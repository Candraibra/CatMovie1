package com.candraibra.catmovie.viewmodel;

import androidx.lifecycle.ViewModel;

import com.candraibra.catmovie.data.Movie;
import com.candraibra.catmovie.utils.DummyData;

import java.util.ArrayList;

public class MovieViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    public ArrayList<Movie> getMovie() {
        return DummyData.generateDummyMovies();
    }
}
