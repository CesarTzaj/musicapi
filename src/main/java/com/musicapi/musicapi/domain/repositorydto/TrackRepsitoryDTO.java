package com.musicapi.musicapi.domain.repositorydto;

import com.musicapi.musicapi.domain.dto.TrackDTO;
import java.util.List;
import java.util.Optional;


public interface TrackRepsitoryDTO {
    List<TrackDTO> getAll();
    Optional<List<TrackDTO>> getByGenreId(int genreId);
    Optional<List<TrackDTO>> getByTitleLike(String title);
    TrackDTO save(TrackDTO trackDTO);
//    TrackDTO save(TrackDTO trackDTO);
}
