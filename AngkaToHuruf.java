import java.util.Scanner;
public class AngkaToHuruf
{
	public static void main(String[] args)
	{
		int angka;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan Angka : ");

		angka = scanner.nextInt();
		if(angka==1)
			{
				System.out.println("Satu");
			}
		else if(angka==2)
			{
				System.out.println("Dua");
			}
		else if(angka==3)
			{
				System.out.println("Tiga");
			}
		else if(angka==4)
			{
				System.out.println("Empat");
			}
		else if(angka==5)
			{
				System.out.println("Lima");
			}
		else if(angka==6)
			{
				System.out.println("Enam");
			}
		else if(angka==7)
			{
				System.out.println("Tujuh");
			}
		else if(angka==8)
			{
				System.out.println("Delapan");
			}
		else
			{
				System.out.println("Bukan Angka 1-8");
			}
	}
}