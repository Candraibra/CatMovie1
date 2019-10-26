package com.candraibra.catmovie.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.candraibra.catmovie.R;

public class DetailMovieActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
