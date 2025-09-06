package g0;

public final class s implements Runnable {
    public final r f;
    public final String[] g;

    public s(r r0, String[] arr_s) {
        this.f = r0;
        this.g = arr_s;
    }

    @Override
    public final void run() {
        b.x(this.f, this.g);
    }
}

