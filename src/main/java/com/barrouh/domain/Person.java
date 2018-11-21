package com.barrouh.domain;

import java.util.List;

public class Person {
	
	private String firstName;
	
	private String lastName;
	
	private String phoneNumber;
	
	private String email;
	
	private String image;
	
	private String welcomeQuote;
	
	private String facebookLink;
	
	private String githubLink;
	
	private String linkedinLink;
	
	private String instagramLink;
	
	private List<Skill> skills;
	
	private List<Story> stories;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}

	public String getWelcomeQuote() {
		return welcomeQuote;
	}

	public void setWelcomeQuote(String welcomeQuote) {
		this.welcomeQuote = welcomeQuote;
	}

	public String getFacebookLink() {
		return facebookLink;
	}

	public void setFacebookLink(String facebookLink) {
		this.facebookLink = facebookLink;
	}

	public String getGithubLink() {
		return githubLink;
	}

	public void setGithubLink(String githubLink) {
		this.githubLink = githubLink;
	}

	public String getLinkedinLink() {
		return linkedinLink;
	}

	public void setLinkedinLink(String linkedinLink) {
		this.linkedinLink = linkedinLink;
	}

	public String getInstagramLink() {
		return instagramLink;
	}

	public void setInstagramLink(String instagramLink) {
		this.instagramLink = instagramLink;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public List<Story> getStories() {
		return stories;
	}

	public void setStories(List<Story> stories) {
		this.stories = stories;
	}
	
}
