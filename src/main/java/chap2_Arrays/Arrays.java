package chap2_Arrays;

import static java.lang.System.arraycopy;
import static java.lang.System.out;

public class Arrays {


    public static void main(String[] args) {
        long[] intArray = {1,2,4,8,16};

        long length = 5;
        long key;
        key = 2;
        int j;
        for (j = 0; j < length; j++)
            if (intArray[j] == key) break;

        arraycopy(intArray, j + 1, intArray, j, (int) (length - 1 - j));
                length--;

        out.println("after deleting");
                for (j = 0; j < length; j++) {
                    out.println(intArray[j]);
                }
    }
}
