package chap02;

public class ex02_2 {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1: "+var1 + "\t"+ "var2:"+ var2);
			
			//돌리면 마이너스값이 나오는건 한계값을 초과했기때문이다
		}
	}

}
