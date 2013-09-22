package com.vn.web.common;

import org.apache.click.extras.control.Menu;

public class BorderPage11 extends org.apache.click.Page {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Menu rootMenu;

	public BorderPage11() { 

		if (rootMenu == null) { 
			rootMenu = new MenuBuilder().buildMenu(); 
		} 

		addControl(rootMenu); 
	} 

}