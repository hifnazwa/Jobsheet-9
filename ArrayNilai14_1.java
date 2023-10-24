import java.util.Scanner;

public class ArrayNilai14_1 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i<nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc14.nextInt();
        }
        
        for (int i=0; i<10; i++) {
            if (nilaiAkhir[i] >70)
            System.out.println("Nilai akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        }
    }
}
