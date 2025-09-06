package a3;

import java.util.Arrays;

public final class b {
    private final byte[][] a;
    private final int b;
    private final int c;

    public b(int v, int v1) {
        this.a = new byte[v1][v];
        this.b = v;
        this.c = v1;
    }

    public void a(byte b) {
        byte[][] arr2_b = this.a;
        for(int v = 0; v < arr2_b.length; ++v) {
            Arrays.fill(arr2_b[v], b);
        }
    }

    public byte b(int v, int v1) {
        return this.a[v1][v];
    }

    public byte[][] c() {
        return this.a;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.b;
    }

    public void f(int v, int v1, int v2) {
        this.a[v1][v] = (byte)v2;
    }

    public void g(int v, int v1, boolean z) {
        this.a[v1][v] = (byte)z;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.b * 2 * this.c + 2);
        for(int v = 0; v < this.c; ++v) {
            byte[] arr_b = this.a[v];
            for(int v1 = 0; v1 < this.b; ++v1) {
                switch(arr_b[v1]) {
                    case 0: {
                        stringBuilder0.append(" 0");
                        break;
                    }
                    case 1: {
                        stringBuilder0.append(" 1");
                        break;
                    }
                    default: {
                        stringBuilder0.append("  ");
                    }
                }
            }
            stringBuilder0.append('\n');
        }
        return stringBuilder0.toString();
    }
}

