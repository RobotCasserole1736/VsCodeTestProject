package frc.websocketTest;

import frc.lib.Calibration.CalWrangler;
import frc.lib.WebServer.CasseroleDriverView;
import frc.lib.WebServer.CasseroleWebServer;
import frc.lib.WebServer.CassesroleWebStates;

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
