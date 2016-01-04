
public class Gioco {
	
	public static void main(String [] args){
		Giocatore uno = new Giocatore();
		uno.nome = "Jon";
		uno.salute = 100;
		
		Alieno predator = new Alieno();
		predator.danno = 10;
		
		while (uno.salute > 0){
			
			uno.salute -= predator.danno;
			if (uno.salute > 0){
				System.out.println("Il giocatore è ancora vivo, livello vita: "+uno.salute);
			} else {
				System.out.println("Il giocatore è morto");
			}
		}
	}
}