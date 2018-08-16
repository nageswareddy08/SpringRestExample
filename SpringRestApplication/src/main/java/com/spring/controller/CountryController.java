package com.spring.controller;

import com.spring.bean.Country;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nageswar on 7/31/2018.
 */
@RestController
public class CountryController {
    @RequestMapping(value = "/countries",method = RequestMethod.GET,headers = "Accept=application/json")
    public List<Country> getCountries(){
        List<Country> countryList = new ArrayList<>();
        countryList = createCountryList();
        return countryList;
    }
    @RequestMapping(value = "/country{id}",method = RequestMethod.GET,headers = "Accept=application/json")
    public Country getCountryById(@PathVariable int id){
        List<Country> countryList = new ArrayList<>();
        countryList = createCountryList();
        for(Country country :countryList){
            if(country.getId() == id){
                return country;
            }
        }
        return null;
    }

    private List<Country> createCountryList() {
        List<Country> countryList = new ArrayList<>();
        Country countryOne = new Country(1,"IN");
        Country countryTwo = new Country(2,"US");
        Country countryThree = new Country(3,"AU");
        Country countryFour = new Country(4,"GE");
        Country countryFive = new Country(5,"UK");
        countryList.add(countryOne);
        countryList.add(countryTwo);
        countryList.add(countryThree);
        countryList.add(countryFour);
        countryList.add(countryFive);
        return countryList;
    }

}
