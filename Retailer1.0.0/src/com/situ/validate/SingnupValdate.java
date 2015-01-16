package com.situ.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.situ.command.SignupCmand;
@Component
public class SingnupValdate implements Validator {

	public boolean supports(Class<?> classtype) {
		System.out.println("support");
		return classtype.isAssignableFrom(SignupCmand.class);
	}

	public void validate(Object command, Errors errors) {
		System.out.println("validate");
		SignupCmand scm = (SignupCmand) command;
		if (scm.getId() == 0) {
			errors.rejectValue("id", "idError");
		}
	}

}
