package assignment_3;


public class Area {

 // Calculates the Area of a Triangle
 public static double getArea(double a, double b, double c) {
  double s = (a + b + c) / 2.0; // s = parameter/2
  if (a + b <= c || b + c <= a || a + c <= b) {
   return 0.0;
  } else {
   double x = ((s) * (s - a) * (s - b) * (s - c)); // herons formula
   double area = Math.sqrt(x);
   return area;
  }
 }
}

