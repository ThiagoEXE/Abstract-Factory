package harpy2;

import interface2.Guards;

public class HarpyGuards implements Guards{

	static final String DESCRICAO = "ESSE � O GUARDA DE HARPIA!";

	@Override
	public String getDescricao() {
		return DESCRICAO;
	}

}
