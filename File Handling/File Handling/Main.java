package com.packages;

import java.util.Map;

public class Main {
	   public static void main(String[] args) {
	       String filePath = "D:/country.csv"; 
	       Map<String, String> countryCapitalMap = TextFileHandler.loadCsvFileToMap(filePath);
	       for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
	           System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
	       }
	   }
	}