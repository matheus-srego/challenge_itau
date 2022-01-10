package com.challange.itidigital.fieldsvalidation.servicesimpl;

import com.challange.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorBlankSpaceServiceImpl implements ValidatorService {
	
	@Override
	public Boolean validate( String field ) {
		final Boolean noHasBlankSpace = !( field.indexOf( " " ) == 0 );
		return noHasBlankSpace;
	}
	
}
