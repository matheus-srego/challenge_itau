package com.challenge.itidigital.fieldsvalidation.servicesimpl;

import com.challenge.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorBlankSpaceServiceImpl implements ValidatorService {
	
	@Override
	public Boolean validate( String field ) {
		final Boolean noHasBlankSpace = !( field.indexOf( " " ) == 0 );
		return noHasBlankSpace;
	}
	
}
