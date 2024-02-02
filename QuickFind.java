package Week1;

import java.util.Arrays;
//https://chat.openai.com/share/3ffe9899-2ad3-498c-bc4f-4364bc65732c
public class QuickFind {
    private int[] id;

    // Constructor: Initialize the array to represent individual components
    public QuickFind(int size) {
        id = new int[size];
        for (int i = 0; i < size; i++) {
            id[i] = i;
        }
    }

    // Check if two objects are connected
    public boolean isConnected(int p, int q) {
        return id[p] == id[q];
    }

    // Connect two objects
    // Muzam: quadratic time complexity O(N^2)
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];

        // Change all entries with id[p] to id[q]
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    public void printArray() {
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        int size = 10;
        QuickFind quickFind = new QuickFind(size);
        System.out.println("Initial state of the array:");
        quickFind.printArray();

        quickFind.union(4, 3);
        System.out.println("After union(4, 3):");
        quickFind.printArray();

        quickFind.union(3, 8);
        System.out.println("After union(3, 8):");
        quickFind.printArray();

        quickFind.union(6, 5);
        System.out.println("After union(6, 5):");
        quickFind.printArray();

        quickFind.union(9, 4);
        System.out.println("After union(9, 4):");
        quickFind.printArray();

        quickFind.union(2, 1);
        System.out.println("After union(2, 1):");
        quickFind.printArray();

        // Check if 0 and 7 are connected
        System.out.println("Are 0 and 7 connected? " + quickFind.isConnected(0, 7));

        // Check if 8 and 9 are connected
        System.out.println("Are 8 and 9 connected? " + quickFind.isConnected(8, 9));
    }
}

