package com.assignment3.app;

public class User {
	public boolean validation(String [] user_Name,String [] User_pass,String username,String userpass) {

	      for(int i=0;i<user_Name.length;i++) {
	    	  if(username.equals(user_Name[i]) && userpass.equals(User_pass[i])) {
	    		  return true;
	    	  }
	      }
	      return false;
	}
}