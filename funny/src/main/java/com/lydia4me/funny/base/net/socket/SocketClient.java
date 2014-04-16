package com.lydia4me.funny.base.net.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	public static void main(String[] args){
		try {
			Socket socket = new Socket("127.0.0.1", 8082);
			OutputStream os = socket.getOutputStream();
			os.write("Hello server, I am the client".getBytes());
			os.flush();
			//FIXME:
			InputStream is = socket.getInputStream();
			InputStreamReader rd = new InputStreamReader(is);
			char[] chs = new char[1024];
			StringBuilder sb = new StringBuilder();
			while(rd.read(chs)!=-1){
				sb.append(chs);
			}
			System.out.println(sb.toString());
			os.close();
//			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
