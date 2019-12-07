package harpy2;

import interface2.Server;

public class HarpyServer implements Server{


	static final String DESCRICAO = "ESSE É O SERVIDOR Harpia!";

	@Override
	public String getDescricao() {
		return DESCRICAO;
	}

}
