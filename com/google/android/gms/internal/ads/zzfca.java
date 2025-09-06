package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.ArrayList;

public final class zzfca {
    public final zzfl zza;
    public final zzbla zzb;
    public final zzekx zzc;
    public final zzl zzd;
    public final zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbek zzi;
    public final zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final zzcb zzn;
    public final zzfbn zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final zzcf zzr;

    zzfca(zzfby zzfby0, zzfbz zzfbz0) {
        zzbek zzbek0;
        zzfl zzfl0;
        this.zze = zzfby0.zzb;
        this.zzf = zzfby0.zzc;
        this.zzr = zzfby0.zzs;
        int v = zzs.zza(zzfby0.zza.zzw);
        this.zzd = new zzl(zzfby0.zza.zza, zzfby0.zza.zzb, zzfby0.zza.zzc, zzfby0.zza.zzd, zzfby0.zza.zze, zzfby0.zza.zzf, zzfby0.zza.zzg, zzfby0.zza.zzh || zzfby0.zze, zzfby0.zza.zzi, zzfby0.zza.zzj, zzfby0.zza.zzk, zzfby0.zza.zzl, zzfby0.zza.zzm, zzfby0.zza.zzn, zzfby0.zza.zzo, zzfby0.zza.zzp, zzfby0.zza.zzq, zzfby0.zza.zzr, zzfby0.zza.zzs, zzfby0.zza.zzt, zzfby0.zza.zzu, zzfby0.zza.zzv, v, zzfby0.zza.zzx);
        if(zzfby0.zzd == null) {
            zzfl0 = zzfby0.zzh == null ? null : zzfby0.zzh.zzf;
        }
        else {
            zzfl0 = zzfby0.zzd;
        }
        this.zza = zzfl0;
        this.zzg = zzfby0.zzf;
        this.zzh = zzfby0.zzg;
        if(zzfby0.zzf == null) {
            zzbek0 = null;
        }
        else {
            zzbek0 = zzfby0.zzh == null ? new zzbek(new Builder().build()) : zzfby0.zzh;
        }
        this.zzi = zzbek0;
        this.zzj = zzfby0.zzi;
        this.zzk = zzfby0.zzm;
        this.zzl = zzfby0.zzj;
        this.zzm = zzfby0.zzk;
        this.zzn = zzfby0.zzl;
        this.zzb = zzfby0.zzn;
        this.zzo = new zzfbn(zzfby0.zzo, null);
        this.zzp = zzfby0.zzp;
        this.zzc = zzfby0.zzq;
        this.zzq = zzfby0.zzr;
    }

    public final zzbgn zza() {
        PublisherAdViewOptions publisherAdViewOptions0 = this.zzm;
        if(publisherAdViewOptions0 == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions0 == null ? this.zzl.zza() : publisherAdViewOptions0.zzb();
    }

    public final boolean zzb() {
        String s = (String)zzba.zzc().zzb(zzbbr.zzcS);
        return this.zzf.matches(s);
    }
}

