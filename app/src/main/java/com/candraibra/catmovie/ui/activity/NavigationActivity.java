package com.candraibra.catmovie.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.candraibra.catmovie.R;
import com.candraibra.catmovie.ui.fragment.MovieFragment;
import com.candraibra.catmovie.ui.fragment.TvFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NavigationActivity extends AppCompatActivity {

    final Fragment fragmentMovie = new MovieFragment();
    final Fragment fragmentTv = new TvFragment();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = fragmentMovie;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = item -> {
        switch (item.getItemId()) {
            case R.id.navigation_movies:
                fm.beginTransaction().hide(active).show(fragmentMovie).commit();
                active = fragmentMovie;
                return true;

            case R.id.navigation_tv:
                fm.beginTransaction().hide(active).show(fragmentTv).commit();
                active = fragmentTv;
                return true;

        }
        return false;
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        BottomNavigationView navView = findViewById(R.id.bottom_navigation);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        fm.beginTransaction().add(R.id.nav_container, fragmentTv, "Tv").hide(fragmentTv).commit();
        fm.beginTransaction().add(R.id.nav_container, fragmentMovie, "Movie").commit();

    }

}
