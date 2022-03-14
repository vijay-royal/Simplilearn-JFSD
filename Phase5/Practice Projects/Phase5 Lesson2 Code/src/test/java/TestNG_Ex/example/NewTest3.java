package TestNG_Ex.example;
import org.testng.annotations.Test;
public class NewTest3 {
    @Test(groups= {"smoke","regression"})
    public void test4() {
     System.out.println("test4");
  }
  
  @Test(groups= {"smoke","functional","regression"})
  public void test5() {
      System.out.println("test5");
  }
}
