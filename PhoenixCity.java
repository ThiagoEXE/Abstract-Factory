package phoenix2;

import interface2.City;

public class PhoenixCity implements City{


	static final String DESCRICAO = "ESSA � A CIDADE DE PHOENIX!";
	@Override
	public String getDescricao() {
		return DESCRICAO;
	}
}
