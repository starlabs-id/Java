import java.util.Scanner;
public class Lulus
{
	public static void main(String[] args)
	{
		int nilai;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan Nilai : ");
		
		nilai = scanner.nextInt();
		if(nilai>=70)
		{
			System.out.println("Nilai saya = "+nilai);
			System.out.println("Saya Lulus");
		}
	}
}