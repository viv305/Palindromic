package com.odx.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odx.test.model.Test;
import com.odx.test.repository.TestRepository;
import com.odx.test.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestRepository repository;
	
	@Override
	public String longestPalindromValue(String input) {
		int maxLength = 1; 		  
        int start = 0; 
        int len = input.length(); 
        int low, high; 
        for (int i = 1; i < len; ++i){
            low = i - 1; 
            high = i; 
            while (low >= 0 && high < len 
                    && input.charAt(low) == input.charAt(high)) { 
                if (high - low + 1 > maxLength) { 
                    start = low; 
                    maxLength = high - low + 1; 
                } 
                --low; 
                ++high; 
            } 
            low = i - 1; 
            high = i + 1; 
            while (low >= 0 && high < len 
                    && input.charAt(low) == input.charAt(high)) { 
                if (high - low + 1 > maxLength) { 
                    start = low; 
                    maxLength = high - low + 1; 
                } 
                --low; 
                ++high; 
            } 
        } 
        String longest = input.substring(start, start + maxLength);
        saveDetails(input,longest);
        return longest;
	}

	private void saveDetails(String input , String longest) {
		Test t = new Test();
		t.setName(input);
		t.setLongestPalindrom(longest);
		repository.save(t);
	}

	@Override
	public String getLongestPalindromValue(String input) {
		Test t = repository.findByName(input);
		return t !=null ? t.getLongestPalindrom():"Not Available";
	}

}
