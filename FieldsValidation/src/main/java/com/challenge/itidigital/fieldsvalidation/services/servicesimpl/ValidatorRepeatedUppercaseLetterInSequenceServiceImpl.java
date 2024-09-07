package com.challenge.itidigital.fieldsvalidation.services.servicesimpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.challenge.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorRepeatedUppercaseLetterInSequenceServiceImpl implements ValidatorService {
	
	@Override
	public Boolean validate( String field ) {
		final Pattern pattern = Pattern.compile( "([A-Z])(\\1){1,}" );
		final Matcher matcher = pattern.matcher( field );
		final Boolean hasRepeatedUppercaseLetters = matcher.find();
		
		return !hasRepeatedUppercaseLetters;
	}
	
}
