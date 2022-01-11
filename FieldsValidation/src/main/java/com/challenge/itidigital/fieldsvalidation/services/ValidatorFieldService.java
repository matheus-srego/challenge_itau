package com.challenge.itidigital.fieldsvalidation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ValidatorFieldService {
	
	@Value( "#{'${enabled_validators_for_password}'.split(',')}" )
	private List<String> enabledValidatorsForPassword;
	
	public Boolean isPasswordValid( String password ) {
		
		return this.enabledValidatorsForPassword.stream()
									 .map( ValidatorFactory::getValidatorType )
									 .map( validatorType -> validatorType.validate( password ) )
									 .reduce( true, ( isFieldValid, isConditionValid ) -> isFieldValid && isConditionValid );
	}

}
