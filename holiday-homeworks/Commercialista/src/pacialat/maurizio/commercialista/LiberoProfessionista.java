package pacialat.maurizio.commercialista;

public class LiberoProfessionista extends Dipendente {
	private String PIVA;
	private int numfatt;
	
	
	public int calcolaParcella(){
		return super.calcolaParcella() + (50 * numfatt);
	}
	
	public String getPIVA() {
		return PIVA;
	}
	public void setPIVA(String pIVA) {
		PIVA = pIVA;
	}
	public int getNumfatt() {
		return numfatt;
	}
	public void setNumfatt(int numfatt) {
		this.numfatt = numfatt;
	}
	
}
