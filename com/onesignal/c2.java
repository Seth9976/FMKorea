package com.onesignal;

import a2.e;
import a2.l.b;
import a2.l;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;

class c2 extends b2 {
    static class a {
        private final String a;
        private final String b;
        private final String c;

        a() {
            this(null, null, null);
        }

        a(String s, String s1, String s2) {
            if(s == null) {
                s = "onesignal-shared-public";
            }
            this.a = s;
            if(s1 == null) {
                s1 = "1:754795614042:android:c682b8144a8dd52bc1ad63";
            }
            this.b = s1;
            if(s2 == null) {
                s2 = "AIzaSyAnTLn5-_4Mc2a2P-dKUeE-aBtgyCrjlYU";
            }
            this.c = s2;
        }

        static String a(a c2$a0) {
            return c2$a0.a;
        }

        static String b(a c2$a0) {
            return c2$a0.c;
        }

        static String c(a c2$a0) {
            return c2$a0.b;
        }
    }

    private e f;
    private final Context g;
    private final a h;

    c2(Context context0, a c2$a0) {
        this.g = context0;
        if(c2$a0 == null) {
            this.h = new a();
            return;
        }
        this.h = c2$a0;
    }

    @Override  // com.onesignal.b2
    String f() {
        return "FCM";
    }

    @Override  // com.onesignal.b2
    String g(String s) {
        this.n(s);
        try {
            return this.m();
        }
        catch(NoClassDefFoundError | NoSuchMethodError unused_ex) {
            I1.a(C.j, "FirebaseMessaging.getToken not found, attempting to use FirebaseInstanceId.getToken");
            return this.l(s);
        }
    }

    private String l(String s) {
        try {
            Object object0 = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getMethod("getInstance", e.class).invoke(null, this.f);
            return (String)object0.getClass().getMethod("getToken", String.class, String.class).invoke(object0, s, "FCM");
        }
        catch(ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException classNotFoundException0) {
            throw new Error("Reflection error on FirebaseInstanceId.getInstance(firebaseApp).getToken(senderId, FirebaseMessaging.INSTANCE_ID_SCOPE)", classNotFoundException0);
        }
    }

    private String m() {
        Task task0 = ((FirebaseMessaging)this.f.i(FirebaseMessaging.class)).n();
        try {
            return (String)Tasks.await(task0);
        }
        catch(ExecutionException unused_ex) {
            throw task0.getException();
        }
    }

    private void n(String s) {
        if(this.f != null) {
            return;
        }
        l l0 = new b().d(s).c(a.c(this.h)).b(a.b(this.h)).e(a.a(this.h)).a();
        this.f = e.r(this.g, l0, "ONESIGNAL_SDK_FCM_APP_NAME");
    }
}

