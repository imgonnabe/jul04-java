package jul04;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetStream {
	public static void main(String[] args) {
		URL url = null;
		BufferedReader br = null;
		String address = "https://blog.naver.com/wisejia";
		
		try {
			url = new URL(address);
			InputStream ins = url.openStream();
			br = new BufferedReader(new InputStreamReader(ins));
			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
