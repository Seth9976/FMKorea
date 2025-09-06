package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzli implements Iterator {
    private int zza;
    private Iterator zzb;
    private final zzlg zzc;

    private zzli(zzlg zzlg0) {
        this.zzc = zzlg0;
        super();
        this.zza = zzlg0.zzb.size();
    }

    zzli(zzlg zzlg0, zzlh zzlh0) {
        this(zzlg0);
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean hasNext() {
        return this.zza > 0 && this.zza <= this.zzc.zzb.size() || this.zza().hasNext();
    }

    @Override
    public final Object next() {
        if(this.zza().hasNext()) {
            return this.zza().next();
        }
        int v = this.zza - 1;
        this.zza = v;
        return (Map.Entry)this.zzc.zzb.get(v);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator zza() {
        if(this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }
}

