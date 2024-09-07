package com.challenge.itidigital.fieldsvalidation.servicesimpl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.challenge.itidigital.fieldsvalidation.services.servicesimpl.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ValidatorServiceTests {

	@InjectMocks
	private ValidatorFieldEmptyServiceImpl fieldEmptyService;

	@InjectMocks
	private ValidatorNumberOfCharactersServiceImpl numberOfCharactersService;

	@InjectMocks
	private ValidatorBlankSpaceServiceImpl blankSpaceService;

	@InjectMocks
	private ValidatorLowercaseLetterServiceImpl lowercaseLetterService;

	@InjectMocks
	private ValidatorUppercaseLetterServiceImpl uppercaseLetterService;

	@InjectMocks
	private ValidatorDigitServiceImpl digitService;

	@InjectMocks
	private ValidatorSpecialCharacterServiceImpl specialCharacterService;

	@InjectMocks
	private ValidatorRepeatedCharactersWithinTheSetServiceImpl repeatedCharactersWithinTheSetService;

	@InjectMocks
	private ValidatorRepeatedLowercaseLetterInSequenceServiceImpl repeatedLowercaseLetterInSequenceService;

	@InjectMocks
	private ValidatorRepeatedUppercaseLetterInSequenceServiceImpl repeatedUppercaseLetterInSequenceService;

	@InjectMocks
	private ValidatorRepeatedDigitInSequenceServiceImpl repeatedDigitInSequenceService;

	@InjectMocks
	private ValidatorRepeatedSpecialCharacterInSequenceServiceImpl repeatedSpecialCharacterInSequenceService;

	@ParameterizedTest
	@ValueSource( strings = { "" } )
	public void isFieldEmpty( String field ) {
		
		assertFalse( fieldEmptyService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "Lz!78arp@", "$oZ4)aqI-#cQj;", "rO0(qMGRawe", "Of(Eu8l@s", "e$u1ky&-U#XKNp18e" } )
	public void noHasFieldEmpty( String field ) {
		
		assertTrue( fieldEmptyService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "Lz!78arp@", "$oZ4)aqI-#cQj;", "rO0(qMGRawe", "Of(Eu8l@s", "e$u1ky&-U#XKNp18e" } )
	public void numberOfCharactersIsValid( String field ) {
		
		assertTrue( numberOfCharactersService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "IY1}MSx", "I,Z}dxL+", "OT8aH", "p", ".(W}=KyX" } )
	public void numberOfCharactersIsNotValid( String field ) {
		
		assertFalse( numberOfCharactersService.validate( field ) );
		
	}

	@ParameterizedTest
	@ValueSource( strings = { " ", "x0AA 1_nUVz", " l7PzCz)7", "wwUT6heR!gNZLxpY#B ", "e$u1ky&-U#XKN p18e" } )
	public void hasBlankSpaceInField( String field ) {
		
		assertFalse( blankSpaceService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "3V92+HI0BxZW", "V)XK,g!i)gzsQ", "ks2YP2O%TEF", "Of(Eu8l@s", "e$u1ky&-U#XKNp18e" } )
	public void noHasBlankSpaceInField( String field ) {
		
		assertTrue( blankSpaceService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "Vd(6wg%t0f", "+C5gAiT%nHJ#3", "$oZ4)aqI-#cQj;", "rO0(qMGRawe", "x63#(w0VG_]mM0" } )
	public void hasLowercaseLetterInTheField( String field ) {
		
		assertTrue( lowercaseLetterService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "{'#~U(YM][W)W$", "8.JY=68Q9", "X6!;O}B'8=^-%[8;8239Q=4", "-N_.$^1E3+LTLA333Y;J", "WGMX{MGB931" } )
	public void noHasLowercaseLetterInTheField( String field ) {
		
		assertFalse( lowercaseLetterService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "Vd(6wg%t0f", "+C5gAiT%nHJ#3", "$oZ4)aqI-#cQj;", "rO0(qMGRawe", "x63#(w0VG_]mM0" } )
	public void hasUppercaseLetterInTheField( String field ) {
		
		assertTrue( uppercaseLetterService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { ".@ulvyyc)9)}z(y^+4+n", "3m89g]@3~", "p;5'g8u[wg(2+83sn7l=;7#", "3gw}[", "g)06u$j4wfrbcnndn" } )
	public void noHasUppercaseLetterInTheField( String field ) {
		
		assertFalse( uppercaseLetterService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "vm'Vm-2z~q7yJU34Fh)NV.MBH", "hm9b0CZ+F", "X48YcXznUAV", "p1QsFlHGoI+D", "x63#(w0VG_]mM0" } )
	public void hasDigitInTheField( String field ) {
		
		assertTrue( digitService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { ".PAblgKDZY_KItjFrhHP.uwjM", "D{%~ihQmNKCRcEj", "oEUCIcJlTZToWXWeBegRp", "Ij$k{O.~YAu='QPY]", "oroDfRkDaiITXgLgmnogp" } )
	public void noHasDigitInTheField( String field ) {
		
		assertFalse( digitService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+" } )
	public void validateSpecialCharacters( String field ) {
		
		assertTrue( specialCharacterService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "Vd(6wg%t0f", "+C5gAiT%nHJ#3", "$oZ4)aqI-#cQj;", "rO0(qMGRawe", "x63#(w0VG_]mM0" } )
	public void hasSpecialCharacterInTheField( String field ) {
		
		assertTrue( specialCharacterService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "HVDNaD7TTIbEG1", "Qay6ZCj zeqJ2Yr", "uEvn1jB", "HN8JgpXvB5sEQiyOXWSA", "WGMX{gMGB931ou" } )
	public void noHasSpecialCharacterInTheField( String field ) {
		
		assertFalse( specialCharacterService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "t#lBJ8yGfPKI@-If_2", "Mh(alc1=44", "ruPka4RDT.drt13)lRreeiM,6", "PQi~mx(;^=_#f#5E", "uh%IM;b=MouJ" } )
	public void hasRepeatedCharactersWithinTheSetInTheField( String field ) {
		
		assertFalse( repeatedCharactersWithinTheSetService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "7}RA=eW(muO", "VIHNC!$zoZ_'LKaX@3Afpb#", "L)8YBeQpo", ")cC3^XHwqVb", "$2ow&SV" } )
	public void noHasRepeatedCharactersWithinTheSetInTheField( String field ) {
		
		assertTrue( repeatedCharactersWithinTheSetService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "oQRZGY~lp6ILwwKRs30-a-I", "xfgLU95#}y!AL,Ot0nn", "!5Z2@zzoY", "KCe'TOpcc3BQ$H8GP", "9xx.!Zm" } )
	public void hasRepeatedLowercaseLetterInSequenceInTheField( String field ) {
		
		assertFalse( repeatedLowercaseLetterInSequenceService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "3Buko{i", "}lCFM#pySzc5VsjZ5TnO[9C", "xrQE%(F5E", "T&dLT4Mf}", "GtuMXPg)3_KvGR!"} )
	public void noHasRepeatedLowercaseLetterInSequenceInTheField( String field ) {
		
		assertTrue( repeatedLowercaseLetterInSequenceService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "c]TTt+{v.wqwH;F+", "t[auFvT(NMMM0I4xo", "cv7QR,#XXq", "7uor-gcB$-^)UAIgNo786MM", "QQZVgB8w]1U{]xci" } )
	public void hasRepeatedUppercaseLetterInSequenceInTheField( String field ) {
		
		assertFalse( repeatedUppercaseLetterInSequenceService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "T{9e)CbyDyh+FrS028tE(&5", "fMIJQn~+,", "LDr;=", "kYXgn;ed{@", "X^D7cvF^L+S,z#9" } )
	public void noHasepeatedUppercaseLetterInSequenceInTheField( String field ) {
		
		assertTrue( repeatedUppercaseLetterInSequenceService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "&[448C]{(n", "c%vN7m88]", "rY&aGVuMZ-@P-5332+c8Vm[", "55&&P25hDiXqC0H7D", "DjP5mbiv33@" } )
	public void hasRepeatedDigitInSequenceServiceInTheField( String field ) {
		
		assertFalse( repeatedDigitInSequenceService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "eloDnnj$V6#", "Z7%-&3y_C", "hij^;6{BQLFA{_cOIkhTz1)", "!O#cxFI](~4V35O", "_eR,A;r;L1xDM$" } )
	public void noHasRepeatedDigitInSequenceServiceInTheField( String field ) {
		
		assertTrue( repeatedDigitInSequenceService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "Y}^^xLr0k9Qvbhdj", "K5))f!Dm.E", "x)U6;z%%wG", "D~##q_6qrUv0DBC", "(55yxiwH#h9mDJE++9di#IS" } )
	public void hasRepeatedSpecialCharacterInSequenceServiceInTheField( String field ) {
		
		assertFalse( repeatedSpecialCharacterInSequenceService.validate( field ) );
		
	}
	
	@ParameterizedTest
	@ValueSource( strings = { "@D!yIosW]", "z@v60,P@Fg8NQml'rPcE(wx", "!9fokJqT-lY(gJ+", "X3=48gUs1({dX%TS5F9y!", "RCdoG1Vz5EXt)^U0Z" } )
	public void noHasRepeatedSpecialCharacterInSequenceServiceInTheField( String field ) {
		
		assertTrue( repeatedSpecialCharacterInSequenceService.validate( field ) );
		
	}

}
