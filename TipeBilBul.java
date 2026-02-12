import java.util.Scanner;

public class TipeBilBul {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); //objek untuk membaca input user
		int T = input.nextInt(); //mengambil input beripe int
		
		for(int i=0; i<T; i++){
			try{
				long a = input.nextLong();
				System.out.println(a + " can be fitted in:");
				if (a>=-128 && a<=127){
					System.out.println("* byte");
				} if (a>=-32768 && a<=32767) {
					System.out.println("* short");
				} if (a>=-2147483648 && a<=2147483747L) {
					System.out.println("* int");
				}
					System.out.println("* long");
			} catch (Exception e){
				System.out.println(input.next() + " can't be fitted anywhere");
			}
		}
		input.close();
	}
}		
