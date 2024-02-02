package Week1;

public class QuickUnionMyExample {

    private int[] id;

    //Here each number represents a player.
    //0 is Dhoni (IN)
    //1 is Rizwan (PAK)
    //2 is Williamson (NZ)
    //3 is Miller (SA)
    //4 is Maxwell (AUS)
    //5 is Azam (PAK)
    //6 is ABD (SA)
    //7 is Boult (NZ)
    //8 is Smith (AUS)
    //9 is Sachin (IN)
    //We are going to group (connect) by country and see the connectivity.
    //Union (0,9) (1,5) (2,7) (3,6) (4,8)
    //Further Union by continent
    //Union (0,1) (0,5) (9,5) (1,9) (2,4) (2,8)
    public QuickUnionMyExample(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    private int findRoot(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

    public boolean isConnected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    public void union(int p, int q) {
        int rootP = findRoot(p);
        int rootQ = findRoot(q);
        id[rootP] = rootQ;
    }

    public void printArray() {
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10; // Number of elements
        QuickUnionMyExample qu = new QuickUnionMyExample(n);

        System.out.println("Initial state of the array:");
        qu.printArray();

        qu.union(0, 9);
        System.out.println("After union(0, 9):");
        qu.printArray();

        qu.union(1, 5);
        System.out.println("After union(1, 5):");
        qu.printArray();

        qu.union(2, 7);
        System.out.println("After union(2, 7):");
        qu.printArray();

        qu.union(3, 6);
        System.out.println("After union(3, 6):");
        qu.printArray();

        qu.union(4, 8);
        System.out.println("After union(4, 8):");
        qu.printArray();

        //Union (0,9) (1,5) (2,7) (3,6) (4,8)
        System.out.println("Is 0 connected to 9? " + qu.isConnected(0, 9));
        System.out.println("Is 1 connected to 5? " + qu.isConnected(1, 5));
        System.out.println("Is 0 connected to 5? " + qu.isConnected(0, 5));

        //Further Union by continent
        //Union (0,1) (0,5) (9,5) (1,9) (2,4) (2,8)
        qu.union(0, 1);
        System.out.println("After union(0, 1):");
        qu.printArray();

        qu.union(0, 5);
        System.out.println("After union(0, 5):");
        qu.printArray();

        qu.union(9, 5);
        System.out.println("After union(9, 5):");
        qu.printArray();

        qu.union(1, 9);
        System.out.println("After union(1, 9):");
        qu.printArray();

        qu.union(2, 4);
        System.out.println("After union(2, 4):");
        qu.printArray();

        qu.union(2, 8);
        System.out.println("After union(2, 8):");
        qu.printArray();

        //0 is Dhoni (IN)
        //1 is Rizwan (PAK)
        //2 is Williamson (NZ)
        //3 is Miller (SA)
        //4 is Maxwell (AUS)
        //5 is Azam (PAK)
        //6 is ABD (SA)
        //7 is Boult (NZ)
        //8 is Smith (AUS)
        //9 is Sachin (IN)

        System.out.println("Is 0 connected to 1? " + qu.isConnected(0, 1));
        System.out.println("Is 9 connected to 5? " + qu.isConnected(9, 5));
        System.out.println("Is 9 connected to 2? " + qu.isConnected(9, 2));
        System.out.println("Is 2 connected to 4? " + qu.isConnected(2, 4));


    }
}
