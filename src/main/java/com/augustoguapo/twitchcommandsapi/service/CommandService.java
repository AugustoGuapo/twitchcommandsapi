package com.augustoguapo.twitchcommandsapi.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CommandService {

    public String meMideCommand() {
        Random random = new Random();
        int size = (int)Math.floor(Math.random()*(27-1+1)+1);
        return "le mide " + size + "cm";
    }
}
