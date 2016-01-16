

public class Main {
	public static void main(String[] args){
		Azienda microsoft = new Azienda();
		microsoft.setRagioneSociale("Microsoft spa");
		microsoft.setPIva("01234567890");
		
		Dipendente mario = new Dipendente();
		mario.setNome("Mario");
		mario.setCognome("Rossi");
		
		ContrattoLavoro impiegato = new ContrattoLavoro();
		impiegato.setTipo("Impiegato di primo livello");
		impiegato.setPagaBase(120000);
		
		
		Dipendente luigi = new Dipendente();
		luigi.setNome("Luigi");
		luigi.setCognome("Bianchi");
		
		ContrattoLavoro dirigente = new ContrattoLavoro();
		dirigente.setTipo("Dirigente di secondo livello");
		dirigente.setPagaBase(320000);
		
		
		Azienda apple = new Azienda();
		apple.setRagioneSociale("Apple spa");
		apple.setPIva("12357845912");
		
		Dipendente steve = new Dipendente();
		steve.setNome("Steve");
		steve.setCognome("Jobs");
		
		ContrattoLavoro ceo = new ContrattoLavoro();
		ceo.setTipo("Capo");
		ceo.setPagaBase(1000000);
		
		Stipendio(mario,impiegato);
		Stipendio(steve,ceo);
		Stipendi(microsoft);
		Stipendi(apple);
		
		
		//System.out.println(mario.getNome() +" "+ mario.getCognome());
	}
	static void Stipendio(Dipendente d, ContrattoLavoro c){
		System.out.println("Nome: " +d.getNome());
		System.out.println("Cognome: " +d.getCognome());
		System.out.println("Tipo di contratto: " + c.getTipo());
		System.out.println("Paga base: " +(c.getPagaBase()/100) + "\n");
	}
	
	static void Stipendi(Azienda a){
		System.out.println("Ragione sociale: " +a.getRagioneSociale());
		System.out.println("Partita IVA: " +a.getPIva());
		System.out.println("Totale stipendi: " + "\n");
	}
}
