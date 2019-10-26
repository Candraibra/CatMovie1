package com.candraibra.catmovie.data;

public class Movie {
    private String movieId;
    private String title;
    private String desc;
    private int image;

    public Movie(String movieId, String title, String desc, int image) {
        this.movieId = movieId;
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
