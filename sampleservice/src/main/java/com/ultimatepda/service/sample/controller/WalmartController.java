package com.ultimatepda.service.sample.controller;

import com.ultimatepda.service.sample.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/sample/walmart", produces = MediaType.APPLICATION_JSON_VALUE)
public class WalmartController {

	@RequestMapping(value={"/product/all"}, method = { RequestMethod.GET}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> retrieveItems() {
		return new ResponseEntity<String>(Constants.Walmart.Product_All, HttpStatus.ACCEPTED);
	}

    @RequestMapping(value={"/product/{id}"}, method = { RequestMethod.GET}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> retrieveItems(@PathVariable String id) {
	    switch (id) {
            case "15075125": return new ResponseEntity<String>(Constants.Walmart.Product_15075125, HttpStatus.ACCEPTED);
            case "15076191": return new ResponseEntity<String>(Constants.Walmart.Product_15076191, HttpStatus.ACCEPTED);
        }

        return new ResponseEntity<String>(Constants.Walmart.Product_15076191, HttpStatus.ACCEPTED);
    }
}
