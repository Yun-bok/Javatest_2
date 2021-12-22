package chap02;

public class ex01_3 {
	public static void main(String[] args) {
		int var1;
		
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;
		}
		
		var1 = 10;
		//var2 = 20;
		
		for(int i = 0; i<1; i++) {
			int var3;
			
			var1 = 10;
			var3 = 30;
		}
		
		var1 = 10;
		//var3 = 30;
		//var3은 이영역에서 사용x 위if문에서만 만들어졌기때문
	}

}
