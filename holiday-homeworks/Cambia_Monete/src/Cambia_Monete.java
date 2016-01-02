
/*Cambia Monete
Dato un numero intero, rappresentante un valore in euro, indicare la combinazione di
banconote da:
500, 200, 100, 50, 20, 10, 5, 2, 1 euro
che permettono di ottenere tale cifra.*/

public class Cambia_Monete {
	static int [] cambia(int soldi){
		int [] banconote = new int[] {1,2,5,10,20,50,100,200,500};
		int [] combinazione = new int[9];
		
		while (soldi >= banconote[8]){
			soldi -= banconote[8];
			combinazione[8]++;
		}
		while (soldi >= banconote[7]){
			soldi -= banconote[7];
			combinazione[7]++;
		}
		while (soldi >= banconote[6]){
			soldi -= banconote[6];
			combinazione[6]++;
		}
		while (soldi >= banconote[5]){
			soldi -= banconote[5];
			combinazione[5]++;
		}
		while (soldi >= banconote[4]){
			soldi -= banconote[4];
			combinazione[4]++;
		}
		while (soldi >= banconote[3]){
			soldi -= banconote[3];
			combinazione[3]++;
		}
		while (soldi >= banconote[2]){
			soldi -= banconote[2];
			combinazione[2]++;
		}
		while (soldi >= banconote[1]){
			soldi -= banconote[1];
			combinazione[1]++;
		}
		while (soldi >= banconote[0]){
			soldi -= banconote[0];
			combinazione[0]++;
		}
		return combinazione;
	}
	public static void main(String[] args){
		int importo = 77;
		int taglio [] = cambia(importo);
		System.out.println("Le banconote da 500 Euro " +taglio[8]);
		System.out.println("Le banconote da 200 Euro " +taglio[7]);
		System.out.println("Le banconote da 100 Euro " +taglio[6]);
		System.out.println("Le banconote da 50 Euro " +taglio[5]);
		System.out.println("Le banconote da 20 Euro " +taglio[4]);
		System.out.println("Le banconote da 10 Euro " +taglio[3]);
		System.out.println("Le banconote da 5 Euro " +taglio[2]);
		System.out.println("Le monete da 2 Euro " +taglio[1]);
		System.out.println("Le monete da 1 Euro " +taglio[0]);
	}
}
