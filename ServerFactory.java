package interface2;

import interface2.City;
import interface2.Guards;
import interface2.Server;

public interface ServerFactory {

	Server createServer();
	City createCity();
	Guards createGuards();

}
