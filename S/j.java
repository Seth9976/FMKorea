package s;

import java.util.Arrays;

public abstract class j extends e implements i {
    public e[] w0;
    public int x0;

    public j() {
        this.w0 = new e[4];
        this.x0 = 0;
    }

    @Override  // s.i
    public void a(e e0) {
        if(e0 != this && e0 != null) {
            e[] arr_e = this.w0;
            if(this.x0 + 1 > arr_e.length) {
                this.w0 = (e[])Arrays.copyOf(arr_e, arr_e.length * 2);
            }
            int v = this.x0;
            this.w0[v] = e0;
            this.x0 = v + 1;
        }
    }

    @Override  // s.i
    public void b() {
        this.x0 = 0;
        Arrays.fill(this.w0, null);
    }

    @Override  // s.i
    public void c(f f0) {
    }
}

