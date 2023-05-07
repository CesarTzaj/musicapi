package com.musicapi.musicapi.persistance.mapper;

import com.musicapi.musicapi.domain.dto.BandDTO;
import com.musicapi.musicapi.persistance.entity.Band;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-06T17:29:54-0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
@Component
public class BandMapperImpl implements BandMapper {

    @Override
    public BandDTO toBandDTO(Band band) {
        if ( band == null ) {
            return null;
        }

        BandDTO bandDTO = new BandDTO();

        bandDTO.setBandId( band.getBandId() );
        bandDTO.setBand( band.getBand() );

        return bandDTO;
    }

    @Override
    public List<BandDTO> toBandDTOs(List<Band> bands) {
        if ( bands == null ) {
            return null;
        }

        List<BandDTO> list = new ArrayList<BandDTO>( bands.size() );
        for ( Band band : bands ) {
            list.add( toBandDTO( band ) );
        }

        return list;
    }

    @Override
    public Band toBand(BandDTO bandDTO) {
        if ( bandDTO == null ) {
            return null;
        }

        Band band = new Band();

        band.setBandId( bandDTO.getBandId() );
        band.setBand( bandDTO.getBand() );

        return band;
    }
}
