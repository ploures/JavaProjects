
public class TestaMultiplos3 {
	public static void main(String[] args) {
		for (int numero = 1; numero <=100; numero++) {
				if(numero % 3 == 0) {  
					System.out.println(numero);
					} 
			}
		}
	}

/*Pode ser assim tamb�m:
public class MultiplosDeTresAteCem {
public static void main (String[] args) {
    for (int i = 3; i < 100; i += 3 ){
        System.out.println(i);
    }
}
}*/

