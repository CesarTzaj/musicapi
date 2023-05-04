package com.musicapi.musicapi.domain.repositorydto;

import com.musicapi.musicapi.domain.dto.GenreDTO;
import java.util.List;
import java.util.Optional;


public interface GenreRepositoryDTO {
    List<GenreDTO> getAll();
    Optional<GenreDTO> findByGenreId(int idgenre);
    GenreDTO save(GenreDTO genreDTO);
    
}
