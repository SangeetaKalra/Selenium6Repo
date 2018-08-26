package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class Link1PO extends BasePage {
	
	public Link1PO(WebDriver driver) {
		super(driver);

	}

	
	@FindBy(id="i1")
	private WebElement myGoogleLink;
	public WebElement myGoogleLink() {
		return myGoogleLink;
	}
	
	@FindBy(id="i2")
	private WebElement myFacebookLink;
	public WebElement myFacebookLink() {
		return myFacebookLink;
	}
	
	@FindBy(id="i3")
	private WebElement myTwitterLink;
	public WebElement myTwitterLink() {
		return myTwitterLink;
	}
	
	@FindBy(id="i4")
	private WebElement myInstaLink;
	public WebElement myInstaLink() {
		return myInstaLink;
	}
	
	
}
