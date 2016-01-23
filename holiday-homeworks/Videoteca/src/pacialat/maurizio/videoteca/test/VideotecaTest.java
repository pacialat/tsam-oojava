package pacialat.maurizio.videoteca.test;
import pacialat.maurizio.videoteca.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class VideotecaTest {

	@Test
	public void testPrincipale() {
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
		
		assertEquals(1010, incassoTotale);
	}
	
	@Test
	public void testCassetta(){
		Cassetta prova = new Cassetta();
		prova.setGiorniNoleggio(3);
		int costocas = prova.costoNoleggio();
		
		assertEquals(500, costocas);
	}
	
	
	
	@Test
	public void testDvd(){
		Dvd prova2 = new Dvd();
		prova2.setGiorniNoleggio(3);
		int costodvd = prova2.costoNoleggio();
		
		assertEquals(500, costodvd);
	}
	
	
	@Test
	public void testBluray(){
		Bluray prova3 = new Bluray();
		prova3.setGiorniNoleggio(3);
		int costobluray = prova3.costoNoleggio();
		
		assertEquals(320, costobluray);
	}
	
	
	@Test
	public void testHardDisk(){
		class HardDisk extends Cassetta{
			private String capacita;
		
			public int costoNoleggio(){
				if (getGiorniNoleggio() <= 5){
					return (getGiorniNoleggio() * 100);
				} else {
					return (500 + (getGiorniNoleggio() - 5)* 200);
				}
			}

			public String getCapacita() {
				return capacita;
			}

			public void setCapacita(String capacita) {
				this.capacita = capacita;
			}
			
			
		}
		
		Videoteca casamia = new Videoteca();
		
		HardDisk h1 = new HardDisk();
		h1.setCapacita("100 GB");
		h1.setGiorniNoleggio(6);
		
		Cassetta[] cassette = new Cassetta[]{
				h1
		};
		
		casamia.setCassette(cassette);
		int mioincasso = casamia.incassoTotale();
		
		assertEquals(700, mioincasso);
	}

}
