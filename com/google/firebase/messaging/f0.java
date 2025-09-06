package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import e0.m;

class f0 extends Binder {
    interface a {
        Task a(Intent arg1);
    }

    private final a f;

    f0(a f0$a0) {
        this.f = f0$a0;
    }

    // 检测为 Lambda 实现
    public static void a(com.google.firebase.messaging.i0.a i0$a0, Task task0) [...]

    private static void b(com.google.firebase.messaging.i0.a i0$a0, Task task0) {
        i0$a0.d();
    }

    void c(com.google.firebase.messaging.i0.a i0$a0) {
        if(Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f.a(i0$a0.a).addOnCompleteListener(new m(), (Task task0) -> f0.b(i0$a0, task0));
    }
}

