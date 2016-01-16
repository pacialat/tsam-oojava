
public class Dipendente {
	String nome;
	String cognome;
	ContrattoLavoro contrattolavoro; //aggregazione
	
	void setNome(String n){
		nome = n;
	}
	
	public String getNome(){
		return nome;
	}
	
	void setCognome(String c){
		cognome = c;
	}
	
	public String getCognome(){
		return cognome;
	}
}
