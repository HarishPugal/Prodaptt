package com.packages;

public interface DigitalService {
	void login(String username, String password);
 
	void logout();
 
	void accessContent(String contentId);
 
	void updateProfile(String firstName, String lastName, String email);
}