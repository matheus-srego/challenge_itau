package com.challenge.itidigital.fieldsvalidation.services.servicesimpl;

import com.challenge.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorRepeatedCharactersWithinTheSetServiceImpl implements ValidatorService {
	
	@Override
	public Boolean validate( String field ) {
		final CharSequence fieldCheckSequence = field;
		final Boolean hasRepeatedCharacter = fieldCheckSequence.length() != fieldCheckSequence.chars().distinct().count();
		
		return !hasRepeatedCharacter;
	}
	
}
