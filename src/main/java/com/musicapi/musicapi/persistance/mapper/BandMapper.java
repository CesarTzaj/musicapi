
package com.musicapi.musicapi.persistance.mapper;

import com.musicapi.musicapi.domain.dto.BandDTO;
import com.musicapi.musicapi.persistance.entity.Band;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BandMapper {
    
    BandDTO toBandDTO(Band band);
    List<BandDTO> toBandDTOs(List<Band> bands);
    
    @InheritInverseConfiguration
    Band toBand(BandDTO bandDTO);
}
