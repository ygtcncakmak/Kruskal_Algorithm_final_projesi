import java.util.Random;

public class random {
    public static void main(String[] args) {

    }

    static public int randomhile(int sayi) {
        Random rnd=new Random();
        int[][] end = new int[][] {
                // start değerimiz 0 olursa 0 1 5 değerlerinde bir tanesi random olarak end değişkenine aktarılacak
                {0,1,5},
                // start değerimiz 1 olursa 0 değerlerinde bir tanesi random olarak end değişkenine aktarılacak
                {0},
                // start değerimiz 2 olursa 0 1 5 değerlerinde bir tanesi random olarak end değişkenine aktarılacak
                {0,1,5},
                // start değerimiz 3 olursa 2 3 değerlerinde bir tanesi random olarak end değişkenine aktarılacak
                {2,3},
                // start değerimiz 4 olursa 1 4 5 değerlerinde bir tanesi random olarak end değişkenine aktarılacak
                {1,4,5},
                // start değerimiz 5 olursa 1 5 değerlerinde bir tanesi random olarak end değişkenine aktarılacak
                {1,5},
                // start değerimiz 6 olursa 1 4 5 6 8 değerlerinde bir tanesi random olarak end değişkenine aktarılacak
                {1,4,5,6,8},
                // start değerimiz 7 olursa 2 3 7 değerlerinde bir tanesi random olarak end değişkenine aktarılacak
                {2,3,7},
                // start değerimiz 8 olursa 1 4 5 8 değerlerinde bir tanesi random olarak end değişkenine aktarılacak
                {1,4,5,8}
        };
        if(sayi == 0) {
            return end[0][rnd.nextInt(2)];
        }
        if(sayi == 1) {
            return end[1][0];
        }
        if(sayi == 2) {
            return end[2][rnd.nextInt(2)];
        }
        if(sayi == 3) {
            return end[3][rnd.nextInt(1)];
        }
        if(sayi == 4) {
            return end[4][rnd.nextInt(2)];
        }
        if(sayi == 5) {
            return end[5][rnd.nextInt(1)];
        }
        if(sayi == 6) {
            return end[6][rnd.nextInt(4)];
        }
        if(sayi == 7) {
            return end[7][rnd.nextInt(2)];
        }
        if(sayi == 8) {
            return end[8][rnd.nextInt(3)];
        }
        return 0;
    }
}
