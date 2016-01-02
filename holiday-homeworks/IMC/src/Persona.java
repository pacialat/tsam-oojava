public class Persona {
	int massa;
	double altezza;
	
	double IMC;
	String massacorporea(){
		IMC = this.massa / Math.pow(this.altezza, 2.0);
		if (IMC < 18.5){
			return "sottopeso";
		} else if (IMC < 25){
			return "normale";
		} else if (IMC < 30){
			return  "sovrappeso";
		} else {
			return "obeso";
		}
	}

}