package test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import bussinessclass.Prime;

public class PrimeTest {
  @Test
  public void test1() {
	  Prime p=new Prime();
	  int a=3;
	  boolean actual=p.Prime(a);
	  Assert.assertTrue(true);
  }
  @Test
  public void test2() {
	  Prime p=new Prime();
	  int a=0;
	  boolean actual=p.Prime(a);
	  Assert.assertFalse(false);
  }
  @Test
  public void test3() {
	  Prime p=new Prime();
	  int a=1;
	  boolean actual=p.Prime(a);
	  Assert.assertFalse(false);
  }
  @Test
  public void test4() {
	  Prime p=new Prime();
	  int a=3;
	 boolean actual=p.Prime(a);
	  Assert.assertFalse(false);
  }

}
