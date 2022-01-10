package com.challange.itidigital.fieldsvalidation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ValidatorFieldService {
	
	@Value( "#{'${enabled_validators}'.split(',')}" )
	private List<String> enabledValidators;
	
	public Boolean isPasswordValid( String password ) {
		
		return this.enabledValidators.stream()
									 .map( ValidatorFactory::getValidatorType )
									 .map( validatorType -> validatorType.validate( password ) )
									 .reduce( true, ( isFieldValid, isConditionValid ) -> isFieldValid && isConditionValid );
	}

}
