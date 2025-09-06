package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.h;
import com.facebook.internal.F;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import jeb.synthetic.FIN;

abstract class f {
    static class a extends ObjectInputStream {
        public a(InputStream inputStream0) {
            super(inputStream0);
        }

        @Override
        protected ObjectStreamClass readClassDescriptor() {
            ObjectStreamClass objectStreamClass0 = super.readClassDescriptor();
            if(objectStreamClass0.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(b.class);
            }
            return objectStreamClass0.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1") ? ObjectStreamClass.lookup(com.facebook.appevents.c.b.class) : objectStreamClass0;
        }
    }

    private static final String a = "com.facebook.appevents.f";

    static {
    }

    public static void a(com.facebook.appevents.a a0, o o0) {
        Class class0 = f.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        if(b1.a.d(f.class)) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(class0);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        try {
            n n0 = f.c();
            n0.a(a0, o0.d());
            f.d(n0);
            FIN.finallyExec$NT(v);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, f.class);
            FIN.finallyExec$NT(v);
        }
    }

    public static void b(d d0) {
        synchronized(f.class) {
            if(b1.a.d(f.class)) {
                return;
            }
            try {
                n n0 = f.c();
                for(Object object0: d0.f()) {
                    n0.a(((com.facebook.appevents.a)object0), d0.c(((com.facebook.appevents.a)object0)).d());
                }
                f.d(n0);
                return;
            }
            catch(Throwable throwable0) {
            }
            b1.a.b(throwable0, f.class);
        }
    }

    public static n c() {
        n n0;
        a f$a0;
        Context context0;
        Class class0 = f.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        if(b1.a.d(f.class)) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(class0);
            FIN.finallyCodeEnd$NT(v);
            return null;
        }
        try {
            context0 = h.e();
        }
        catch(Throwable throwable0) {
            goto label_41;
        }
        try {
            f$a0 = null;
            f$a0 = new a(new BufferedInputStream(context0.openFileInput("AppEventsLogger.persistedevents")));
            n0 = (n)f$a0.readObject();
            goto label_31;
        }
        catch(FileNotFoundException unused_ex) {
        }
        catch(Exception exception0) {
            goto label_16;
        }
        catch(Throwable throwable1) {
            goto label_25;
        }
        try {
            F.g(f$a0);
            goto label_18;
        }
        catch(Throwable throwable0) {
            goto label_41;
        }
        try {
        label_16:
            Log.w("com.facebook.appevents.f", "Got unexpected exception while reading events: ", exception0);
        }
        catch(Throwable throwable1) {
            goto label_25;
        }
        try {
            F.g(f$a0);
            try {
            label_18:
                context0.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            }
            catch(Exception exception1) {
                Log.w("com.facebook.appevents.f", "Got unexpected exception when removing events file: ", exception1);
            }
            n0 = null;
            goto label_36;
        label_25:
            F.g(f$a0);
            try {
                context0.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            }
            catch(Exception exception2) {
                Log.w("com.facebook.appevents.f", "Got unexpected exception when removing events file: ", exception2);
            }
            throw throwable1;
        label_31:
            F.g(f$a0);
            try {
                context0.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            }
            catch(Exception exception3) {
                Log.w("com.facebook.appevents.f", "Got unexpected exception when removing events file: ", exception3);
            }
        label_36:
            if(n0 == null) {
                n0 = new n();
            }
            FIN.finallyExec$NT(v);
            return n0;
        }
        catch(Throwable throwable0) {
        label_41:
            b1.a.b(throwable0, f.class);
            FIN.finallyExec$NT(v);
            return null;
        }
    }

    protected static void d(n n0) {
        Class class0 = f.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            Context context0 = h.e();
            ObjectOutputStream objectOutputStream0 = null;
            try {
                objectOutputStream0 = new ObjectOutputStream(new BufferedOutputStream(context0.openFileOutput("AppEventsLogger.persistedevents", 0)));
                objectOutputStream0.writeObject(n0);
            }
            catch(Throwable unused_ex) {
                try {
                    Log.w("com.facebook.appevents.f", "Got unexpected exception while persisting events: ", throwable1);
                    try {
                        context0.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    }
                    catch(Exception unused_ex) {
                    }
                }
                finally {
                    F.g(objectOutputStream0);
                }
                return;
            }
            F.g(objectOutputStream0);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }
}

