package z2;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

class q {
    private final SharedPreferences a;

    static {
    }

    public q(Context context0, String s) {
        this.a = context0.getSharedPreferences("FirebaseHeartBeat" + s, 0);
    }

    private void a() {
        synchronized(this) {
            long v1 = this.a.getLong("fire-count", 0L);
            String s = "";
            String s1 = null;
            for(Object object0: this.a.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() instanceof Set) {
                    for(Object object1: ((Set)map$Entry0.getValue())) {
                        String s2 = (String)object1;
                        if(s1 == null || s1.compareTo(s2) > 0) {
                            s = (String)map$Entry0.getKey();
                            s1 = s2;
                        }
                    }
                }
            }
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet(this.a.getStringSet(s, hashSet0));
            hashSet1.remove(s1);
            this.a.edit().putStringSet(s, hashSet1).putLong("fire-count", v1 - 1L).commit();
        }
    }

    void b() {
        synchronized(this) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
            int v1 = 0;
            for(Object object0: this.a.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() instanceof Set) {
                    Set set0 = (Set)map$Entry0.getValue();
                    String s = (String)map$Entry0.getKey();
                    if(set0.contains("2025-09-05")) {
                        HashSet hashSet0 = new HashSet();
                        hashSet0.add("2025-09-05");
                        ++v1;
                        sharedPreferences$Editor0.putStringSet(s, hashSet0);
                    }
                    else {
                        sharedPreferences$Editor0.remove(s);
                    }
                }
            }
            if(v1 == 0) {
                sharedPreferences$Editor0.remove("fire-count");
            }
            else {
                sharedPreferences$Editor0.putLong("fire-count", ((long)v1));
            }
            sharedPreferences$Editor0.commit();
        }
    }

    List c() {
        synchronized(this) {
            List list0 = new ArrayList();
            for(Object object0: this.a.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() instanceof Set) {
                    HashSet hashSet0 = new HashSet(((Set)map$Entry0.getValue()));
                    hashSet0.remove("2025-09-05");
                    if(!hashSet0.isEmpty()) {
                        ((ArrayList)list0).add(r.a(((String)map$Entry0.getKey()), new ArrayList(hashSet0)));
                    }
                }
            }
            this.l(System.currentTimeMillis());
            return list0;
        }
    }

    private String d(long v) [...] // 潜在的解密器

    private String e(String s) {
        synchronized(this) {
            for(Object object0: this.a.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() instanceof Set) {
                    for(Object object1: ((Set)map$Entry0.getValue())) {
                        if(s.equals(((String)object1))) {
                            return (String)map$Entry0.getKey();
                        }
                        if(false) {
                            break;
                        }
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return null;
        }
    }

    boolean f(long v, long v1) {
        synchronized(this) {
            return this.d(v).equals(this.d(v1));
        }
    }

    void g() {
        synchronized(this) {
            this.a.edit().putString("last-used-date", "2025-09-05").commit();
            this.h("2025-09-05");
        }
    }

    private void h(String s) {
        synchronized(this) {
            String s1 = this.e(s);
            if(s1 == null) {
                return;
            }
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet(this.a.getStringSet(s1, hashSet0));
            hashSet1.remove(s);
            if(hashSet1.isEmpty()) {
                this.a.edit().remove(s1).commit();
            }
            else {
                this.a.edit().putStringSet(s1, hashSet1).commit();
            }
        }
    }

    boolean i(long v) {
        synchronized(this) {
            return this.j("fire-global", v);
        }
    }

    boolean j(String s, long v) {
        synchronized(this) {
            if(this.a.contains(s)) {
                if(!this.f(this.a.getLong(s, -1L), v)) {
                    this.a.edit().putLong(s, v).commit();
                    return true;
                }
                return false;
            }
            this.a.edit().putLong(s, v).commit();
            return true;
        }
    }

    void k(long v, String s) {
        synchronized(this) {
            String s1 = this.d(v);
            if(this.a.getString("last-used-date", "").equals(s1)) {
                String s2 = this.e(s1);
                if(s2 == null) {
                    return;
                }
                if(s2.equals(s)) {
                    return;
                }
                this.m(s, s1);
                return;
            }
            long v2 = this.a.getLong("fire-count", 0L);
            if(v2 + 1L == 30L) {
                this.a();
                v2 = this.a.getLong("fire-count", 0L);
            }
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet(this.a.getStringSet(s, hashSet0));
            hashSet1.add(s1);
            this.a.edit().putStringSet(s, hashSet1).putLong("fire-count", v2 + 1L).putString("last-used-date", s1).commit();
        }
    }

    void l(long v) {
        synchronized(this) {
            this.a.edit().putLong("fire-global", v).commit();
        }
    }

    private void m(String s, String s1) {
        synchronized(this) {
            this.h(s1);
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet(this.a.getStringSet(s, hashSet0));
            hashSet1.add(s1);
            this.a.edit().putStringSet(s, hashSet1).commit();
        }
    }
}

