package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

public class FirebaseMessagingService extends i {
    private static final Queue k;

    static {
        FirebaseMessagingService.k = new ArrayDeque(10);
    }

    @Override  // com.google.firebase.messaging.i
    protected Intent e(Intent intent0) {
        return S.b().c();
    }

    @Override  // com.google.firebase.messaging.i
    public void f(Intent intent0) {
        String s = intent0.getAction();
        if(!"com.google.android.c2dm.intent.RECEIVE".equals(s) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(s)) {
            if("com.google.firebase.messaging.NEW_TOKEN".equals(s)) {
                this.s(intent0.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent0.getAction());
            return;
        }
        this.o(intent0);
    }

    private boolean l(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        Queue queue0 = FirebaseMessagingService.k;
        if(queue0.contains(s)) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received duplicate message: " + s);
            }
            return true;
        }
        if(queue0.size() >= 10) {
            queue0.remove();
        }
        queue0.add(s);
        return false;
    }

    private void m(Intent intent0) {
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        bundle0.remove("androidx.content.wakelockid");
        if(G.t(bundle0)) {
            G g0 = new G(bundle0);
            ExecutorService executorService0 = n.e();
            f f0 = new f(this, g0, executorService0);
            try {
                if(f0.a()) {
                    return;
                }
            }
            finally {
                executorService0.shutdown();
            }
            if(E.A(intent0)) {
                E.t(intent0);
            }
        }
        this.q(new RemoteMessage(bundle0));
    }

    private String n(Intent intent0) {
        String s = intent0.getStringExtra("google.message_id");
        return s == null ? intent0.getStringExtra("message_id") : s;
    }

    private void o(Intent intent0) {
        if(!this.l(intent0.getStringExtra("google.message_id"))) {
            this.u(intent0);
        }
    }

    public void p() {
    }

    public void q(RemoteMessage remoteMessage0) {
    }

    public void r(String s) {
    }

    public void s(String s) {
    }

    public void t(String s, Exception exception0) {
    }

    private void u(Intent intent0) {
        String s = intent0.getStringExtra("message_type");
        if(s == null) {
            s = "gcm";
        }
        switch(s) {
            case "deleted_messages": {
                return;
            }
            case "gcm": {
                E.v(intent0);
                this.m(intent0);
                return;
            }
            case "send_error": {
                this.t(this.n(intent0), new Q(intent0.getStringExtra("error")));
                return;
            }
            case "send_event": {
                this.r(intent0.getStringExtra("google.message_id"));
                return;
            }
            default: {
                Log.w("FirebaseMessaging", "Received message with unknown type: " + s);
            }
        }
    }
}

