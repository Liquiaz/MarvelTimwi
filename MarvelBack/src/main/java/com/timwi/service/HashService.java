package com.timwi.service;

import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class HashService {


    public String hashMd5(String value) {

        return DigestUtils.md5DigestAsHex(value.getBytes());
    }



}
