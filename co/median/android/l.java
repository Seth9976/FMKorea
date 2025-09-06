package co.median.android;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class l {
    public static class a {
        private final String a;
        private boolean b;
        private int c;
        private int d;
        private boolean e;

        a(String s, boolean z) {
            this.a = s;
            this.b = z;
            this.c = -1;
            this.d = -1;
        }

        public void h(int v, int v1) {
            this.c = v;
            this.d = v1;
        }

        @Override
        public String toString() {
            return "id=" + this.a + "\nisRoot=" + this.b + "\nurlLevel=" + this.c + "\nparentUrlLevel=" + this.d;
        }
    }

    interface b {
        void a();
    }

    private final LinkedHashMap a;
    private b b;
    private String c;

    public l() {
        this.c = null;
        this.a = new LinkedHashMap();
    }

    public void a(String s, boolean z) {
        a l$a0 = new a(s, z);
        this.a.put(s, l$a0);
    }

    public String b() {
        return this.c;
    }

    public String c() {
        for(Object object0: this.a.entrySet()) {
            a l$a0 = (a)((Map.Entry)object0).getValue();
            if(!l$a0.b) {
                return l$a0.a;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public int d(String s) {
        a l$a0 = (a)this.a.get(s);
        return l$a0 == null ? -1 : l$a0.d;
    }

    public int e(String s) {
        a l$a0 = (a)this.a.get(s);
        return l$a0 == null ? -1 : l$a0.c;
    }

    public int f() {
        return this.a.size();
    }

    public boolean g(String s) {
        a l$a0 = (a)this.a.get(s);
        return l$a0 == null ? false : l$a0.e;
    }

    public boolean h(String s) {
        a l$a0 = (a)this.a.get(s);
        return l$a0 == null ? false : l$a0.b;
    }

    public void i(String s) {
        this.a.remove(s);
        if(this.b != null && this.a.size() <= 1) {
            this.b.a();
        }
    }

    public void j(String s) {
        for(Object object0: this.a.entrySet()) {
            a l$a0 = (a)((Map.Entry)object0).getValue();
            l$a0.b = TextUtils.equals(s, ((CharSequence)((Map.Entry)object0).getKey()));
        }
    }

    public void k(String s) {
        this.c = s;
    }

    public void l(String s, boolean z) {
        a l$a0 = (a)this.a.get(s);
        if(l$a0 != null) {
            l$a0.e = z;
        }
    }

    public void m(b l$b0) {
        this.b = l$b0;
    }

    public void n(String s, int v) {
        a l$a0 = (a)this.a.get(s);
        if(l$a0 != null) {
            l$a0.h(v, l$a0.d);
        }
    }

    public void o(String s, int v, int v1) {
        a l$a0 = (a)this.a.get(s);
        if(l$a0 != null) {
            l$a0.h(v, v1);
        }
    }
}

