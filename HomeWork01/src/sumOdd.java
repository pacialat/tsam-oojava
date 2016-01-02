/*
Esercizio 2
Dato un numero n, restituire la somma dei primi n numeri interi positivi dispari*/

public class sumOdd {
	static int sumOd(int n){
		int tot = 0;
	    for(int i = 0; i < n; ++i) {
	        tot += 1 + 2 *i;
	    }
	    return tot;
	}
	public static void main(String[] args){
		int prova = 3;
		int res = sumOd(prova);
		System.out.println(res);
	}
}
