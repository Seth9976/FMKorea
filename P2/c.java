package p2;

import com.google.android.gms.tasks.TaskCompletionSource;
import j2.r;
import k1.h;

public final class c implements h {
    public final e a;
    public final TaskCompletionSource b;
    public final boolean c;
    public final r d;

    public c(e e0, TaskCompletionSource taskCompletionSource0, boolean z, r r0) {
        this.a = e0;
        this.b = taskCompletionSource0;
        this.c = z;
        this.d = r0;
    }

    @Override  // k1.h
    public final void a(Exception exception0) {
        e.a(this.a, this.b, this.c, this.d, exception0);
    }
}

