package com.ultimatepda.engine.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ultimatepda.engine.model.StoreItemsDetailResponse;
import com.ultimatepda.engine.util.Constants;

@RestController
@RequestMapping(value = "/private/storeitemlist", produces = MediaType.APPLICATION_JSON_VALUE)
public class StoreItemsController {

	@GetMapping("/id")
	@ResponseStatus(HttpStatus.OK)
	public StoreItemsDetailResponse retrieveItems(@PathVariable(Constants.ID) String id,
			@RequestHeader(value = Constants.USERID) String userId) {
		return null;
	}
}
