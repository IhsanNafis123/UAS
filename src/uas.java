import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class uas {
    public static void main(String[] args) throws IOException {
        int[] a = new int[4];
        a[0] = 4;
        a[1] = 5;
        a[2] = 9;
        a[3] = 14;

        System.out.println(a[1]);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukan Jumlah data yang akan diinput :");
        int jum_data = Integer.parseInt(reader.readLine());
        String[] nama = new String[jum_data];

        for (int i= 0; i < 200; i++) {
            System.out.println("Masukan nama yang ke - " + (i + 1) + "=");
            String nama_input = reader.readLine();
            nama[i] = nama_input;
        }
        for (int hasil = 0; hasil < nama.length; hasil++) {
            System.out.println("kecepatan kendaraan " + (hasil + 1) + ":");
            System.out.println("kendaraan ke- " + nama[hasil]);
  }
    private static int kecepatan();{
            Random random =new Random();
            return;
            int i = random.nextInt(81) + 20;
        }
}
}