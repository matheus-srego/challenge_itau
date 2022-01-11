package com.challange.itidigital.fieldsvalidation.servicesimpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.challange.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorRepeatedDigitWithinTheSetServiceImpl implements ValidatorService {
	
	@Override
	public Boolean validate( String field ) {
		final Pattern pattern = Pattern.compile( "(?=.*[0-9]+$)" );
		final Matcher matcher = pattern.matcher( field );
		final Boolean hasRepeatedDigit = matcher.matches();
		
		return !hasRepeatedDigit;
	}
	
}
