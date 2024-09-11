package com.challenge.itidigital.fieldsvalidation.services.servicesimpl;

import com.challenge.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorNumberOfCharactersServiceImpl implements ValidatorService {
	
	@Override
	public Boolean validate( String field ) {
		final int quantityOfCharacters = field.length();
		return quantityOfCharacters >= 9;
	}

}
