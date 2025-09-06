package co.median.android;

import B0.H0;
import I0.g;
import android.content.Context;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Observable;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class o extends Observable {
    static class a extends AsyncTask {
        private WeakReference a;

        public a(o o0) {
            this.a = new WeakReference(o0);
        }

        protected String a(String[] arr_s) {
            o o0 = (o)this.a.get();
            if(o0 == null) {
                return null;
            }
            try {
                URL uRL0 = new URL(arr_s[0]);
                HttpURLConnection httpURLConnection0 = null;
                int v = 0;
                do {
                    if(httpURLConnection0 != null) {
                        httpURLConnection0.disconnect();
                    }
                    httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                    boolean z = true;
                    httpURLConnection0.setInstanceFollowRedirects(true);
                    httpURLConnection0.setRequestProperty("User-Agent", I0.a.V(o0.a).k);
                    httpURLConnection0.connect();
                    switch(httpURLConnection0.getResponseCode()) {
                        case 301: 
                        case 302: {
                            ++v;
                            uRL0 = new URL(uRL0, httpURLConnection0.getHeaderField("Location"));
                            break;
                        }
                        default: {
                            z = false;
                        }
                    }
                }
                while(!this.isCancelled() && z && v < 10);
                String s = httpURLConnection0.getURL().toString();
                httpURLConnection0.disconnect();
                return s;
            }
            catch(Exception exception0) {
            }
            g.a().c("co.median.android.o", exception0.getMessage(), exception0);
            return null;
        }

        protected void b(String s) {
            o o0 = (o)this.a.get();
            if(o0 == null) {
                return;
            }
            H0.a().d(s);
            if(s == null) {
                o0.c = false;
                o0.setChanged();
                o0.notifyObservers();
                return;
            }
            I0.a a0 = I0.a.V(o0.a);
            ArrayList arrayList0 = a0.R;
            for(int v = 0; v < arrayList0.size(); ++v) {
                if(((Pattern)arrayList0.get(v)).matcher(s).matches()) {
                    JSONObject jSONObject0 = (JSONObject)a0.S.get(v);
                    o0.c = jSONObject0.optBoolean("loggedIn", false);
                    boolean z = I0.a.c0(jSONObject0, "menuName") != null;
                    o0.setChanged();
                    o0.notifyObservers();
                    return;
                }
            }
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.a(((String[])arr_object));
        }

        @Override  // android.os.AsyncTask
        protected void onPostExecute(Object object0) {
            this.b(((String)object0));
        }
    }

    private Context a;
    private a b;
    private boolean c;
    private static final String d = "co.median.android.o";

    static {
    }

    o(Context context0) {
        this.b = null;
        this.c = false;
        this.a = context0;
        this.g();
    }

    static boolean b(o o0) {
        return o0.c;
    }

    // 去混淆评级： 低(20)
    static String d() [...] // 潜在的解密器

    public void g() {
        a o$a0 = this.b;
        if(o$a0 != null) {
            o$a0.cancel(true);
        }
        if(I0.a.V(this.a).Q == null) {
            return;
        }
        a o$a1 = new a(this);
        this.b = o$a1;
        o$a1.execute(new String[]{I0.a.V(this.a).Q});
    }

    public boolean h() {
        return this.c;
    }
}

