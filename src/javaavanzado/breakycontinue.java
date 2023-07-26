package javaavanzado;

public class breakycontinue {
public static void main (String []argumentos) {

	int i;
	
	for(i=0;i<10;) {
		System.out.println("1");
		System.out.println("2");
		break;
	}
	for(i=0;i<10;i++) {
		System.out.println("3");
		System.out.println("4");
		continue;
	}
}
}
