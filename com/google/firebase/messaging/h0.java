package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

public final class h0 implements OnCompleteListener {
    public final ScheduledFuture a;

    public h0(ScheduledFuture scheduledFuture0) {
        this.a = scheduledFuture0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        a.a(this.a, task0);
    }
}

