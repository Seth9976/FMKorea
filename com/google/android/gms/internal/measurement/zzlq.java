package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzlq implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final zzlg zzd;

    private zzlq(zzlg zzlg0) {
        this.zzd = zzlg0;
        super();
        this.zza = -1;
    }

    zzlq(zzlg zzlg0, zzlp zzlp0) {
        this(zzlg0);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean hasNext() {
        return this.zza + 1 < this.zzd.zzb.size() || !this.zzd.zzc.isEmpty() && this.zza().hasNext();
    }

    @Override
    public final Object next() {
        this.zzb = true;
        int v = this.zza + 1;
        this.zza = v;
        return v < this.zzd.zzb.size() ? ((Map.Entry)this.zzd.zzb.get(this.zza)) : this.zza().next();
    }

    @Override
    public final void remove() {
        if(!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        this.zzd.zzg();
        if(this.zza < this.zzd.zzb.size()) {
            int v = this.zza;
            this.zza = v - 1;
            this.zzd.zzc(v);
            return;
        }
        this.zza().remove();
    }

    private final Iterator zza() {
        if(this.zzc == null) {
            this.zzc = this.zzd.zzc.entrySet().iterator();
        }
        return this.zzc;
    }
}

