package com.packages;

import java.util.Map;

public class MainCountryMap {
 
	public static void main(String[] args) {
		System.out.println("Question 3 : ");
		String filePath = "D:/country.csv";
	    Map<String, String> countryCapitalMap = CountryMap.loadCsvFileToMap(filePath);
	    char startsWith = 'I'; 
	    String outputFile = "D:/country_filtered.txt";
	    CountryMap.writeFilteredCountries(outputFile, countryCapitalMap, startsWith);
	    System.out.println("Filtered countries have been written to the file.");
	}
 
}