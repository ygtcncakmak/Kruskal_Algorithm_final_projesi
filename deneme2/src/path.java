import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class path {

    public static void main(String[] args) throws FileNotFoundException {

    }

    static public void shortpath(int[][] resultmatris, int v) throws FileNotFoundException {

        

        // kruskal algorithmasından gelecek matrisi aktaracığımız matris
        int[][] matris = new int[v][v];

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                // kruskaldaki matristen gelen değerleri matrisimize aktarıyoruz
                matris[i][j] = resultmatris[i][j];
            }

        }

        // start değerimize göre indexs değerini alacağımız array
        int[] src = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

        // hedef düğümümüze göre indexs değerini alacağımız array
        int[] target = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

        // züyaret edeceğimiz düğümleri tuttuğumuz array list 
        List<Integer> visitnode = new ArrayList<>();

        // Random class ından obje üretiyoruz
        Random rnd = new Random();
        // start değişkeni 0 ile 8 arasında değerler alacak
        int start = rnd.nextInt(8);
        // end değikleni start hangi değeri alıyosa hile clss ından ona göre random değerler alacak
        int end = random.randomhile(start);
        // start ve end değişkenini daha sonra kullancağımız için değişiklik yapmak için farklı değişkenlere atama yapıyoruz
        int s = start, nd = end;
        // mesafe bilgisini tutacak değişkenimiz
        int distance = 0;
        // ziyaret ettiğimiz node ları visitnode arrayına eklemeye başlıyoruz
        visitnode.add(start);
        // ilk for döngümüz satırları dondürüyor
        for (int i = 0; i < 9; i++) {
            //ikinci for döngüsü ise satırların içerisindeki değerlerin içinde dönüyo
            for (int j = 0; j < 9; j++) {
                // lastIndexOf methodu ile visitnode arrayındaki son elemanı kontrol ediyor değişken eğer son elemanda değilse -1 eğer varsa 0 döndürüyor
                int a = visitnode.lastIndexOf(s);
                if (a == -1) {
                    visitnode.add(s);

                }
                // start değerimize göre o indexsdeki satırın içersinde dönmeye başlıyor eğer değerimiz 0 değilse distance değişkenine değeri ekliyor ve s değişkeni o indexse eşitlemiyor
                if (matris[src[s]][j] != 0) {
                    distance += matris[src[s]][j];
                    s = target[j];

                }
                // start değerimizin hedef dügüme ulaşıp ulaşmadığını kontrol ediyor
                if (s == nd) {
                a = visitnode.lastIndexOf(s);
                if (a == 0) {
                    visitnode.add(s);

                }
                    System.out.println("***************************************");

                    System.out.println(
                            "BAŞLANGIÇ : " + hasmap.dügümler(start) + " HEDEF : " + hasmap.dügümler(end) + " MESAFE : " + distance);
                    break;
                }
            }

            int a = visitnode.lastIndexOf(s);

            if (a == -1) {
                visitnode.add(s);

            }

            if (s == nd) {

                break;
            }

        }
        Dosyaicineyazma.dosyayaz(visitnode, start, end, distance);

    }
}
