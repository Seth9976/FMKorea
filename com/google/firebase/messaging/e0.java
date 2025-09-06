package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final class e0 implements OnCompleteListener {
    public final a a;

    public e0(a i0$a0) {
        this.a = i0$a0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        f0.a(this.a, task0);
    }
}

