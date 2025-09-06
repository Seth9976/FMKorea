package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.E;
import com.google.firebase.messaging.m;
import java.util.concurrent.ExecutionException;

public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    private static Intent a(Context context0, String s, Bundle bundle0) {
        return new Intent(s).putExtras(bundle0);
    }

    @Override  // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    protected int onMessageReceive(Context context0, CloudMessage cloudMessage0) {
        try {
            return (int)(((Integer)Tasks.await(new m(context0).i(cloudMessage0.getIntent()))));
        }
        catch(ExecutionException | InterruptedException executionException0) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", executionException0);
            return 500;
        }
    }

    @Override  // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    protected void onNotificationDismissed(Context context0, Bundle bundle0) {
        Intent intent0 = FirebaseInstanceIdReceiver.a(context0, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle0);
        if(E.A(intent0)) {
            E.s(intent0);
        }
    }
}

