package pacialat.maurizio.alieni.test;
import pacialat.maurizio.alieni.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Alienitest {

	@Test
	public void testvivo() {
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

		
		assertEquals(25, saluteRestante);
	}
	
	@Test
	public void testmorto(){
		Gioco secondapartita = new Gioco();

		Giocatore mario = new Giocatore();
		mario.setUsername("mario12");
		mario.setSalute(100);
		
		Alieno pred = new Alieno();
		pred.setNome("predator");
		pred.setDanno(50);
		
		Alieno alien = new Alieno();
		alien.setNome("alien");
		alien.setDanno(50);
		
		Alieno[] aliens = new Alieno[] {
				pred,
				alien
		};
		
		secondapartita.setAlieni(aliens);
		int saluteRestante = secondapartita.saluterestante();
		mario.setSalute(saluteRestante);
		String statoGiocatore = secondapartita.statogiocatore();

		
		assertEquals("il giocatore è morto", statoGiocatore);		
	}

}
