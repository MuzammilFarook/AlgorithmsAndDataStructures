package Week1;

import Week2.MyOwnStackWithArray;

public class RoughNoteBook {

    //https://www.youtube.com/watch?v=s2mYsPWzLjg

    //1758

    public static void main(String[] args) {
       //minOperations("10010");
        MyOwnStackWithArray my = new MyOwnStackWithArray();
        my.push(1);
        my.push(2);
        my.push(3);
        my.push(4);
        my.push(5);

        my.print();

        my.pop();
        my.print();

    }

    public static int minOperations(String s) {
        int countPatternStartingWith0 = 0;
        int countPatternStartingWith1 = 0;

        //s.startsWith(0)
        for (int i = 0; i < s.length(); i++) {

            char expected = i % 2 == 0 ? '0' : '1';
            if (i % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }


        return Math.min(countPatternStartingWith0, countPatternStartingWith1);

    }
}
