package hello;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

public class App implements Callable<String>{
	
	//InputStreamReader  --Read 字符流
	//BufferedWriter   --writer 字符流
	//FileInputStream   --inputStream 字节流
	//ObjectInputStream  --inputStream 字节流
	InputStream in = new InputStream() {
		@Override
		public int read() throws IOException {
			// TODO Auto-generated method stub
			ObjectInputStream o =  new ObjectInputStream(in);
			try {
				o.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		}
	};
	
	public String Reversal(String ss) {
		
		Set<App> s = new HashSet<>();
		
		try {
			throw new EmptyStackException();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		char[] c = ss.toCharArray();
		String revers = "";
		for(int i = c.length-1;i>=0;i--) {
			
			revers+=c[i];
		}
		return revers;
	}

	public static void main(String[] args) {
		App app = new App();
		app.Reversal("abcdef");
		//格式化日期
		SimpleDateFormat ss = new SimpleDateFormat("yyyy/MM/dd");
		Date date1 = new Date();
		
		ss.format(date1);
		
		LocalDateTime dt = LocalDateTime.now();
		//dt.get
		System.out.println(dt.minusDays(1));
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}



class A {

    static {
        System.out.print("1");
    }

    public A() {
        System.out.print("2");
    }
}

class B extends A{

    static {
        System.out.print("a");
    }

    public B() {
        System.out.print("b");
    }
}










