package com.facebook;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.internal.F;
import com.facebook.internal.G;
import com.facebook.internal.v;
import com.facebook.internal.z;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import jeb.synthetic.TWR;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GraphRequest {
    public static class ParcelableResourceWithMimeType implements Parcelable {
        static final class a implements Parcelable.Creator {
            public ParcelableResourceWithMimeType a(Parcel parcel0) {
                return new ParcelableResourceWithMimeType(parcel0, null);
            }

            public ParcelableResourceWithMimeType[] b(int v) {
                return new ParcelableResourceWithMimeType[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        private final String f;
        private final Parcelable g;

        static {
            ParcelableResourceWithMimeType.CREATOR = new a();
        }

        private ParcelableResourceWithMimeType(Parcel parcel0) {
            this.f = parcel0.readString();
            this.g = parcel0.readParcelable(h.e().getClassLoader());
        }

        ParcelableResourceWithMimeType(Parcel parcel0, k k0) {
            this(parcel0);
        }

        public ParcelableResourceWithMimeType(Parcelable parcelable0, String s) {
            this.f = s;
            this.g = parcelable0;
        }

        public String a() {
            return this.f;
        }

        public Parcelable b() {
            return this.g;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeString(this.f);
            parcel0.writeParcelable(this.g, v);
        }
    }

    static class d {
        private final GraphRequest a;
        private final Object b;

        public d(GraphRequest graphRequest0, Object object0) {
            this.a = graphRequest0;
            this.b = object0;
        }

        public GraphRequest a() {
            return this.a;
        }

        public Object b() {
            return this.b;
        }
    }

    public interface e {
        void a(n arg1);
    }

    interface f {
        void a(String arg1, String arg2);
    }

    static class g implements f {
        private final OutputStream a;
        private final v b;
        private boolean c;
        private boolean d;

        public g(OutputStream outputStream0, v v0, boolean z) {
            this.c = true;
            this.a = outputStream0;
            this.b = v0;
            this.d = z;
        }

        @Override  // com.facebook.GraphRequest$f
        public void a(String s, String s1) {
            this.f(s, null, null);
            this.i("%s", new Object[]{s1});
            this.k();
            v v0 = this.b;
            if(v0 != null) {
                v0.d("    " + s, s1);
            }
        }

        private RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public void c(String s, Object[] arr_object) {
            if(!this.d) {
                if(this.c) {
                    this.a.write("--".getBytes());
                    this.a.write(GraphRequest.o.getBytes());
                    this.a.write("\r\n".getBytes());
                    this.c = false;
                }
                this.a.write(String.format(s, arr_object).getBytes());
                return;
            }
            byte[] arr_b = URLEncoder.encode(String.format(Locale.US, s, arr_object), "UTF-8").getBytes();
            this.a.write(arr_b);
        }

        public void d(String s, Bitmap bitmap0) {
            this.f(s, s, "image/png");
            bitmap0.compress(Bitmap.CompressFormat.PNG, 100, this.a);
            this.i("", new Object[0]);
            this.k();
            v v0 = this.b;
            if(v0 != null) {
                v0.d("    " + s, "<Image>");
            }
        }

        public void e(String s, byte[] arr_b) {
            this.f(s, s, "content/unknown");
            this.a.write(arr_b);
            this.i("", new Object[0]);
            this.k();
            v v0 = this.b;
            if(v0 != null) {
                v0.d("    " + s, String.format(Locale.ROOT, "<Data: %d>", ((int)arr_b.length)));
            }
        }

        public void f(String s, String s1, String s2) {
            if(!this.d) {
                this.c("Content-Disposition: form-data; name=\"%s\"", new Object[]{s});
                if(s1 != null) {
                    this.c("; filename=\"%s\"", new Object[]{s1});
                }
                this.i("", new Object[0]);
                if(s2 != null) {
                    this.i("%s: %s", new Object[]{"Content-Type", s2});
                }
                this.i("", new Object[0]);
                return;
            }
            this.a.write(String.format("%s=", s).getBytes());
        }

        public void g(String s, Uri uri0, String s1) {
            int v1;
            if(s1 == null) {
                s1 = "content/unknown";
            }
            this.f(s, s, s1);
            if(this.a instanceof t) {
                long v = F.t(uri0);
                ((t)this.a).b(v);
                v1 = 0;
            }
            else {
                v1 = F.l(h.e().getContentResolver().openInputStream(uri0), this.a);
            }
            this.i("", new Object[0]);
            this.k();
            v v2 = this.b;
            if(v2 != null) {
                v2.d("    " + s, String.format(Locale.ROOT, "<Data: %d>", v1));
            }
        }

        public void h(String s, ParcelFileDescriptor parcelFileDescriptor0, String s1) {
            int v;
            if(s1 == null) {
                s1 = "content/unknown";
            }
            this.f(s, s, s1);
            OutputStream outputStream0 = this.a;
            if(outputStream0 instanceof t) {
                ((t)outputStream0).b(parcelFileDescriptor0.getStatSize());
                v = 0;
            }
            else {
                v = F.l(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0), this.a);
            }
            this.i("", new Object[0]);
            this.k();
            v v1 = this.b;
            if(v1 != null) {
                v1.d("    " + s, String.format(Locale.ROOT, "<Data: %d>", v));
            }
        }

        public void i(String s, Object[] arr_object) {
            this.c(s, arr_object);
            if(!this.d) {
                this.c("\r\n", new Object[0]);
            }
        }

        public void j(String s, Object object0, GraphRequest graphRequest0) {
            OutputStream outputStream0 = this.a;
            if(outputStream0 instanceof com.facebook.v) {
                ((com.facebook.v)outputStream0).a(graphRequest0);
            }
            if(GraphRequest.I(object0)) {
                this.a(s, GraphRequest.L(object0));
                return;
            }
            if(object0 instanceof Bitmap) {
                this.d(s, ((Bitmap)object0));
                return;
            }
            if(object0 instanceof byte[]) {
                this.e(s, ((byte[])object0));
                return;
            }
            if(object0 instanceof Uri) {
                this.g(s, ((Uri)object0), null);
                return;
            }
            if(object0 instanceof ParcelFileDescriptor) {
                this.h(s, ((ParcelFileDescriptor)object0), null);
                return;
            }
            if(!(object0 instanceof ParcelableResourceWithMimeType)) {
                throw this.b();
            }
            Parcelable parcelable0 = ((ParcelableResourceWithMimeType)object0).b();
            String s1 = ((ParcelableResourceWithMimeType)object0).a();
            if(parcelable0 instanceof ParcelFileDescriptor) {
                this.h(s, ((ParcelFileDescriptor)parcelable0), s1);
                return;
            }
            if(!(parcelable0 instanceof Uri)) {
                throw this.b();
            }
            this.g(s, ((Uri)parcelable0), s1);
        }

        public void k() {
            if(!this.d) {
                this.i("--%s", new Object[]{"AjIcx38Wf5HvnqNpmmGurhm2NCKNbW2"});
                return;
            }
            this.a.write("&".getBytes());
        }

        public void l(String s, JSONArray jSONArray0, Collection collection0) {
            OutputStream outputStream0 = this.a;
            if(!(outputStream0 instanceof com.facebook.v)) {
                this.a(s, jSONArray0.toString());
                return;
            }
            this.f(s, null, null);
            this.c("[", new Object[0]);
            int v = 0;
            for(Object object0: collection0) {
                JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                ((com.facebook.v)outputStream0).a(((GraphRequest)object0));
                if(v > 0) {
                    this.c(",%s", new Object[]{jSONObject0.toString()});
                }
                else {
                    this.c("%s", new Object[]{jSONObject0.toString()});
                }
                ++v;
            }
            this.c("]", new Object[0]);
            v v1 = this.b;
            if(v1 != null) {
                v1.d("    " + s, jSONArray0.toString());
            }
        }
    }

    private AccessToken a;
    private o b;
    private String c;
    private JSONObject d;
    private String e;
    private String f;
    private boolean g;
    private Bundle h;
    private e i;
    private String j;
    private Object k;
    private String l;
    private boolean m;
    public static final String n = "GraphRequest";
    private static final String o;
    private static String p;
    private static Pattern q;
    private static volatile String r;

    static {
        GraphRequest.q = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
        char[] arr_c = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder stringBuilder0 = new StringBuilder();
        SecureRandom secureRandom0 = new SecureRandom();
        int v = secureRandom0.nextInt(11);
        for(int v1 = 0; v1 < v + 30; ++v1) {
            stringBuilder0.append(arr_c[secureRandom0.nextInt(arr_c.length)]);
        }
        GraphRequest.o = "AzfrNwGl0YzGsppFI8Is7FZDzUQybPA";
    }

    public GraphRequest(AccessToken accessToken0, String s, Bundle bundle0, o o0, e graphRequest$e0) {
        this(accessToken0, s, bundle0, o0, graphRequest$e0, null);
    }

    public GraphRequest(AccessToken accessToken0, String s, Bundle bundle0, o o0, e graphRequest$e0, String s1) {
        this.g = true;
        this.m = false;
        this.a = accessToken0;
        this.c = s;
        this.l = s1;
        this.V(graphRequest$e0);
        this.Y(o0);
        this.h = bundle0 == null ? new Bundle() : new Bundle(bundle0);
        if(this.l == null) {
            this.l = "v9.0";
        }
    }

    public final Object A() {
        return this.k;
    }

    final String B() {
        String s = this.j;
        if(s != null) {
            return s.toString();
        }
        Object[] arr_object = {(this.w() != o.g || (this.c == null || !this.c.endsWith("/videos")) ? z.f() : z.g()), this.v()};
        this.d();
        return this.e(String.format("%s/%s", arr_object), Boolean.FALSE);
    }

    private static String C() [...] // 潜在的解密器

    public final String D() {
        return this.l;
    }

    private static boolean E(m m0) {
        for(Object object0: m0.o()) {
            com.facebook.m.a m$a0 = (com.facebook.m.a)object0;
        }
        Iterator iterator1 = m0.iterator();
        while(iterator1.hasNext()) {
            iterator1.next();
        }
        return false;
    }

    private static boolean F(m m0) {
        for(Object object0: m0) {
            GraphRequest graphRequest0 = (GraphRequest)object0;
            for(Object object1: graphRequest0.h.keySet()) {
                if(GraphRequest.H(graphRequest0.h.get(((String)object1)))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private static boolean G(String s) {
        Matcher matcher0 = GraphRequest.q.matcher(s);
        if(matcher0.matches()) {
            s = matcher0.group(1);
        }
        return s.startsWith("me/") || s.startsWith("/me/");
    }

    // 去混淆评级： 中等(50)
    private static boolean H(Object object0) {
        return object0 instanceof Bitmap || object0 instanceof byte[] || object0 instanceof Uri || object0 instanceof ParcelFileDescriptor || object0 instanceof ParcelableResourceWithMimeType;
    }

    // 去混淆评级： 低(40)
    private static boolean I(Object object0) {
        return object0 instanceof String || object0 instanceof Boolean || object0 instanceof Number || object0 instanceof Date;
    }

    public static GraphRequest J(AccessToken accessToken0, String s, e graphRequest$e0) {
        return new GraphRequest(accessToken0, s, null, null, graphRequest$e0);
    }

    public static GraphRequest K(AccessToken accessToken0, String s, JSONObject jSONObject0, e graphRequest$e0) {
        GraphRequest graphRequest0 = new GraphRequest(accessToken0, s, null, o.g, graphRequest$e0);
        graphRequest0.X(jSONObject0);
        return graphRequest0;
    }

    private static String L(Object object0) {
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(!(object0 instanceof Boolean) && !(object0 instanceof Number)) {
            if(!(object0 instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            return new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ssZ", Locale.US).format(object0);
        }
        return object0.toString();
    }

    private static void M(JSONObject jSONObject0, String s, f graphRequest$f0) {
        boolean z;
        if(GraphRequest.G(s)) {
            int v = s.indexOf(":");
            int v1 = s.indexOf("?");
            z = v <= 3 || v1 != -1 && v >= v1 ? false : true;
        }
        else {
            z = false;
        }
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            GraphRequest.N(((String)object0), jSONObject0.opt(((String)object0)), graphRequest$f0, z && ((String)object0).equalsIgnoreCase("image"));
        }
    }

    private static void N(String s, Object object0, f graphRequest$f0, boolean z) {
        Class class0 = object0.getClass();
        if(JSONObject.class.isAssignableFrom(class0)) {
            if(z) {
                Iterator iterator0 = ((JSONObject)object0).keys();
                while(iterator0.hasNext()) {
                    Object object1 = iterator0.next();
                    GraphRequest.N(String.format("%s[%s]", s, ((String)object1)), ((JSONObject)object0).opt(((String)object1)), graphRequest$f0, true);
                }
                return;
            }
            if(((JSONObject)object0).has("id")) {
                GraphRequest.N(s, ((JSONObject)object0).optString("id"), graphRequest$f0, false);
                return;
            }
            if(((JSONObject)object0).has("url")) {
                GraphRequest.N(s, ((JSONObject)object0).optString("url"), graphRequest$f0, false);
                return;
            }
            if(((JSONObject)object0).has("fbsdk:create_object")) {
                GraphRequest.N(s, ((JSONObject)object0).toString(), graphRequest$f0, false);
            }
        }
        else {
            if(JSONArray.class.isAssignableFrom(class0)) {
                int v = ((JSONArray)object0).length();
                for(int v1 = 0; v1 < v; ++v1) {
                    GraphRequest.N(String.format(Locale.ROOT, "%s[%d]", s, v1), ((JSONArray)object0).opt(v1), graphRequest$f0, z);
                }
                return;
            }
            if(String.class.isAssignableFrom(class0) || Number.class.isAssignableFrom(class0) || Boolean.class.isAssignableFrom(class0)) {
                graphRequest$f0.a(s, object0.toString());
            }
            else if(Date.class.isAssignableFrom(class0)) {
                graphRequest$f0.a(s, new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ssZ", Locale.US).format(((Date)object0)));
            }
        }
    }

    private static void O(m m0, v v0, int v1, URL uRL0, OutputStream outputStream0, boolean z) {
        g graphRequest$g0 = new g(outputStream0, v0, z);
        if(v1 == 1) {
            GraphRequest graphRequest0 = m0.l(0);
            HashMap hashMap0 = new HashMap();
            for(Object object0: graphRequest0.h.keySet()) {
                String s = (String)object0;
                Object object1 = graphRequest0.h.get(s);
                if(GraphRequest.H(object1)) {
                    hashMap0.put(s, new d(graphRequest0, object1));
                }
            }
            if(v0 != null) {
                v0.b("  Parameters:\n");
            }
            GraphRequest.R(graphRequest0.h, graphRequest$g0, graphRequest0);
            if(v0 != null) {
                v0.b("  Attachments:\n");
            }
            GraphRequest.Q(hashMap0, graphRequest$g0);
            JSONObject jSONObject0 = graphRequest0.d;
            if(jSONObject0 == null) {
                return;
            }
            GraphRequest.M(jSONObject0, uRL0.getPath(), graphRequest$g0);
            return;
        }
        String s1 = GraphRequest.r(m0);
        if(F.P(s1)) {
            throw new com.facebook.e("App ID was not specified at the request or Settings.");
        }
        graphRequest$g0.a("batch_app_id", s1);
        HashMap hashMap1 = new HashMap();
        GraphRequest.S(graphRequest$g0, m0, hashMap1);
        if(v0 != null) {
            v0.b("  Attachments:\n");
        }
        GraphRequest.Q(hashMap1, graphRequest$g0);
    }

    static void P(m m0, List list0) {
        static final class b implements Runnable {
            final ArrayList f;
            final m g;

            b(ArrayList arrayList0, m m0) {
                this.f = arrayList0;
                this.g = m0;
                super();
            }

            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    for(Object object0: this.f) {
                        ((e)((Pair)object0).first).a(((n)((Pair)object0).second));
                    }
                    for(Object object1: this.g.o()) {
                        ((com.facebook.m.a)object1).a(this.g);
                    }
                    return;
                }
                catch(Throwable throwable0) {
                }
                b1.a.b(throwable0, this);
            }
        }

        int v = m0.size();
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < v; ++v1) {
            GraphRequest graphRequest0 = m0.l(v1);
            if(graphRequest0.i != null) {
                arrayList0.add(new Pair(graphRequest0.i, list0.get(v1)));
            }
        }
        if(arrayList0.size() > 0) {
            b graphRequest$b0 = new b(arrayList0, m0);
            Handler handler0 = m0.n();
            if(handler0 == null) {
                graphRequest$b0.run();
                return;
            }
            handler0.post(graphRequest$b0);
        }
    }

    private static void Q(Map map0, g graphRequest$g0) {
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            d graphRequest$d0 = (d)map0.get(s);
            if(GraphRequest.H(graphRequest$d0.b())) {
                graphRequest$g0.j(s, graphRequest$d0.b(), graphRequest$d0.a());
            }
        }
    }

    private static void R(Bundle bundle0, g graphRequest$g0, GraphRequest graphRequest0) {
        for(Object object0: bundle0.keySet()) {
            String s = (String)object0;
            Object object1 = bundle0.get(s);
            if(GraphRequest.I(object1)) {
                graphRequest$g0.j(s, object1, graphRequest0);
            }
        }
    }

    private static void S(g graphRequest$g0, Collection collection0, Map map0) {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: collection0) {
            ((GraphRequest)object0).T(jSONArray0, map0);
        }
        graphRequest$g0.l("batch", jSONArray0, collection0);
    }

    private void T(JSONArray jSONArray0, Map map0) {
        class c implements f {
            final ArrayList a;
            final GraphRequest b;

            c(ArrayList arrayList0) {
                this.a = arrayList0;
                super();
            }

            @Override  // com.facebook.GraphRequest$f
            public void a(String s, String s1) {
                Locale locale0 = Locale.US;
                Object[] arr_object = {s, URLEncoder.encode(s1, "UTF-8")};
                this.a.add(String.format(locale0, "%s=%s", arr_object));
            }
        }

        JSONObject jSONObject0 = new JSONObject();
        String s = this.e;
        if(s != null) {
            jSONObject0.put("name", s);
            jSONObject0.put("omit_response_on_success", this.g);
        }
        String s1 = this.f;
        if(s1 != null) {
            jSONObject0.put("depends_on", s1);
        }
        String s2 = this.z();
        jSONObject0.put("relative_url", s2);
        jSONObject0.put("method", this.b);
        AccessToken accessToken0 = this.a;
        if(accessToken0 != null) {
            v.k(accessToken0.q());
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.h.keySet()) {
            Object object1 = this.h.get(((String)object0));
            if(GraphRequest.H(object1)) {
                String s3 = String.format(Locale.ROOT, "%s%d", "file", map0.size());
                arrayList0.add(s3);
                map0.put(s3, new d(this, object1));
            }
        }
        if(!arrayList0.isEmpty()) {
            jSONObject0.put("attached_files", TextUtils.join(",", arrayList0));
        }
        if(this.d != null) {
            ArrayList arrayList1 = new ArrayList();
            GraphRequest.M(this.d, s2, new c(this, arrayList1));
            jSONObject0.put("body", TextUtils.join("&", arrayList1));
        }
        jSONArray0.put(jSONObject0);
    }

    static final void U(m m0, HttpURLConnection httpURLConnection0) {
        u u0;
        v v0 = new v(q.f, "Request");
        int v1 = m0.size();
        boolean z = GraphRequest.F(m0);
        o o0 = v1 == 1 ? m0.l(0).b : o.g;
        httpURLConnection0.setRequestMethod(o0.name());
        GraphRequest.W(httpURLConnection0, z);
        URL uRL0 = httpURLConnection0.getURL();
        v0.b("Request:\n");
        v0.d("Id", m0.p());
        v0.d("URL", uRL0);
        v0.d("Method", httpURLConnection0.getRequestMethod());
        v0.d("User-Agent", httpURLConnection0.getRequestProperty("User-Agent"));
        v0.d("Content-Type", httpURLConnection0.getRequestProperty("Content-Type"));
        httpURLConnection0.setConnectTimeout(m0.s());
        httpURLConnection0.setReadTimeout(m0.s());
        if(o0 == o.g) {
            httpURLConnection0.setDoOutput(true);
            BufferedOutputStream bufferedOutputStream0 = null;
            try {
                BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(httpURLConnection0.getOutputStream());
                if(z) {
                    bufferedOutputStream0 = bufferedOutputStream1;
                    bufferedOutputStream0 = new GZIPOutputStream(bufferedOutputStream1);
                }
                else {
                    bufferedOutputStream0 = bufferedOutputStream1;
                }
                if(GraphRequest.E(m0)) {
                    t t0 = new t(m0.n());
                    GraphRequest.O(m0, null, v1, uRL0, t0, z);
                    u0 = new u(bufferedOutputStream0, m0, t0.g(), ((long)t0.f()));
                }
                else {
                    u0 = bufferedOutputStream0;
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(bufferedOutputStream0, throwable0);
                throw throwable0;
            }
            try {
                GraphRequest.O(m0, v0, v1, uRL0, u0, z);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(u0, throwable0);
                throw throwable0;
            }
            u0.close();
            v0.e();
            return;
        }
        v0.e();
    }

    public final void V(e graphRequest$e0) {
        class com.facebook.GraphRequest.a implements e {
            final e a;
            final GraphRequest b;

            com.facebook.GraphRequest.a(e graphRequest$e0) {
                this.a = graphRequest$e0;
                super();
            }

            @Override  // com.facebook.GraphRequest$e
            public void a(n n0) {
                JSONObject jSONObject0 = n0.h();
                JSONObject jSONObject1 = jSONObject0 == null ? null : jSONObject0.optJSONObject("__debug__");
                JSONArray jSONArray0 = jSONObject1 == null ? null : jSONObject1.optJSONArray("messages");
                if(jSONArray0 != null) {
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        JSONObject jSONObject2 = jSONArray0.optJSONObject(v);
                        String s = jSONObject2 == null ? null : jSONObject2.optString("message");
                        String s1 = jSONObject2 == null ? null : jSONObject2.optString("type");
                        String s2 = jSONObject2 == null ? null : jSONObject2.optString("link");
                        if(s != null && s1 != null) {
                            q q0 = s1.equals("warning") ? q.l : q.m;
                            if(!F.P(s2)) {
                                s = s + " Link: " + s2;
                            }
                            v.h(q0, "GraphRequest", s);
                        }
                    }
                }
                e graphRequest$e0 = this.a;
                if(graphRequest$e0 != null) {
                    graphRequest$e0.a(n0);
                }
            }
        }

        if(!h.x(q.m) && !h.x(q.l)) {
            this.i = graphRequest$e0;
            return;
        }
        this.i = new com.facebook.GraphRequest.a(this, graphRequest$e0);
    }

    private static void W(HttpURLConnection httpURLConnection0, boolean z) {
        if(z) {
            httpURLConnection0.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection0.setRequestProperty("Content-Encoding", "gzip");
            return;
        }
        httpURLConnection0.setRequestProperty("Content-Type", "multipart/form-data; boundary=bcCEQBKMKSgmY3kj9QncAgVxbCs8TicVK");
    }

    public final void X(JSONObject jSONObject0) {
        this.d = jSONObject0;
    }

    public final void Y(o o0) {
        if(this.j != null && o0 != o.f) {
            throw new com.facebook.e("Can\'t change HTTP method on request with overridden URL.");
        }
        if(o0 == null) {
            o0 = o.f;
        }
        this.b = o0;
    }

    public final void Z(Bundle bundle0) {
        this.h = bundle0;
    }

    public final void a0(boolean z) {
        this.m = z;
    }

    public final void b0(Object object0) {
        this.k = object0;
    }

    static final boolean c0(GraphRequest graphRequest0) {
        String s = graphRequest0.D();
        if(F.P(s)) {
            return true;
        }
        if(s.startsWith("v")) {
            s = s.substring(1);
        }
        String[] arr_s = s.split("\\.");
        return arr_s.length >= 2 && Integer.parseInt(arr_s[0]) > 2 || Integer.parseInt(arr_s[0]) >= 2 && Integer.parseInt(arr_s[1]) >= 4;
    }

    private void d() {
        if(this.a == null) {
            if(!this.m && !this.h.containsKey("access_token")) {
                String s1 = h.f();
                String s2 = h.k();
                if(F.P(s1) || F.P(s2)) {
                    F.V("GraphRequest", "Warning: Request without access token missing application ID or client token.");
                }
                else {
                    this.h.putString("access_token", s1 + "|" + s2);
                }
            }
        }
        else if(!this.h.containsKey("access_token")) {
            String s = this.a.q();
            v.k(s);
            this.h.putString("access_token", s);
        }
        this.h.putString("sdk", "android");
        this.h.putString("format", "json");
        if(h.x(q.m)) {
            this.h.putString("debug", "info");
            return;
        }
        if(h.x(q.l)) {
            this.h.putString("debug", "warning");
        }
    }

    public static HttpURLConnection d0(m m0) {
        HttpURLConnection httpURLConnection0;
        URL uRL0;
        GraphRequest.e0(m0);
        try {
            uRL0 = m0.size() == 1 ? new URL(m0.l(0).B()) : new URL(z.f());
            goto label_8;
        }
        catch(MalformedURLException malformedURLException0) {
        }
        throw new com.facebook.e("could not construct URL for request", malformedURLException0);
        try {
        label_8:
            httpURLConnection0 = null;
            httpURLConnection0 = GraphRequest.f(uRL0);
            GraphRequest.U(m0, httpURLConnection0);
            return httpURLConnection0;
        }
        catch(IOException | JSONException iOException0) {
            F.m(httpURLConnection0);
            throw new com.facebook.e("could not construct request body", iOException0);
        }
    }

    private String e(String s, Boolean boolean0) {
        if(!boolean0.booleanValue() && this.b == o.g) {
            return s;
        }
        Uri.Builder uri$Builder0 = Uri.parse(s).buildUpon();
        for(Object object0: this.h.keySet()) {
            String s1 = (String)object0;
            String s2 = this.h.get(s1);
            if(s2 == null) {
                s2 = "";
            }
            if(GraphRequest.I(s2)) {
                uri$Builder0.appendQueryParameter(s1, GraphRequest.L(s2).toString());
            }
            else {
                if(this.b == o.f) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", s2.getClass().getSimpleName()));
                }
                if(false) {
                    break;
                }
            }
        }
        return uri$Builder0.toString();
    }

    static final void e0(m m0) {
        for(Object object0: m0) {
            GraphRequest graphRequest0 = (GraphRequest)object0;
            if(o.f.equals(graphRequest0.w()) && GraphRequest.c0(graphRequest0)) {
                Bundle bundle0 = graphRequest0.y();
                if(!bundle0.containsKey("fields") || F.P(bundle0.getString("fields"))) {
                    v.g(q.k, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", new Object[]{graphRequest0.u()});
                }
            }
        }
    }

    private static HttpURLConnection f(URL uRL0) {
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
        httpURLConnection0.setRequestProperty("User-Agent", "FBAndroidSDK.9.1.1");
        httpURLConnection0.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection0.setChunkedStreamingMode(0);
        return httpURLConnection0;
    }

    public final n g() {
        return GraphRequest.h(this);
    }

    public static n h(GraphRequest graphRequest0) {
        List list0 = GraphRequest.l(new GraphRequest[]{graphRequest0});
        if(list0 == null || list0.size() != 1) {
            throw new com.facebook.e("invalid state: expected a single response");
        }
        return (n)list0.get(0);
    }

    public final l i() {
        GraphRequest[] arr_graphRequest = {this};
        G.i(arr_graphRequest, "requests");
        return GraphRequest.n(Arrays.asList(arr_graphRequest));
    }

    public static List j(m m0) {
        List list1;
        List list0;
        G.h(m0, "requests");
        HttpURLConnection httpURLConnection0 = null;
        try {
            try {
                httpURLConnection0 = GraphRequest.d0(m0);
                goto label_9;
            }
            catch(Exception exception0) {
            }
            list0 = n.a(m0.q(), null, new com.facebook.e(exception0));
            GraphRequest.P(m0, list0);
        }
        catch(Throwable throwable0) {
            F.m(httpURLConnection0);
            throw throwable0;
        }
        F.m(null);
        return list0;
        try {
        label_9:
            list1 = GraphRequest.p(httpURLConnection0, m0);
        }
        catch(Throwable throwable0) {
            F.m(httpURLConnection0);
            throw throwable0;
        }
        F.m(httpURLConnection0);
        return list1;
    }

    public static List k(Collection collection0) {
        return GraphRequest.j(new m(collection0));
    }

    public static List l(GraphRequest[] arr_graphRequest) {
        G.i(arr_graphRequest, "requests");
        return GraphRequest.k(Arrays.asList(arr_graphRequest));
    }

    public static l m(m m0) {
        G.h(m0, "requests");
        l l0 = new l(m0);
        l0.executeOnExecutor(h.m(), new Void[0]);
        return l0;
    }

    public static l n(Collection collection0) {
        return GraphRequest.m(new m(collection0));
    }

    public static l o(GraphRequest[] arr_graphRequest) [...] // Inlined contents

    public static List p(HttpURLConnection httpURLConnection0, m m0) {
        List list0 = n.f(httpURLConnection0, m0);
        F.m(httpURLConnection0);
        int v = m0.size();
        if(v != list0.size()) {
            throw new com.facebook.e(String.format(Locale.US, "Received %d responses while expecting %d", list0.size(), v));
        }
        GraphRequest.P(m0, list0);
        com.facebook.b.h().f();
        return list0;
    }

    public final AccessToken q() {
        return this.a;
    }

    private static String r(m m0) {
        if(!F.P(m0.m())) {
            return m0.m();
        }
        for(Object object0: m0) {
            AccessToken accessToken0 = ((GraphRequest)object0).a;
            if(accessToken0 != null) {
                String s = accessToken0.f();
                if(s != null) {
                    return s;
                }
                if(false) {
                    break;
                }
            }
        }
        return F.P(GraphRequest.p) ? h.f() : GraphRequest.p;
    }

    public final e s() {
        return this.i;
    }

    public final JSONObject t() {
        return this.d;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("{Request: ");
        stringBuilder0.append(" accessToken: ");
        AccessToken accessToken0 = this.a;
        if(accessToken0 == null) {
            accessToken0 = "null";
        }
        stringBuilder0.append(accessToken0);
        stringBuilder0.append(", graphPath: ");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", graphObject: ");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", httpMethod: ");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", parameters: ");
        stringBuilder0.append(this.h);
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    public final String u() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    private String v() {
        return GraphRequest.q.matcher(this.c).matches() ? this.c : String.format("%s/%s", this.l, this.c);
    }

    public final o w() {
        return this.b;
    }

    // 去混淆评级： 低(20)
    private static String x() [...] // 潜在的解密器

    public final Bundle y() {
        return this.h;
    }

    final String z() {
        if(this.j != null) {
            throw new com.facebook.e("Can\'t override URL for a batch request");
        }
        Object[] arr_object = {z.f(), this.v()};
        this.d();
        Uri uri0 = Uri.parse(this.e(String.format("%s/%s", arr_object), Boolean.TRUE));
        return String.format("%s?%s", uri0.getPath(), uri0.getQuery());
    }
}

