package a_review.week12;

public class Circle {


    public final static double PI = 3.14;
    private double radius, diameter, area, perimeter;

    public Circle(double radius){
        this.radius =radius;
        diameter =  radius * 2;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }


    public double calculateArea(){
        return radius * radius * PI;
    }

    public double calculatePerimeter(){
        return diameter * PI;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }


    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

}

/*
	Circle:
		attributes:
			r, PI, diameter, area, perimeter

		methods:
			calculateArea(), calculatePerimeter(),
			toString()
 */
