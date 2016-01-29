package pacialat.maurizio.harbour;

public class Gioco {
	
	private Portonavale porto;
	
	

	public Portonavale getPorto() {
		return porto;
	}

	public void setPorto(Portonavale porto) {
		this.porto = porto;
	}


	
	
	
	public static void main(String[] args) {
		Portonavale trieste = new Portonavale();
		trieste.setMetriquadri(1000);
		
		
		Sottomarino nero = new Sottomarino();
		nero.setStazza(200);
		//nero.setArmi(prova[] {1,2,3});
		nero.calcolopotenzafuoco();
		
		Aereo caccia = new Aereo();
		caccia.calcolopotenzafuoco();
		caccia.getAlpha();
		caccia.getAlpha();
		
		Invasore[] invasori = new Invasore[]{
				nero,
				caccia
		};
		
		trieste.setInvasori(invasori);
		int vita = trieste.attacco();
		
		System.out.println(vita);

	}
}
