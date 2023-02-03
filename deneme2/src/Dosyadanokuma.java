
import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class Dosyadanokuma {
    public static void main(String[] args) throws FileNotFoundException {

    }

    static public String okuma(int node1, int node2) throws FileNotFoundException {
        // okunacak dosyanın yolunu ve adını belirtiyoruz
        File f = new File("src/info.txt");

        // yolu ve adı verilen dosyanın var olup olmadığını exists methodu ile kontrol
        // eder
        if (f.exists()) {
            // dosyanın içersinde scanner ile geziyoruz
            Scanner scan = new Scanner(f);
            // dosyamızın içersindeki verileri strin matrisimize aktarıyoruz
            String[][] sehir = new String[][] {
                    { null },
                    { null },
                    { null },
                    { null },
                    { null },
                    { null },
                    { null },
                    { null },
                    { null }

            };
            // dosyadan okunan verileri sehir matrisimize aktarıyoruz
            for (int i = 0; i < 9; i++) {
                sehir[i][0] = scan.nextLine();

            }
            scan.close();

            // aktarılan verileri return ile değer dönderiyoruz
            return sehir[node1][0] + "\n" + sehir[node2][0];

        } else {
            System.out.println("dosya yok");
        }
        

        return "boş boş";

    }
}
