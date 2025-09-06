package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;

public final class zzecp implements DialogInterface.OnClickListener {
    public final zzecs zza;
    public final zzl zzb;

    public zzecp(zzecs zzecs0, zzl zzl0) {
        this.zza = zzecs0;
        this.zzb = zzl0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.zzm(this.zzb, dialogInterface0, v);
    }
}

