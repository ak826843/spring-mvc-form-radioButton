package com.shinde.customer.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.shinde.customer.model.Customer;

public class RadioButtonController extends SimpleFormController {

	public RadioButtonController() {
		setCommandClass(Customer.class);
		setCommandName("customerForm");

	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		Customer cust = new Customer();
		cust.setSex("M");
		return cust;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		Customer customer = (Customer) command;
		return new ModelAndView("CustomerSuccess", "customer", customer);
	}

	// Generate the data for web framework multiple checkboxes
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected Map referenceData(HttpServletRequest request) throws Exception {
		Map referenceData = new HashMap();
		List<String> numberList = new ArrayList<String>();
		numberList.add("Number 1");
		numberList.add("Number 2");
		numberList.add("Number 3");
		numberList.add("Number 4");
		referenceData.put("numberList", numberList);
		return referenceData;
	}

}
