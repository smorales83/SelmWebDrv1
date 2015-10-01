package com.globant.wikipedia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectWikipediaMain {
	private static final String URL_WIKIPEDIA_MAIN = "https://en.wikipedia.org/wiki/Main_Page";
	private static final String RANDOM_ARTICLE_TEXT = "Random article";
	private final WebDriver driver;

	public PageObjectWikipediaMain(WebDriver driver){
		this.driver = driver;
	}

	public void goToMainPage(){
		driver.get( URL_WIKIPEDIA_MAIN );
	}

	public void goToRandomPage(){
		WebElement elementRandomLink = findRandomArticleLink();
		elementRandomLink.click();
	}

	private WebElement findRandomArticleLink(){
		return findLinkElementByText( RANDOM_ARTICLE_TEXT );
	}

	private WebElement findLinkElementByText( String text ){
		return driver.findElement( By.linkText( text ) );
	}

	public PageObjectRandomWikipediaArticle getArticleData(  ) {
		PageObjectRandomWikipediaArticle page = new PageObjectRandomWikipediaArticle( driver );
		return page;
	}
}
