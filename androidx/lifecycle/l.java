package androidx.lifecycle;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import z3.k;

public class L {
    private final Map a;

    public L() {
        this.a = new LinkedHashMap();
    }

    public final void a() {
        for(Object object0: this.a.values()) {
            ((H)object0).a();
        }
        this.a.clear();
    }

    public final H b(String s) {
        k.e(s, "key");
        return (H)this.a.get(s);
    }

    public final Set c() {
        return new HashSet(this.a.keySet());
    }

    public final void d(String s, H h0) {
        k.e(s, "key");
        k.e(h0, "viewModel");
        H h1 = (H)this.a.put(s, h0);
        if(h1 != null) {
            h1.d();
        }
    }
}

