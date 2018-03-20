package com.r10.practise;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpPlay {
	public static void main(String[] args) {
		String l = "http://openexchangerates.org/api/currencies.json";
		try {
			URL url = new URL(l);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setConnectTimeout(5000);
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.connect();
			int code = conn.getResponseCode();
//			System.out.println(code);				//200
			
			InputStream is = conn.getInputStream();
			String pathout = "D:\\javaPlay\\";
			long now = System.currentTimeMillis();
			String fileout = "out__" + now;
			FileOutputStream fos = new FileOutputStream(pathout + fileout);
			byte[] buffer = new byte[1024];
			int len = 0;
			while((len = is.read(buffer)) != -1) {
//				fos.write(buffer);			//得到的内容不完整
				System.out.println(len);
				fos.write(buffer, 0, len);
			}
			System.out.println(is.read(buffer));			// -1
			System.out.println(len);						// -1
			fos.flush();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
