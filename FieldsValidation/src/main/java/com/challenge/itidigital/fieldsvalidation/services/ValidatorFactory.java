package com.challenge.itidigital.fieldsvalidation.services;

import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorBlankSpaceServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorDigitServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorFieldEmptyServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorLowercaseLetterServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorNumberOfCharactersServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorRepeatedCharactersWithinTheSetServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorRepeatedDigitInSequenceServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorRepeatedLowercaseLetterInSequenceServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorRepeatedSpecialCharacterInSequenceServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorRepeatedUppercaseLetterInSequenceServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorSpecialCharacterServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorUppercaseLetterServiceImpl;
import com.challenge.itidigital.fieldsvalidation.utils.CONSTANTS;

public class ValidatorFactory {
	
	public static ValidatorService getValidatorType( String name ) {
		switch( name ) {
			case "isFieldEmpty":
				return new ValidatorFieldEmptyServiceImpl();
				
			case "hasNumberOfCharactersValid":
				return new ValidatorNumberOfCharactersServiceImpl();
				
			case "hasLowercaseLetter":
				return new ValidatorLowercaseLetterServiceImpl();
				
			case "hasUppercaseLetter":
				return new ValidatorUppercaseLetterServiceImpl();

			case "hasDigit":
				return new ValidatorDigitServiceImpl();
				
			case "hasSpecialCharacter":
				return new ValidatorSpecialCharacterServiceImpl();
				
			case "hasRepeatedLowercaseLetterInSequence":
				return new ValidatorRepeatedLowercaseLetterInSequenceServiceImpl();
				
			case "hasRepeatedUppercaseLetterInSequence":
				return new ValidatorRepeatedUppercaseLetterInSequenceServiceImpl();

			case "hasRepeatedDigitInSequence":
				return new ValidatorRepeatedDigitInSequenceServiceImpl();
				
			case "hasRepeatedSpecialCharacterInSequence":
				return new ValidatorRepeatedSpecialCharacterInSequenceServiceImpl();
				
			case "hasRepeatedCharactersWithinTheSet":
				return new ValidatorRepeatedCharactersWithinTheSetServiceImpl();
				
			case "noExistBlankSpace":
				return new ValidatorBlankSpaceServiceImpl();
				
			default: 
				throw new IllegalArgumentException( CONSTANTS.METHOD_NOT_EXIST + name );
		}
	}

}
