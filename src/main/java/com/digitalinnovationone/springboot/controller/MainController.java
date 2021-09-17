package com.digitalinnovationone.springboot.controller;

import com.digitalinnovationone.springboot.domain.Country;
import com.digitalinnovationone.springboot.service.ParsingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static jdk.internal.org.jline.utils.Colors.s;

//import static jdk.internal.org.jline.utils.Colors.s;

@Controller
public class MainController {

    private static final String MAIN_PAGE = "main";
    private static final String JSON_COUNTRY_URL = "https://restcountries.eu/rest/v2/name/australia";
                                                        //inserir link com conteudo json

    @Autowired
    private ParsingService parsingService;

    @GetMapping
    public String main(final Model model) {
         List<Country> countries = (List<Country>) parsingService.parse(JSON_COUNTRY_URL) ;                        // the given json returns a list of countries
         model.addAttribute( "country", countries.get(0));
        return MAIN_PAGE;
    }

}
