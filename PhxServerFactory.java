package phoenix2;

import interface2.City;
import interface2.Guards;
import interface2.Server;
import interface2.ServerFactory;

public class PhxServerFactory implements ServerFactory {

	@Override
	public Server createServer() {
		return new PhoenixServer();
	}

	@Override
	public City createCity() {
		return new PhoenixCity();
	}

	@Override
	public Guards createGuards() {
		return new PhoenixGuards();
	}
}
