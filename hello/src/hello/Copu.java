package hello;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copu {
	public static  void fileCopy(String source,String target) throws IOException{
		
		try (InputStream in = new FileInputStream(source)){
			try (OutputStream out = new FileOutputStream(target)) {
				byte[] buffer = new byte[4096];
				int bytesToRead;
				while((bytesToRead = in.read(buffer)) != -1) {
	                out.write(buffer, 0, bytesToRead);
	            }
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		try {
			fileCopy("D:\\images\\aa.jpg","D:\\cxg\\a.jpg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
