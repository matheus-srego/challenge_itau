package com.challenge.itidigital.fieldsvalidation.services.servicesimpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.challenge.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorUppercaseLetterServiceImpl implements ValidatorService {

	@Override
	public Boolean validate( String field ) {
		final Pattern pattern = Pattern.compile( "([A-Z])" );
		final Matcher matcher = pattern.matcher( field );
		
		return matcher.find();
	}
	
}
