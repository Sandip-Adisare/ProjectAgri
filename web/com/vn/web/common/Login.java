package com.vn.web.common;

import org.apache.click.Page;
import org.apache.click.control.Form;
import org.apache.click.control.PasswordField;
import org.apache.click.control.Submit;
import org.apache.click.control.TextField;
import org.apache.commons.lang.text.StrBuilder;

import com.vn.core.AppUtil;

/**
 * @author viraj patil
 *
 */
public class Login extends Page {
	/**
	 *  
	 */
	private static final long serialVersionUID = 4534053510736891920L;
	
	private String username;
	private String password;
	
	public String msg="";

	private Form 		form = new Form("login");
	private TextField 	unField = new TextField("Username");
	private PasswordField 	pwField = new PasswordField("Password");

	private Submit		login_Submit	  = new Submit("Login",this,"onLoginClick");

	/**
	 * Login page constructor.
	 */
	public Login(){
		username = "";
		password = "";
		addControl(form);
		form.add(unField);
		form.add(pwField);
		form.add(login_Submit);		
	}

	/**
	 * This is event handler for Login button.
	 * @return {@link Boolean}
	 */
	public boolean onLoginClick() {
		username = unField.getValue();
		password = pwField.getValue();
		if (!AppUtil.isEmpty(username) && !AppUtil.isEmpty(password) && username.equals("admin") && password.equals("admin")) {
			this.setMsg("Login is successfull...");
			getContext().getSession().setAttribute("username", unField.getValue().trim());
			getContext().getSession().setAttribute("password", pwField.getValue().trim());
			setForward("home.htm");
		} else {
			
		}
		//this.setMsg(username + password);
		return true;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}