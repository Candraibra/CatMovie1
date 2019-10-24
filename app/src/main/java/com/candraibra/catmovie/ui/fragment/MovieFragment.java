package com.candraibra.catmovie.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.candraibra.catmovie.R;
import com.candraibra.catmovie.adapter.MovieAdapter;
import com.candraibra.catmovie.data.Movie;
import com.candraibra.catmovie.viewmodel.MovieViewModel;

import java.util.ArrayList;

public class MovieFragment extends Fragment {

    private MovieViewModel mViewModel;
    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;
    private ArrayList<Movie> movies;

    public static MovieFragment newInstance() {
        return new MovieFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.movie_fragment, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_movie);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() != null) {
            //define viewModel
            mViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
            movies = mViewModel.getMovie();

            //adapter
            movieAdapter = new MovieAdapter(getActivity());
            movieAdapter.setMovieList(movies);

            //recyclerView
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(movieAdapter);
        }
    }

}
