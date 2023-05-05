
package com.musicapi.musicapi.persistance.crud;

import com.musicapi.musicapi.persistance.entity.Track;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface TrackCrudReposity extends CrudRepository<Track, Integer>{
    
}
