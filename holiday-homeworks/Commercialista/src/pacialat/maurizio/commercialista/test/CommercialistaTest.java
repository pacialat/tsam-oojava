package pacialat.maurizio.commercialista.test;
import pacialat.maurizio.commercialista.*;


import static org.junit.Assert.*;

import org.junit.Test;

public class CommercialistaTest {

	@Test
	public void testPrincipale() {
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
		assertEquals(60500, totale);
	}
	
	
	@Test
	public void testDipendente(){
		
		Dipendente d1 = new Dipendente();
		d1.setNome("Mario");
		d1.setCognome("Rossi");
		d1.setCF("RSSMRA90GH98");
		
		int parcellaDip = d1.calcolaParcella();
		
		assertEquals(5000, parcellaDip);
	}
	
	@Test
	public void testLiberoProfessionista(){
		LiberoProfessionista l1 = new LiberoProfessionista();
		l1.setNome("Luigi");
		l1.setCognome("Verdi");
		l1.setCF("VRDLG65694");
		l1.setPIVA("0113456789");
		l1.setNumfatt(10);
		
		int parcellaLibProf = l1.calcolaParcella();
		
		assertEquals(5500, parcellaLibProf);
	}
	
	
	@Test 
	public void testImprenditore(){
		Imprenditore i1 = new Imprenditore();
		i1.setNome("Andrea");
		i1.setCognome("Bianchi");
		i1.setCF("BIANANR878784");
		i1.setPIVA("6546480554");
		i1.setNumfatt(100);
		i1.setRagioneSociale("Azienda SpA");
		
		int parcellaImp = i1.calcolaParcella();
		
		assertEquals(50000, parcellaImp);
	}
	
	
	@Test
	public void testImprenditore2(){
		Imprenditore i2 = new Imprenditore();
		i2.setNome("Mano");
		i2.setCognome("Noneo");
		i2.setCF("BIRGE4E378784");
		i2.setPIVA("8448484874");
		i2.setNumfatt(200);
		i2.setRagioneSociale("Ricco SpA");
		
		int parcellaImp2 = i2.calcolaParcella();
		
		assertEquals(60000, parcellaImp2);
	}
	
	
	@Test
	public void testAlieni(){
		class Alieno extends Dipendente{
			private String pianetaProvenienza;
			private int numfatt;

			
			public int calcolaParcella(){
				return (super.calcolaParcella() + (100 * getNumfatt()));
			}
			
			public int getNumfatt() {
				return numfatt;
			}

			public void setNumfatt(int numfatt) {
				this.numfatt = numfatt;
			}

			public String getPianetaProvenienza() {
				return pianetaProvenienza;
			}

			public void setPianetaProvenienza(String pianetaProvenienza) {
				this.pianetaProvenienza = pianetaProvenienza;
			}
		}
		
		
		
		
		Commercialista c2 = new Commercialista();
		
		
		Dipendente d2 = new Dipendente();
		d2.setNome("Steve");
		d2.setCognome("Jobs");
		d2.setCF("KJDFHVGJFV8");
		
		
		
		Alieno a1 = new Alieno();
		a1.setNome("ET");
		a1.setCognome("Telefono casa");
		a1.setCF("unknown");
		a1.setNumfatt(100);
		a1.setPianetaProvenienza("Marte");
		
		Dipendente[] dipendenti = new Dipendente[] {
				d2,
				a1
		};
		
		c2.setDipendenti(dipendenti);
		int incassotot2 = c2.incassoTotale();
		assertEquals(20000, incassotot2);
	}

}
