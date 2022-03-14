package TestNG_Ex.example;
import org.testng.annotations.Test;
public class FirstTest1 {
  @Test(groups= {"smoke"})
    public void test1() {
     System.out.println("test1");
  }
  
  @Test(groups= {"smoke","functional"})
  public void test2() {
      System.out.println("test2");
  }
  
  @Test(groups= {"regression"}) 
  public void test3() {
      System.out.println("test3");
  }
  
}