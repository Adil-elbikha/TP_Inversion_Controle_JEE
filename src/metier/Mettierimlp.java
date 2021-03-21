package metier;

import dao.DaoImpl;
import dao.IDAO;

public class Mettierimlp implements IMetier {
	//couplage faible
	private IDAO dao;
	

	

	@Override
	public double calcul() {
		double d=dao.getData();
		double res=d*23;
		return res;
		
	}
	public void setDao(DaoImpl dao2) {
		this.dao = (IDAO) dao2;
	}
	public Mettierimlp(IDAO dao) {
		super();
		this.dao = dao;
	}
	public Mettierimlp() {
		super();
		
	}
	

}
