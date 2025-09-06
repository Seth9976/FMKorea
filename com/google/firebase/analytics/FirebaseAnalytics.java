package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {
    private final zzdf a;
    private static volatile FirebaseAnalytics b;

    private FirebaseAnalytics(zzdf zzdf0) {
        Preconditions.checkNotNull(zzdf0);
        this.a = zzdf0;
    }

    public final void a(String s, Bundle bundle0) {
        this.a.zza(s, bundle0);
    }

    public final void b(boolean z) {
        this.a.zza(Boolean.valueOf(z));
    }

    public final void c(Bundle bundle0) {
        this.a.zzd(bundle0);
    }

    public final void d(String s) {
        this.a.zzd(s);
    }

    public final void e(String s, String s1) {
        this.a.zzb(s, s1);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String)Tasks.await(c.p().getId(), 30000L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException executionException0) {
            throw new IllegalStateException(executionException0.getCause());
        }
        catch(TimeoutException unused_ex) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        catch(InterruptedException interruptedException0) {
            throw new IllegalStateException(interruptedException0);
        }
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context0) {
        if(FirebaseAnalytics.b == null) {
            Class class0 = FirebaseAnalytics.class;
            synchronized(class0) {
                if(FirebaseAnalytics.b == null) {
                    FirebaseAnalytics.b = new FirebaseAnalytics(zzdf.zza(context0));
                }
            }
        }
        return FirebaseAnalytics.b;
    }

    @Keep
    public static zzjz getScionFrontendApiImplementation(Context context0, Bundle bundle0) {
        zzdf zzdf0 = zzdf.zza(context0, null, null, null, bundle0);
        return zzdf0 == null ? null : new a(zzdf0);
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity0, String s, String s1) {
        this.a.zza(activity0, s, s1);
    }
}

