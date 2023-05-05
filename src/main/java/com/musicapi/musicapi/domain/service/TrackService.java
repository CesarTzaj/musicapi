package com.musicapi.musicapi.domain.service;

import com.musicapi.musicapi.domain.dto.TrackDTO;
import com.musicapi.musicapi.domain.repositorydto.TrackRepsitoryDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackService {
    
    @Autowired
    private TrackRepsitoryDTO track;
    
    public List<TrackDTO> getAl(){
        return track.getAll();
    }
  /*  public TrackDTO save(TrackDTO trackDTO){
        return track.save(trackDTO);
    }
*/
}
