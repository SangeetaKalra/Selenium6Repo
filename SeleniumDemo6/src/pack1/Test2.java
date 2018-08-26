package pack1;

import org.testng.annotations.Test;

import library.BaseTest;

public class Test2 extends BaseTest {

	
	@Test(priority=1)
	public void google() {
		driver.get("https://www.google.com");	
	}
	@Test(priority=3)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	
	@Test
	public void insta() {
		driver.get("https://www.instagram.com");	
	}
	/*
	 * 
	 * @Test
	 * public void c(){
	 * 
	@Test(dependsOnMethods= {"c"}){
		public void b() {
			driver.get("https://www.facebook.com");	
		}
		@Test(dependsOnMethods= {"b"}){
		public void a() {
			driver.get("https://www.instagram.com");	
		}
		*/
	}
	

