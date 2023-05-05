package com.musicapi.musicapi.persistance.repository;

import com.musicapi.musicapi.domain.dto.GenreDTO;
import com.musicapi.musicapi.domain.repositorydto.GenreRepositoryDTO;
import com.musicapi.musicapi.persistance.crud.GenreCrudRepository;
import com.musicapi.musicapi.persistance.entity.Genre;
import com.musicapi.musicapi.persistance.mapper.GenreMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GenreRepository implements GenreRepositoryDTO{
    
    @Autowired
    private GenreCrudRepository crud;
    
    @Autowired
    private GenreMapper mapper;

    @Override
    public List<GenreDTO> getAll() {
        List<Genre> genres = (List<Genre>) crud.findAll();
        return mapper.toGenreDTOs(genres);
    }

    @Override
    public Optional<GenreDTO> findByGenreId(int idgenre) {
        return crud.findById(idgenre)
                .map(genre -> mapper.toGenreDTO(genre));
    }

    @Override
    public GenreDTO save(GenreDTO genreDTO) {
        Genre genre = mapper.toGenre(genreDTO);
        return mapper.toGenreDTO(crud.save(genre));
    }
}
