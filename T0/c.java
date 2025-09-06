package T0;

import S0.f.a;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.GraphRequest;
import com.facebook.h;
import com.facebook.internal.F;
import com.facebook.internal.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class c {
    static abstract class d {
        static final int[] a;

        static {
            int[] arr_v = new int[e.values().length];
            d.a = arr_v;
            try {
                arr_v[e.f.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                d.a[e.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum e {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        public String b() {
            switch(d.a[this.ordinal()]) {
                case 1: {
                    return "integrity_detect";
                }
                case 2: {
                    return "app_event_pred";
                }
                default: {
                    return "Unknown";
                }
            }
        }

        public String f() {
            switch(d.a[this.ordinal()]) {
                case 1: {
                    return "MTML_INTEGRITY_DETECT";
                }
                case 2: {
                    return "MTML_APP_EVENT_PRED";
                }
                default: {
                    return null;
                }
            }
        }
    }

    static class f {
        String a;
        String b;
        String c;
        int d;
        float[] e;
        File f;
        b g;
        private Runnable h;

        f(String s, String s1, String s2, int v, float[] arr_f) {
            this.a = s;
            this.b = s1;
            this.c = s2;
            this.d = v;
            this.e = arr_f;
        }

        static f c(JSONObject jSONObject0) {
            if(jSONObject0 == null) {
                return null;
            }
            try {
                return new f(jSONObject0.getString("use_case"), jSONObject0.getString("asset_uri"), jSONObject0.optString("rules_uri", null), jSONObject0.getInt("version_id"), c.e(jSONObject0.getJSONArray("thresholds")));
            }
            catch(Exception unused_ex) {
                return null;
            }
        }

        private static void d(String s, int v) {
            File file0 = T0.e.a();
            if(file0 == null) {
                return;
            }
            File[] arr_file = file0.listFiles();
            if(arr_file != null && arr_file.length != 0) {
                for(int v1 = 0; v1 < arr_file.length; ++v1) {
                    File file1 = arr_file[v1];
                    String s1 = file1.getName();
                    if(s1.startsWith(s) && !s1.startsWith(s + "_" + v)) {
                        file1.delete();
                    }
                }
            }
        }

        private static void e(String s, String s1, a f$a0) {
            File file0 = new File(T0.e.a(), s1);
            if(s != null && !file0.exists()) {
                new S0.f(s, file0, f$a0).execute(new String[0]);
                return;
            }
            f$a0.a(file0);
        }

        static void f(f c$f0, List list0) {
            static final class T0.c.f.a implements a {
                final List a;

                T0.c.f.a(List list0) {
                    this.a = list0;
                    super();
                }

                @Override  // S0.f$a
                public void a(File file0) {
                    class T0.c.f.a.a implements a {
                        final f a;
                        final b b;
                        final T0.c.f.a c;

                        T0.c.f.a.a(f c$f0, b b0) {
                            this.a = c$f0;
                            this.b = b0;
                            super();
                        }

                        @Override  // S0.f$a
                        public void a(File file0) {
                            this.a.g = this.b;
                            this.a.f = file0;
                            if(this.a.h != null) {
                                this.a.h.run();
                            }
                        }
                    }

                    b b0 = b.a(file0);
                    if(b0 != null) {
                        for(Object object0: this.a) {
                            f.e(((f)object0).c, ((f)object0).a + "_" + ((f)object0).d + "_rule", new T0.c.f.a.a(this, ((f)object0), b0));
                        }
                    }
                }
            }

            f.d(c$f0.a, c$f0.d);
            f.e(c$f0.b, c$f0.a + "_" + c$f0.d, new T0.c.f.a(list0));
        }

        f g(Runnable runnable0) {
            this.h = runnable0;
            return this;
        }
    }

    private static final Map a;
    private static final Integer b;
    private static final List c;
    private static final List d;

    static {
        c.a = new ConcurrentHashMap();
        c.b = 259200000;
        c.c = Arrays.asList(new String[]{"other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout"});
        c.d = Arrays.asList(new String[]{"none", "address", "health"});
    }

    static boolean a(long v) {
        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return false;
        }
        try {
            return c.l(v);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return false;
        }
    }

    static JSONObject b() {
        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            return c.i();
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    static void c(JSONObject jSONObject0) {
        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            c.f(jSONObject0);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }

    static void d() {
        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            c.h();
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }

    static float[] e(JSONArray jSONArray0) {
        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            return c.m(jSONArray0);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    private static void f(JSONObject jSONObject0) {
        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            Iterator iterator0 = jSONObject0.keys();
            try {
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    f c$f0 = f.c(jSONObject0.getJSONObject(((String)object0)));
                    if(c$f0 != null) {
                        c.a.put(c$f0.a, c$f0);
                    }
                }
            }
            catch(JSONException unused_ex) {
            }
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }

    public static void g() {
        static final class T0.c.a implements Runnable {
            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences0 = h.e().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                    String s = sharedPreferences0.getString("models", null);
                    JSONObject jSONObject0 = s == null || s.isEmpty() ? new JSONObject() : new JSONObject(s);
                    long v = sharedPreferences0.getLong("model_request_timestamp", 0L);
                    if(!l.g(com.facebook.internal.l.b.p) || jSONObject0.length() == 0 || !c.a(v)) {
                        jSONObject0 = c.b();
                        if(jSONObject0 == null) {
                            return;
                        }
                        sharedPreferences0.edit().putString("models", jSONObject0.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                    }
                    c.c(jSONObject0);
                    c.d();
                    return;
                }
                catch(Exception unused_ex) {
                    return;
                }
                catch(Throwable throwable0) {
                }
                b1.a.b(throwable0, this);
            }
        }

        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            F.m0(new T0.c.a());
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }

    private static void h() {
        static final class T0.c.b implements Runnable {
            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    W0.d.c();
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }


        static final class T0.c.c implements Runnable {
            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    R0.a.a();
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            String s = null;
            int v = 0;
            for(Object object0: c.a.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s1 = (String)map$Entry0.getKey();
                if(s1.equals("MTML_APP_EVENT_PRED")) {
                    f c$f0 = (f)map$Entry0.getValue();
                    s = c$f0.b;
                    v = Math.max(v, c$f0.d);
                    if(l.g(com.facebook.internal.l.b.n) && c.k()) {
                        arrayList0.add(c$f0.g(new T0.c.b()));
                    }
                }
                if(s1.equals("MTML_INTEGRITY_DETECT")) {
                    f c$f1 = (f)map$Entry0.getValue();
                    String s2 = c$f1.b;
                    int v1 = Math.max(v, c$f1.d);
                    if(l.g(com.facebook.internal.l.b.o)) {
                        arrayList0.add(c$f1.g(new T0.c.c()));
                    }
                    s = s2;
                    v = v1;
                }
            }
            if(s != null && v > 0 && !arrayList0.isEmpty()) {
                f.f(new f("MTML", s, null, v, null), arrayList0);
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
    }

    private static JSONObject i() {
        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            Bundle bundle0 = new Bundle();
            bundle0.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            GraphRequest graphRequest0 = GraphRequest.J(null, String.format("%s/model_asset", h.f()), null);
            graphRequest0.a0(true);
            graphRequest0.Z(bundle0);
            JSONObject jSONObject0 = graphRequest0.g().h();
            return jSONObject0 == null ? null : c.n(jSONObject0);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    public static File j(e c$e0) {
        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            String s = c$e0.f();
            f c$f0 = (f)c.a.get(s);
            return c$f0 == null ? null : c$f0.f;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    private static boolean k() {
        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return false;
        }
        try {
            Locale locale0 = F.B();
            if(locale0 == null || locale0.getLanguage().contains("en")) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
        return false;
    }

    private static boolean l(long v) {
        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return false;
        }
        if(v == 0L) {
            return false;
        }
        try {
            if(System.currentTimeMillis() - v < ((long)(((int)c.b)))) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
        return false;
    }

    private static float[] m(JSONArray jSONArray0) {
        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return null;
        }
        if(jSONArray0 == null) {
            return null;
        }
        try {
            float[] arr_f = new float[jSONArray0.length()];
            for(int v = 0; v < jSONArray0.length(); ++v) {
                try {
                    arr_f[v] = Float.parseFloat(jSONArray0.getString(v));
                }
                catch(JSONException unused_ex) {
                }
            }
            return arr_f;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    private static JSONObject n(JSONObject jSONObject0) {
        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            JSONObject jSONObject1 = new JSONObject();
            try {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("data");
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject2 = jSONArray0.getJSONObject(v);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version_id", jSONObject2.getString("version_id"));
                    jSONObject3.put("use_case", jSONObject2.getString("use_case"));
                    jSONObject3.put("thresholds", jSONObject2.getJSONArray("thresholds"));
                    jSONObject3.put("asset_uri", jSONObject2.getString("asset_uri"));
                    if(jSONObject2.has("rules_uri")) {
                        jSONObject3.put("rules_uri", jSONObject2.getString("rules_uri"));
                    }
                    jSONObject1.put(jSONObject2.getString("use_case"), jSONObject3);
                }
                return jSONObject1;
            }
            catch(JSONException unused_ex) {
                return new JSONObject();
            }
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
        return null;
    }

    public static String[] o(e c$e0, float[][] arr2_f, String[] arr_s) {
        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            String s = c$e0.f();
            f c$f0 = (f)c.a.get(s);
            if(c$f0 != null && c$f0.g != null) {
                int v = arr2_f[0].length;
                T0.a a0 = new T0.a(new int[]{arr_s.length, v});
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    System.arraycopy(arr2_f[v1], 0, a0.b(), v1 * v, v);
                }
                T0.a a1 = c$f0.g.d(a0, arr_s, c$e0.b());
                float[] arr_f = c$f0.e;
                if(a1 != null && arr_f != null && a1.b().length != 0 && arr_f.length != 0) {
                    switch(c$e0) {
                        case 1: {
                            return c.p(a1, arr_f);
                        }
                        case 2: {
                            return c.q(a1, arr_f);
                        }
                        default: {
                            return null;
                        }
                    }
                }
            }
            return null;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
        return null;
    }

    private static String[] p(T0.a a0, float[] arr_f) {
        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            int v = a0.c(0);
            int v1 = a0.c(1);
            float[] arr_f1 = a0.b();
            String[] arr_s = new String[v];
            if(v1 != arr_f.length) {
                return null;
            }
            for(int v2 = 0; v2 < v; ++v2) {
                arr_s[v2] = "none";
                for(int v3 = 0; v3 < arr_f.length; ++v3) {
                    if(arr_f1[v2 * v1 + v3] >= arr_f[v3]) {
                        arr_s[v2] = (String)c.d.get(v3);
                    }
                }
            }
            return arr_s;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    private static String[] q(T0.a a0, float[] arr_f) {
        Class class0 = c.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            int v = a0.c(0);
            int v1 = a0.c(1);
            float[] arr_f1 = a0.b();
            String[] arr_s = new String[v];
            if(v1 != arr_f.length) {
                return null;
            }
            for(int v2 = 0; v2 < v; ++v2) {
                arr_s[v2] = "other";
                for(int v3 = 0; v3 < arr_f.length; ++v3) {
                    if(arr_f1[v2 * v1 + v3] >= arr_f[v3]) {
                        arr_s[v2] = (String)c.c.get(v3);
                    }
                }
            }
            return arr_s;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }
}

