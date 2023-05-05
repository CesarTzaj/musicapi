
package com.musicapi.musicapi.persistance.repository;

import com.musicapi.musicapi.domain.dto.TrackDTO;
import com.musicapi.musicapi.domain.repositorydto.TrackRepsitoryDTO;
import com.musicapi.musicapi.persistance.crud.TrackCrudReposity;
import com.musicapi.musicapi.persistance.entity.Track;
import com.musicapi.musicapi.persistance.mapper.TrackMapper;
import java.util.List;
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
    
}
