package com.ultimatepda.service.sample.controller;

import com.ultimatepda.service.sample.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/sample/googlecustomsearch", produces = MediaType.APPLICATION_JSON_VALUE)
public class GoogleCustomSearchController {

    @RequestMapping(value={"/items/all"}, method = { RequestMethod.GET}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> retrieveItems() {
        return new ResponseEntity<String>(Constants.GoogleCustomSearch.Result_Items_All, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value={"/items/{count}"}, method = { RequestMethod.GET}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> retrieveItems(@PathVariable int count) {
        switch (count) {
            case 1: return new ResponseEntity<String>(Constants.GoogleCustomSearch.Result_Items_1, HttpStatus.ACCEPTED);
            case 2: return new ResponseEntity<String>(Constants.GoogleCustomSearch.Result_Items_2, HttpStatus.ACCEPTED);
        }

        return new ResponseEntity<String>(Constants.GoogleCustomSearch.Result_Items_All, HttpStatus.ACCEPTED);
    }
}
