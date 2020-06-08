package com.odx.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Test {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String longestPalindrom;
	public Test() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLongestPalindrom() {
		return longestPalindrom;
	}
	public void setLongestPalindrom(String longestPalindrom) {
		this.longestPalindrom = longestPalindrom;
	}
	
	

}
