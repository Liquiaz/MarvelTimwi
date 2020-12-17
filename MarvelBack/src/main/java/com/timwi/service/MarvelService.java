package com.timwi.service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Class service execute and return information for the API
 */
@Service
public class MarvelService {

    /**
     * Save the character id in the superteam list
     * @param value id of the hero
     * @return id of the hero
     */
    public Integer saveCharacter(Integer value) {
        return value;
    }

    /**
     * get the list of hero's id of the superteam
     * @return list of hero's id
     */
    public List<Integer> getSuperteam(){
        List<Integer> superteamIds = new ArrayList<>();
        return superteamIds;
    }
}
