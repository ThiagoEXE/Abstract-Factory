package phoenix2;

import interface2.Guards;

public class PhoenixGuards implements Guards{


	static final String DESCRICAO = "ESSE � O GUARDA DE PHOENIX!";
	@Override
	public String getDescricao() {
		return DESCRICAO;
	}
}
