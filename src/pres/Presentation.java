package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;



import dao.DaoImpl;
import dao.IDAO;
import metier.IMetier;
import metier.Mettierimlp;

public class Presentation {

	public static void main(String[] args) throws Exception {
		/*
		 *Injection des d"pendances par
		 *instanciation statique => new
		 *instanciation dynamique
		 */
		/*
		  DaoImpl dao=new DaoImpl();
		
		Mettierimlp metier=new Mettierimlp();
		metier.setDao(dao);
		System.out.println(metier.calcul());
		*/
			Scanner scanner=new Scanner(new File("config.txt"));
			String daoClassName=scanner.nextLine();
			Class cDao=Class.forName(daoClassName);
			IDAO  dao=(IDAO) cDao.newInstance();
			
			String metierClassName=scanner.nextLine();
			Class cMetier=Class.forName(metierClassName);
			IMetier metier=(IMetier) cMetier.newInstance();
			Method m=cMetier.getMethod("setDao", IDAO.class);
			m.invoke(metier, dao);
			System.out.println(metier.calcul());
			
		
		
	}

}
