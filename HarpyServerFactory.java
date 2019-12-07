package harpy2;

import interface2.City;
import interface2.Guards;
import interface2.Server;
import interface2.ServerFactory;

public class HarpyServerFactory implements ServerFactory {

	@Override
	public Server createServer() {
		return new HarpyServer();
	}

	@Override
	public City createCity() {
		return new HarpyCity();
	}

	@Override
	public Guards createGuards() {
		return new HarpyGuards();
	}

}
