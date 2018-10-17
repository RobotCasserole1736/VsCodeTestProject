package websocketTest;

import Calibration.CalWrangler;
import WebServer.CasseroleWebServer;

public class MainServer {
	
	static CasseroleWebServer webserver = new CasseroleWebServer();
	static TestJSONDataSource datasource = new TestJSONDataSource();
	static CalWrangler wrangler = new CalWrangler();

	public static void main(String[] args) {

		datasource.initDataGeneration();
		datasource.startDataGeneration();
		webserver.startServer();

	}

}
