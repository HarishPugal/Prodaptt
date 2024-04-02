package com.packages;



public class ConnectXPlatform {
	public static void main(String[] args) {
		DigitalService streamingService = new StreamingService();
		DigitalService cloudStorageService = new CloudStorageService();

		streamingService.login("User-1", "password*123");
		streamingService.accessContent("movie123");
		streamingService.updateProfile("Xyz", "Uvw", "xyz.uvw@example.com");
		streamingService.logout();

		System.out.println("--------------------------------");

		cloudStorageService.login("User-2", "password*456");
		cloudStorageService.accessContent("file456");
		cloudStorageService.updateProfile("Abc", "def", "abc.def@example.com");
		cloudStorageService.logout();
	}
}

 