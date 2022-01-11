package com.challenge.itidigital.fieldsvalidation.servicesimpl;

import com.challenge.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorFieldEmptyServiceImpl implements ValidatorService {
	
	@Override
	public Boolean validate( String field ) {
		final Boolean isNotFieldEmpty = !field.isEmpty();
		
		return isNotFieldEmpty;
	}
	
}
