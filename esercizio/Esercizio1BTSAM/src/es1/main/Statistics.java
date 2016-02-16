package es1.main;


/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Statistics {
	
	int area;  //rimosso private per errore nel main
	int perimeter; //rimosso private per errore nel main
	
	public void add(Statistics statistics){
		
		//appena aggiunto
		//setArea(getArea()+statistics.area);
		//setPerimeter(getPerimeter()+statistics.perimeter);
		area += statistics.area;
    	perimeter += statistics.perimeter;
	}
	
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}

	
	
	
	
	public Statistics(double perimeter1, double area1) {
		// TODO Auto-generated constructor stub
	}

	public void test() {
		double perimeter1 = 5;
		double area1 = 10;
		Statistics st1 = new Statistics(perimeter1, area1);

		double perimeter2 = 3;
		double area2 = 4;
	
		st1.add(new Statistics(perimeter2, area2));
		
		//assertEquals(14, st1.getArea(), 0.01);
		//assertEquals(8, st1.getPerimeter(), 0.01);
	}
}