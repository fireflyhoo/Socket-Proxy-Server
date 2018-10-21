package com.puyaya.net.socket.proxy;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerBoots {
	public static void main(String[] args) {
		java.security.Security.setProperty("networkaddress.cache.ttl", "86400");
		try (ServerSocket serverSocket = new ServerSocket(8080)) {
			Socket socket = null;
			while ((socket = serverSocket.accept()) != null) {
				new Thread(new Socket5ProxyServer(socket)).start();
			}
			// log("close socket(this never happen)");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
