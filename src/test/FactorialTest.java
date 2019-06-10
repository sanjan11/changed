package test;



import org.testng.Assert;
import org.testng.annotations.Test;

import bussinessclass.Factorial;

public class FactorialTest {

  @Test
  public void test1() {
	  Factorial s=new Factorial();
	  int a=4;
	  int actual=s.Fact(a);
	  Assert.assertEquals(actual,24);
 
  }
  @Test
  public void test2() {
	  Factorial s=new Factorial();
	  int a=0;
	  int actual=s.Fact(a);
	  Assert.assertEquals(actual,1);
 
  }
  @Test
  public void test3() {
	  Factorial s=new Factorial();
	  int a=1;
	  int actual=s.Fact(a);
	  Assert.assertEquals(actual,1);
 
  }

}
