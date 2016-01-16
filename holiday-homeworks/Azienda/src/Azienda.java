
public class Azienda {
	private String ragionesociale;
	private String piva;
	private Dipendente dipendente; //aggregazione
	
	void setRagioneSociale(String r){ //accesso solo dallo stesso package
		ragionesociale = r;
	}
	public String getRagioneSociale(){ //accessibile da tutte le classi, indipendentemente in quale package si trovano
		return ragionesociale;
	}
	
	void setPIva(String iva){
		piva = iva;
	}
	public String getPIva(){ 
		return piva;
	}
}

