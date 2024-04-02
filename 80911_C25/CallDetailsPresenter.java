package com.packages;

public class CallDetailsPresenter {
	 
    public static void displayCallDetails() {
        // Placeholder for fetching call records from the database
        CallRecordFetcher callRecordFetcher = new CallRecordFetcher();
        System.out.println("Displaying Call Details...");
        callRecordFetcher.fetchCallRecords();
    }
}