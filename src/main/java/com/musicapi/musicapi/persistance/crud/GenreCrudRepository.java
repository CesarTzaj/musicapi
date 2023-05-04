
package com.musicapi.musicapi.persistance.crud;

import com.musicapi.musicapi.persistance.entity.Genre;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface GenreCrudRepository extends CrudRepository<Genre, Integer>{
    Optional<Genre> findById(int genreId);
}
