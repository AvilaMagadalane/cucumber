package com.pb.cucumberdemo.pageobjs;

import java.util.HashMap;
import java.util.Map;

public class User_Objs 
{
	// Creation of HashMap
    private static final Map<String, String> userMap;

	
    static
    {
    	userMap = new HashMap<String, String>();
    	userMap.put("emailaddresstextbox", "email");
    	userMap.put("passwordtextbox", "passwd");
    	userMap.put("signinbutton", "SubmitLogin");
    }

	public String findLocator(String elementName)
	{	
		System.out.print("element inside class: "+elementName + "...");
		elementName = elementName.replaceAll("\\s","");
	    
	    if(userMap.containsKey(elementName))
	    {	
		return(userMap.get(elementName));
	    }
	    
	 
	 return null;   
	}
    

}
