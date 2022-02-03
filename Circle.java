// This class represents a circle shape
public class Circle {

    // Instance variables (data members) of class Circle
    protected double radius; // the radius of the circle
    protected double x; // the x coordinate of the circle's center
    protected double y; // the y coordinate fo the circle's center

    // The default constructor with no argument
    public Circle(){
      // Initializing the values of the instance variables
      radius = 1.0;
      x = 0.0;
      y = 0.0;
    }

    // Second constructor with given radius, but origin default
    public Circle(double r) {
      radius = r;
      x = 0.0;
      y = 0.0;
    }

    // TODO: [2 points] Complete this overloaded constructor
    // Parameter r should be the radius length
    // Parameter ex should be the x coordinate
    // Parameter why should be the y coordinate
    public Circle(double r, double ex, double why) {
    	// ... Add your code here ... //
    }

    // A public getter method for retrieving the radius
    public double getRadius() {
     return radius;
    }

    // A public getter method for retrieving the center coordinates
    public double[] getCenter() {
     double[] c = {this.x, this.y};
     return c;
    }

    // A public getter method for computing and returning
    // the area of the circle
    public double getArea() {
      return radius * radius * Math.PI;
    }

    // TODO: [2 points] A public method you need to write to
    // compute and return the circumference of the circle
    public double getCircumference() {
    	// ... Add your code here ... //
    }

    // TODO: [3 points] A public method that compares the sizes of two circles: the circle
    // represented by the current object, and the circle passed as a parameter.
    // Example: circleA.isBiggerThan(circleB) should return true if circleA
    // has a larger area than circleB, false otherwise.
    // NOTE: You may need to modify the parameter list!
    public boolean isBiggerThan() {
      // ... Add your code here ... //
    }

    // TODO: [6 points] A public method that takes as input an x coordinate (as a double)
    // and a y coordinate (a double), and returns true if the (x, y) coordinate
    // is inside the current circle, false otherwise.
    // NOTE: You may need to modify the parameter list!
    public boolean containsPoint() {
    	// ... Add your code here ... //
    }

    // TODO: [3 points] Write a method named setRadius that sets this object's radius
    // based on the passed parameter (of type double).
    // The method should not return anything.
    // ... Add your method setRadius here here ... //

    // TODO: [3 points] Write a method named setCenter that sets this object's center.
    // The method takes two doubles as parameters: ex and why.
    // It should set the x coordinate of the circle to ex,
    // and the y coordinate of the circle to why.
    // The method should not return anything.
    // ... Add your method here ... //

    // TODO: [1 point] Complete the overriden method toString which should
    // return the string representation of this Circle object, as follows:
    // "This circle is centered at point <display_coordinate_of_center_here>
    // with radius <display_radius>"
    @Override
    public String toString() {
        return ""; // TODO
    }
}
