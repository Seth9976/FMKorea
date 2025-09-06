package z3;

import E3.b;
import G3.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import m3.F;
import m3.o;
import y3.c;
import y3.f;
import y3.i;
import y3.j;
import y3.l;
import y3.m;
import y3.n;
import y3.p;
import y3.q;
import y3.r;
import y3.s;
import y3.t;
import y3.u;
import y3.v;
import y3.w;

public final class e implements b, d {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        public final String a(Class class0) {
            k.e(class0, "jClass");
            String s = null;
            if(!class0.isAnonymousClass()) {
                if(class0.isLocalClass()) {
                    String s1 = class0.getSimpleName();
                    Method method0 = class0.getEnclosingMethod();
                    if(method0 != null) {
                        k.b(s1);
                        String s2 = h.d0(s1, method0.getName() + '$', null, 2, null);
                        if(s2 != null) {
                            return s2;
                        }
                    }
                    Constructor constructor0 = class0.getEnclosingConstructor();
                    if(constructor0 != null) {
                        k.b(s1);
                        return h.d0(s1, constructor0.getName() + '$', null, 2, null);
                    }
                    k.b(s1);
                    return h.c0(s1, '$', null, 2, null);
                }
                if(class0.isArray()) {
                    Class class1 = class0.getComponentType();
                    if(class1.isPrimitive()) {
                        String s3 = (String)e.g.get(class1.getName());
                        if(s3 != null) {
                            s = s3 + "Array";
                        }
                    }
                    return s == null ? "Array" : s;
                }
                s = (String)e.g.get(class0.getName());
                return s == null ? class0.getSimpleName() : s;
            }
            return null;
        }
    }

    private final Class a;
    public static final a b;
    private static final Map c;
    private static final HashMap d;
    private static final HashMap e;
    private static final HashMap f;
    private static final Map g;

    static {
        e.b = new a(null);
        int v = 0;
        Iterable iterable0 = o.k(new Class[]{y3.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, y3.b.class, c.class, y3.d.class, y3.e.class, f.class, y3.g.class, y3.h.class, i.class, j.class, y3.k.class, m.class, n.class, y3.o.class});
        ArrayList arrayList0 = new ArrayList(o.n(iterable0, 10));
        for(Object object0: iterable0) {
            if(v < 0) {
                o.m();
            }
            arrayList0.add(l3.r.a(((Class)object0), v));
            ++v;
        }
        e.c = F.p(arrayList0);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("boolean", "kotlin.Boolean");
        hashMap0.put("char", "kotlin.Char");
        hashMap0.put("byte", "kotlin.Byte");
        hashMap0.put("short", "kotlin.Short");
        hashMap0.put("int", "kotlin.Int");
        hashMap0.put("float", "kotlin.Float");
        hashMap0.put("long", "kotlin.Long");
        hashMap0.put("double", "kotlin.Double");
        e.d = hashMap0;
        HashMap hashMap1 = new HashMap();
        hashMap1.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap1.put("java.lang.Character", "kotlin.Char");
        hashMap1.put("java.lang.Byte", "kotlin.Byte");
        hashMap1.put("java.lang.Short", "kotlin.Short");
        hashMap1.put("java.lang.Integer", "kotlin.Int");
        hashMap1.put("java.lang.Float", "kotlin.Float");
        hashMap1.put("java.lang.Long", "kotlin.Long");
        hashMap1.put("java.lang.Double", "kotlin.Double");
        e.e = hashMap1;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Object", "kotlin.Any");
        hashMap2.put("java.lang.String", "kotlin.String");
        hashMap2.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap2.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap2.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap2.put("java.lang.Number", "kotlin.Number");
        hashMap2.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap2.put("java.lang.Enum", "kotlin.Enum");
        hashMap2.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap2.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap2.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap2.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap2.put("java.util.List", "kotlin.collections.List");
        hashMap2.put("java.util.Set", "kotlin.collections.Set");
        hashMap2.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap2.put("java.util.Map", "kotlin.collections.Map");
        hashMap2.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap2.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap2.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap2.putAll(hashMap0);
        hashMap2.putAll(hashMap1);
        Collection collection0 = hashMap0.values();
        k.d(collection0, "<get-values>(...)");
        Iterator iterator1 = collection0.iterator();
        while(iterator1.hasNext()) {
            k.b("kotlin.Long");
            l3.r.a("kotlin.jvm.internal.LongCompanionObject", "kotlin.Long.Companion");
            hashMap2.put("kotlin.jvm.internal.LongCompanionObject", "kotlin.Long.Companion");
        }
        for(Object object1: e.c.entrySet()) {
            hashMap2.put("y3.o", "kotlin.Function" + ((Number)((Map.Entry)object1).getValue()).intValue());
        }
        e.f = hashMap2;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(F.e(hashMap2.size()));
        Iterator iterator3 = hashMap2.entrySet().iterator();
        while(iterator3.hasNext()) {
            iterator3.next();
            k.b("kotlin.Function0");
            linkedHashMap0.put("y3.a", "Function0");
        }
        e.g = linkedHashMap0;
    }

    public e(Class class0) {
        k.e(class0, "jClass");
        super();
        this.a = class0;
    }

    @Override  // E3.b
    public String a() {
        return e.b.a(this.b());
    }

    @Override  // z3.d
    public Class b() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof e && k.a(x3.a.b(this), x3.a.b(((b)object0)));
    }

    @Override
    public int hashCode() {
        return x3.a.b(this).hashCode();
    }

    @Override
    public String toString() {
        return this.b() + " (Kotlin reflection is not available)";
    }
}

