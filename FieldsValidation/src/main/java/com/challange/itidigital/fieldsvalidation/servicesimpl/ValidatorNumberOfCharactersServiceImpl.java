package com.challange.itidigital.fieldsvalidation.servicesimpl;

import com.challange.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorNumberOfCharactersServiceImpl implements ValidatorService {
	
	@Override
	public Boolean validate( String field ) {
		final int quantityOfCharacters = field.length();
		final Boolean quantityIsValid = quantityOfCharacters >= 9; 
		
		return quantityIsValid;
	}

}
