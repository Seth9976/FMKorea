package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public final class zzfby {
    private zzl zza;
    private zzq zzb;
    private String zzc;
    private zzfl zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbek zzh;
    private zzw zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private zzcb zzl;
    private int zzm;
    private zzbla zzn;
    private final zzfbl zzo;
    private boolean zzp;
    private zzekx zzq;
    private boolean zzr;
    private zzcf zzs;

    public zzfby() {
        this.zzm = 1;
        this.zzo = new zzfbl();
        this.zzp = false;
        this.zzr = false;
    }

    public final zzfby zzA(zzbek zzbek0) {
        this.zzh = zzbek0;
        return this;
    }

    public final zzfby zzB(ArrayList arrayList0) {
        this.zzf = arrayList0;
        return this;
    }

    public final zzfby zzC(ArrayList arrayList0) {
        this.zzg = arrayList0;
        return this;
    }

    public final zzfby zzD(PublisherAdViewOptions publisherAdViewOptions0) {
        this.zzk = publisherAdViewOptions0;
        if(publisherAdViewOptions0 != null) {
            this.zze = publisherAdViewOptions0.zzc();
            this.zzl = publisherAdViewOptions0.zza();
        }
        return this;
    }

    public final zzfby zzE(zzl zzl0) {
        this.zza = zzl0;
        return this;
    }

    public final zzfby zzF(zzfl zzfl0) {
        this.zzd = zzfl0;
        return this;
    }

    public final zzfca zzG() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfca(this, null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzfby zzQ(zzcf zzcf0) {
        this.zzs = zzcf0;
        return this;
    }

    public final zzl zze() {
        return this.zza;
    }

    public final zzq zzg() {
        return this.zzb;
    }

    public final zzfbl zzo() {
        return this.zzo;
    }

    public final zzfby zzp(zzfca zzfca0) {
        this.zzo.zza(zzfca0.zzo.zza);
        this.zza = zzfca0.zzd;
        this.zzb = zzfca0.zze;
        this.zzs = zzfca0.zzr;
        this.zzc = zzfca0.zzf;
        this.zzd = zzfca0.zza;
        this.zzf = zzfca0.zzg;
        this.zzg = zzfca0.zzh;
        this.zzh = zzfca0.zzi;
        this.zzi = zzfca0.zzj;
        this.zzq(zzfca0.zzl);
        this.zzD(zzfca0.zzm);
        this.zzp = zzfca0.zzp;
        this.zzq = zzfca0.zzc;
        this.zzr = zzfca0.zzq;
        return this;
    }

    public final zzfby zzq(AdManagerAdViewOptions adManagerAdViewOptions0) {
        this.zzj = adManagerAdViewOptions0;
        if(adManagerAdViewOptions0 != null) {
            this.zze = adManagerAdViewOptions0.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfby zzr(zzq zzq0) {
        this.zzb = zzq0;
        return this;
    }

    public final zzfby zzs(String s) {
        this.zzc = s;
        return this;
    }

    public final zzfby zzt(zzw zzw0) {
        this.zzi = zzw0;
        return this;
    }

    public final zzfby zzu(zzekx zzekx0) {
        this.zzq = zzekx0;
        return this;
    }

    public final zzfby zzv(zzbla zzbla0) {
        this.zzn = zzbla0;
        this.zzd = new zzfl(false, true, false);
        return this;
    }

    public final zzfby zzw(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfby zzx(boolean z) {
        this.zzr = true;
        return this;
    }

    public final zzfby zzy(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfby zzz(int v) {
        this.zzm = v;
        return this;
    }
}

