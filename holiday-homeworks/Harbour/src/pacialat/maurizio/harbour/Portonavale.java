package pacialat.maurizio.harbour;

public class Portonavale {
	private String nome;
	private int numeroimbarcazioni;
	private int metriquadri;
	
	
	
	private Invasore[] invasori;
	
	
	public Invasore[] getInvasori() {
		return invasori;
	}

	public void setInvasori(Invasore[] invasori) {
		this.invasori = invasori;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroimbarcazioni() {
		return numeroimbarcazioni;
	}
	public void setNumeroimbarcazioni(int numeroimbarcazioni) {
		this.numeroimbarcazioni = numeroimbarcazioni;
	}
	public int getMetriquadri() {
		return metriquadri;
	}
	public void setMetriquadri(int metriquadri) {
		this.metriquadri = metriquadri;
	}
	
	
	
	
	
	
	public int attacco(){
		int totmetri = metriquadri;
		for (Invasore inv: invasori){
			int dannometri = (int) (inv.calcolopotenzafuoco() * 1.5);
			totmetri -= dannometri;
		}
		setMetriquadri(totmetri);
		return totmetri;
	}
	
	public String portodistrutto(){
		if (getMetriquadri() <= 0){
			return "Il porto navale è distrutto";
		} else {
			return "Il porto navale è ancora intero";
		}
	}
}
