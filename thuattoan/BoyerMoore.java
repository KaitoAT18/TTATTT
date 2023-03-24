package thuattoan;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BoyerMoore {
    private int LastOccurrence(String P, char x) {
        int index = -1;
        for (int i = 0; i < P.length(); i++) {
            if (P.charAt(i) == x) {
                index = i;
            }
        }
        if (index >= 0) return index;
        return -1;
    }

    public void printL(String P, String T) {
        //Loại bỏ các phần tử trùng nhau của chuỗi T
        Set<Character> characters = new HashSet<>();

        //Thêm các ký tự vào tập hợp
        for (int i = 0; i < T.length(); i++) {
            characters.add(T.charAt(i));
        }

        //Chuyển tập hợp thành chuỗi
        StringBuilder sb = new StringBuilder(characters.size());
        for (Character c: characters) {
            sb.append(c);
        }

        String T_new = sb.toString();

        int[] L = new int[T_new.length()];
        System.out.println(Arrays.toString(T_new.toCharArray()));
        for (int i = 0; i < T_new.length(); i++) {
            L[i] = LastOccurrence(P, T_new.charAt(i));
        }
        System.out.println(Arrays.toString(L));
    }

    public int BoyerMoore(String P, String T) {

        int j = P.length()-1;
        int i = P.length()-1;
        while (i < T.length()) {
            if (P.charAt(j) == T.charAt(i)) {
                i--;
                j--;
            } else {
                i = i + P.length() - Math.min(j, 1 + LastOccurrence(P, T.charAt(i)));
                j = P.length() - 1;
            }
            if (j < 0) {
                return i + 1;
            }
        }
        return -1;
    }
}
