package com.lydia4me.funny.base.net.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
	public static void main(String[] args){
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String info = "";
			while(!(info = br.readLine()).equals("bye")){
				Socket socket = new Socket("127.0.0.1", 8082);
				OutputStream os = socket.getOutputStream();
				InputStream is = socket.getInputStream();
				System.out.println("input:"+info);
				os.write(info.getBytes());
				os.flush();
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(is));
				String ret = "";
				StringBuilder returnMsg = new StringBuilder();
				System.out.println("read from server");
				while(!(ret = reader.readLine()).equals("over")){
					System.out.println(ret);
					returnMsg.append(ret);
				}
				System.out.println("返回："+returnMsg.toString());
				reader.close();
				os.close();
				socket.close();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
