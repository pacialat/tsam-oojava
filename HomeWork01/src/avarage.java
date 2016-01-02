/*
Esercizio 3
Dato un array di 10 elementi, calcolarne la media*/
public class avarage {
	static int avarag(int [] myarray) {
		int tot = 0;
	    for(int i = 0; i < myarray.length; i++) {
	        tot += myarray[i];
	    }
	    return tot / myarray.length;
	}
	public static void main(String[] args){
		int [] a = new int[] {1,2,3,4,5,6,7,8,9,0};
		int result = avarag(a);
		System.out.println(result);
	}
}
