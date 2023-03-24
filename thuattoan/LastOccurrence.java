package thuattoan;

public class LastOccurrence {
    public int L(String P, char x) {
        int index = -1;
        for (int i = 0; i < P.length(); i++) {
            if (P.charAt(i) == x) {
                index = i;
            }
        }
        if (index >= 0) return index;
        return -1;
    }
}
