package com.musicapi.musicapi.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Track")
public class Track {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsong")
    private Integer songId;
    private String title;
    private Byte[] track;
    @Column(name = "favorite_count")
    private Integer  favorite;
    @Column(name = "genreid")
    private Integer genreid;
    private Integer bandid;
    
    @ManyToOne
    @JoinColumn(name = "genreid", updatable = false, insertable = false)
    private Genre genre;
    
    @ManyToOne
    @JoinColumn(name = "bandid", updatable = false, insertable = false)
    private Band band;

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

    public Integer getGenreid() {
        return genreid;
    }

    public void setGenreid(Integer genreid) {
        this.genreid = genreid;
    }


    public Integer getBandid() {
        return bandid;
    }

    public void setBandid(Integer bandid) {
        this.bandid = bandid;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }

        
}
