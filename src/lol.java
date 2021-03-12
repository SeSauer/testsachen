
public class lol {
	static boolean back=false;
	static String output="";
	public static void main(String[] args) {
		for(int z=0;z<100;z++) {
			if(z==99)back=true;
			if(z==1)back=false;
			if(back)z-=2;
			
			for(int y=1;y<=z;y++) {
				output+=" ";
			}
			output+="X";
			for(int y=97;y>=z;y--) {
				output+=" ";
			}
			output+="||";
			System.out.println(output);
			output="||";
			
			
			
			try {
				  Thread.sleep(30);
				} catch (InterruptedException ex) {}
		}

	}

}
