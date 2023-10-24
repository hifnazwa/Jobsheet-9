import java.util.Scanner;

public class ArrayRataNilai14_2 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner (System.in);
        int[] nilaiMhs = new int[5];
        double total1 = 0, total2= 0;
        double rata2, rata1;
        int jmlhMhs, jmlhLulus=0, jmlhTdkLulus=0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlhMhs = sc14.nextInt();

        for (int i = 0; i<nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i]= sc14.nextInt();
        }
        for (int i = 0; i<nilaiMhs.length; i++){
            if (nilaiMhs[i]>70) {
                total1 += nilaiMhs[i];
                jmlhLulus++;
            } else {
                total2 += nilaiMhs[i];
                jmlhTdkLulus++;
            }
        }
        rata1 = total1/jmlhLulus;
        rata2 = total2/jmlhTdkLulus;
        System.out.println("Rata-rata nilai lulus = "+ rata1);
        System.out.println("Rata-rata nilai tidak lulus = "+rata2);


    }
}
