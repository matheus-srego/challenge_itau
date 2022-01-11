package com.challange.itidigital.fieldsvalidation.servicesimpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.challange.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorRepeatedUppercaseLetterWithinTheSetServiecImpl implements ValidatorService {
	
	@Override
	public Boolean validate( String field ) {
		final Pattern pattern = Pattern.compile( "(?=.*[A-Z]+$)" );
		final Matcher matcher = pattern.matcher( field );
		final Boolean hasRepeatedUppercaseLetters = matcher.matches();
		
		return !hasRepeatedUppercaseLetters;
	}
	
}
