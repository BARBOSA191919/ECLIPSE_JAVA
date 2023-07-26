package javaavanzado;

public class claseimplicitayexplicita {

	public static void main (String [] argumentos) {
	
	int numero = 10;
	float numerof = 10.1f;
	numerof=numerof +numero;

	float numeroF = 100.100000f;
	int numeroA = (int) numeroF;
	System.out.println(numeroA);

}
}
