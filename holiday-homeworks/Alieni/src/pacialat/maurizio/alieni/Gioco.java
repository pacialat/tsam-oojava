package pacialat.maurizio.alieni;

public class Gioco {
	private Giocatore giocatore;
	private Alieno[] alieni;
	
	public Giocatore getGiocatore() {
		return giocatore;
	}
	public void setGiocatore(Giocatore giocatore) {
		this.giocatore = giocatore;
	}
	public Alieno[] getAlieni() {
		return alieni;
	}
	public void setAlieni(Alieno[] alieni) {
		this.alieni = alieni;
	}
	
	public int saluterestante(){
		int vitagiocatore = 100; //= giocatore.getSalute();
		int danno = 0;
		for  (Alieno a: alieni){
			danno = a.getDanno();
			vitagiocatore -= danno;
			//giocatore.setSalute(vitagiocatore);
		}
		return vitagiocatore;
	}

	public String statogiocatore(){
		
		if (saluterestante() > 0){
			return "il giocatore è ancora vivo,";
		} else {
			return "il giocatore è morto";
		}
	}
}
