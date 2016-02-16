package main;

/**
 * Gestisce le parcelle dei propri Clienti.
 *
 */
public class Commercialista {
	Cliente[] clienti;

	/**
	 * Calcola il totale delle parcelle di tutti i clienti univoci (ovvero NON
	 * vengono considerati le parcelle di eventuali clienti duplicati). 
	 * @return il totale delle parcelle
	 */
	public int totaleParcelle() {
		int tot = 0;
		for (Cliente c: clienti){
			tot += c.calcolaParcella();
		}
		return tot;
		// TODO: da implementare
	}
	
	/**
	 * Inserisce un nuovo cliente, verificando che
	 * non sia già stato inserito.
	 * @param d dipendente
	 */
	public void addCliente(Cliente d) {
		//Cliente d1 = new Cliente();
		
		// TODO: da implementare
	}
	
	
	/**
	 * Restituisce il numero di volte che all'atto dell'inserimento di
	 * un cliente, il cliente era già stato inserito. 
	 * @return
	 */
	public int clientiDuplicati() {
		// TODO: da implementare
		return 0;
	}
	
	/**
	 * Dato un cliente, restituisce il numero di volte che lo stesso
	 * cliente è stato inserito tramite le funzione addCliente.
	 * Nel caso che un dato cliente sia stato inserito una sola volta,
	 * restituisce il valore 1. 
	 * @param d cliente da verificare
	 * @return numero di ripetizioni.
	 */
	public int numeroRipetizioni(Cliente d) {
		// TODO: da implementare
		return 0;
	}

}