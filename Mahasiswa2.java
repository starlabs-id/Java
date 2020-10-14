import java.util.Scanner;
public class Mahasiswa2{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String nama;
	int nim, tugas, nilai;

	System.out.print("NIM : ");
	nim = scan.nextInt();
 
	Scanner one = new Scanner(System.in);
	System.out.print("Nama : " );  
	nama = one.nextLine();

	System.out.print("Nilai Tugas : ");
	tugas = scan.nextInt();
		
	System.out.print("Nilai Akhir : ");
	nilai = scan.nextInt();	
		
	System.out.println("----------------Data Mahasiswa----------------");
	System.out.println("NIM  : " +nim);
	System.out.println("Nama : "+nama );  
	System.out.println("Nilai Tugas  : " +tugas);
	System.out.println("Nilai Akhir  : " +nilai);
	
    }
}