package com.candraibra.catmovie.viewmodel;

import com.candraibra.catmovie.data.Tv;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TvViewModelTest {
    private TvViewModel viewModel;

    @Before
    public void setUp() {
        viewModel = new TvViewModel();
    }

    @Test
    public void getTv() {
        List<Tv> tvList = viewModel.getTv();
        assertNotNull(tvList);
        assertEquals(10, tvList.size());
    }
}