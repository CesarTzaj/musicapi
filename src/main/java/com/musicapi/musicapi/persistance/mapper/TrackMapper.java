/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.musicapi.musicapi.persistance.mapper;

import com.musicapi.musicapi.domain.dto.TrackDTO;
import com.musicapi.musicapi.persistance.entity.Track;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TrackMapper {
    
    
    TrackDTO toTrackDTO(Track track);
    List<TrackDTO> toTrackDTOs(List<Track> track);
    
}
