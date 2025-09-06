package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;

public final class zzeck implements DialogInterface.OnClickListener {
    public final zzecs zza;
    public final Activity zzb;
    public final zzl zzc;

    public zzeck(zzecs zzecs0, Activity activity0, zzl zzl0) {
        this.zza = zzecs0;
        this.zzb = activity0;
        this.zzc = zzl0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.zzd(this.zzb, this.zzc, dialogInterface0, v);
    }
}

