package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzfrv {
    private final zzfqt zza;
    private final zzfru zzb;

    private zzfrv(zzfru zzfru0) {
        this.zzb = zzfru0;
        this.zza = zzfqs.zza;
    }

    static zzfqt zza(zzfrv zzfrv0) {
        return zzfrv0.zza;
    }

    public static zzfrv zzb(int v) {
        return new zzfrv(new zzfrr(4000));
    }

    public static zzfrv zzc(zzfqt zzfqt0) {
        return new zzfrv(new zzfrp(zzfqt0));
    }

    public final Iterable zzd(CharSequence charSequence0) {
        charSequence0.getClass();
        return new zzfrs(this, charSequence0);
    }

    static Iterator zze(zzfrv zzfrv0, CharSequence charSequence0) {
        return zzfrv0.zzg(charSequence0);
    }

    public final List zzf(CharSequence charSequence0) {
        Iterator iterator0 = this.zzg(charSequence0);
        ArrayList arrayList0 = new ArrayList();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            arrayList0.add(((String)object0));
        }
        return Collections.unmodifiableList(arrayList0);
    }

    private final Iterator zzg(CharSequence charSequence0) {
        return this.zzb.zza(this, charSequence0);
    }
}

