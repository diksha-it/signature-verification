package com.signatureverification;

import com.signatureverification.client.main.SignatureVerificationServer;
import com.signatureverification.client.server.EurekaServer;

public class Main {
	public static void main(String[] args) {

		String serverName = "";

		switch (args.length) {
		case 2:
			System.setProperty("server.port", args[1]);
		case 1:
			serverName = args[0].toLowerCase();
			break;

		default:
			return;
		}

		if (serverName.equals("eureka")) {
			EurekaServer.main(args);
		} else if (serverName.equals("service")) {
			SignatureVerificationServer.main(args);
		} else {
			System.out.println("Unknown server type: " + serverName);
		}
	}
}
