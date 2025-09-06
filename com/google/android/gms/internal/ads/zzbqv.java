package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzs;

final class zzbqv implements DialogInterface.OnClickListener {
    final zzbqx zza;

    zzbqv(zzbqx zzbqx0) {
        this.zza = zzbqx0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        Intent intent0 = this.zza.zzb();
        zzs.zzQ(zzbqx.zza(this.zza), intent0);
    }
}

