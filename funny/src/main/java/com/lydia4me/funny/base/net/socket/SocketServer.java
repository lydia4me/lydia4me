package com.lydia4me.funny.base.net.socket;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static void main(String[] args){
		try {
			ServerSocket server = new ServerSocket(8082);
			System.out.println("Server start...");
			while(true){
				Socket socket = server.accept();
				Thread deal = new Thread(new SocketDeal(socket));
				deal.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
class SocketDeal implements Runnable{
	private Socket socket;
	
	public SocketDeal(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try{
			System.out.println("deal start");
			InputStream in = socket.getInputStream();
			BufferedInputStream bin = new BufferedInputStream(in);
			StringBuilder sb = new StringBuilder();
			byte[] buffer = new byte[1024];
			while(bin.read(buffer) != -1){
				sb.append(new String(buffer));
			}
			System.out.println(sb.toString());
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

