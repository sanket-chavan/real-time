package com.rt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ssn-web-api")
public class SSNOperationalController {

	@GetMapping("/find/{ssn}")
	public ResponseEntity<String> getStateBySSN(@PathVariable Long ssn){
		System.out.println(ssn);
		if( String.valueOf(ssn).length() != 9) {
			System.out.println("in side if"+ ssn.intValue());
			return new ResponseEntity<String>("Invalid ssn", HttpStatus.BAD_REQUEST);
		};
		String stateName = null;
		int formatted = (int) (ssn % 100);
		System.out.println(formatted);
		if(formatted == 01) {
			stateName = "Texas";
		}else if(formatted == 02) {
			stateName = "California";
		}if(formatted == 03) {
			stateName = "Florida";
		}else if(formatted == 04) {
			stateName = "Ohio";
		}else {
			stateName = "Invalid ssn";//PF07MKE8
		}
		return new ResponseEntity<String>(stateName, HttpStatus.OK);
	}
	
	
}
