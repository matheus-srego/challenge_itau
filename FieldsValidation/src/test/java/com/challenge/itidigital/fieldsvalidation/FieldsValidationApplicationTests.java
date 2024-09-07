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

	@Autowired
	private ValidatorFieldService validatorFieldService;

	@ParameterizedTest
	@ValueSource( strings = {
			"@ozHaR0Q9", "3uEAR60t7Po%fMcg8Gi",
			"AbTp9!fok", "Ob&)ZsmKq(QkWCg^2U9-M0N", "q3O!s)Qf+"
	} )
	public void validateIsPassword( String password ) {
		
		assertTrue( validatorFieldService.isPasswordValid( password ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = {
			"x0AA 1_nUVz", "", "S5B#Z4G4!8)D", "PsL-xCaY", "NzXIW-M15M",
			"5+g2!b6N5", "HEa!wuz5!", "zntUX2YGhjjjC#I!", "AO(z)00+Vh4O-oP",
			"Slt7j-(OUA!)+ppt86$3", "K^Dpn@@eE9", "YY5R8Yfw$AW", "hJLhdb6K9CmDnAe", "@0wrmz6q7d9up"
	} )
	public void passowrdIsNotValid( String password ) {
		
		assertFalse( validatorFieldService.isPasswordValid( password ) );
		
	}

}
