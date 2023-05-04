package com.musicapi.musicapi.domain.service;

import com.musicapi.musicapi.domain.dto.GenreDTO;
import com.musicapi.musicapi.domain.repositorydto.GenreRepositoryDTO;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService {
    
    @Autowired
    private GenreRepositoryDTO genre;

    public List<GenreDTO> getAll() {
        return genre.getAll();
    }

    public Optional<GenreDTO> findByGenreId(int id) {
        return genre.findByGenreId(id);
    }

    public GenreDTO save(GenreDTO genreDTO) {
        return genre.save(genreDTO);
    }
}
