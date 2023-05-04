
package com.musicapi.musicapi.web.controller;

import com.musicapi.musicapi.domain.dto.GenreDTO;
import com.musicapi.musicapi.domain.service.GenreService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("genre")
public class GenreController {
    
    @Autowired
    private GenreService service;
    
    @GetMapping("all")
    public ResponseEntity<List<GenreDTO>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    
    @GetMapping("{id}")
    public ResponseEntity<GenreDTO> getByID(@PathVariable("id") int id){
        return service.findByGenreId(id)
                .map(genre -> new ResponseEntity<>(genre, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
