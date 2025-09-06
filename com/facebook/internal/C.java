package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import z3.k;

public final class c {
    public static final class a implements h {
        @Override  // com.facebook.internal.c$h
        public void a(Bundle bundle0, String s, Object object0) {
            k.e(bundle0, "bundle");
            k.e(s, "key");
            k.e(object0, "value");
            bundle0.putBoolean(s, ((Boolean)object0).booleanValue());
        }
    }

    public static final class b implements h {
        @Override  // com.facebook.internal.c$h
        public void a(Bundle bundle0, String s, Object object0) {
            k.e(bundle0, "bundle");
            k.e(s, "key");
            k.e(object0, "value");
            bundle0.putInt(s, ((int)(((Integer)object0))));
        }
    }

    public static final class com.facebook.internal.c.c implements h {
        @Override  // com.facebook.internal.c$h
        public void a(Bundle bundle0, String s, Object object0) {
            k.e(bundle0, "bundle");
            k.e(s, "key");
            k.e(object0, "value");
            bundle0.putLong(s, ((long)(((Long)object0))));
        }
    }

    public static final class d implements h {
        @Override  // com.facebook.internal.c$h
        public void a(Bundle bundle0, String s, Object object0) {
            k.e(bundle0, "bundle");
            k.e(s, "key");
            k.e(object0, "value");
            bundle0.putDouble(s, ((double)(((Double)object0))));
        }
    }

    public static final class e implements h {
        @Override  // com.facebook.internal.c$h
        public void a(Bundle bundle0, String s, Object object0) {
            k.e(bundle0, "bundle");
            k.e(s, "key");
            k.e(object0, "value");
            bundle0.putString(s, ((String)object0));
        }
    }

    public static final class f implements h {
        @Override  // com.facebook.internal.c$h
        public void a(Bundle bundle0, String s, Object object0) {
            k.e(bundle0, "bundle");
            k.e(s, "key");
            k.e(object0, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    public static final class g implements h {
        @Override  // com.facebook.internal.c$h
        public void a(Bundle bundle0, String s, Object object0) {
            k.e(bundle0, "bundle");
            k.e(s, "key");
            k.e(object0, "value");
            ArrayList arrayList0 = new ArrayList();
            if(((JSONArray)object0).length() == 0) {
                bundle0.putStringArrayList(s, arrayList0);
                return;
            }
            int v = ((JSONArray)object0).length();
            for(int v1 = 0; v1 < v; ++v1) {
                Object object1 = ((JSONArray)object0).get(v1);
                if(!(object1 instanceof String)) {
                    throw new IllegalArgumentException("Unexpected type in an array: " + object1.getClass());
                }
                arrayList0.add(object1);
            }
            bundle0.putStringArrayList(s, arrayList0);
        }
    }

    public interface h {
        void a(Bundle arg1, String arg2, Object arg3);
    }

    private static final Map a;
    public static final c b;

    static {
        c.b = new c();
        HashMap hashMap0 = new HashMap();
        c.a = hashMap0;
        a c$a0 = new a();
        hashMap0.put(Boolean.class, c$a0);
        b c$b0 = new b();
        hashMap0.put(Integer.class, c$b0);
        com.facebook.internal.c.c c$c0 = new com.facebook.internal.c.c();
        hashMap0.put(Long.class, c$c0);
        d c$d0 = new d();
        hashMap0.put(Double.class, c$d0);
        e c$e0 = new e();
        hashMap0.put(String.class, c$e0);
        f c$f0 = new f();
        hashMap0.put(String[].class, c$f0);
        g c$g0 = new g();
        hashMap0.put(JSONArray.class, c$g0);
    }

    public static final Bundle a(JSONObject jSONObject0) {
        k.e(jSONObject0, "jsonObject");
        Bundle bundle0 = new Bundle();
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            Object object1 = jSONObject0.get(s);
            if(object1 == JSONObject.NULL) {
            }
            else if(object1 instanceof JSONObject) {
                bundle0.putBundle(s, c.a(((JSONObject)object1)));
            }
            else {
                Class class0 = object1.getClass();
                h c$h0 = (h)c.a.get(class0);
                if(c$h0 == null) {
                    throw new IllegalArgumentException("Unsupported type: " + object1.getClass());
                }
                k.d(s, "key");
                k.d(object1, "value");
                c$h0.a(bundle0, s, object1);
            }
        }
        return bundle0;
    }
}

