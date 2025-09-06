package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public final class zzdjg implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdnb zzd;
    private final Clock zze;
    private zzbgq zzf;
    private zzbir zzg;

    public zzdjg(zzdnb zzdnb0, Clock clock0) {
        this.zzd = zzdnb0;
        this.zze = clock0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(this.zzc != null && this.zzc.get() == view0) {
            if(this.zza != null && this.zzb != null) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("id", this.zza);
                hashMap0.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - ((long)this.zzb)));
                hashMap0.put("messageType", "onePointFiveClick");
                this.zzd.zzg("sendMessageToNativeJs", hashMap0);
            }
            this.zzd();
        }
    }

    public final zzbgq zza() {
        return this.zzf;
    }

    public final void zzb() {
        if(this.zzf == null) {
            return;
        }
        if(this.zzb == null) {
            return;
        }
        this.zzd();
        try {
            this.zzf.zze();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzc(zzbgq zzbgq0) {
        this.zzf = zzbgq0;
        zzbir zzbir0 = this.zzg;
        if(zzbir0 != null) {
            this.zzd.zzk("/unconfirmedClick", zzbir0);
        }
        zzdjf zzdjf0 = new zzdjf(this, zzbgq0);
        this.zzg = zzdjf0;
        this.zzd.zzi("/unconfirmedClick", zzdjf0);
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference0 = this.zzc;
        if(weakReference0 == null) {
            return;
        }
        View view0 = (View)weakReference0.get();
        if(view0 == null) {
            return;
        }
        view0.setClickable(false);
        view0.setOnClickListener(null);
        this.zzc = null;
    }
}

