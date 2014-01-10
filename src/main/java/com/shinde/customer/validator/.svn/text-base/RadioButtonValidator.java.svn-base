package com.shinde.customer.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.shinde.customer.model.Customer;

public class RadioButtonValidator implements Validator {

	@Override
	public boolean supports(@SuppressWarnings("rawtypes") Class claszz) {
		// just validate the customer instance
		return Customer.class.isAssignableFrom(claszz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils
				.rejectIfEmptyOrWhitespace(errors, "sex", "required.sex");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "favNumber",
				"required.favNumber");

	}

}
