package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbp;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;

public final class zzeka extends zzbp {
    final zzfby zza;
    final zzdil zzb;
    private final Context zzc;
    private final zzchd zzd;
    private zzbh zze;

    public zzeka(zzchd zzchd0, Context context0, String s) {
        zzfby zzfby0 = new zzfby();
        this.zza = zzfby0;
        this.zzb = new zzdil();
        this.zzd = zzchd0;
        zzfby0.zzs(s);
        this.zzc = context0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() {
        zzdin zzdin0 = this.zzb.zzg();
        ArrayList arrayList0 = zzdin0.zzi();
        this.zza.zzB(arrayList0);
        ArrayList arrayList1 = zzdin0.zzh();
        this.zza.zzC(arrayList1);
        zzfby zzfby0 = this.zza;
        if(zzfby0.zzg() == null) {
            zzfby0.zzr(zzq.zzc());
        }
        return new zzekb(this.zzc, this.zzd, this.zza, zzdin0, this.zze);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbfu zzbfu0) {
        this.zzb.zza(zzbfu0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbfx zzbfx0) {
        this.zzb.zzb(zzbfx0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String s, zzbgd zzbgd0, zzbga zzbga0) {
        this.zzb.zzc(s, zzbgd0, zzbga0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzblj zzblj0) {
        this.zzb.zzd(zzblj0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbgh zzbgh0, zzq zzq0) {
        this.zzb.zze(zzbgh0);
        this.zza.zzr(zzq0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbgk zzbgk0) {
        this.zzb.zzf(zzbgk0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbh0) {
        this.zze = zzbh0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions0) {
        this.zza.zzq(adManagerAdViewOptions0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbla zzbla0) {
        this.zza.zzv(zzbla0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbek zzbek0) {
        this.zza.zzA(zzbek0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions0) {
        this.zza.zzD(publisherAdViewOptions0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcf zzcf0) {
        this.zza.zzQ(zzcf0);
    }
}

