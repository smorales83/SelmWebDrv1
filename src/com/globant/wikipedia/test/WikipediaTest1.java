package com.globant.wikipedia.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.globant.wikipedia.pages.PageObjectRandomWikipediaArticle;
import com.globant.wikipedia.pages.PageObjectWikipediaMain;

import static org.junit.Assert.*;

import org.junit.Test;

public class WikipediaTest1 {

	@Test
	public void testWikipediaRandom() {
		WebDriver driver = new FirefoxDriver();
		PageObjectWikipediaMain mainWiki = new PageObjectWikipediaMain( driver );
		mainWiki.goToMainPage();
		mainWiki.goToRandomPage();
		PageObjectRandomWikipediaArticle randomArticle1 = mainWiki.getArticleData(  );
		mainWiki.goToRandomPage();
		PageObjectRandomWikipediaArticle randomArticle2 = mainWiki.getArticleData(  );

		assertNotEquals("The title is not different", randomArticle1.getTitle(), randomArticle2.getTitle() );
		assertNotEquals("The Url is not different", randomArticle1.getUrl(), randomArticle2.getUrl() );
		assertNotEquals("The H1 with id firstHeading is not different", randomArticle1.getFirstHeading(), randomArticle2.getFirstHeading() );

		driver.close();
	}
}