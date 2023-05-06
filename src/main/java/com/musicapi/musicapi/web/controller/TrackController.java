 
package com.musicapi.musicapi.web.controller;

import com.musicapi.musicapi.domain.dto.TrackDTO;
import com.musicapi.musicapi.domain.service.TrackService;
import jakarta.websocket.server.PathParam;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("song")
public class TrackController {
    
    @Autowired
    private TrackService service;
    
    @GetMapping("all")
    public ResponseEntity<List<TrackDTO>> getAll(){
        return new ResponseEntity<>(service.getAl(), HttpStatus.OK);
    }
    
    @PostMapping("save")
    public ResponseEntity<TrackDTO> save(@RequestBody TrackDTO trackDTO){
    return new ResponseEntity<>(service.save(trackDTO), HttpStatus.CREATED);
    }
    @GetMapping("/genre/{id}")
    public ResponseEntity<List<TrackDTO>> getByGenreId(@PathVariable("id") int genreId){
        return (ResponseEntity<List<TrackDTO>>) service.getByGenreId(genreId)
                .map(genres -> {
                    if(genres.size()>0){
                        return new ResponseEntity<>(genres, HttpStatus.OK);
                    }else{
                        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                    }
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/title/{title}")
    public ResponseEntity<List<TrackDTO>> getByGenreTitle(@PathVariable("title") String title){
        return (ResponseEntity<List<TrackDTO>>) service.getByGenreTitle(title)
                .map(genres -> {
                    if(genres.size()>0){
                        return new ResponseEntity<>(genres, HttpStatus.OK);
                    }else{
                        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                    }
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
