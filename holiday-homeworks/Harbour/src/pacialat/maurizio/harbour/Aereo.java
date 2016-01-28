package pacialat.maurizio.harbour;

public class Aereo extends Invasore{
	private int Alpha = 10;
	private int Beta = 25;
	
	@Override
	public int calcolopotenzafuoco(){
		int totale = 0;
		for (Armamento ar: getArmamenti()){
			totale += ar.getPotenzafuoco();
		}
		return totale;
	}

	public int getAlpha() {
		return Alpha;
	}

	public void setAlpha(int alpha) {
		Alpha = alpha;
	}

	public int getBeta() {
		return Beta;
	}

	public void setBeta(int beta) {
		Beta = beta;
	}
	
	
}
