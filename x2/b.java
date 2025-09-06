package x2;

import java.io.OutputStream;

final class b extends OutputStream {
    private long f;

    b() {
        this.f = 0L;
    }

    long a() {
        return this.f;
    }

    @Override
    public void write(int v) {
        ++this.f;
    }

    @Override
    public void write(byte[] arr_b) {
        this.f += (long)arr_b.length;
    }

    @Override
    public void write(byte[] arr_b, int v, int v1) {
        if(v < 0 || v > arr_b.length || v1 < 0 || (v + v1 > arr_b.length || v + v1 < 0)) {
            throw new IndexOutOfBoundsException();
        }
        this.f += (long)v1;
    }
}

