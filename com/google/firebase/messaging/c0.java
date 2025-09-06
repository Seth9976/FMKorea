package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final class c0 implements OnCompleteListener {
    public final Intent a;

    public c0(Intent intent0) {
        this.a = intent0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        d0.a(this.a, task0);
    }
}

