package com.challange.itidigital.fieldsvalidation.services;

import com.challange.itidigital.fieldsvalidation.servicesimpl.ValidatorBlankSpaceServiceImpl;
import com.challange.itidigital.fieldsvalidation.servicesimpl.ValidatorDigitServiceImpl;
import com.challange.itidigital.fieldsvalidation.servicesimpl.ValidatorLowercaseLetterServiceImpl;
import com.challange.itidigital.fieldsvalidation.servicesimpl.ValidatorNumberOfCharactersServiceImpl;
import com.challange.itidigital.fieldsvalidation.servicesimpl.ValidatorSpecialCharacterServiceImpl;
import com.challange.itidigital.fieldsvalidation.servicesimpl.ValidatorUppercaseLetterServiceImpl;

public class ValidatorFactory {
	
	public static ValidatorService getValidatorType( String name ) {
		switch( name ) {
			case "hasNumberOfCharactersValid":
				return new ValidatorNumberOfCharactersServiceImpl();
				
			case "hasDigit":
				return new ValidatorDigitServiceImpl();
				
			case "hasLowercaseLetter":
				return new ValidatorLowercaseLetterServiceImpl();
				
			case "hasUppercaseLetter":
				return new ValidatorUppercaseLetterServiceImpl();
				
			case "hasSpecialCharacter":
				return new ValidatorSpecialCharacterServiceImpl();
				
//			case "hasRepeatedLowercaseLetter":
//				return new ValidatorRepeatedLowercaseLetterServiceImpl();
				
//			case "hasRepeatedUppercaseLetter":
//				return new ValidatorRepeatedUppercaseLetterServiceImpl();
				
//			case "hasRepeatedSpecialCharacter":
//				return new ValidatorRepeatedSpecialCharacterServiceImpl();
				
			case "noExistBlankSpace":
				return new ValidatorBlankSpaceServiceImpl();
				
			default: 
				return null;
		}
	}

}
