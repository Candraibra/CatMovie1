package com.candraibra.catmovie.viewmodel;

import com.candraibra.catmovie.data.Movie;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MovieViewModelTest {
    private MovieViewModel viewModel;

    @Before
    public void setUp() {
        viewModel = new MovieViewModel();
    }

    @Test
    public void getMovie() {
        List<Movie> movieList = viewModel.getMovie();
        assertNotNull(movieList);
        assertEquals(10, movieList.size());
    }
}