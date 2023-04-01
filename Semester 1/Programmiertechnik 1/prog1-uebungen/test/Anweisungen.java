package klausurAufgabe4;

public final class Anweisungen {
    private Anweisungen() {}
    public static void main(String[]args) {
        System.out.println(max());
        System.out.println(max(1));
        System.out.println(max(2, 3));
        System.out.println(max(4, 5, 6));
    }

    private static Integer max(Integer n, Integer m) {
        return n.intValue() > m.intValue() ? n : m;
    }

    private static Integer max(Integer...zahlen) {
        Integer m;
        switch (zahlen.length) {
        case 0:
            m = null;
            break;
        case 1:
            m = zahlen[0];
            break;
        default:
            m = zahlen[0];
            for (Integer n: zahlen) { // for-each-Schleife
                m = max(m, n);
            }
            break;
        }

        return m;
    }
}
