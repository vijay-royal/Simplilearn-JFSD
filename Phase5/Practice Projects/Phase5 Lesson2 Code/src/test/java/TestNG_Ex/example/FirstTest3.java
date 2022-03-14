package TestNG_Ex.example;
import org.testng.annotations.Test;
public class FirstTest3 {
 String trackID=null;
 @Test(priority = 1)
 public void createID() {
     int a=50/0;
     System.out.println("create an ID");
     trackID="abcdef";
 }
 @Test(priority = 2,dependsOnMethods = {"createID"})
 public void trackshipping() {
     if(trackID!=null) {
         System.out.println("shipping in progress");
     }
     else {
         System.out.println("shipping failed");
     }
 }
 @Test(priority = 3,dependsOnMethods = {"createID"})
 
 public void cancelshipping() {
     if(trackID!=null) {
         System.out.println("shipping in caanceled");
     }
     else {
         System.out.println("shipping cancel failed");
     } 
     
 }
 
}
