package com.challenge.itidigital.fieldsvalidation.services.servicesimpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.challenge.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorBlankSpaceServiceImpl implements ValidatorService {
	
	@Override
	public Boolean validate( String field ) {
		final Pattern pattern = Pattern.compile( "(\\s)" );
		final Matcher matcher = pattern.matcher( field );
		final Boolean noHasBlankSpace = !matcher.find();
		
		return noHasBlankSpace;
	}
	
}
