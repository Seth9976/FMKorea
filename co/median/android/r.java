package co.median.android;

import B0.Q;
import I0.g;
import I0.l;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class r {
    class a {
        private String a;
        private List b;
        final r c;

        a(String s, List list0) {
            this.a = s;
            this.b = list0;
        }

        void c() {
            new b(r.this.a, this, r.this).execute(new Void[0]);
        }
    }

    static class b extends AsyncTask {
        private a a;
        private r b;
        private Context c;

        b(Context context0, a r$a0, r r0) {
            this.a = r$a0;
            this.b = r0;
            this.c = context0;
        }

        protected Void a(Void[] arr_void) {
            HashMap hashMap0 = new HashMap();
            hashMap0.putAll(Q.b(this.b.a));
            if(((GoNativeApplication)this.c).c() != null) {
                hashMap0.putAll(((GoNativeApplication)this.c).c());
            }
            if(this.b.b != null) {
                Iterator iterator0 = this.b.b.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    hashMap0.put("customData_" + ((String)object0), this.b.b.opt(((String)object0)));
                }
            }
            try {
                JSONObject jSONObject0 = new JSONObject(hashMap0);
                HttpURLConnection httpURLConnection0 = (HttpURLConnection)new URL(this.a.a).openConnection();
                httpURLConnection0.setRequestMethod("POST");
                httpURLConnection0.setRequestProperty("Content-Type", "application/json");
                httpURLConnection0.setDoOutput(true);
                OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(httpURLConnection0.getOutputStream(), "UTF-8");
                outputStreamWriter0.write(jSONObject0.toString());
                outputStreamWriter0.close();
                httpURLConnection0.connect();
                int v = httpURLConnection0.getResponseCode();
                if(v < 200 || v > 299) {
                    Log.w("co.median.android.r", "Recevied status code " + v + " when posting to " + this.a.a);
                    return null;
                }
            }
            catch(Exception exception0) {
                g.a().c("co.median.android.r", "Error posting to " + this.a.a, exception0);
            }
            return null;
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.a(((Void[])arr_object));
        }
    }

    private Context a;
    private JSONObject b;
    private String c;
    private List d;
    private static final String e = "co.median.android.r";

    static {
    }

    r(Context context0) {
        this.a = context0;
        this.d = new LinkedList();
    }

    // 去混淆评级： 低(20)
    static String c() [...] // 潜在的解密器

    public void d(String s) {
        this.c = s;
        for(Object object0: this.d) {
            a r$a0 = (a)object0;
            if(l.l(s, r$a0.b)) {
                r$a0.c();
            }
        }
    }

    public void e(JSONArray jSONArray0) {
        this.d.clear();
        if(jSONArray0 == null) {
            return;
        }
        for(int v = 0; v < jSONArray0.length(); ++v) {
            JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
            if(jSONObject0 != null) {
                String s = l.i(jSONObject0, "url");
                if(s == null) {
                    Log.w("co.median.android.r", "Invalid registration: endpoint url is null");
                }
                else {
                    a r$a0 = new a(this, s, l.c(jSONObject0.opt("urlRegex")));
                    this.d.add(r$a0);
                }
            }
        }
    }

    private void f() {
        for(Object object0: this.d) {
            a r$a0 = (a)object0;
            if(this.c != null && l.l(this.c, r$a0.b)) {
                r$a0.c();
            }
        }
    }

    public void g() {
        for(Object object0: this.d) {
            ((a)object0).c();
        }
    }

    public void h(JSONObject jSONObject0) {
        this.b = jSONObject0;
        this.f();
    }
}

