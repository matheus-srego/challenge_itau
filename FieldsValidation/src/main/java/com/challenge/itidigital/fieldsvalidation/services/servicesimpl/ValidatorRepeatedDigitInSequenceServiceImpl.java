package com.challenge.itidigital.fieldsvalidation.services.servicesimpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.challenge.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorRepeatedDigitInSequenceServiceImpl implements ValidatorService {
	
	@Override
	public Boolean validate( String field ) {
		final Pattern pattern = Pattern.compile( "([0-9])(\\1){1,}" );
		final Matcher matcher = pattern.matcher( field );
		final Boolean hasRepeatedDigit = matcher.find();
		
		return !hasRepeatedDigit;
	}
	
}
