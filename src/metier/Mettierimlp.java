package metier;

import dao.DaoImpl;
import dao.IDAO;

public class Mettierimlp implements IMétier {
	//couplage faible
	private IDAO dao;
	

	

	@Override
	public double calcul() {
		double temp=dao.getData();
		double res=temp*Math.PI;
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
