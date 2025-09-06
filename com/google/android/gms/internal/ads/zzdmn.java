package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

public final class zzdmn implements zzbir {
    private final zzbga zza;
    private final zzdnb zzb;
    private final zzgyn zzc;

    public zzdmn(zzdin zzdin0, zzdic zzdic0, zzdnb zzdnb0, zzgyn zzgyn0) {
        this.zza = zzdin0.zzc(zzdic0.zzA());
        this.zzb = zzdnb0;
        this.zzc = zzgyn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("asset");
        try {
            zzbfq zzbfq0 = (zzbfq)this.zzc.zzb();
            this.zza.zze(zzbfq0, s);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzk(("Failed to call onCustomClick for asset " + s + "."), remoteException0);
        }
    }

    public final void zzb() {
        if(this.zza == null) {
            return;
        }
        this.zzb.zzi("/nativeAdCustomClick", this);
    }
}

