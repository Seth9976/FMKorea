package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class zzaqw extends zzaqv {
    protected zzaqw(Context context0, String s, boolean z) {
        super(context0, s, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzaqv
    protected final List zzp(zzary zzary0, Context context0, zzanv zzanv0, zzano zzano0) {
        if(zzary0.zzk() != null && this.zzu) {
            int v = zzary0.zza();
            List list0 = new ArrayList();
            list0.addAll(super.zzp(zzary0, context0, zzanv0, null));
            list0.add(new zzasq(zzary0, "9mv9Ihk+HlE8P3WJWSjhrxWrdB7cEu1gaxdteA5kBJ6DKumpWYk1Q5Vf8aocVg4i", "s7rU1m4XsqJ83s2reIjdkboWJYkg+gYouDrDcn3Ghpw=", zzanv0, v, 24));
            return list0;
        }
        return super.zzp(zzary0, context0, zzanv0, null);
    }

    public static zzaqw zzt(String s, Context context0, boolean z) {
        zzaqv.zzr(context0, false);
        return new zzaqw(context0, s, false);
    }

    @Deprecated
    public static zzaqw zzu(String s, Context context0, boolean z, int v) {
        zzaqv.zzr(context0, z);
        return new zzaqw(context0, s, z);
    }
}

