package k2;

import g2.f;
import j2.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

class b {
    private final Map a;
    private final int b;
    private final int c;

    public b(int v, int v1) {
        this.a = new HashMap();
        this.b = v;
        this.c = v1;
    }

    public Map a() {
        synchronized(this) {
            return Collections.unmodifiableMap(new HashMap(this.a));
        }
    }

    private String b(String s) {
        if(s == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        return b.c(s, this.c);
    }

    public static String c(String s, int v) {
        if(s != null) {
            s = s.trim();
            return s.length() <= v ? s : s.substring(0, v);
        }
        return null;
    }

    public boolean d(String s, String s1) {
        synchronized(this) {
            String s2 = this.b(s);
            if(this.a.size() >= this.b && !this.a.containsKey(s2)) {
                f.f().k("Ignored entry \"" + s + "\" when adding custom keys. Maximum allowable: " + this.b);
                return false;
            }
            String s3 = b.c(s1, this.c);
            if(i.B(((String)this.a.get(s2)), s3)) {
                return false;
            }
            Map map0 = this.a;
            if(s1 == null) {
                s3 = "";
            }
            map0.put(s2, s3);
            return true;
        }
    }

    public void e(Map map0) {
        synchronized(this) {
            int v1 = 0;
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s = this.b(((String)map$Entry0.getKey()));
                if(this.a.size() >= this.b && !this.a.containsKey(s)) {
                    ++v1;
                }
                else {
                    String s1 = (String)map$Entry0.getValue();
                    this.a.put(s, (s1 == null ? "" : b.c(s1, this.c)));
                }
            }
            if(v1 > 0) {
                f.f().k("Ignored " + v1 + " entries when adding custom keys. Maximum allowable: " + this.b);
            }
        }
    }
}

