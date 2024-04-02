package com.packages;

public class CloudStorageService implements DigitalService {
    @Override
    public void login(String username, String password) {
        System.out.println("Logged in to Cloud Storage Service with username: " + username);
    }

    @Override
    public void logout() {
        System.out.println("Logged out from Cloud Storage Service");
    }

    @Override
    public void accessContent(String contentId) {
        System.out.println("Accessing content with ID: " + contentId + " on Cloud Storage Service.");
    }

    @Override
    public void updateProfile(String firstName, String lastName, String email) {
        System.out.println("Updated profile on Cloud Storage Service with first name: " + firstName + ", last name: " + lastName + ", and email: " + email);
    }
}