package com.musicapi.musicapi.domain.repositorydto;

import com.musicapi.musicapi.domain.dto.TrackDTO;
import java.util.List;


public interface TrackRepsitoryDTO {
    List<TrackDTO> getAll();
    
//    TrackDTO save(TrackDTO trackDTO);
}
