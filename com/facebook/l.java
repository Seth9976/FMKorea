package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import b1.a;
import com.facebook.internal.F;
import java.net.HttpURLConnection;
import java.util.List;

public class l extends AsyncTask {
    private final HttpURLConnection a;
    private final m b;
    private Exception c;
    private static final String d = "com.facebook.l";

    static {
    }

    public l(m m0) {
        this(null, m0);
    }

    public l(HttpURLConnection httpURLConnection0, m m0) {
        this.b = m0;
        this.a = httpURLConnection0;
    }

    protected List a(Void[] arr_void) {
        if(a.d(this)) {
            return null;
        }
        try {
            try {
                return this.a == null ? this.b.e() : GraphRequest.p(this.a, this.b);
            }
            catch(Exception exception0) {
            }
            this.c = exception0;
            return null;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, this);
        return null;
    }

    protected void b(List list0) {
        if(a.d(this)) {
            return;
        }
        try {
            super.onPostExecute(list0);
            Exception exception0 = this.c;
            if(exception0 != null) {
                F.V("com.facebook.l", String.format("onPostExecute: exception encountered during request: %s", exception0.getMessage()));
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
        }
    }

    @Override  // android.os.AsyncTask
    protected Object doInBackground(Object[] arr_object) {
        if(a.d(this)) {
            return null;
        }
        try {
            return this.a(((Void[])arr_object));
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
            return null;
        }
    }

    @Override  // android.os.AsyncTask
    protected void onPostExecute(Object object0) {
        if(a.d(this)) {
            return;
        }
        try {
            this.b(((List)object0));
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
        }
    }

    @Override  // android.os.AsyncTask
    protected void onPreExecute() {
        if(a.d(this)) {
            return;
        }
        try {
            super.onPreExecute();
            if(this.b.n() == null) {
                Handler handler0 = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
                this.b.v(handler0);
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, this);
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return "{RequestAsyncTask:  connection: " + this.a + ", requests: " + this.b + "}";
    }
}

