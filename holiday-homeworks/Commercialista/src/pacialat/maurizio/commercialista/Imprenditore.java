package pacialat.maurizio.commercialista;

public class Imprenditore extends LiberoProfessionista {
	
	private String RagioneSociale;

	
	public int calcolaParcella(){
		if (getNumfatt() <= 100){
			return 50000;
		} else {
			return 50000 + (100 * (getNumfatt() - 100));
		}
	}
	
	public String getRagioneSociale() {
		return RagioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		RagioneSociale = ragioneSociale;
	}
	
}
