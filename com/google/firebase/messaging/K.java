package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class k implements Continuation {
    public final Context a;
    public final Intent b;

    public k(Context context0, Intent intent0) {
        this.a = context0;
        this.b = intent0;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return m.a(this.a, this.b, task0);
    }
}

