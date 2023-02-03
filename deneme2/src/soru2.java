import java.io.FileNotFoundException;


public class soru2 {
    public static void main(String[] args)throws FileNotFoundException {
        // algoritmamızı 5 defa çalıştırmak için kullanıyoruz
        int n=0;
        while(n<5){
            KruskalAlgorithm.kruskalcalistir();
            n++;
        }
    }
}
