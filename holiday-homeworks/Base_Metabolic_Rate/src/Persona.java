
public class Persona {
	int peso;
	double altezza;
	int eta;
	String tipoattivita;
	char sesso;

	double MB;
	double metabolsimobasale(){
		if (this.sesso == 'm'){
			MB = 655 + (13.8 * this.peso) + (1.8 * this.altezza) + (4.7 * this.eta);
		} else {
			MB = 655 + (9.6 * this.peso) + (1.8 * this.altezza) + (4.7 * this.eta);
		}
		switch (this.tipoattivita) {
		case "sedentario":
			MB *= 1.2;
			break;
		case "moderatamente attivo":
			MB *= 1.3;
			break;
		case "attivo":
			MB *= 1.4;
			break;
		case "molto attivo":
			MB *= 1.5;
			break;
		}
		return MB;
	}
}