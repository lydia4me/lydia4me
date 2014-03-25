package com.lydia4me.funny.base.runtime;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RuntimeTest {
	public static void main(String[] args) throws IOException{
		Runtime runtime = Runtime.getRuntime();
		Process p = runtime.exec("df -lh");
		InputStream stream = p.getInputStream();
		BufferedInputStream bi = new BufferedInputStream(stream);
		StringBuilder sb = new StringBuilder();
		byte[] bs = new byte[1024];
		while((bi.read(bs)) > 0){
			sb.append(new String(bs));
		}
		System.out.println(sb);
	}
}
