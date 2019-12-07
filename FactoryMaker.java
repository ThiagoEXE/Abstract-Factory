package factory.maker;

import harpy2.HarpyServerFactory;
import interface2.ServerFactory;
import phoenix2.PhxServerFactory;

public class FactoryMaker {

	public enum ServerType{
		PHX, HRP
	}
	
	public static ServerFactory makeFactory(ServerType type) {
		switch(type) {
		case PHX:
			return 	new PhxServerFactory();
		case HRP:
			return 	new HarpyServerFactory();
		default:
			throw new IllegalArgumentException("ServerType não suportado");
		}
	}
}
