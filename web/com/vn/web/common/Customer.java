package com.vn.web.common;

import java.util.ArrayList;
import java.util.List;

import org.apache.click.control.FieldSet;
import org.apache.click.control.Form;
import org.apache.click.control.Option;
import org.apache.click.control.Select;
import org.apache.click.control.Submit;
import org.apache.click.control.TextArea;
import org.apache.click.control.TextField;
import org.apache.click.dataprovider.DataProvider;
import org.apache.click.extras.control.EmailField;

public class Customer extends BorderPage {

	private static final long serialVersionUID = 1L;
	
	private Form form = new Form("form");
	
	private FieldSet 	basicInfo	= new FieldSet("Basic Information");
	private TextField 	custName	= new TextField("Customer Name");
	private Select	  	occupation  = new Select("Occupation");
	private TextArea 	address		= new TextArea("Address");
	private EmailField 	emailField 	= new EmailField("Email");
	
	private FieldSet 	personalInfo= new FieldSet("Personal Information");
	private TextField 	fName		= new TextField("Father's Name");
	private TextField	mName	    = new TextField("Middle Name");
	private TextField 	wName		= new TextField("Wife's Name");
	
	private FieldSet 	agriInfo	= new FieldSet("Agriculture Information");
	private TextField 	area		= new TextField("Area");
	private Select		noOfWell	= new Select("Number of Well");
	private Select		noOfboar	= new Select("Number of boar");
	private TextField	form_7_12	= new TextField("Form 7/12");
	
	private Submit		validation		= new Submit("Validation",this,"onValidationClicked");
	private Submit		submit			= new Submit("  submit  ",this,"onSaveClicked");

	public Customer(){
		super.setTitle("Customer Information");
		addControl(form);

		form.add(basicInfo);
		form.setButtonAlign(form.ALIGN_CENTER);
		
		basicInfo.add(custName);
		occupation.setDataProvider(new DataProvider() {
		     public List getData() {
		         List options = new ArrayList();
		         options.add(new Option("Gov", "Gov"));
		         options.add(new Option("Farmer", "Farmer"));
		         options.add(new Option("Gov & Farmer", "Gov & Farmer"));
		         return options;
		     }
		 }); 
		basicInfo.add(occupation);
		basicInfo.add(address);
		basicInfo.add(emailField);
		
		form.add(personalInfo);

		personalInfo.add(fName);
		personalInfo.add(mName);
		personalInfo.add(wName);

		form.add(agriInfo);

		agriInfo.add(area);
		agriInfo.add(noOfWell);
		noOfWell.setDataProvider(new DataProvider() {
		     public List getData() {
		         List options = new ArrayList();
		         options.add(new Option("1", "1"));
		         options.add(new Option("2", "2"));
		         options.add(new Option("3", "3"));
		         options.add(new Option("4", "4"));
		         options.add(new Option("5", "5"));
		         options.add(new Option("6", "6"));
		         options.add(new Option("7", "7"));
		         options.add(new Option("8", "8"));
		         options.add(new Option("9", "9"));
		         options.add(new Option("10", "10"));
		         options.add(new Option("11", "11"));
		         options.add(new Option("12", "12"));
		         options.add(new Option("13", "13"));
		         options.add(new Option("14", "14"));
		         options.add(new Option("15", "15"));
		         options.add(new Option("16", "16"));
		         options.add(new Option("17", "17"));
		         options.add(new Option("18", "18"));
		         options.add(new Option("19", "19"));
		         options.add(new Option("20", "20"));
		         return options;
		     }
		 });
		agriInfo.add(noOfboar);
		noOfboar.setDataProvider(new DataProvider() {
		     public List getData() {
		         List options = new ArrayList();
		         options.add(new Option("1", "1"));
		         options.add(new Option("2", "2"));
		         options.add(new Option("3", "3"));
		         options.add(new Option("4", "4"));
		         options.add(new Option("5", "5"));
		         options.add(new Option("6", "6"));
		         options.add(new Option("7", "7"));
		         options.add(new Option("8", "8"));
		         options.add(new Option("9", "9"));
		         options.add(new Option("10", "10"));
		         options.add(new Option("11", "11"));
		         options.add(new Option("12", "12"));
		         options.add(new Option("13", "13"));
		         options.add(new Option("14", "14"));
		         options.add(new Option("15", "15"));
		         options.add(new Option("16", "16"));
		         options.add(new Option("17", "17"));
		         options.add(new Option("18", "18"));
		         options.add(new Option("19", "19"));
		         options.add(new Option("20", "20"));
		         return options;
		     }
		 });
		agriInfo.add(form_7_12);
		
		form.add(validation);
		form.add(submit);

	}

	@Override
	public boolean onSecurityCheck() {
		// TODO Auto-generated method stub
		return super.onSecurityCheck();
	}
	
	public boolean onValidationClicked() {
		return true;
	}
	
	public boolean onSaveClicked() {
		super.setMsg("Customer information saved successfully...");
		return true;
	}
}