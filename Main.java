package main;

import app2.App;
import factory.maker.FactoryMaker;
import factory.maker.FactoryMaker.ServerType;

public class Main {

	public static void main(String[] args) {
		App app = new App();
		
		
		app.createServer(FactoryMaker.makeFactory(ServerType.PHX));
		System.out.println(app.getGuards().getDescricao());
		System.out.println(app.getCity().getDescricao());
		System.out.println(app.getServer().getDescricao());
		System.out.println("\n");
		app.createServer(FactoryMaker.makeFactory(ServerType.HRP));
		System.out.println(app.getGuards().getDescricao());
		System.out.println(app.getCity().getDescricao());
		System.out.println(app.getServer().getDescricao());
		
		
	}

}
