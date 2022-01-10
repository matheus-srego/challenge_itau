package com.challange.itidigital.fieldsvalidation.servicesimpl;

import org.springframework.beans.factory.annotation.Value;

import com.challange.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorNumberOfCharactersServiceImpl implements ValidatorService {
	
	@Value( "9" )
	private static int minimunNumberOfCharacters;
	
	@Override
	public Boolean validate( String field ) {
		final int quantityOfCharacters = field.length();
		final Boolean quantityIsValid = quantityOfCharacters >= minimunNumberOfCharacters; 
		
		return quantityIsValid;
	}

}
