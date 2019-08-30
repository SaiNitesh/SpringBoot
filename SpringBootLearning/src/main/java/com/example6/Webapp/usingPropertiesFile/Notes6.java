package com.example6.Webapp.usingPropertiesFile;

public class Notes6 {
	
	/*
	 * 
	 * Remember spring boot doesnt support JSP so add 'tomcat jasper' dependency
	 * 
	 * 
	 * 
	 *Here were are returning JSP pages in the request mapping method
	 *
	 *JSP files will be stored under
	 *src->main->webapp
	 *
	 *-------------------------------------------------------------------
	 *
	 *using properties file
	 *--------------------
	 *
	 *Here we are using properties  file to mention the prefix and suffix pattern of the JSP files
	 * 
	 * prefix is for location of view files(like jsp)
	 * suffix is for view pages extension(like .jsp, .html etc)
	 *
	 *The default location for the view is src->main->webapp
	 *so we use prefix to find the files if the views are saved in different location.
	 *Lets say the JSP files are saved under a new folder called pages src->main->webapp->pages
	 *then the prefix will be like this
	 *spring.mvc.view.prefix=/pages/
	 *
	 * 
	 * 
	 * */

}
