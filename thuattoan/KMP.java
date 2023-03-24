package thuattoan;

public class KMP {
    //Knuth-Morris-Pratt
    private int[] failure(String P) {
        int[] F = new int[P.length()];

        F[0] = -1;

        for (int i = 1; i < P.length(); i++) {
            int maxLenPrefix = 0;
            String[] prefix = new String[i];
            String[] suffix = new String[i];

            //Prefix
            for (int j = 0; j < i; j++) {
                prefix[j] = P.substring(0, j+1);
            }

            //Suffix
            int k = i;
            int index = 1;
            suffix[0] = "";
            while (true) {
                if (index >= k) break;
                suffix[index] = P.substring(index, k);
                index++;
            }

            for (int n = prefix.length-1; n >= 0; n--) {
                for (int m = 0; m < suffix.length; m++) {
                    if (prefix[n].equals(suffix[m])) {
                        if (prefix[n].length() > maxLenPrefix) {
                            maxLenPrefix = prefix[n].length();
                        }
                    }
                }
            }
            F[i] = maxLenPrefix;
        }
        return F;
    }

    public int KMP(String P, String T) {
        int[] F = failure(P);

        int i = 0, j = 0, index = -1;
        while (i < T.length()-P.length()) {
            if (j == P.length()) {
                index = i;
                break;
            }
            if (T.charAt(i+j) == P.charAt(j)) {
                j++;
            } else {
                i = i+j-F[j];
                if (F[j] == -1) {
                    j = 0;
                } else {
                    j = F[j];
                }
            }
        }
        return index;
    }
}
