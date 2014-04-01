package com.lydia4me.funny.base.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class NioTest {
	public static Charset charset = Charset.forName("GBK");
	public static SocketChannel channel;
	public static void main(String[] args){
		InetSocketAddress socket = new InetSocketAddress("www.baidu.com", 80);
		try {
			channel = SocketChannel.open(socket);
			channel.write(charset.encode("GET " + "/ HTTP/1.1" + "\r\n\r\n"));
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			while(channel.read(buffer) != -1){
				buffer.flip();
				System.out.println(charset.decode(buffer));
				buffer.clear();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(channel == null){
				return;
			}
			try {
				channel.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
