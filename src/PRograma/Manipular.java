package PRograma;

import java.io.File;
import java.util.Scanner;

public class Manipular {
		
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			System.out.println("enter fold:  ");
			String Path = ler.nextLine();
			
			File path = new File(Path);
			
			File[] folders = path.listFiles(File :: isDirectory);
			System.out.println("folders: ");
			for (File folder : folders) {
				System.out.println(folder);
			}
			
			File[] files = path.listFiles(File ::isFile);
			System.out.println("Files: ");
			for(File file: files) {
				System.out.println(file);
			}
			
			boolean success = new File(Path + "\\out\\summary.csv").mkdir();
			System.out.println("deu certo: " + success);
			
			ler.close();
		}
		
}
