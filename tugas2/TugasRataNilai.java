import java.util.Scanner;
public class TugasRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                int[] nilai = new int[3];
		for(int i = 0; i <= 2; i++)
		{
			System.out.print("Masukkan data ke -" + i  + " : ");
			nilai[i] = input.nextInt();
		}
		int jumlah = 0;
		for(int i = 0; i <= 2; i++)
		{
			jumlah = nilai[i] + jumlah;
		}
		int rata;
		rata = jumlah / 3;
		System.out.print("Rata rata data tersebut adalah "+rata);
                if(rata >= 60){
                    System.out.print(" :-)");
                }
                else
                {
                    System.out.print(" :-(");
                }
    }
}
