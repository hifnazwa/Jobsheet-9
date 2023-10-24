import java.util.Scanner;

public class LinearSearch14_2 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner (System.in);
        int[] arrayInt = new int[6];
        int key = 0, jmlhElemen;
        int hasil = 0;

        System.out.println("Masukkan jumlah elemen array : ");
        jmlhElemen = sc14.nextInt();

        for (int i = 0; i<arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-"+(i)+" : ");
            arrayInt[i]= sc14.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        key = sc14.nextInt();
        for (int i = 0; i<arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("Key dalam array pada posisi indeks ke-"+hasil);
                break;
            } else {
                System.out.print("key tidak ditemukan");
                break;
            }
        }
    }
}

