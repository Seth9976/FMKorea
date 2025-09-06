package com.google.android.material.snackbar;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.app.E;

class a {
    interface b {
    }

    static abstract class c {
    }

    private final Object a;
    private final Handler b;
    private static a c;

    private a() {
        class com.google.android.material.snackbar.a.a implements Handler.Callback {
            final a f;

            @Override  // android.os.Handler$Callback
            public boolean handleMessage(Message message0) {
                if(message0.what != 0) {
                    return false;
                }
                E.a(message0.obj);
                a.this.c(null);
                return true;
            }
        }

        this.a = new Object();
        this.b = new Handler(Looper.getMainLooper(), new com.google.android.material.snackbar.a.a(this));
    }

    private boolean a(c a$c0, int v) {
        throw null;
    }

    static a b() {
        if(a.c == null) {
            a.c = new a();
        }
        return a.c;
    }

    void c(c a$c0) {
        synchronized(this.a) {
            this.a(a$c0, 2);
        }
    }

    private boolean d(b a$b0) [...] // Inlined contents

    public void e(b a$b0) {
        synchronized(this.a) {
        }
    }

    public void f(b a$b0) {
        synchronized(this.a) {
        }
    }
}

