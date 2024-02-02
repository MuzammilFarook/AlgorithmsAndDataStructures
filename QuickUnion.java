package Week1;

public class QuickUnion {

    private int[] id;

    public QuickUnion(int n) {
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
        System.out.println("Root of "+p+ " is "+rootP+" and Root of "+q+ " is "+rootQ);
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
        QuickUnion qu = new QuickUnion(n);

        System.out.println("Initial state of the array:");
        qu.printArray();

        qu.union(4, 3);
        System.out.println("After union(4, 3):");
        qu.printArray();

        qu.union(3, 8);
        System.out.println("After union(3, 8):");
        qu.printArray();

        qu.union(6, 5);
        System.out.println("After union(6, 5):");
        qu.printArray();

        qu.union(9, 4);
        System.out.println("After union(9, 4):");
        qu.printArray();

        qu.union(2, 1);
        System.out.println("After union(2, 1):");
        qu.printArray();


        System.out.println("Is 0 connected to 7? " + qu.isConnected(0, 7));
        System.out.println("Is 8 connected to 9? " + qu.isConnected(8, 9));
    }
}
