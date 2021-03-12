public class Euklidischer {
	static int a=8;
	static int b=3;
	
	static int ggT(int a, int b) {
		int r=a%b;
		if(r==0)return b;
		return ggT(b,r);
	}
	
	public static void main(String[] args) {
		System.out.println(ggT(a,b));
	}
}