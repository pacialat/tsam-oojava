package pacialat.maurizio.harbour;

public abstract class Invasore {
	private String codiceidentificativo;
	private String modello;
	private Armamento[] armamenti;
	
	public abstract int calcolopotenzafuoco();

	
	
	public String getCodiceidentificativo() {
		return codiceidentificativo;
	}

	public void setCodiceidentificativo(String codiceidentificativo) {
		this.codiceidentificativo = codiceidentificativo;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public Armamento[] getArmamenti() {
		return armamenti;
	}
	
	public void setArmamenti(Armamento[] armamenti) {
		this.armamenti = armamenti;
	}
	
	
	
}
