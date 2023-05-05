 
package com.musicapi.musicapi.web.controller;

import com.musicapi.musicapi.domain.dto.TrackDTO;
import com.musicapi.musicapi.domain.service.TrackService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
