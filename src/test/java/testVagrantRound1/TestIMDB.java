package testVagrantRound1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testVagrant.base.TestBase;
import com.testVagrant.pages.IMDBHomePage;
import com.testVagrant.pages.IMDBMoviePage;
import com.testVagrant.pages.IMDBResultListPage;
import com.testVagrant.pages.WikiHomePage;
import com.testVagrant.pages.WikiMoviePage;
import com.testVagrant.utils.Utilities;

public class TestIMDB extends TestBase {
	
	IMDBHomePage imdbHomePage;
	IMDBResultListPage imdbResultListPage;
	IMDBMoviePage imdbMoviePage;
	WikiHomePage wikiHomePage;
	WikiMoviePage wikiMoviePage;
	Utilities util;
	String countryWiki;
	String countryIMDB;
	
	public TestIMDB() {
		super();
	}
	
	@BeforeClass
	public void setup() {
		initialization();
		imdbHomePage = new IMDBHomePage();
		imdbResultListPage = new IMDBResultListPage();
		imdbMoviePage = new IMDBMoviePage();
		wikiHomePage = new WikiHomePage();
		wikiMoviePage = new WikiMoviePage();
		util = new Utilities();
	}
	
	@Test(priority = 1)
	public void testReleaseDate() {
		imdbHomePage.movieNameSearch(prop.getProperty("movieName"));
		imdbResultListPage.clickOnMovieName();
		
		String dateIMDB = imdbMoviePage.getReleaseDate();
		countryIMDB = imdbMoviePage.getCountryName();
		
		util.loadURL(prop.getProperty("WikiURL"));
		wikiHomePage.movieNameSearch(prop.getProperty("movieName"));
		
		String dateWiki = wikiMoviePage.getReleaseDate();
		countryWiki = wikiMoviePage.getCountryName();
		
		String parts[] = dateWiki.split(" ");
		Assert.assertTrue(dateIMDB.contains(parts[0]));
		Assert.assertTrue(dateIMDB.contains(parts[1]));
		Assert.assertTrue(dateIMDB.contains(parts[2]));
		
	}
	
	@Test(priority = 2)
	public void testCountryName() {
		
		Assert.assertEquals(countryIMDB, countryWiki);
	}
	
	@AfterClass
	public void closure() {
		driver.quit();
		
	}

}
