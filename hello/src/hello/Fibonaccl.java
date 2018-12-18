package hello;

public class Fibonaccl {
	
	
	
	//0 1 1 2 3 5 8 13,元素值为前两项之和，输出前20个元素序列
	
	public void fib() {
		int q=0;//初始第一个
		int j=1;//初始第二个
		int p;//求前两项之和
		for(int i=0;i<20;i++) {
			p=q+j;
			//把第二个赋给第一个，然后把p和第二个相加，赋给p,然后p就是第二个。
			q=j;
			j=p;
			System.out.println(p+"-");
		}
	}
	
	//输入一个字符，求该字符在字符串中重复的次数
	public void zifu() {
		String qq = "hojownfdlsafjel";//字符串
		char q = 'l';
		int j = 0;//次数
		char[] sq = qq.toCharArray();
		for(int i =0;i<sq.length;i++) {
			if(q==sq[i]) {
				j++;
			}	
		}
		System.out.println(j);	
	}
	
	//实现冒泡排序
	public void maop() {
		Integer[] iii = {22,4,8,5,1,8,45,16,24};
		int temp=0;//用于交换
		/*
		 * 外循环控制多少趟，内循环控制多少次
		 * 
		 */
		//从小往大冒泡,N个数字要排N-1轮，第一轮把最大的数字排到最后面，以此类推
		for(int i = 0;i<iii.length;i++) {
			System.out.print(iii[i]+"-");
		}
		for(int i=0;i<iii.length-1;i++){
			for(int j=0;j<iii.length-i-1;j++ ) {
				if(iii[j]>iii[j+1]) {

					
					iii[j+1]=iii[j+1]+iii[j];  
					iii[j]=iii[j+1]-iii[j];  
					iii[j+1]=iii[j+1]-iii[j];
					
					
				}
			}
		}
		for(int i = 0;i<iii.length;i++) {
			System.out.print(iii[i]+"-");
		}
		
	}
	
	//16进制字符串转10进制数字
	public void zhuan() {
		String str = "45cab";
		int parseInt = Integer.parseInt(str, 16);
		System.out.println(parseInt);
	}
	
	//给定任意字符序列，输出所有排列组合比如：str="qwert"
	public void pai() {
		String str = "qwert";
		//一个char[5]的字符数组，把qwert拆成一个个，随机放入任意一个下标中。形成一个String，
	}
	
	public void test() {
		
		Integer i =150;
		Integer ii = 150;
		short s = 1;
		s+=1;
		double x= 2;
		float f = 1;
		Float ff = 1.f;
		Double d = 1.d;
		if(i==ii) {
			System.out.println("true");
		}else
		{
			System.out.println("false");
		}
		
	}
	
	
	public static void main(String[] args) {
		Fibonaccl a = new Fibonaccl();
		a.test();
		/*String s = "he";
		s = s +"hi";   //String 对象建立之后不能再改变，此S非彼S。
		
		System.out.println(s);*/
	}

}
