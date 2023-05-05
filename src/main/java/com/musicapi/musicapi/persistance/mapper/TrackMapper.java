
package com.musicapi.musicapi.persistance.mapper;

import com.musicapi.musicapi.domain.dto.TrackDTO;
import com.musicapi.musicapi.persistance.entity.Track;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {GenreMapper.class, BandMapper.class})
public interface TrackMapper {
    
    /**
     *
     * @param track
     * @return
     */
    TrackDTO toTrackDTO(Track track);
    List<TrackDTO> toTrackDTOs(List<Track> track);
    
}
