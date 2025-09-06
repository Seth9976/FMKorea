package w2;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map.Entry;
import java.util.Map;
import u2.b;
import u2.c;
import u2.d;
import u2.f;
import u2.g;

final class e implements u2.e, g {
    private e a;
    private boolean b;
    private final JsonWriter c;
    private final Map d;
    private final Map e;
    private final d f;
    private final boolean g;

    e(Writer writer0, Map map0, Map map1, d d0, boolean z) {
        this.a = null;
        this.b = true;
        this.c = new JsonWriter(writer0);
        this.d = map0;
        this.e = map1;
        this.f = d0;
        this.g = z;
    }

    @Override  // u2.e
    public u2.e a(c c0, boolean z) {
        return this.q(c0.b(), z);
    }

    @Override  // u2.e
    public u2.e b(c c0, double f) {
        return this.m(c0.b(), f);
    }

    @Override  // u2.e
    public u2.e c(c c0, int v) {
        return this.n(c0.b(), v);
    }

    @Override  // u2.e
    public u2.e d(c c0, long v) {
        return this.o(c0.b(), v);
    }

    @Override  // u2.e
    public u2.e e(c c0, Object object0) {
        return this.p(c0.b(), object0);
    }

    @Override  // u2.g
    public g f(String s) {
        return this.l(s);
    }

    @Override  // u2.g
    public g g(boolean z) {
        return this.r(z);
    }

    public e h(double f) {
        this.y();
        this.c.value(f);
        return this;
    }

    public e i(int v) {
        this.y();
        this.c.value(((long)v));
        return this;
    }

    public e j(long v) {
        this.y();
        this.c.value(v);
        return this;
    }

    e k(Object object0, boolean z) {
        int v = 0;
        if(z && this.t(object0)) {
            throw new b(String.format("%s cannot be encoded inline", (object0 == null ? null : object0.getClass())));
        }
        if(object0 == null) {
            this.c.nullValue();
            return this;
        }
        if(object0 instanceof Number) {
            this.c.value(((Number)object0));
            return this;
        }
        if(object0.getClass().isArray()) {
            if(object0 instanceof byte[]) {
                return this.s(((byte[])object0));
            }
            this.c.beginArray();
            if(object0 instanceof int[]) {
                while(v < ((int[])object0).length) {
                    this.c.value(((long)((int[])object0)[v]));
                    ++v;
                }
            }
            else if(object0 instanceof long[]) {
                while(v < ((long[])object0).length) {
                    this.j(((long[])object0)[v]);
                    ++v;
                }
            }
            else if(object0 instanceof double[]) {
                while(v < ((double[])object0).length) {
                    this.c.value(((double[])object0)[v]);
                    ++v;
                }
            }
            else if(object0 instanceof boolean[]) {
                while(v < ((boolean[])object0).length) {
                    this.c.value(((boolean[])object0)[v]);
                    ++v;
                }
            }
            else if(object0 instanceof Number[]) {
                for(int v1 = 0; v1 < ((Number[])object0).length; ++v1) {
                    this.k(((Number[])object0)[v1], false);
                }
            }
            else {
                for(int v2 = 0; v2 < ((Object[])object0).length; ++v2) {
                    this.k(((Object[])object0)[v2], false);
                }
            }
            this.c.endArray();
            return this;
        }
        if(object0 instanceof Collection) {
            this.c.beginArray();
            for(Object object1: ((Collection)object0)) {
                this.k(object1, false);
            }
            this.c.endArray();
            return this;
        }
        if(object0 instanceof Map) {
            this.c.beginObject();
            for(Object object2: ((Map)object0).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object2;
                Object object3 = map$Entry0.getKey();
                try {
                    this.p(((String)object3), map$Entry0.getValue());
                }
                catch(ClassCastException classCastException0) {
                    throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", object3, object3.getClass()), classCastException0);
                }
            }
            this.c.endObject();
            return this;
        }
        Class class0 = object0.getClass();
        d d0 = (d)this.d.get(class0);
        if(d0 != null) {
            return this.v(d0, object0, z);
        }
        Class class1 = object0.getClass();
        f f0 = (f)this.e.get(class1);
        if(f0 != null) {
            f0.a(object0, this);
            return this;
        }
        if(object0 instanceof Enum) {
            if(object0 instanceof w2.f) {
                this.i(((w2.f)object0).a());
                return this;
            }
            this.l(((Enum)object0).name());
            return this;
        }
        return this.v(this.f, object0, z);
    }

    public e l(String s) {
        this.y();
        this.c.value(s);
        return this;
    }

    public e m(String s, double f) {
        this.y();
        this.c.name(s);
        return this.h(f);
    }

    public e n(String s, int v) {
        this.y();
        this.c.name(s);
        return this.i(v);
    }

    public e o(String s, long v) {
        this.y();
        this.c.name(s);
        return this.j(v);
    }

    // 去混淆评级： 低(20)
    public e p(String s, Object object0) {
        return this.g ? this.x(s, object0) : this.w(s, object0);
    }

    public e q(String s, boolean z) {
        this.y();
        this.c.name(s);
        return this.r(z);
    }

    public e r(boolean z) {
        this.y();
        this.c.value(z);
        return this;
    }

    public e s(byte[] arr_b) {
        this.y();
        if(arr_b == null) {
            this.c.nullValue();
            return this;
        }
        String s = Base64.encodeToString(arr_b, 2);
        this.c.value(s);
        return this;
    }

    // 去混淆评级： 中等(50)
    private boolean t(Object object0) {
        return object0 == null || object0.getClass().isArray() || object0 instanceof Collection || object0 instanceof Date || object0 instanceof Enum || object0 instanceof Number;
    }

    void u() {
        this.y();
        this.c.flush();
    }

    e v(d d0, Object object0, boolean z) {
        if(!z) {
            this.c.beginObject();
        }
        d0.a(object0, this);
        if(!z) {
            this.c.endObject();
        }
        return this;
    }

    private e w(String s, Object object0) {
        this.y();
        this.c.name(s);
        if(object0 == null) {
            this.c.nullValue();
            return this;
        }
        return this.k(object0, false);
    }

    private e x(String s, Object object0) {
        if(object0 == null) {
            return this;
        }
        this.y();
        this.c.name(s);
        return this.k(object0, false);
    }

    private void y() {
        if(!this.b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e e0 = this.a;
        if(e0 != null) {
            e0.y();
            this.a.b = false;
            this.a = null;
            this.c.endObject();
        }
    }
}

