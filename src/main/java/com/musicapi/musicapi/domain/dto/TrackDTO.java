package com.musicapi.musicapi.domain.dto;


public class TrackDTO {
    private Integer songId;
    private String title;
    private Byte[] track;
    private Integer  favorite;
    private GenreDTO genre;
    private BandDTO band;

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

    public Byte[] getTrack() {
        return track;
    }

    public void setTrack(Byte[] track) {
        this.track = track;
    }

    public Integer getFavorite() {
        return favorite;
    }

    public void setFavorite(Integer favorite) {
        this.favorite = favorite;
    }

    public GenreDTO getGenre() {
        return genre;
    }

    public void setGenre(GenreDTO genre) {
        this.genre = genre;
    }

    public BandDTO getBand() {
        return band;
    }

    public void setBand(BandDTO band) {
        this.band = band;
    }

}
