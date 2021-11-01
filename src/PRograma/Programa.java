package PRograma;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa {
		 
		public static void main(String[] args) {
		
			File file = new File("C:\\Users\\felipe.silva\\frontFE");
			Scanner read = null;
			try {
				read = new Scanner(file);
				while (read.hasNextLine()) {
					System.out.println(read.nextLine());
				}
			}
			catch(IOException e) {
				System.out.println("Error: "+ e.getMessage());
			}
			finally {
				if (read != null) {
					read.close();
				}
			}
		}
}
