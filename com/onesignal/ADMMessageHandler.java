package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import org.json.JSONObject;

public class ADMMessageHandler extends ADMMessageHandlerBase {
    private static final int JOB_ID = 0x1E3F3;

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    protected void onMessage(Intent intent0) {
        class a implements e {
            final Bundle a;
            final Context b;
            final ADMMessageHandler c;

            a(Bundle bundle0, Context context0) {
                this.a = bundle0;
                this.b = context0;
                super();
            }

            @Override  // com.onesignal.S$e
            public void a(f s$f0) {
                if(s$f0.c()) {
                    return;
                }
                JSONObject jSONObject0 = S.a(this.a);
                R0 r00 = new R0(jSONObject0);
                W0 w00 = new W0(this.b);
                w00.q(jSONObject0);
                w00.o(this.b);
                w00.r(r00);
                S.m(w00, true);
            }
        }

        Context context0 = this.getApplicationContext();
        Bundle bundle0 = intent0.getExtras();
        S.h(context0, bundle0, new a(this, bundle0, context0));
    }

    protected void onRegistered(String s) {
        I1.a(C.j, "ADM registration ID: " + s);
        a2.c(s);
    }

    protected void onRegistrationError(String s) {
        C i1$C0 = C.h;
        I1.a(i1$C0, "ADM:onRegistrationError: " + s);
        if("INVALID_SENDER".equals(s)) {
            I1.a(i1$C0, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        a2.c(null);
    }

    protected void onUnregistered(String s) {
        I1.a(C.j, "ADM:onUnregistered: " + s);
    }
}

