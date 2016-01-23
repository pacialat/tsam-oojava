package pacialat.maurizio.videoteca;

public class Bluray extends Cassetta {
	
	public int costoNoleggio(){
		if (getGiorniNoleggio() == 1){
			return 100;
		} else if (getGiorniNoleggio() > 1){
			int costo = 100;
			costo += (100 * (getGiorniNoleggio() -1) * 110/100);
			return costo;
		} else {
			return 0;
		}
	}

}
