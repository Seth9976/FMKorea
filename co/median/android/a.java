package co.median.android;

import B0.Q;
import I0.g;
import android.content.Context;
import android.os.AsyncTask;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    static class co.median.android.a.a extends AsyncTask {
        WeakReference a;

        co.median.android.a.a(Context context0) {
            this.a = new WeakReference(context0);
        }

        protected Void a(Void[] arr_void) {
            Context context0 = (Context)this.a.get();
            if(context0 == null) {
                return null;
            }
            JSONObject jSONObject0 = new JSONObject(Q.b(context0));
            try {
                jSONObject0.put("event", "launch");
            }
            catch(JSONException jSONException0) {
                g.a().c("co.median.android.a", jSONException0.getMessage(), jSONException0);
                return null;
            }
            try {
                HttpURLConnection httpURLConnection0 = (HttpURLConnection)new URL("https://events.gonative.io/api/events/new").openConnection();
                httpURLConnection0.setRequestMethod("POST");
                httpURLConnection0.setRequestProperty("Content-Type", "application/json");
                httpURLConnection0.setDoOutput(true);
                httpURLConnection0.setDoInput(false);
                OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(httpURLConnection0.getOutputStream(), "UTF-8");
                outputStreamWriter0.write(jSONObject0.toString());
                outputStreamWriter0.close();
                httpURLConnection0.connect();
                httpURLConnection0.getResponseCode();
                httpURLConnection0.disconnect();
            }
            catch(Exception exception0) {
                g.a().c("co.median.android.a", exception0.getMessage(), exception0);
            }
            return null;
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.a(((Void[])arr_object));
        }
    }

    private Context a;
    private static final String b = "co.median.android.a";

    static {
    }

    a(Context context0) {
        this.a = context0;
    }

    // 去混淆评级： 低(20)
    static String a() [...] // 潜在的解密器

    public void b() {
        if(I0.a.V(this.a).p) {
            return;
        }
        new co.median.android.a.a(this.a).execute(new Void[0]);
    }
}

