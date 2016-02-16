package es1.main;




/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Square extends Shape {

	private static final double EPSILON = 0.01;

	private double side;


	public double area(){
		return getSide() * getSide();
	}
	
	public double perimeter(){
		return getSide() * 4;
	}

	public double getSide() {
	return side;
}




public void setSide(double side) {
	this.side = side;
}




public static double getEpsilon() {
	return EPSILON;
}




	public void test() {
		Square r = new Square();
		r.setSide(5);
		//assertEquals(25.0, r.area(), EPSILON);
		//assertEquals(20.0, r.perimeter(), EPSILON);
	}
}
