import java.util.Random;
public class Euklidischer {
	static Random r=new Random();
	static long a=r.nextInt(2143000000);
	static long b=r.nextInt(2143000000);
	
	static long ggT(long a, long b) {
		long r=a%b;
		if(r==0)return b;
		return ggT(b,r);
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(ggT(a,b));
	}
}