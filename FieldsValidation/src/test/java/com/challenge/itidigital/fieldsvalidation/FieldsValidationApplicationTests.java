package com.challenge.itidigital.fieldsvalidation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.challenge.itidigital.fieldsvalidation.services.ValidatorFieldService;

@SpringBootTest
class FieldsValidationApplicationTests {
	
	@ParameterizedTest
	@ValueSource( strings = {"AbTp9!fok"} )
	public void validatePassword( String password ) {
		
		assertTrue( validatorFieldService.isPasswordValid( password ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = {" ", "aa", "ab", "AAAbbbCc", "AbTp9!foo", "AbTp9!foA", "AbTp9 fok"} )
	public void passowrdIsNotValid( String password ) {
		
		assertFalse( validatorFieldService.isPasswordValid( password ) );
		
	}
	
	@Autowired
	private ValidatorFieldService validatorFieldService;

}
