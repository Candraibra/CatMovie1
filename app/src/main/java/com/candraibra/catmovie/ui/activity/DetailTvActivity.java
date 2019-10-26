package com.candraibra.catmovie.ui.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.candraibra.catmovie.R;

public class DetailTvActivity extends AppCompatActivity {
    public static final String EXTRA_TV = "extra_tv";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
