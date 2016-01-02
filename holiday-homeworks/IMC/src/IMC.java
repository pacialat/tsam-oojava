/*IMC
Data la massa e altezza di una persona calcolare l'indice di massa corporea e stampare la
classe di rischio della persona:
IMC = massa (kg)/altezza (m)^2
sottopeso < 18.5 <= normale < 25 <= sovrappeso < 30 <= obeso
Inserire la funzionalità all’interno di una classe Salute .*/
public class IMC {
	public static void main(String[] args){

		Persona luigi = new Persona();
		luigi.massa = 55;
		luigi.altezza = 1.8;
		
		Persona mauro = new Persona();
		mauro.massa = 100;
		mauro.altezza = 1.7;
		
		String imcLuigi = luigi.massacorporea();
		String imcMauro = mauro.massacorporea();
		System.out.println("Massa corporea di Luigi: " +imcLuigi);
		System.out.println("Massa corporea di Mauro: " +imcMauro);

	}
}


