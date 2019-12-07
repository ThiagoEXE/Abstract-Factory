package harpy2;

import interface2.City;
public class HarpyCity implements City {


	static final String DESCRICAO = "ESSE É O SERVIDOR PHOENIX!";

	@Override
	public String getDescricao() {
		return DESCRICAO;
	}

}

