
package com.musicapi.musicapi.persistance.repository;

import com.musicapi.musicapi.domain.dto.TrackDTO;
import com.musicapi.musicapi.domain.repositorydto.TrackRepsitoryDTO;
import com.musicapi.musicapi.persistance.crud.TrackCrudReposity;
import com.musicapi.musicapi.persistance.entity.Track;
import com.musicapi.musicapi.persistance.mapper.TrackMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TrackRepository implements TrackRepsitoryDTO{
    
    @Autowired
    TrackMapper mapper;
    @Autowired
    TrackCrudReposity crud;
    
    @Override
    public List<TrackDTO> getAll() {
        List<Track> tracks = (List<Track>) crud.findAll();
        return mapper.toTrackDTOs(tracks);
    }

    @Override
    public Optional<List<TrackDTO>> getByGenreId(int genreId) {
        List<Track> tracks = crud.findByGenreid(genreId);
        return Optional.of(mapper.toTrackDTOs(tracks));
    }

    @Override
    public TrackDTO save(TrackDTO trackDTO) {
        Track track = mapper.toTrack(trackDTO);
        return mapper.toTrackDTO(crud.save(track));
    }

    @Override
    public Optional<List<TrackDTO>> getByTitleLike(String title) {
         List<Track> tracks = crud.findByTitleContains(title);
        return Optional.of(mapper.toTrackDTOs(tracks));
    }
    
}
