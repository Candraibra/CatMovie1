package com.candraibra.catmovie.viewmodel;

import com.candraibra.catmovie.R;
import com.candraibra.catmovie.data.Movie;
import com.candraibra.catmovie.data.Tv;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DetailViewModelTest {
    private DetailViewModel detailViewModel;
    private Movie movies;
    private Tv tvs;

    @Before
    public void setUp() {
        detailViewModel = new DetailViewModel();
        movies = new Movie("1",
                "Avengers: Infinity War (2018)",
                "Ketika Avengers dan sekutu mereka terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh satu pahlawan, bahaya baru telah muncul dari bayang-bayang kosmik: Thanos. Seorang lalim penghinaan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan tak terbayangkan, dan menggunakannya untuk menimbulkan keinginannya yang terpelintir pada semua kenyataan. Segala yang Avengers telah perjuangkan telah mengarah ke saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                R.drawable.poster_avengerinfinity);
        tvs = new Tv("1",
                "Shameless (2011)",
                "Chicagoan Frank Gallagher adalah ayah tunggal yang bangga dari enam anak yang cerdas, rajin, mandiri, yang tanpanya mungkin lebih baik. Ketika Frank tidak di bar menghabiskan sedikit uang yang mereka miliki, dia pingsan di lantai. Tetapi anak-anak telah menemukan cara untuk tumbuh meskipun dia. Mereka mungkin tidak seperti keluarga yang Anda kenal, tetapi mereka tidak meminta maaf karena menjadi diri mereka yang sebenarnya.",
                R.drawable.poster_shameless);
    }

    @Test
    public void getMovies() {
        detailViewModel.setMovieId(movies.getMovieId());
        Movie movies = detailViewModel.getMovies();
        assertNotNull(movies);
        assertEquals(movies.getMovieId(), movies.getMovieId());
        assertEquals(movies.getTitle(), movies.getTitle());
        assertEquals(movies.getDesc(), movies.getDesc());
        assertEquals(movies.getImage(), movies.getImage());
    }

    @Test
    public void getTvs() {
        detailViewModel.setTvId(tvs.getTvId());
        Tv tvs = detailViewModel.getTvs();
        assertNotNull(tvs);
        assertEquals(tvs.getTvId(), tvs.getTvId());
        assertEquals(tvs.getTitle(), tvs.getTitle());
        assertEquals(tvs.getDesc(), tvs.getDesc());
        assertEquals(tvs.getImage(), tvs.getImage());
    }

}