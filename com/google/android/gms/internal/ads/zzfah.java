package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfah implements OnAdMetadataChangedListener, zzcwi, zzcwl, zzcwy, zzcxw, zzcyt, zzddw, zzeys {
    private final zzfdj zza;
    private final AtomicReference zzb;
    private final AtomicReference zzc;
    private final AtomicReference zzd;
    private final AtomicReference zze;
    private final AtomicReference zzf;
    private final AtomicReference zzg;
    private final AtomicReference zzh;

    public zzfah(zzfdj zzfdj0) {
        this.zzb = new AtomicReference();
        this.zzc = new AtomicReference();
        this.zzd = new AtomicReference();
        this.zze = new AtomicReference();
        this.zzf = new AtomicReference();
        this.zzg = new AtomicReference();
        this.zzh = new AtomicReference();
        this.zza = zzfdj0;
    }

    @Override  // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzeyj.zza(this.zzb, (zzfab this) -> ((OnAdMetadataChangedListener)object0).onAdMetadataChanged());
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
        this.zza.zza();
        zzeyj.zza(this.zzd, (zzezt this) -> ((zzbvz)object0).zzg());
        zzeyj.zza(this.zze, (zzezu this) -> ((zzbvj)object0).zzf());
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
        zzeyj.zza(this.zze, (zzfac this) -> ((zzbvj)object0).zzh());
    }

    @Override  // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(zze zze0) {
        zzezn zzezn0 = new zzezn(zze0);
        zzeyj.zza(this.zzc, zzezn0);
        zzezo zzezo0 = new zzezo(zze0.zza);
        zzeyj.zza(this.zzc, zzezo0);
        zzezp zzezp0 = new zzezp(zze0.zza);
        zzeyj.zza(this.zze, zzezp0);
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        zzeyj.zza(this.zzd, (zzezl this) -> ((zzbvz)object0).zze());
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzbw(zzbvd zzbvd0, String s, String s1) {
        zzfad zzfad0 = new zzfad(zzbvd0);
        zzeyj.zza(this.zzd, zzfad0);
        zzfae zzfae0 = new zzfae(zzbvd0, s, s1);
        zzeyj.zza(this.zzf, zzfae0);
        zzfaf zzfaf0 = new zzfaf(zzbvd0);
        zzeyj.zza(this.zze, zzfaf0);
        zzfag zzfag0 = new zzfag(zzbvd0, s, s1);
        zzeyj.zza(this.zzg, zzfag0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
        zzeyj.zza(this.zzd, (zzezv this) -> ((zzbvz)object0).zzj());
        zzeyj.zza(this.zze, (zzezx this) -> ((zzbvj)object0).zzj());
        zzeyj.zza(this.zzd, (zzezy this) -> ((zzbvz)object0).zzf());
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
        zzeyj.zza(this.zze, (zzezs this) -> ((zzbvj)object0).zzk());
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
        zzeyj.zza(this.zze, (zzezw this) -> ((zzbvj)object0).zzl());
    }

    public final void zzg(OnAdMetadataChangedListener onAdMetadataChangedListener0) {
        this.zzb.set(onAdMetadataChangedListener0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcyt
    public final void zzh(zzs zzs0) {
        zzezm zzezm0 = new zzezm(zzs0);
        zzeyj.zza(this.zzh, zzezm0);
    }

    public final void zzi(zzdg zzdg0) {
        this.zzh.set(zzdg0);
    }

    public final void zzj(zzbvz zzbvz0) {
        this.zzd.set(zzbvz0);
    }

    public final void zzk(zzbwd zzbwd0) {
        this.zzc.set(zzbwd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzeys
    public final void zzl(zzeys zzeys0) {
        throw null;
    }

    @Deprecated
    public final void zzm(zzbvj zzbvj0) {
        this.zze.set(zzbvj0);
    }

    @Deprecated
    public final void zzn(zzbve zzbve0) {
        this.zzg.set(zzbve0);
    }

    public final void zzo(zzbwe zzbwe0) {
        this.zzf.set(zzbwe0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwy
    public final void zzp(zze zze0) {
        zzezq zzezq0 = new zzezq(zze0);
        zzeyj.zza(this.zzd, zzezq0);
        zzezr zzezr0 = new zzezr(zze0);
        zzeyj.zza(this.zzd, zzezr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        zzeyj.zza(this.zzc, (zzezz this) -> ((zzbwd)object0).zzg());
        zzeyj.zza(this.zze, (zzfaa this) -> ((zzbvj)object0).zzi());
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
    }
}

