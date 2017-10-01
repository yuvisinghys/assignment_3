package assignment_3;

import assignment_3.Area;
import org.junit.Test;

import static org.junit.Assert.*;

public class AreaTest {

 
 private static final double DELTA = 1e-15; 
 
 @Test
 public void testGetArea(){
  double a = 3;
  double b = 4;
  double c = 5;
  assertEquals(6.0 ,Area.getArea(a, b, c), DELTA);
 }
 
 @Test
 public void testGetArea2(){
  double a = 1;
  double b = 4;  
  double c = 7; 
  // The area will be 0.0 not 7.0 ! This is not a triangle!
  assertEquals(0.0 , Area.getArea(a, b, c), DELTA);
 }
 
 @Test
 public void testGetArea3(){
  double a = 3;
  double b = 3;  
  double c = 8;
  assertEquals(0.0 , Area.getArea(a, b, c), DELTA);
 }
 
}


