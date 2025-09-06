package M0;

import b1.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    private String a;
    private List b;
    private String c;
    private static final Set d;

    static {
        c.d = new CopyOnWriteArraySet();
    }

    private c(String s, List list0, String s1) {
        this.a = s;
        this.b = list0;
        this.c = s1;
    }

    private static void a(JSONObject jSONObject0) {
        Class class0 = c.class;
        if(a.d(class0)) {
            return;
        }
        try {
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s = (String)object0;
                JSONObject jSONObject1 = jSONObject0.optJSONObject(s);
                if(jSONObject1 != null) {
                    String s1 = jSONObject1.optString("k");
                    String s2 = jSONObject1.optString("v");
                    if(!s1.isEmpty()) {
                        c c0 = new c(s, Arrays.asList(s1.split(",")), s2);
                        c.d.add(c0);
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
    }

    public static Set b() {
        Class class0 = c.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            Set set0 = new HashSet();
            for(Object object0: c.d) {
                set0.add(((c)object0).d());
            }
            return set0;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    List c() {
        if(a.d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.b);
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
            return null;
        }
    }

    // 去混淆评级： 低(20)
    String d() {
        return a.d(this) ? null : this.a;
    }

    static Set e() {
        Class class0 = c.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            return new HashSet(c.d);
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    // 去混淆评级： 低(20)
    String f() {
        return a.d(this) ? null : this.c;
    }

    static void g(String s) {
        Class class0 = c.class;
        if(a.d(class0)) {
            return;
        }
        try {
            c.d.clear();
            c.a(new JSONObject(s));
        }
        catch(JSONException throwable0) {
            a.b(throwable0, class0);
        }
        catch(Throwable unused_ex) {
        }
    }
}

