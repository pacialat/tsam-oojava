package pacialat.maurizio.videoteca;

public class Cassetta {
	private String titolo;
	private String nomeRegista;
	private String annoProduzione;
	private String nomeAttori;
	private int giorniNoleggio;
	
	public int costoNoleggio(){
		if (giorniNoleggio == 1){
			return 100;
		} else if (giorniNoleggio > 1) {
			return (100 + ((giorniNoleggio - 1) * 200));
		} else {
			return 0;
		}
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getNomeRegista() {
		return nomeRegista;
	}
	public void setNomeRegista(String nomeRegista) {
		this.nomeRegista = nomeRegista;
	}
	public String getAnnoProduzione() {
		return annoProduzione;
	}
	public void setAnnoProduzione(String annoProduzione) {
		this.annoProduzione = annoProduzione;
	}
	public String getNomeAttori() {
		return nomeAttori;
	}
	public void setNomeAttori(String nomeAttori) {
		this.nomeAttori = nomeAttori;
	}

	public int getGiorniNoleggio() {
		return giorniNoleggio;
	}

	public void setGiorniNoleggio(int giorniNoleggio) {
		this.giorniNoleggio = giorniNoleggio;
	}
	
}
