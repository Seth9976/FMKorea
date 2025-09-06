package s;

import java.util.ArrayList;
import r.c;

public abstract class m extends e {
    public ArrayList w0;

    public m() {
        this.w0 = new ArrayList();
    }

    public abstract void K0();

    public void L0(e e0) {
        this.w0.remove(e0);
        e0.w0(null);
    }

    public void M0() {
        this.w0.clear();
    }

    @Override  // s.e
    public void Y() {
        this.w0.clear();
        super.Y();
    }

    public void a(e e0) {
        this.w0.add(e0);
        if(e0.G() != null) {
            ((m)e0.G()).L0(e0);
        }
        e0.w0(this);
    }

    @Override  // s.e
    public void a0(c c0) {
        super.a0(c0);
        int v = this.w0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((e)this.w0.get(v1)).a0(c0);
        }
    }
}

