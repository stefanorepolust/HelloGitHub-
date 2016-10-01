import java.util.Scanner;

public class HelloGitHub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello GitHub!");
		//this is a test asdf
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte zahl 1 eingeben:");
		int z1 = scanner.nextInt();
		System.out.println("Bitte zahl 2 eingeben:");
		int z2 = scanner.nextInt();
		
		int teiler = testcalc(z1, z2);
		System.out.println("ggt:"+teiler);
		
//		System.out.println();
	}
	
	private static int testcalc(int z1, int z2) {
		   int r=0;
		   while (z2 != 0) {
		        r = z1 % z2;
		        z1 = z2;
		        z2 = r;
		    }
		   return z1;

	}

}
