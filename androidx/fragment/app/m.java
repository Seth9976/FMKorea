package androidx.fragment.app;

import B.h;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.core.app.b;
import androidx.core.content.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class m extends j {
    private final Activity f;
    private final Context g;
    private final Handler h;
    private final int i;
    final FragmentManager j;

    m(Activity activity0, Context context0, Handler handler0, int v) {
        this.j = new u();
        this.f = activity0;
        this.g = (Context)h.h(context0, "context == null");
        this.h = (Handler)h.h(handler0, "handler == null");
        this.i = v;
    }

    m(androidx.fragment.app.h h0) {
        this(h0, h0, new Handler(), 0);
    }

    Activity e() {
        return this.f;
    }

    Context g() {
        return this.g;
    }

    public Handler h() {
        return this.h;
    }

    public abstract void i(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4);

    public abstract Object j();

    public abstract LayoutInflater l();

    public void n(Fragment fragment0, String[] arr_s, int v) {
    }

    public abstract boolean o(String arg1);

    public void p(Fragment fragment0, Intent intent0, int v, Bundle bundle0) {
        if(v != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        a.startActivity(this.g, intent0, bundle0);
    }

    public void q(Fragment fragment0, IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) {
        if(v != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        b.h(this.f, intentSender0, -1, intent0, v1, v2, v3, bundle0);
    }

    public abstract void r();
}

