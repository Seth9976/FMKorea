package com.google.android.gms.ads.mediation.customevent;

import java.util.HashMap;

@Deprecated
public final class CustomEventExtras {
    private final HashMap zza;

    public CustomEventExtras() {
        this.zza = new HashMap();
    }

    public Object getExtra(String s) {
        return this.zza.get(s);
    }

    public void setExtra(String s, Object object0) {
        this.zza.put(s, object0);
    }
}

