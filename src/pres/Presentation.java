package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import dao.DaoImpl;
import metier.Mettierimlp;

public class Presentation {

	public static void main(String[] args) {
		/*
		 *Injection des d"pendances par
		 *instanciation statique => new
		 *instanciation dynamique
		 */
		/*
		 * DaoImpl dao=new DaoImpl();
		 
		Mettierimlp metier=new Mettierimlp();
		metier.setDao(dao);
		System.out.println(metier.calcul());
		*/
		try {
			Scanner scanner=new Scanner(new File("config.txt"));
			String daoClassName=scanner.nextLine();
			System.out.println(daoClassName);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
