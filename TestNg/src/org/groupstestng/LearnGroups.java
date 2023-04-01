package org.groupstestng;

import org.testng.annotations.Test;

public class LearnGroups {
	@Test(groups= {"smoke"})
 public void signUp() {
	 System.out.println("SignUp");
 }
	@Test(groups= {"sanity"},dependsOnMethods="signUp")
 public void Login() {
	 System.out.println("Login");
 }
	@Test(groups= {"reg"})
 public void serach() {
	 System.out.println("Search");
 }
	@Test(groups= {"smoke"})
 public void Addtocart() {
	 System.out.println("AddtoCart");
 }
	@Test(groups= {"reg"})
 public void Logout() {
	 System.out.println("Logout");
 }
}
