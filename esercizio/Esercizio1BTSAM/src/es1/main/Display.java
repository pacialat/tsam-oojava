package es1.main;





/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Display {
	
	
	private Shape[] shapes;
	
	
	
	public double totalArea(){
		double tot = 0.0;
		for (Shape d: shapes){
			tot += d.area();
		}
		return tot;
	}
	public double totalPerimeter(){
		double tot = 0.0;
		for (Shape d: shapes){
			tot += d.perimeter();
		}
		return tot;
	}



	public Shape[] getShapes() {
		return shapes;
	}


	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}


	public void testTotalArea() {
		Square r = new Square();
		r.setSide(9.5);
		
		Circle t = new Circle();
		t.setRadius(14);
		
		Display d = new Display();
		d.setShapes(new Shape[]{r, t});
		
		//assertEquals(706.0, d.totalArea(), 0.01);
	}

	
	public void testTotalPerimeter() {
		Square r = new Square();
		r.setSide(58);
		
		Circle t = new Circle();
		t.setRadius(15.3);
		
		Display d = new Display();
		d.setShapes(new Shape[]{r, t});
		
		//assertEquals(328.13, d.totalPerimeter(), 0.01);
	}
}
