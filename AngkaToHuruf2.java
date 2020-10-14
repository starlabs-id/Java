import java.util.Scanner;
public class AngkaToHuruf2
{
	public static void main(String[] args)
	{
		int angka;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan Angka : ");

		angka = scanner.nextInt();
		switch (angka)
		{
			case 1:
				System.out.println("Satu");
				break;
			case 2:
				System.out.println("Dua");
				break;
			case 3:
				System.out.println("Tiga");
				break;
			case 4:
				System.out.println("Empat");
				break;
			case 5:
				System.out.println("Lima");
				break;
			case 6:
				System.out.println("Enam");
				break;
			case 7:
				System.out.println("Tujuh");
				break;
			case 8:
				System.out.println("Delapan");
				break;
			default:
				System.out.println("Bukan Angka 1-8");
				break;
		}
	}
}