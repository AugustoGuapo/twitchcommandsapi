package com.augustoguapo.twitchcommandsapi.controller;

import com.augustoguapo.twitchcommandsapi.service.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CommandController {
    @Autowired
    CommandService commandService;
    @GetMapping("/memide")
    public ResponseEntity<String> memMide() {
        return new ResponseEntity<>(commandService.meMideCommand(), HttpStatus.OK);
    }
}
