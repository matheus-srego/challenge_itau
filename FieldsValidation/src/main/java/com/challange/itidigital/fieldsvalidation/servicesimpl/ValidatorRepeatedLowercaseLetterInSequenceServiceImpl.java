package com.challange.itidigital.fieldsvalidation.servicesimpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.challange.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorRepeatedLowercaseLetterInSequenceServiceImpl implements ValidatorService {
	
	@Override
	public Boolean validate( String field ) {
		final Pattern pattern = Pattern.compile( "([a-z])(\\1){1,}" );
		final Matcher matcher = pattern.matcher( field );
		final Boolean hasRepeatedLowercaseLetters = matcher.find();
		
		return !hasRepeatedLowercaseLetters;
	}
	
}
