/*Si vuole creare un programma per la gestione contabile degli stipendi erogati da
un� azienda .
Un�azienda � caratterizzata dalla ragione sociale e contiene l�elenco dei dipendenti. Si vuole
mettere a disposizione due funzionalit�, una per il calcolo della somma degli stipendi da
erogare e una per avere l�elenco dei dipendenti con lo stipendio massimo.
Ogni dipendente � caratterizzato dal nome, cognome, anzianit� e ha associato un contratto.
Il calcolo dello stipendio � dato dal stipendio base indicato nel contratto pi� 0.5% per ogni
anno di anzianit� relativo allo stipendio base.
Un contratto contiene lo stipendio base annuo in centesimi di euro e il nome del tipo di
contratto.*/
public class Azienda {
	public static void main (String[] args){
		Contratto impiegato = new Contratto();
		impiegato.stipendio = 120000;
		impiegato.tipocontratto = "impiegato d'ufficio";
		
		Dipendente primo = new Dipendente();
		primo.nome = "Mario";
		primo.cognome = "Rossi";
		primo.anzianita = 5;
		primo.contratto = "impiegato";
		
		
	}
}
