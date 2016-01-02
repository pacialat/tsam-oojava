/*Esercizio 1
Dato un array di interi, restituire la loro somma fino a che non viene ritrovato un valore
negativo.*/

public class sumPos {
	static int sumPo(int[] myarray){
		int tot = 0;
		for (int i = 0; i <= myarray.length; i++){
			int x = myarray[i];
			if (x < 0){
				return tot;
			}
			tot += x;
		}
		return tot;
	}
	
	public static void main(String[] args){
		int [] a = new int[] {2,5,7,1};
		int res = sumPo(a);
		System.out.println(res);
	}
}
