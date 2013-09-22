package com.vn.web.admin;

import org.apache.click.control.Form;

import com.vn.web.common.BorderPage;

public class Admin extends BorderPage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Form form = new Form("form");

	public Admin(){
		addControl(form);
	}

}