/*
Esercizio 4
Dato un intervallo [a, b] con a e b due interi positivi, 
restituire la somma di tutti i numeri
compresi all’interno dell’intervallo, estremi inclusi. 
Nel caso che b fosse minore di a,
calcolare la somma nell’intervallo [b,a]
Esempio:
sumInterval(3, 5) => 12
sumInterval(5, 3) => 12*/

public class sumRange {
	static int sumRang(int a, int b){
		int tot = 0;
		for(int i = a; i <= b; i++) {
			tot += i;
		}
		return tot;
	}
	static int sumR(int a, int b) {
	    if (a < b){
	        return sumRang(a, b);
	    } else {
	        return sumRang(b, a);
	    }
	}
	public static void main(String [] args){
		int num1 = 3;
		int num2 = 5;
		int res = sumR(num1, num2);
		System.out.println(res);		
	}
}
