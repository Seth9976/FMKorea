package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

public abstract class x implements ServiceConnection {
    public interface b {
        void a(Bundle arg1);
    }

    private final Context f;
    private final Handler g;
    private b h;
    private boolean i;
    private Messenger j;
    private int k;
    private int l;
    private final String m;
    private final int n;

    public x(Context context0, int v, int v1, int v2, String s) {
        class a extends Handler {
            final x a;

            @Override  // android.os.Handler
            public void handleMessage(Message message0) {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    x.this.c(message0);
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        Context context1 = context0.getApplicationContext();
        if(context1 != null) {
            context0 = context1;
        }
        this.f = context0;
        this.k = v;
        this.l = v1;
        this.m = s;
        this.n = v2;
        this.g = new a(this);
    }

    private void a(Bundle bundle0) {
        if(!this.i) {
            return;
        }
        this.i = false;
        b x$b0 = this.h;
        if(x$b0 != null) {
            x$b0.a(bundle0);
        }
    }

    public void b() {
        this.i = false;
    }

    protected void c(Message message0) {
        if(message0.what == this.l) {
            Bundle bundle0 = message0.getData();
            if(bundle0.getString("com.facebook.platform.status.ERROR_TYPE") == null) {
                this.a(bundle0);
            }
            else {
                this.a(null);
            }
            try {
                this.f.unbindService(this);
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
    }

    protected abstract void d(Bundle arg1);

    private void e() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("com.facebook.platform.extra.APPLICATION_ID", this.m);
        this.d(bundle0);
        Message message0 = Message.obtain(null, this.k);
        message0.arg1 = this.n;
        message0.setData(bundle0);
        message0.replyTo = new Messenger(this.g);
        try {
            this.j.send(message0);
        }
        catch(RemoteException unused_ex) {
            this.a(null);
        }
    }

    public void f(b x$b0) {
        this.h = x$b0;
    }

    public boolean g() {
        if(this.i) {
            return false;
        }
        if(w.s(this.n) == -1) {
            return false;
        }
        Intent intent0 = w.l(this.f);
        if(intent0 == null) {
            return false;
        }
        this.i = true;
        this.f.bindService(intent0, this, 1);
        return true;
    }

    @Override  // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        this.j = new Messenger(iBinder0);
        this.e();
    }

    @Override  // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName0) {
        try {
            this.j = null;
            this.f.unbindService(this);
        }
        catch(IllegalArgumentException unused_ex) {
        }
        this.a(null);
    }
}

