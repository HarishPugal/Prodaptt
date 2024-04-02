package com.packages;

public class SocialMediaService implements DigitalService {
	 
	@Override
	public void login(String username, String password) {
		System.out.println("Logging in with username: " + username);
 
	}
 
	@Override
	public void logout() {
		System.out.println("Logging Out.....");
 
	}
 
	@Override
	public void accessContent(String content) {
		System.out.println("Accessing content: " + content);
 
	}
 
	public void updateProfile(String updateinfo) {
		System.out.println("Updating profile: " + updateinfo);
 
	}

	@Override
	public void updateProfile(String firstName, String lastName, String email) {
		// TODO Auto-generated method stub
		
	}
 
}