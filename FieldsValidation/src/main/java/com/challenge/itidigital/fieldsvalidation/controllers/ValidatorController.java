package com.challenge.itidigital.fieldsvalidation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.itidigital.fieldsvalidation.services.ValidatorFieldService;

@RestController
@RequestMapping( value = "/validate" )
public class ValidatorController {
	
	@PostMapping( value = "/password/{passwordSent}" )
	@ResponseBody
	public Boolean validatePassword( @PathVariable( "passwordSent" ) String password ) {
		return this.validatorFieldService.isPasswordValid( password );
	}
	
	@Autowired
	private ValidatorFieldService validatorFieldService;
	
}
