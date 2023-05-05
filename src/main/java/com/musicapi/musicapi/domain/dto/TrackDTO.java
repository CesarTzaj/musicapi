package com.musicapi.musicapi.domain.dto;


public class TrackDTO {
    private Integer songId;
    private String title;
    private Integer  favorite;
  //  private Byte [] track;
   // private GenreDTO genre;

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getFavorite() {
        return favorite;
    }

    public void setFavorite(Integer favorite) {
        this.favorite = favorite;
    }
}
