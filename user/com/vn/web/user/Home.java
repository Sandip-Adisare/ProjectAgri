package com.vn.web.user;

import org.apache.click.control.Form;

import com.vn.web.common.BorderPage;

public class Home extends BorderPage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Form form=new Form("form");
	public Home(){
		title = "";
		addControl(form);
	}


}