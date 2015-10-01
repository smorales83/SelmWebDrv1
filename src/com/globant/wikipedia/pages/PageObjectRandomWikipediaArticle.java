package com.globant.wikipedia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectRandomWikipediaArticle {
	private String title;
	private String firstHeading;
	private String url;
	
	private final WebDriver driver;

	public PageObjectRandomWikipediaArticle(WebDriver driver){
		this.driver = driver;
		this.setTitle( driver.getTitle() );
		this.setUrl( driver.getCurrentUrl() );
		this.setFirstHeading( getFirstHeadingText() );
	}

	private String getFirstHeadingText() {
		return driver.findElement( By.id("firstHeading") ).getText();
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public void setFirstHeading( String firstHeading ) {
		this.firstHeading = firstHeading;
	}
	public String getFirstHeading() {
		return firstHeading;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
