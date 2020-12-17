package com.timwi.service;

import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class HashService {

    /**
     * Return hash md5 of the parameter value
     * @param value to hash
     * @return hash of parameter value
     */
    public String hashMd5(String value) {
        return DigestUtils.md5DigestAsHex(value.getBytes());
    }



}
