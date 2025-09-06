package androidx.media;

import android.text.TextUtils;

class g implements c {
    private String a;
    private int b;
    private int c;

    g(String s, int v, int v1) {
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof g ? TextUtils.equals(this.a, ((g)object0).a) && this.b == ((g)object0).b && this.c == ((g)object0).c : false;
    }

    @Override
    public int hashCode() {
        return B.c.b(new Object[]{this.a, this.b, this.c});
    }
}

