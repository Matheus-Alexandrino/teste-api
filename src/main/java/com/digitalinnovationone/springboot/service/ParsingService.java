package com.digitalinnovationone.springboot.service;

public interface ParsingService {

    /**
     * Service to parse Json response and convert it to
     * the desired model class
     */

    Object parse(String url);

}
