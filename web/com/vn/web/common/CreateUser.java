package com.vn.web.common;

import org.apache.click.Page;
import org.apache.click.control.Form;
import org.apache.click.control.PasswordField;
import org.apache.click.control.Radio;
import org.apache.click.control.RadioGroup;
import org.apache.click.control.Submit;
import org.apache.click.control.TextField;
import org.apache.click.extras.control.EmailField;
import org.apache.click.extras.control.RegexField;

/**
 * @author viraj patil
 *
 */
public class CreateUser extends BorderPage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4974706790054755597L;
	
	public 	String			msg				=	"";
	
	private Form			form			= new Form("form");
	private TextField 		usernameField 	= new TextField("Usernname");
	private PasswordField	passwordField 	= new PasswordField("Password");
	private PasswordField   repasswordField = new PasswordField("Re-Password");
	private RadioGroup 		gender		 	= new RadioGroup("Gender");
	private EmailField		emailId			= new EmailField("Email");
	private RegexField		phonenoField	= new RegexField("Phone No");
	private Submit			submit			= new Submit("Submit",this,"onSumbitButtonClick");
	
	public CreateUser(){
		addControl(form);
		
		form.setButtonAlign("center");
		
		form.add(usernameField);
		form.add(passwordField);
		form.add(repasswordField);
		form.add(gender);
		form.add(emailId);
		form.add(phonenoField);
		form.add(submit);
		
		gender.add(new Radio("Male", "Male"));
        gender.add(new Radio("Female", "Female"));
        gender.setVerticalLayout(false);
	}
	
	public boolean onSumbitButtonClick() {
		msg += usernameField.getLabel() +":"+usernameField.getValue()+"</br>";
		msg += passwordField.getLabel() +":"+passwordField.getValue()+"</br>";
		msg += gender.getLabel() +":"+gender.getValue()+"</br>";
		msg += emailId.getLabel() +":"+emailId.getValue()+"</br>";
		msg += phonenoField.getLabel() +":"+phonenoField.getValue()+"</br>";
		
		return true;
		
	}
	
}