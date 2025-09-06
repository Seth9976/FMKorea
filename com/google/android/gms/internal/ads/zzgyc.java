package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public abstract class zzgyc extends zzgya implements zzanb {
    private int zza;

    protected zzgyc(String s) {
        super("mvhd");
    }

    public final int zzh() {
        if(!this.zzc) {
            this.zzg();
        }
        return this.zza;
    }

    protected final long zzi(ByteBuffer byteBuffer0) {
        this.zza = zzana.zzc(byteBuffer0.get());
        zzana.zzd(byteBuffer0);
        byteBuffer0.get();
        return 4L;
    }
}

