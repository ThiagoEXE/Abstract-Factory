package phoenix2;

import interface2.Server;

public class PhoenixServer implements Server  {

	static final String DESCRICAO = "ESSE � O SERVIDOR PHOENIX!";
	@Override
	public String getDescricao() {
		return DESCRICAO;
	}

}
