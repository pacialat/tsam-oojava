package pacialat.maurizio.videoteca;

public class Dvd extends Cassetta {
	
	public int costoNoleggio(){
		if (getGiorniNoleggio() <= 2){
			return (getGiorniNoleggio() * 150);
		} else {
			return (300 + (getGiorniNoleggio() - 2) * 200);
		}
	}
}
