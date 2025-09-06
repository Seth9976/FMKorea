package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import org.json.JSONObject;
import z3.k;

public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {
    protected void onMessage(Context context0, Intent intent0) {
        public static final class a implements e {
            final Bundle a;
            final Context b;

            a(Bundle bundle0, Context context0) {
                this.a = bundle0;
                this.b = context0;
                super();
            }

            @Override  // com.onesignal.S$e
            public void a(f s$f0) {
                if(s$f0 != null && s$f0.c()) {
                    return;
                }
                JSONObject jSONObject0 = S.a(this.a);
                k.d(jSONObject0, "bundleAsJSONObject(bundle)");
                R0 r00 = new R0(jSONObject0);
                W0 w00 = new W0(this.b);
                w00.q(jSONObject0);
                w00.o(this.b);
                w00.r(r00);
                S.m(w00, true);
            }
        }

        Bundle bundle0 = intent0 == null ? null : intent0.getExtras();
        S.h(context0, bundle0, new a(bundle0, context0));
    }

    protected void onRegistered(Context context0, String s) {
        I1.a(C.j, "ADM registration ID: " + s);
        a2.c(s);
    }

    protected void onRegistrationError(Context context0, String s) {
        C i1$C0 = C.h;
        I1.a(i1$C0, k.k("ADM:onRegistrationError: ", s));
        if(k.a("INVALID_SENDER", s)) {
            I1.a(i1$C0, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        a2.c(null);
    }

    protected void onUnregistered(Context context0, String s) {
        I1.a(C.j, "ADM:onUnregistered: " + s);
    }
}

