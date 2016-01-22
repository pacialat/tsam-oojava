package pacialat.maurizio.alieni;

public class Main {
	public static void main(String[] args){
		
		Gioco primapartita = new Gioco();
		
		Giocatore mario = new Giocatore();
		mario.setUsername("mario12");
		mario.setSalute(100);
		
		Alieno pred = new Alieno();
		pred.setNome("predator");
		pred.setDanno(25);
		
		Alieno alien = new Alieno();
		alien.setNome("alien");
		alien.setDanno(50);
		
		Alieno[] aliens = new Alieno[] {
				pred,
				alien
		};
		
		primapartita.setAlieni(aliens);
		int saluteRestante = primapartita.saluterestante();
		mario.setSalute(saluteRestante);
		String statoGiocatore = primapartita.statogiocatore();
		System.out.print(statoGiocatore);
		if (saluteRestante <= 0){
			System.exit(0);
		}
		System.out.println(" ha " + saluteRestante + " punti di vita" );
	}
}
