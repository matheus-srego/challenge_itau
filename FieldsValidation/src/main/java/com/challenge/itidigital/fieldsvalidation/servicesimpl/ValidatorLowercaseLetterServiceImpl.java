package com.challenge.itidigital.fieldsvalidation.servicesimpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.challenge.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorLowercaseLetterServiceImpl implements ValidatorService {

	@Override
	public Boolean validate( String field ) {
		final Pattern pattern = Pattern.compile( "([a-z])" );
		final Matcher matcher = pattern.matcher( field );
		final Boolean hasLowercaseLetter = matcher.find();
		
		return hasLowercaseLetter;
	}
	
}
