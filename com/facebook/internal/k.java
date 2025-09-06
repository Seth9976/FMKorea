package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

public class k extends H {
    private boolean t;
    private static final String u = "com.facebook.internal.k";

    static {
    }

    private k(Context context0, String s, String s1) {
        super(context0, s);
        this.v(s1);
    }

    public static k A(Context context0, String s, String s1) {
        H.n(context0);
        return new k(context0, s, s1);
    }

    @Override  // com.facebook.internal.H
    public void cancel() {
        class a implements Runnable {
            final k f;

            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    k.this.super.cancel();
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        WebView webView0 = this.m();
        if(this.p() && !this.o() && webView0 != null && webView0.isShown()) {
            if(this.t) {
                return;
            }
            this.t = true;
            webView0.loadUrl("javascript:(function() {  var event = document.createEvent(\'Event\');  event.initEvent(\'fbPlatformDialogMustClose\',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new a(this), 1500L);
            return;
        }
        super.cancel();
    }

    @Override  // com.facebook.internal.H
    protected Bundle r(String s) {
        Bundle bundle0 = F.a0(Uri.parse(s).getQuery());
        String s1 = bundle0.getString("bridge_args");
        bundle0.remove("bridge_args");
        if(!F.P(s1)) {
            try {
                bundle0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", c.a(new JSONObject(s1)));
            }
            catch(JSONException jSONException0) {
                F.W("com.facebook.internal.k", "Unable to parse bridge_args JSON", jSONException0);
            }
        }
        String s2 = bundle0.getString("method_results");
        bundle0.remove("method_results");
        if(!F.P(s2)) {
            if(F.P(s2)) {
                s2 = "{}";
            }
            try {
                bundle0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", c.a(new JSONObject(s2)));
            }
            catch(JSONException jSONException1) {
                F.W("com.facebook.internal.k", "Unable to parse bridge_args JSON", jSONException1);
            }
        }
        bundle0.remove("version");
        bundle0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", w.t());
        return bundle0;
    }
}

