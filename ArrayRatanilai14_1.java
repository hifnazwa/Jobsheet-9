import java.util.Scanner;

public class ArrayRatanilai14_1 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner (System.in);
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int jmlhLulus=0;

        for (int i = 0; i<nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i]= sc14.nextInt();
        }
        for (int i = 0; i<nilaiMhs.length; i++){
            total += nilaiMhs[i];
            if (nilaiMhs[i]>70) {
                jmlhLulus++;
            }
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Jumlah mahasiswa lulus ada "+jmlhLulus);
        System.out.println("Rata-rata nilai = "+rata2);
    }
}
