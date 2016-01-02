/*Base Metabolic Rate
Data l'altezza in cm, il peso in kg, l'età in anni, il tipo di attività fisica fatta (tra i valori
"sedentario", "moderatamente attivo", "attivo", "molto attivo") e il sesso ('m' o 'f') di una
persona , utilizzare l'equazione per il calcolo del metabolismo basale e stamparne il valore a
video. Inserire la funzionalità all’interno di una classe salute .
Per le donne:
MB = 655 + (9.6* peso in KG) + (1.8 * altezza in cm) (4.7 per l'età in anni)
Per gli uomini:
MB = 655 + (13.8* peso in KG) + (1.8 * altezza in cm) (4.7 per l'età in anni)*/


public class Base_Metabolic_Rate {
	public static void main(String[] args){
		Persona luca = new Persona();
		luca.peso = 55;
		luca.altezza = 1.8;
		luca.eta = 20;
		luca.tipoattivita = "sedentario";
		luca.sesso = 'm';

		Persona mario = new Persona();
		mario.peso = 70;
		mario.altezza = 1.75;
		mario.eta = 25;
		mario.tipoattivita = "moderatamente attivo";
		mario.sesso = 'm';
		
		double saluteluca = luca.metabolsimobasale();
		double salutemario = mario.metabolsimobasale();
		System.out.println("Metabolsimo basale di Luca: " +saluteluca);
		System.out.println("Metabolismo basale di Mario: " +salutemario);
	}
}