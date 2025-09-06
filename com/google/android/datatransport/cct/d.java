package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import l1.j;
import l1.k;
import l1.l;
import l1.n;
import l1.o.c;
import l1.o;
import l1.p;
import m1.h;
import m1.i;
import n1.f;
import n1.g;
import n1.m;

final class d implements m {
    static final class a {
        final URL a;
        final j b;
        final String c;

        a(URL uRL0, j j0, String s) {
            this.a = uRL0;
            this.b = j0;
            this.c = s;
        }

        a a(URL uRL0) {
            return new a(uRL0, this.b, this.c);
        }
    }

    static final class b {
        final int a;
        final URL b;
        final long c;

        b(int v, URL uRL0, long v1) {
            this.a = v;
            this.b = uRL0;
            this.c = v1;
        }
    }

    private final u2.a a;
    private final ConnectivityManager b;
    private final Context c;
    final URL d;
    private final w1.a e;
    private final w1.a f;
    private final int g;

    d(Context context0, w1.a a0, w1.a a1) {
        this(context0, a0, a1, 130000);
    }

    d(Context context0, w1.a a0, w1.a a1, int v) {
        this.a = j.b();
        this.c = context0;
        this.b = (ConnectivityManager)context0.getSystemService("connectivity");
        this.d = d.n("https://firebaselogging.googleapis.com/v0cc/log/batch?format=json_proto3");
        this.e = a1;
        this.f = a0;
        this.g = v;
    }

    @Override  // n1.m
    public i a(i i0) {
        NetworkInfo networkInfo0 = this.b.getActiveNetworkInfo();
        return i0.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", d.k()).a("net-type", d.g(networkInfo0)).a("mobile-subtype", d.f(networkInfo0)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", d.j(this.c).getSimOperator()).c("application_build", Integer.toString(d.h(this.c))).d();
    }

    @Override  // n1.m
    public g b(f f0) {
        j j0 = this.i(f0);
        URL uRL0 = this.d;
        String s = null;
        if(f0.c() != null) {
            try {
                com.google.android.datatransport.cct.a a0 = com.google.android.datatransport.cct.a.c(f0.c());
                if(a0.d() != null) {
                    s = a0.d();
                }
                if(a0.e() != null) {
                    uRL0 = d.n(a0.e());
                }
            }
            catch(IllegalArgumentException unused_ex) {
                return g.a();
            }
        }
        try {
            b d$b0 = (b)r1.b.a(5, new a(uRL0, j0, s), (a d$a0) -> {
                q1.a.f("CctTransportBackend", "Making request to: %s", d$a0.a);
                HttpURLConnection httpURLConnection0 = (HttpURLConnection)d$a0.a.openConnection();
                httpURLConnection0.setConnectTimeout(30000);
                httpURLConnection0.setReadTimeout(this.g);
                httpURLConnection0.setDoOutput(true);
                httpURLConnection0.setInstanceFollowRedirects(false);
                httpURLConnection0.setRequestMethod("POST");
                httpURLConnection0.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
                httpURLConnection0.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection0.setRequestProperty("Content-Type", "application/json");
                httpURLConnection0.setRequestProperty("Accept-Encoding", "gzip");
                String s = d$a0.c;
                if(s != null) {
                    httpURLConnection0.setRequestProperty("X-Goog-Api-Key", s);
                }
                try(OutputStream outputStream0 = httpURLConnection0.getOutputStream(); GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(outputStream0)) {
                    BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream0));
                    this.a.a(d$a0.b, bufferedWriter0);
                }
                catch(ConnectException | UnknownHostException connectException0) {
                    q1.a.d("CctTransportBackend", "Couldn\'t open connection, returning with 500", connectException0);
                    return new b(500, null, 0L);
                }
                catch(u2.b | IOException b0) {
                    q1.a.d("CctTransportBackend", "Couldn\'t encode request, returning with 400", b0);
                    return new b(400, null, 0L);
                }
                int v = httpURLConnection0.getResponseCode();
                q1.a.f("CctTransportBackend", "Status Code: %d", v);
                q1.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection0.getHeaderField("Content-Type"));
                q1.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection0.getHeaderField("Content-Encoding"));
                switch(v) {
                    case 200: {
                        try(InputStream inputStream0 = httpURLConnection0.getInputStream(); InputStream inputStream1 = d.m(inputStream0, httpURLConnection0.getHeaderField("Content-Encoding"))) {
                            return new b(200, null, n.b(new BufferedReader(new InputStreamReader(inputStream1))).c());
                        }
                    }
                    case 301: 
                    case 302: 
                    case 307: {
                        return new b(v, new URL(httpURLConnection0.getHeaderField("Location")), 0L);
                    }
                    default: {
                        return new b(v, null, 0L);
                    }
                }
            }, (a d$a0, b d$b0) -> {
                URL uRL0 = d$b0.b;
                if(uRL0 != null) {
                    q1.a.b("CctTransportBackend", "Following redirect to: %s", uRL0);
                    return d$a0.a(d$b0.b);
                }
                return null;
            });
            int v = d$b0.a;
            if(v == 200) {
                return g.e(d$b0.c);
            }
            if(v < 500) {
                switch(v) {
                    case 400: {
                        return g.d();
                    }
                    case 404: {
                        break;
                    }
                    default: {
                        return g.a();
                    }
                }
            }
            return g.f();
        }
        catch(IOException iOException0) {
        }
        q1.a.d("CctTransportBackend", "Could not make request to the backend", iOException0);
        return g.f();
    }

    // 检测为 Lambda 实现
    private b e(a d$a0) [...]

    private static int f(NetworkInfo networkInfo0) {
        if(networkInfo0 == null) {
            return l1.o.b.g.f();
        }
        int v = networkInfo0.getSubtype();
        if(v == -1) {
            return l1.o.b.A.f();
        }
        return l1.o.b.b(v) == null ? 0 : v;
    }

    private static int g(NetworkInfo networkInfo0) {
        return networkInfo0 == null ? c.y.f() : networkInfo0.getType();
    }

    private static int h(Context context0) {
        try {
            return context0.getPackageManager().getPackageInfo("com.fmkorea.m.fmk", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            q1.a.d("CctTransportBackend", "Unable to find version code for package", packageManager$NameNotFoundException0);
            return -1;
        }
    }

    private j i(f f0) {
        l1.l.a l$a0;
        HashMap hashMap0 = new HashMap();
        for(Object object0: f0.b()) {
            i i0 = (i)object0;
            String s = i0.j();
            if(hashMap0.containsKey(s)) {
                ((List)hashMap0.get(s)).add(i0);
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(i0);
                hashMap0.put(s, arrayList0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            i i1 = (i)((List)map$Entry0.getValue()).get(0);
            l1.m.a m$a0 = l1.m.a().f(p.g).g(this.f.a()).h(this.e.a()).b(k.a().c(l1.k.b.h).b(l1.a.a().m(i1.g("sdk-version")).j(i1.b("model")).f(i1.b("hardware")).d(i1.b("device")).l(i1.b("product")).k(i1.b("os-uild")).h(i1.b("manufacturer")).e(i1.b("fingerprint")).c(i1.b("country")).g(i1.b("locale")).i(i1.b("mcc_mnc")).b(i1.b("application_build")).a()).a());
            try {
                m$a0.i(Integer.parseInt(((String)map$Entry0.getKey())));
            }
            catch(NumberFormatException unused_ex) {
                m$a0.j(((String)map$Entry0.getKey()));
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object2: ((List)map$Entry0.getValue())) {
                i i2 = (i)object2;
                h h0 = i2.e();
                k1.b b0 = h0.b();
                if(b0.equals(k1.b.b("proto"))) {
                    l$a0 = l.j(h0.a());
                }
                else if(b0.equals(k1.b.b("json"))) {
                    l$a0 = l.i(new String(h0.a(), Charset.forName("UTF-8")));
                }
                else {
                    goto label_40;
                }
                l$a0.c(i2.f()).d(i2.k()).h(i2.h("tz-offset")).e(o.a().c(c.b(i2.g("net-type"))).b(l1.o.b.b(i2.g("mobile-subtype"))).a());
                if(i2.d() != null) {
                    l$a0.b(i2.d());
                }
                arrayList2.add(l$a0.a());
                continue;
            label_40:
                q1.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b0);
            }
            m$a0.c(arrayList2);
            arrayList1.add(m$a0.a());
        }
        return j.a(arrayList1);
    }

    private static TelephonyManager j(Context context0) {
        return (TelephonyManager)context0.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return (long)(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    // 检测为 Lambda 实现
    private static a l(a d$a0, b d$b0) [...]

    private static InputStream m(InputStream inputStream0, String s) {
        return "gzip".equals(s) ? new GZIPInputStream(inputStream0) : inputStream0;
    }

    private static URL n(String s) {
        try {
            return new URL(s);
        }
        catch(MalformedURLException malformedURLException0) {
            throw new IllegalArgumentException("Invalid url: " + s, malformedURLException0);
        }
    }
}

