package pacialat.maurizio.videoteca;

public class Videoteca {
	private Cassetta[] cassette;
	
	
	public Cassetta[] getCassette() {
		return cassette;
	}
	public void setCassette(Cassetta[] cassette) {
		this.cassette = cassette;
	}


	public int incassoTotale(){
		int totale = 0;
		for (Cassetta cas: cassette){
			totale += cas.costoNoleggio();
		}
		return totale;
	}

	public static void main(String[] args){
		
		Videoteca blockbuster = new Videoteca();
		
		Cassetta uno = new Cassetta();
		uno.setTitolo("Arancia Meccanica");
		uno.setNomeRegista("Stanley Kubrick");
		uno.setAnnoProduzione("1974");
		uno.setNomeAttori("prodif");
		uno.setGiorniNoleggio(2);
		
		Dvd due = new Dvd();
		due.setGiorniNoleggio(3);
		
		Bluray tre = new Bluray();
		tre.setGiorniNoleggio(2);
		
		Cassetta[] cassette = new Cassetta[]{
			uno,
			due,
			tre
		};
		
		blockbuster.setCassette(cassette);
		int incassoTotale = blockbuster.incassoTotale();
		System.out.println("L'incasso totale è stato di: " +incassoTotale+ " centesimi di Euro");
	}
}
