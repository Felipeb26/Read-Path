package PRograma;

import java.io.File;
import java.util.Scanner;

public class CaminhoINFO {
	
	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		
		System.out.println("enter a path:   ");
		String path = ler.nextLine();
		
		File Path = new File (path);
		
		System.out.println("arquivo:  " + Path.getName());
		System.out.println("pasta:  " + Path.getParent());
		System.out.println("caminho completo:  " + Path.getPath());
		
		ler.close();
	}
}
