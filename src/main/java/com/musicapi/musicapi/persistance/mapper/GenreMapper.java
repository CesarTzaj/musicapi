
package com.musicapi.musicapi.persistance.mapper;

import com.musicapi.musicapi.domain.dto.GenreDTO;
import com.musicapi.musicapi.persistance.entity.Genre;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GenreMapper {
   
    GenreDTO toGenreDTO (Genre genre);
    List<GenreDTO> toGenreDTOs (List<Genre> Genre);
    
    @InheritInverseConfiguration
    Genre toGenre(GenreDTO genreDTO);
}
