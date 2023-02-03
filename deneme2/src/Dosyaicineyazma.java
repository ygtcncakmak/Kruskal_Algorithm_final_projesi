
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.List;

public class Dosyaicineyazma {
    public static void main(String[] args) {

    }

    static public void dosyayaz(List<Integer> visitenode ,int start , int end, int distance)throws FileNotFoundException {
        try {
            

            // FileWriter class ından nesne türetiyoruz yolunu belirtiyoruz ve append kısmını belirtiyoruz eğer dosyanın üstüne veri eklensin istiyorsak true yazıyoruz
            FileWriter yaz = new FileWriter("src/output.txt",true);
            
            yaz.append("Başlangıç Düğümü : "+hasmap.dügümler(start)+" Hedef Düğüm : "+hasmap.dügümler(end)+" Mesafe : "+distance);
            yaz.append("\n");
            yaz.append("Ziyaret Edilen Düğümler : [");

            // path2 classındaki shorpath methodundaki visitenode arry listini burda yakalayıp dosyaya yazdırıyoruz
            for (int i = 0; i < visitenode.size(); i++) {
                
                yaz.append(hasmap.dügümler(visitenode.get(i)) + ",");
            }

            yaz.append("]");
            yaz.append("\n");
            // Dosyadanokuma class ından okuma methodundaki veriyi dosyaya yazdırıyoruz
            yaz.append(Dosyadanokuma.okuma(start, end));
            yaz.append("\n");
            yaz.append("*************************************************************************");
            yaz.append("\n");

            
            yaz.close();

        } catch (Exception e) {

            e.getStackTrace();
        }
    }
}
