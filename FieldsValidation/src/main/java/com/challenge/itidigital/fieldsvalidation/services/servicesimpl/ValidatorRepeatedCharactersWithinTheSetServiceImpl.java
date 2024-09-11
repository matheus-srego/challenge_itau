package com.challenge.itidigital.fieldsvalidation.services.servicesimpl;

import com.challenge.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorRepeatedCharactersWithinTheSetServiceImpl implements ValidatorService {
	
	@Override
	public Boolean validate( String field ) {
        final boolean hasRepeatedCharacter = ( ( CharSequence ) field ).length() != ( ( CharSequence ) field ).chars().distinct().count();
		return !hasRepeatedCharacter;
	}
	
}
