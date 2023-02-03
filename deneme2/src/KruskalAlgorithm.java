import java.io.FileNotFoundException;
import java.util.Arrays;

public class KruskalAlgorithm {
    // kenarlarımızın başlangıç bitiş ve mesafeleri gibi özelliklerin saklandığı class
    static class Edge implements Comparable<Edge> {
        int source, destination, weight;

        public int compareTo(Edge compareEdge) {
            return this.weight - compareEdge.weight;
        }
    }
    //  düğümlerin levellerini tutan class çocuk ebeveyn gibi
    static class Subset {
        int parent, rank;
    }
    // V yani vector köşe yani düğümlerimiz
    static int V = 9;
    // edge yani kenarlarımız
    static int E = 15;
    // edge class ından edge adında array tanımlıyoruz bu array kenarlarımızı tutacak
    static Edge edge[] = new Edge[E];
    //find() methodu, Kruskal Algorithm için Minimum Spanning Tree (MST) oluştururken kullanılan Union-Find yapısının bir parçasıdır. Bu method, verilen bir düğümün (i parametresi) hangi alt ağa ait olduğunu bulmak için kullanılır. Eğer düğümün parent'ı kendisi değilse, o zaman düğümün parent'ının parent'ını aramaya devam eder ve sonunda düğümün gerçek parent'ını döndürür. Bu, Kruskal Algorithm için kullanılan Union-Find yapısının bir parçasıdır ve MST oluştururken düğümlerin aynı alt ağda olup olmadığını kontrol etmek için kullanılır.
    static int find(Subset subsets[], int i) {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);

        return subsets[i].parent;
    }
    // kenarların birleştirdiğimiz method   
    static void union(Subset subsets[], int x, int y) {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);

        if (subsets[xroot].rank < subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank > subsets[yroot].rank)
            subsets[yroot].parent = xroot;

        else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }
    // Kruskal algoritmasının çalıştığı method
    static void KruskalMST()throws FileNotFoundException {
        Edge result[] = new Edge[V];
        int e = 0;
        int i = 0;
        for (i = 0; i < V; ++i)
            result[i] = new Edge();
        // kenarlarımızın mesafesine göre sıralandığı kısım
        Arrays.sort(edge);

        // kenarlarımız Subset class dan türetilen subsets arrayının içersine aktarılıyor
        Subset subsets[] = new Subset[V];
        for (i = 0; i < V; ++i) {
            subsets[i] = new Subset();
            subsets[i].parent = i;
            subsets[i].rank = 0;
        }

        i = 0;
        // sıralanmış kenaarları loop oluşmıyacak şekilde kısa kenarlardan başlayarak bu kısımda birleştiriliyor
        while (e < V - 1) {
            Edge next_edge = new Edge();
            next_edge = edge[i++];

            int x = find(subsets, next_edge.source);
            int y = find(subsets, next_edge.destination);

            if (x != y) {
                result[e++] = next_edge;
                union(subsets, x, y);
            }
        }

       


        // çıktımızı matrise aktaracağımız için resultmatris adında array oluşturuyoruz bu arrayımızn eleman sayısı V kadar olacak
        int[][] resultmatris = new int[V][V];

        // for döngüsü ile çıktımızı resulmatris dizisine aktarıyoruz
        for (i = 0; i < e; ++i) {
            // çıktının ekrana yazıldığı kısım
            System.out.println("source : " + hasmap.dügümler(result[i].source) + " destination :  " + hasmap.dügümler(result[i].destination) + " weight : " + result[i].weight);
            // çıktıyı resultmatris arrayına akrarıldığı kısım
            resultmatris[result[i].source][result[i].destination] = result[i].weight;
            resultmatris[result[i].destination][result[i].source] = result[i].weight;
        }
        // resultmatris arrayımızı path2 class ındaki shortpath methoduna yolluyoruz
        path.shortpath(resultmatris,V);
        
    }
    // kenarları verdiğimiz method
    static void kruskalcalistir()throws FileNotFoundException{
        // Edge class ında türettiğimiz edge isimli arrayın indexs lerine Edge class ının özellikleri olan source destination ve weight özelliklerinin değerlerini belirtiyoruz.
        edge[0] = new Edge();
        edge[0].source = 0;
        edge[0].destination = 1;
        edge[0].weight = 2;

        edge[1] = new Edge();
        edge[1].source = 0;
        edge[1].destination = 3;
        edge[1].weight = 7;

        edge[2] = new Edge();
        edge[2].source = 0;
        edge[2].destination = 2;
        edge[2].weight = 3;

        edge[3] = new Edge();
        edge[3].source = 1;
        edge[3].destination = 4;
        edge[3].weight = 4;

        edge[4] = new Edge();
        edge[4].source = 1;
        edge[4].destination = 5;
        edge[4].weight = 1;

        edge[5] = new Edge();
        edge[5].source = 1;
        edge[5].destination = 3;
        edge[5].weight = 5;

        edge[6] = new Edge();
        edge[6].source = 2;
        edge[6].destination = 3;
        edge[6].weight = 4;

        edge[7] = new Edge();
        edge[7].source = 2;
        edge[7].destination = 7;
        edge[7].weight = 2;

        edge[8] = new Edge();
        edge[8].source = 3;
        edge[8].destination = 6;
        edge[8].weight = 5;

        edge[9] = new Edge();
        edge[9].source = 4;
        edge[9].destination = 8;
        edge[9].weight = 1;

        edge[10] = new Edge();
        edge[10].source = 4;
        edge[10].destination = 5;
        edge[10].weight = 3;

        edge[11] = new Edge();
        edge[11].source = 5;
        edge[11].destination = 8;
        edge[11].weight = 7;

        edge[12] = new Edge();
        edge[12].source = 5;
        edge[12].destination = 6;
        edge[12].weight = 4;

        edge[13] = new Edge();
        edge[13].source = 6;
        edge[13].destination = 7;
        edge[13].weight = 6;

        edge[14] = new Edge();
        edge[14].source = 6;
        edge[14].destination = 8;
        edge[14].weight = 2;

        // KruskalMST algoritmasını çağırıyoruz
        KruskalMST();

    }

    public static void main(String[] args)throws FileNotFoundException {

        kruskalcalistir();

    }
}
