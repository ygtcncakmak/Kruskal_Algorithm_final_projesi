

import java.io.File;
import java.io.FileNotFoundException;


public class Dosyaolusturma {
    public static void main(String[] args) throws Exception {
        
        
    }

    public static void txtolustur()throws FileNotFoundException {
        // src dosyası içinde bir file nesnesi oluşturuyoruz
        File file = new File("src/output.txt");

        try {
            // file nesnesine bağlı bir code oluşturuyoruz
            // eğer dosya varsa bu dosya zaten var uyarısı alıyoruz yoksa value değişkenine true değeri döndürüyor ve yeni dosya oluşturuyor
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("Yeni dosya oluşturuldu.");
            } else {
                System.out.println("Bu isimde dosya zaten mevcut");
            }
        } catch (Exception e) {

            e.getStackTrace();
        }
    }
}
