package com.musicapi.musicapi.persistance.mapper;

import com.musicapi.musicapi.domain.dto.TrackDTO;
import com.musicapi.musicapi.persistance.entity.Track;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-06T17:29:54-0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
@Component
public class TrackMapperImpl implements TrackMapper {

    @Autowired
    private GenreMapper genreMapper;
    @Autowired
    private BandMapper bandMapper;

    @Override
    public TrackDTO toTrackDTO(Track track) {
        if ( track == null ) {
            return null;
        }

        TrackDTO trackDTO = new TrackDTO();

        trackDTO.setId( track.getSongId() );
        trackDTO.setBandId( track.getBandid() );
        trackDTO.setGenreId( track.getGenreid() );
        trackDTO.setTitle( track.getTitle() );
        Byte[] track1 = track.getTrack();
        if ( track1 != null ) {
            trackDTO.setTrack( Arrays.copyOf( track1, track1.length ) );
        }
        trackDTO.setFavorite( track.getFavorite() );
        trackDTO.setGenre( genreMapper.toGenreDTO( track.getGenre() ) );
        trackDTO.setBand( bandMapper.toBandDTO( track.getBand() ) );

        return trackDTO;
    }

    @Override
    public List<TrackDTO> toTrackDTOs(List<Track> track) {
        if ( track == null ) {
            return null;
        }

        List<TrackDTO> list = new ArrayList<TrackDTO>( track.size() );
        for ( Track track1 : track ) {
            list.add( toTrackDTO( track1 ) );
        }

        return list;
    }

    @Override
    public Track toTrack(TrackDTO trackDTO) {
        if ( trackDTO == null ) {
            return null;
        }

        Track track1 = new Track();

        track1.setSongId( trackDTO.getId() );
        track1.setBandid( trackDTO.getBandId() );
        track1.setGenreid( trackDTO.getGenreId() );
        track1.setTitle( trackDTO.getTitle() );
        Byte[] track = trackDTO.getTrack();
        if ( track != null ) {
            track1.setTrack( Arrays.copyOf( track, track.length ) );
        }
        track1.setFavorite( trackDTO.getFavorite() );
        track1.setGenre( genreMapper.toGenre( trackDTO.getGenre() ) );
        track1.setBand( bandMapper.toBand( trackDTO.getBand() ) );

        return track1;
    }
}
