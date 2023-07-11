package jul04;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {
	public static void main(String[] args) {
		String serverIP = "localhost";// 127.0.0.1
		System.out.println("서버에 연결 중입니다. " + serverIP);
		
		Socket socket = null;
		try {
			socket = new Socket(serverIP, 5000);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("서버에서 보내온 메세지: " + dis.readUTF());
			System.out.println("연결종료");
			dis.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
