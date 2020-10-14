import java.util.Scanner;
public class MiniKalkulator
{
	public static void main(String [] args)
	{
		pilihan();
	}
	public static void pilihan()
	{
		Scanner scanner = new Scanner(System.in);
		Aritmatika arit = new Aritmatika();
		PersegiPanjang pp = new PersegiPanjang();

		int pil;
		String lanjut;
		double angka1, angka2;
		angka1=0;
		angka2=0;

		System.out.println("Mini Calculator");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.println("4. Pembagian");
		System.out.println("5. Persegi Panjang");
		System.out.println("6. Persegi");
		System.out.println("7. Segitiga");
		System.out.print("Masukkan Pilihan Anda: ");

		pil = scanner.nextInt();
		switch (pil)
		{
			case 1: case 2: case 3: case 4:
				System.out.println("-----------------------");
				System.out.print("Masukkan Angka 1: ");
				angka1 = scanner.nextDouble();
				System.out.print("Masukkan Angka 2: ");
				angka2 = scanner.nextDouble();
				break;
			case 5:
				System.out.println("-----------------------");
				System.out.print("Panjang : ");
				angka1 = scanner.nextDouble();
				System.out.print("Lebar   : ");
				angka2 = scanner.nextDouble();
				break;
			default:
				System.out.println("Anda memasukkan pilihan yang salah.");
		}
		
		switch (pil)
		{
			case 1:
				System.out.println("----------------------- (+) ");
				System.out.println("                  " + arit.tambah(angka1, angka2));
				break;
			case 2:
				System.out.println("----------------------- (-) ");
				System.out.println("                  " + arit.kurang(angka1, angka2));
				break;
			case 3:
				System.out.println("----------------------- (x) ");
				System.out.println("                  " + arit.kali(angka1, angka2));
				break;
			case 4:
				System.out.println("----------------------- (/) ");
				System.out.println("                  " + arit.bagi(angka1, angka2));
				break;
			case 5:
				System.out.println("Luas    : " + pp.luas(angka1, angka2));
				System.out.println("Keliling: " + pp.keliling(angka1, angka2));
				break;
			default:
				System.out.println("Anda memasukkan pilihan yang salah");
		}

		System.out.println("");
		System.out.println("-----------------------");
		System.out.print("Apakah Anda ingin melanjutkan lagi (y/t) ?");
		lanjut = scanner.next();
		if(lanjut.equals("y"))
		{
			pilihan();
		}
	}
}