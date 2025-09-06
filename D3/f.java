package D3;

abstract class f extends e {
    public static int a(int v, int v1) {
        return v >= v1 ? v : v1;
    }

    public static int b(int v, int v1) {
        return v <= v1 ? v : v1;
    }

    public static long c(long v, long v1) {
        return v <= v1 ? v : v1;
    }

    public static int d(int v, int v1, int v2) {
        if(v1 > v2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + v2 + " is less than minimum " + v1 + '.');
        }
        if(v < v1) {
            return v1;
        }
        return v <= v2 ? v : v2;
    }

    public static long e(long v, long v1, long v2) {
        if(v1 > v2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + v2 + " is less than minimum " + v1 + '.');
        }
        if(v < v1) {
            return v1;
        }
        return v <= v2 ? v : v2;
    }

    public static a f(int v, int v1) {
        return a.i.a(v, v1, -1);
    }

    public static c g(int v, int v1) {
        return v1 > 0x80000000 ? new c(v, v1 - 1) : c.j.a();
    }
}

