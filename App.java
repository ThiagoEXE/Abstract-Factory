package app2;

import interface2.City;
import interface2.Guards;
import interface2.Server;
import interface2.ServerFactory;

public class App {
	
	private City city;
	private Server server;
	private Guards guards;

	public void createServer(final ServerFactory factory) {
		setServer(factory.createServer());
		setCity(factory.createCity());
		setGuards(factory.createGuards());
	}

	Server getServer(final ServerFactory factory) {
		return factory.createServer();
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Server getServer() {
		return server;
	}

	public void setServer(Server server) {
		this.server = server;
	}

	Guards getGuards(final ServerFactory factory) {
		return factory.createGuards();
	}

	public Guards getGuards() {
		return guards;
	}
	public void setGuards(Guards guards) {
		this.guards = guards;
	}


}
