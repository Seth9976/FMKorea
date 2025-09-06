package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class a0 {
    private final f0 a;
    private final ConcurrentMap b;
    private static final a0 c;

    static {
        a0.c = new a0();
    }

    private a0() {
        this.b = new ConcurrentHashMap();
        this.a = new G();
    }

    public static a0 a() {
        return a0.c;
    }

    public e0 b(Class class0, e0 e00) {
        y.b(class0, "messageType");
        y.b(e00, "schema");
        return (e0)this.b.putIfAbsent(class0, e00);
    }

    public e0 c(Class class0) {
        y.b(class0, "messageType");
        e0 e00 = (e0)this.b.get(class0);
        if(e00 == null) {
            e00 = this.a.a(class0);
            e0 e01 = this.b(class0, e00);
            return e01 == null ? e00 : e01;
        }
        return e00;
    }

    public e0 d(Object object0) {
        return this.c(object0.getClass());
    }
}

