package pacialat.maurizio.harbour;

public class Gioco {
	
	private Portonavale porto;
	
	private Invasore[] invasori;
	
	
	public int attacco(){
		int totmetri = porto.getMetriquadri();
		for (Invasore inv: invasori){
			int dannometri = (int) (inv.calcolopotenzafuoco() * 1.5);
			totmetri -= dannometri;
		}
		return totmetri;
	}
	
		
		
}
