package com.challange.itidigital.fieldsvalidation.services;

import com.challange.itidigital.fieldsvalidation.servicesimpl.ValidatorNumberOfCharactersServiceImpl;

public class ValidatorFactory {
	
	public static ValidatorService getValidatorType( String name ) {
		switch( name ) {
			case "hasNumberOfharactersValid":
				return new ValidatorNumberOfCharactersServiceImpl();
			default: 
				return null;
		}
	}

}
