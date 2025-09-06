package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

public final class j implements Callable {
    public final Context a;
    public final Intent b;

    public j(Context context0, Intent intent0) {
        this.a = context0;
        this.b = intent0;
    }

    @Override
    public final Object call() {
        return m.b(this.a, this.b);
    }
}

