package com.packages;

public class StreamingService implements DigitalService {
	 
	@Override
	public void login(String username, String password) {
		System.out.println("Logged in to Streaming Service with username: " + username);
	}
 
	@Override
	public void logout() {
		System.out.println("Logged out from Streaming Service.");
	}

	@Override
	public void accessContent(String contentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProfile(String firstName, String lastName, String email) {
		// TODO Auto-generated method stub
		
	}
}