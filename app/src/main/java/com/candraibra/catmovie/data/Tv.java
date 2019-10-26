package com.candraibra.catmovie.data;

public class Tv {
    private String tvId;
    private String title;
    private String desc;
    private int image;

    public Tv(String tvId, String title, String desc, int image) {
        this.tvId = tvId;
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    public String getTvId() {
        return tvId;
    }

    public void setTvId(String tvId) {
        this.tvId = tvId;
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
