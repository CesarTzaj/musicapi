
package com.musicapi.musicapi.persistance.mapper;

import com.musicapi.musicapi.domain.dto.TrackDTO;
import com.musicapi.musicapi.persistance.entity.Track;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {GenreMapper.class, BandMapper.class})
public interface TrackMapper {
    
    /**
     *
     * @param track
     * @return
     */
    @Mappings({
        @Mapping(source = "songId", target = "id"),
        @Mapping(source = "bandid", target = "bandId"),
        @Mapping(source = "genreid", target = "genreId"),
    })
    TrackDTO toTrackDTO(Track track);
    List<TrackDTO> toTrackDTOs(List<Track> track);
    
    /**
     *
     * @param trackDTO
     * @return
     */
    @InheritInverseConfiguration          
    Track toTrack(TrackDTO trackDTO);
}
