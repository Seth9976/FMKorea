package com.facebook;

import X.a;
import android.content.Intent;
import com.facebook.internal.F;
import com.facebook.internal.G;

public final class s {
    private final a a;
    private final r b;
    private Profile c;
    private static volatile s d;

    s(a a0, r r0) {
        G.i(a0, "localBroadcastManager");
        G.i(r0, "profileCache");
        this.a = a0;
        this.b = r0;
    }

    Profile a() {
        return this.c;
    }

    static s b() {
        if(s.d == null) {
            Class class0 = s.class;
            synchronized(class0) {
                if(s.d == null) {
                    s.d = new s(a.b(h.e()), new r());
                }
            }
        }
        return s.d;
    }

    boolean c() {
        Profile profile0 = this.b.b();
        if(profile0 != null) {
            this.f(profile0, false);
            return true;
        }
        return false;
    }

    private void d(Profile profile0, Profile profile1) {
        Intent intent0 = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent0.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile0);
        intent0.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile1);
        this.a.d(intent0);
    }

    void e(Profile profile0) {
        this.f(profile0, true);
    }

    private void f(Profile profile0, boolean z) {
        Profile profile1 = this.c;
        this.c = profile0;
        if(z) {
            if(profile0 == null) {
                this.b.a();
            }
            else {
                this.b.c(profile0);
            }
        }
        if(!F.a(profile1, profile0)) {
            this.d(profile1, profile0);
        }
    }
}

