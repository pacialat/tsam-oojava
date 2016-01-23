package pacialat.maurizio.commercialista;

public class Commercialista {
	
	private Dipendente[] dipendenti;
	
	
	public Dipendente[] getDipendenti() {
		return dipendenti;
	}
	public void setDipendenti(Dipendente[] dipendenti) {
		this.dipendenti = dipendenti;
	}
	
	
	
	
	public int incassoTotale(){
		int tot = 0;
		for (Dipendente d: dipendenti){
			tot += d.calcolaParcella();
		}
		return tot;
	}
	public static void main(String[] args){
		
		Commercialista c = new Commercialista();
		
		Dipendente d1 = new Dipendente();
		d1.setNome("Mario");
		d1.setCognome("Rossi");
		d1.setCF("RSSMRA90GH98");
		
		LiberoProfessionista l1 = new LiberoProfessionista();
		l1.setNome("Luigi");
		l1.setCognome("Verdi");
		l1.setCF("VRDLG65694");
		l1.setPIVA("0113456789");
		l1.setNumfatt(10);
		
		Imprenditore i1 = new Imprenditore();
		i1.setNome("Andrea");
		i1.setCognome("Bianchi");
		i1.setCF("BIANANR878784");
		i1.setPIVA("6546480554");
		i1.setNumfatt(100);
		i1.setRagioneSociale("Azienda SpA");
		
		Dipendente[] dipendenti = new Dipendente[] {
				d1,
				l1,
				i1
				
		};
		c.setDipendenti(dipendenti);
		int totale = c.incassoTotale();
		System.out.println("Incassso totale di tutti i clienti: " +totale/100+ " Euro");
	}
}
