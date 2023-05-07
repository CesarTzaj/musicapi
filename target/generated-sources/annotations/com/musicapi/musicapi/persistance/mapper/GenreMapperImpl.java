package com.musicapi.musicapi.persistance.mapper;

import com.musicapi.musicapi.domain.dto.GenreDTO;
import com.musicapi.musicapi.persistance.entity.Genre;
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
public class GenreMapperImpl implements GenreMapper {

    @Override
    public GenreDTO toGenreDTO(Genre genre) {
        if ( genre == null ) {
            return null;
        }

        GenreDTO genreDTO = new GenreDTO();

        genreDTO.setIdgenre( genre.getIdgenre() );
        genreDTO.setGenre( genre.getGenre() );

        return genreDTO;
    }

    @Override
    public List<GenreDTO> toGenreDTOs(List<Genre> Genre) {
        if ( Genre == null ) {
            return null;
        }

        List<GenreDTO> list = new ArrayList<GenreDTO>( Genre.size() );
        for ( Genre genre : Genre ) {
            list.add( toGenreDTO( genre ) );
        }

        return list;
    }

    @Override
    public Genre toGenre(GenreDTO genreDTO) {
        if ( genreDTO == null ) {
            return null;
        }

        Genre genre = new Genre();

        genre.setIdgenre( genreDTO.getIdgenre() );

        return genre;
    }
}
