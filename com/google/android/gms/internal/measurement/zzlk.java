package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class zzlk extends zzls {
    private final zzlg zza;

    private zzlk(zzlg zzlg0) {
        this.zza = zzlg0;
        super(zzlg0, null);
    }

    zzlk(zzlg zzlg0, zzlj zzlj0) {
        this(zzlg0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzls
    public final Iterator iterator() {
        return new zzli(this.zza, null);
    }
}

