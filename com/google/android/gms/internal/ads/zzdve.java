package com.google.android.gms.internal.ads;

public class zzdve extends Exception {
    private final int zza;

    public zzdve(int v) {
        this.zza = v;
    }

    public zzdve(int v, String s) {
        super(s);
        this.zza = v;
    }

    public zzdve(int v, String s, Throwable throwable0) {
        super(s, throwable0);
        this.zza = 1;
    }

    public final int zza() {
        return this.zza;
    }
}

