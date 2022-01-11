package com.challange.itidigital.fieldsvalidation.servicesimpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.challange.itidigital.fieldsvalidation.services.ValidatorService;

public class ValidatorRepeatedSpecialCharacterInSequenceServiceImpl implements ValidatorService {
	
	@Override
	public Boolean validate( String field ) {
		final Pattern pattern = Pattern.compile( "([!@#$%^&*()-+])(\\1){1,}" );
		final Matcher matcher = pattern.matcher( field );
		final Boolean hasRepeatedSpecialCharacter = matcher.find();
		
		return !hasRepeatedSpecialCharacter;
	}
	
}
