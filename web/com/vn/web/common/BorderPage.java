package com.vn.web.common;

import javax.servlet.http.HttpSession;

import org.apache.click.Page;
import org.apache.click.extras.control.Menu;
import org.apache.click.extras.control.MenuFactory;

/**
 * Provides a page border template. This Page returns the template
 * <tt>"border-template.htm"</tt>, and sets the Page model values <tt>$title</tt> and
 * <tt>$srcPath</tt>.
 * <p/>
 * Please note this page is designed for extending by Page subclasses and will
 * not be auto mapped as the template name <tt>"border-template.htm"</tt> does
 * not match the Pages class name <tt>BorderPage</tt>.
 */
public class BorderPage extends Page {

    private static final long serialVersionUID = 1L;
    private Menu rootMenu; 
    
    public String version="unknown";
    public String title="unknown";
    public String msg="";
    
    public BorderPage() { 
        MenuFactory menuFactory = new MenuFactory(); 
        rootMenu = menuFactory.getRootMenu(); 
        System.out.println(rootMenu);
        addControl(rootMenu); 
    } 
    
    @Override
    public boolean onSecurityCheck() {
    	super.onSecurityCheck();
    	HttpSession  httpSession = getContext().getSession();
    	System.out.println("username"+httpSession.getAttribute("username"));
    	System.out.println("pass"+httpSession.getAttribute("password"));
    	if (httpSession.getAttribute("username") == "admin" && httpSession.getAttribute("password") == "admin") {
    		setMsg("Onsecurity called");
    		System.out.println("On security check");
			return true;
		} else {
			System.out.println("retuns false");
			return false;
		}
    }

    
    @Override 
    public String getTemplate() { 
        return "/border-template.htm"; 
    }

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	} 
    
	public void setMsg(String _msg) {
		this.msg=_msg;
	}

}
