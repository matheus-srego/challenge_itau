package com.challenge.itidigital.fieldsvalidation.services;

import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorBlankSpaceServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorDigitServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorLowercaseLetterServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorNumberOfCharactersServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorRepeatedDigitInSequenceServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorRepeatedDigitWithinTheSetServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorRepeatedLowercaseLetterInSequenceServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorRepeatedLowercaseLetterWithinTheSetServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorRepeatedSpecialCharacterInSequenceServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorRepeatedUppercaseLetterInSequenceServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorRepeatedUppercaseLetterWithinTheSetServiecImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorSpecialCharacterServiceImpl;
import com.challenge.itidigital.fieldsvalidation.servicesimpl.ValidatorUppercaseLetterServiceImpl;

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
				
			case "hasRepeatedLowercaseLetterInSequence":
				return new ValidatorRepeatedLowercaseLetterInSequenceServiceImpl();
				
			case "hasRepeatedUppercaseLetterInSequence":
				return new ValidatorRepeatedUppercaseLetterInSequenceServiceImpl();
				
			case "hasRepeatedSpecialCharacterInSequence":
				return new ValidatorRepeatedSpecialCharacterInSequenceServiceImpl();
				
			case "hasRepeatedDigitInSequence":
				return new ValidatorRepeatedDigitInSequenceServiceImpl();
				
			case "hasRepeatedLowercaseLetterWithinTheSet":
				return new ValidatorRepeatedLowercaseLetterWithinTheSetServiceImpl();
				
			case "hasRepeatedUppercaseLetterWithinTheSet":
				return new ValidatorRepeatedUppercaseLetterWithinTheSetServiecImpl();
				
			case "hasRepeatedDigitWithinTheSet":
				return new ValidatorRepeatedDigitWithinTheSetServiceImpl();
				
			case "noExistBlankSpace":
				return new ValidatorBlankSpaceServiceImpl();
				
			default: 
				final String messageError = new String( "Não foi possível validar o campo com o método solicitado. Método não encontrado: " + name );
				throw new IllegalArgumentException( messageError );
		}
	}

}
