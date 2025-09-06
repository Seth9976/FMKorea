package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

public class m {
    private final Context a;
    private final Executor b;
    private static final Object c;
    private static i0 d;

    static {
        m.c = new Object();
    }

    public m(Context context0) {
        this.a = context0;
        this.b = new e0.m();
    }

    // 检测为 Lambda 实现
    public static Task a(Context context0, Intent intent0, Task task0) [...]

    // 检测为 Lambda 实现
    public static Integer b(Context context0, Intent intent0) [...]

    // 检测为 Lambda 实现
    public static Integer c(Task task0) [...]

    private static Task d(Context context0, Intent intent0) {
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if(S.b().e(context0)) {
            d0.f(context0, m.e(context0, "com.google.firebase.MESSAGING_EVENT"), intent0);
            return Tasks.forResult(-1);
        }
        m.e(context0, "com.google.firebase.MESSAGING_EVENT").c(intent0);
        return Tasks.forResult(-1);
    }

    private static i0 e(Context context0, String s) {
        synchronized(m.c) {
            if(m.d == null) {
                m.d = new i0(context0, s);
            }
            return m.d;
        }
    }

    private static Integer f(Context context0, Intent intent0) {
        return S.b().g(context0, intent0);
    }

    private static Integer g(Task task0) {
        return 403;
    }

    // 去混淆评级： 低(40)
    private static Task h(Context context0, Intent intent0, Task task0) {
        return ((int)(((Integer)task0.getResult()))) == 402 ? m.d(context0, intent0).continueWith(new e0.m(), (Task task0) -> m.g(task0)) : task0;
    }

    public Task i(Intent intent0) {
        String s = intent0.getStringExtra("gcm.rawData64");
        if(s != null) {
            intent0.putExtra("rawData", Base64.decode(s, 0));
            intent0.removeExtra("gcm.rawData64");
        }
        return this.j(this.a, intent0);
    }

    public Task j(Context context0, Intent intent0) {
        if((intent0.getFlags() & 0x10000000) == 0) {
            return m.d(context0, intent0);
        }
        j j0 = () -> m.f(context0, intent0);
        Task task0 = Tasks.call(this.b, j0);
        k k0 = (Task task0) -> m.h(context0, intent0, task0);
        return task0.continueWithTask(this.b, k0);
    }
}

