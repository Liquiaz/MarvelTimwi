package com.timwi.controller;

import com.timwi.config.MarvelProperties;
import com.timwi.service.HashService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Controller for the Rest API of the application Marvel
 */
@RestController
@CrossOrigin
@RequestMapping(path = "/api")
public class MarvelController {

    private static final Logger logger = LoggerFactory.getLogger(MarvelController.class);

    @Autowired
    private HashService hashService;

    private String ts;
    private String domainName;
    private String publicKey;
    private String privateKey;

    @Autowired
    public MarvelController(MarvelProperties marvelProperties) {
        this.ts = "1";
        this.domainName = marvelProperties.getDomainName();
        this.publicKey = marvelProperties.getPublicKey();
        this.privateKey = marvelProperties.getPrivateKey();
    }

    /**
     * Method which return the list of all the marvel's characters
     * @return String characters list in JSON format
     */
    @GetMapping("/characters")
    public String getCharacters() {
        String hash = hashService.hashMd5(String.join("", this.ts, this.privateKey, this.publicKey));
        final String uri = String.format("http://%1$s/v1/public/characters?ts=1&apikey=%2$s&hash=%3$s", this.domainName, this.publicKey, hash);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }

}
