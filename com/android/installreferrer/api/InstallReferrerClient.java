package com.android.installreferrer.api;

import android.content.Context;

public abstract class InstallReferrerClient {
    static abstract class a {
    }

    public static final class b {
        private final Context a;

        private b(Context context0) {
            this.a = context0;
        }

        b(Context context0, a installReferrerClient$a0) {
            this(context0);
        }

        public InstallReferrerClient a() {
            Context context0 = this.a;
            if(context0 == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            return new com.android.installreferrer.api.a(context0);
        }
    }

    public abstract ReferrerDetails a();

    public static b b(Context context0) {
        return new b(context0, null);
    }

    public abstract void c(InstallReferrerStateListener arg1);
}

