package com.demowebshop.automation.Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass_SmokeCompare {
	@FindBy(linkText = "Log in")
	private WebElement login_link;


	@FindBy(id="Email")
	private WebElement email_textfield;


	@FindBy(id="Password")
	private WebElement password_textfield;


	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement login_btn;
	
	@FindBy(xpath= "//ul[@class='top-menu']/li[1]/a")
	private WebElement books_tab;
	
	@FindBy(xpath= "//select[@id='products-orderby']")
	private WebElement sortby_drop;
	
	@FindBy(xpath= "//select[@id='products-pagesize']")
	private WebElement disp_drop;
	
	@FindBy(xpath= "//select[@id='products-viewmode']")
	private WebElement view_drop;
	
	@FindBy(xpath= "//a[text()='Computing and Internet']/../following-sibling::div[3]/div[2]/input")
	private WebElement computing_addtocart;
	
	@FindBy(xpath= "//a[text()='Health Book']/../following-sibling::div[3]/div[2]/input")
	private WebElement health_addtocart;
	
	@FindBy(linkText= "Fiction")
	private  WebElement fiction_link ;
	
	 
	public PomClass_SmokeCompare(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
				
	}

	public WebElement login_Link()
	{
		return login_link;
	}
   
	public WebElement email_text()
	{
		return email_textfield;
	}
	
	public WebElement pass_text()
	{
		return password_textfield;
	}
	
	public WebElement login_button()
	{
		return login_btn;
	}
	
	public WebElement books_Tab()
	{
		return books_tab;
	}
	
	public WebElement sort_dropdown()
	{
		return sortby_drop;
	}
	
	public WebElement disp_dropdown()
	{
		return disp_drop;
	}
}
	
	


	
	
	
	
	
	
	
	


