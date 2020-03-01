package org.jbadams.spring.springmvc.mvc;

import java.util.LinkedHashMap;

// demonstrate Model binding with html form data

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;
    // define country options in the class
    private LinkedHashMap<String, String> countryOptions;
    // define favorite language options in the class
    private LinkedHashMap<String, String> favoriteLanguageOptions;

    public Student() {
        // populate country options: used ISO country codes
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
        countryOptions.put("CA", "Canada");

        // populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();
        favoriteLanguageOptions.put("Python", "Python");
        favoriteLanguageOptions.put("Perl", "Perl");
        favoriteLanguageOptions.put("R", "R");
        favoriteLanguageOptions.put("C++", "C++");
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("JavaScript", "JavaScript");
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }
}