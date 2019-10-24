package com.candraibra.catmovie.viewmodel;

import androidx.lifecycle.ViewModel;

import com.candraibra.catmovie.data.Tv;
import com.candraibra.catmovie.utils.DummyData;

import java.util.ArrayList;

public class TvViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    public ArrayList<Tv> gettv() {
        return DummyData.generateDummyTvs();
    }
}
