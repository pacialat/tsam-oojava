package pacialat.maurizio.harbour;

public class Sottomarino extends Invasore {
	private int stazza;
	private String[] armi;
	
	@Override
	public int calcolopotenzafuoco(){
		int totale = 0;
		for (Armamento ar: getArmamenti()){
			totale += ar.getPotenzafuoco() * getStazza();
		}
		return totale;
	}

	public int getStazza() {
		return stazza;
	}

	public void setStazza(int stazza) {
		this.stazza = stazza;
	}

	public String[] getArmi() {
		return armi;
	}

	public void setArmi(String[] armi) {
		this.armi = armi;
	}
	
	
	
}
