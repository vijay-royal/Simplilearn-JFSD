package TestNG_Ex.example;

import org.testng.annotations.Test;

public class NewTest2 {
  @Test(priority = 1)
  public void signUp() {
  System.out.println("user does signup");
  }
  @Test(priority = 2)
  public void signIn() {
      System.out.println("user logs in");
  }
  @Test(priority = 3)
  public void searchForTicket() {
      System.out.println("user serach for tickets");
  }
  @Test(priority = 4)
  public void bookTicket() {
      System.out.println("user book ticket");
  }
  @Test(priority = 5)
  public void saveTicket() {
      System.out.println("user save ticket");
  }
  @Test(priority = 6)
  public void payTicket() {
      System.out.println("user pay for ticket");
  }
  @Test(priority = 7)
  public void logOut() {
      System.out.println("user logs out");
  }
}
