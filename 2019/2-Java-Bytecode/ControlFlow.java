class ControlFlow {

    public static Object id(Object o) {
        return o;
    }

    public static long max(long a, long b) { // 4 locals are required
        return a > b ? a : b;
    }

    public static long sumOfInts(int upTo) {
        long s = 1l;
        int i = 2;
        while(i < upTo) { s += i ; i++; }
        return s;
    }
}
