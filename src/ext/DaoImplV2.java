package ext;

import dao.IDAO;

public class DaoImplV2 implements IDAO{

	@Override
	public double getData() {
		/*
		 * Version WS
		
		 */
		System.out.println("version web service");
		double data=12;
		
		return data;
	}

}
