package es1.main;





/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Circle extends Shape {
	private double radius;
	
	
	private static final double EPSILON = 0.01;
	
	
	public double area(){
		return getRadius()*getRadius()* Math.PI;
	}
	
	public double perimeter(){
		return 2 * getRadius() * Math.PI;
	}
	
	
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static double getEpsilon() {
		return EPSILON;
	}
	
	
	public void test() {
		Circle t = new Circle();
		t.setRadius(10.5);
		
		// Nota: utilizza il valore di pi greco pari a:
		// Math.PI
		//assertEquals(346.36, t.area(), EPSILON);
		//assertEquals(65.97, t.perimeter(), EPSILON);
	}
}
