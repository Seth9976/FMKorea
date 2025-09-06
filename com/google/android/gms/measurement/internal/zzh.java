package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

final class zzh {
    private final zzhf zza;
    private long zzaa;
    private long zzab;
    private long zzac;
    private long zzad;
    private long zzae;
    private long zzaf;
    private long zzag;
    private String zzah;
    private boolean zzai;
    private long zzaj;
    private long zzak;
    private final String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj;
    private long zzk;
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private String zzq;
    private Boolean zzr;
    private long zzs;
    private List zzt;
    private String zzu;
    private boolean zzv;
    private long zzw;
    private long zzx;
    private int zzy;
    private boolean zzz;

    zzh(zzhf zzhf0, String s) {
        Preconditions.checkNotNull(zzhf0);
        Preconditions.checkNotEmpty(s);
        this.zza = zzhf0;
        this.zzb = s;
        zzhf0.zzl().zzt();
    }

    public final int zza() {
        this.zza.zzl().zzt();
        return this.zzy;
    }

    public final void zza(int v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzy != v;
        this.zzy = v;
    }

    public final void zza(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzk != v;
        this.zzk = v;
    }

    public final void zza(Boolean boolean0) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zzr, boolean0);
        this.zzr = boolean0;
    }

    public final void zza(String s) {
        this.zza.zzl().zzt();
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.zzai |= !zzg.zza(this.zzq, s);
        this.zzq = s;
    }

    public final void zza(List list0) {
        this.zza.zzl().zzt();
        if(!zzg.zza(this.zzt, list0)) {
            this.zzai = true;
            this.zzt = list0 == null ? null : new ArrayList(list0);
        }
    }

    public final void zza(boolean z) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzp != z;
        this.zzp = z;
    }

    public final String zzaa() {
        this.zza.zzl().zzt();
        return this.zzj;
    }

    public final String zzab() {
        this.zza.zzl().zzt();
        return this.zzf;
    }

    public final String zzac() {
        this.zza.zzl().zzt();
        return this.zzd;
    }

    public final String zzad() {
        this.zza.zzl().zzt();
        return this.zzah;
    }

    public final String zzae() {
        this.zza.zzl().zzt();
        return this.zze;
    }

    public final String zzaf() {
        this.zza.zzl().zzt();
        return this.zzu;
    }

    public final List zzag() {
        this.zza.zzl().zzt();
        return this.zzt;
    }

    public final void zzah() {
        this.zza.zzl().zzt();
        this.zzai = false;
    }

    public final void zzai() {
        this.zza.zzl().zzt();
        long v = this.zzg + 1L;
        if(v > 0x7FFFFFFFL) {
            this.zza.zzj().zzu().zza("Bundle index overflow. appId", zzfr.zza(this.zzb));
            v = 0L;
        }
        this.zzai = true;
        this.zzg = v;
    }

    public final boolean zzaj() {
        this.zza.zzl().zzt();
        return this.zzp;
    }

    public final boolean zzak() {
        this.zza.zzl().zzt();
        return this.zzo;
    }

    public final boolean zzal() {
        this.zza.zzl().zzt();
        return this.zzai;
    }

    public final boolean zzam() {
        this.zza.zzl().zzt();
        return this.zzv;
    }

    public final boolean zzan() {
        this.zza.zzl().zzt();
        return this.zzz;
    }

    public final long zzb() {
        this.zza.zzl().zzt();
        return 0L;
    }

    public final void zzb(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzaa != v;
        this.zzaa = v;
    }

    public final void zzb(String s) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zzc, s);
        this.zzc = s;
    }

    public final void zzb(boolean z) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzo != z;
        this.zzo = z;
    }

    public final long zzc() {
        this.zza.zzl().zzt();
        return this.zzk;
    }

    public final void zzc(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzaj != v;
        this.zzaj = v;
    }

    public final void zzc(String s) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zzl, s);
        this.zzl = s;
    }

    public final void zzc(boolean z) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzv != z;
        this.zzv = z;
    }

    public final long zzd() {
        this.zza.zzl().zzt();
        return this.zzaa;
    }

    public final void zzd(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzae != v;
        this.zzae = v;
    }

    public final void zzd(String s) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zzj, s);
        this.zzj = s;
    }

    public final void zzd(boolean z) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzz != z;
        this.zzz = z;
    }

    public final long zze() {
        this.zza.zzl().zzt();
        return this.zzaj;
    }

    public final void zze(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzaf != v;
        this.zzaf = v;
    }

    public final void zze(String s) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zzf, s);
        this.zzf = s;
    }

    public final long zzf() {
        this.zza.zzl().zzt();
        return this.zzae;
    }

    public final void zzf(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzad != v;
        this.zzad = v;
    }

    public final void zzf(String s) {
        this.zza.zzl().zzt();
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.zzai |= !zzg.zza(this.zzd, s);
        this.zzd = s;
    }

    public final long zzg() {
        this.zza.zzl().zzt();
        return this.zzaf;
    }

    public final void zzg(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzac != v;
        this.zzac = v;
    }

    public final void zzg(String s) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zzah, s);
        this.zzah = s;
    }

    public final long zzh() {
        this.zza.zzl().zzt();
        return this.zzad;
    }

    public final void zzh(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzag != v;
        this.zzag = v;
    }

    public final void zzh(String s) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zze, s);
        this.zze = s;
    }

    public final long zzi() {
        this.zza.zzl().zzt();
        return this.zzac;
    }

    public final void zzi(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzab != v;
        this.zzab = v;
    }

    public final void zzi(String s) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zzu, s);
        this.zzu = s;
    }

    public final long zzj() {
        this.zza.zzl().zzt();
        return this.zzag;
    }

    public final void zzj(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzn != v;
        this.zzn = v;
    }

    public final long zzk() {
        this.zza.zzl().zzt();
        return this.zzab;
    }

    public final void zzk(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzs != v;
        this.zzs = v;
    }

    public final long zzl() {
        this.zza.zzl().zzt();
        return this.zzn;
    }

    public final void zzl(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzak != v;
        this.zzak = v;
    }

    public final long zzm() {
        this.zza.zzl().zzt();
        return this.zzs;
    }

    public final void zzm(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzm != v;
        this.zzm = v;
    }

    public final long zzn() {
        this.zza.zzl().zzt();
        return this.zzak;
    }

    public final void zzn(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzi != v;
        this.zzi = v;
    }

    public final long zzo() {
        this.zza.zzl().zzt();
        return this.zzm;
    }

    public final void zzo(long v) {
        boolean z = false;
        Preconditions.checkArgument(Long.compare(v, 0L) >= 0);
        this.zza.zzl().zzt();
        boolean z1 = this.zzai;
        if(this.zzg != v) {
            z = true;
        }
        this.zzai = z1 | z;
        this.zzg = v;
    }

    public final long zzp() {
        this.zza.zzl().zzt();
        return this.zzi;
    }

    public final void zzp(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzh != v;
        this.zzh = v;
    }

    public final long zzq() {
        this.zza.zzl().zzt();
        return this.zzg;
    }

    public final void zzq(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzx != v;
        this.zzx = v;
    }

    public final long zzr() {
        this.zza.zzl().zzt();
        return this.zzh;
    }

    public final void zzr(long v) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzw != v;
        this.zzw = v;
    }

    public final long zzs() {
        this.zza.zzl().zzt();
        return this.zzx;
    }

    public final long zzt() {
        this.zza.zzl().zzt();
        return this.zzw;
    }

    public final Boolean zzu() {
        this.zza.zzl().zzt();
        return this.zzr;
    }

    public final String zzv() {
        this.zza.zzl().zzt();
        return this.zzq;
    }

    public final String zzw() {
        this.zza.zzl().zzt();
        String s = this.zzah;
        this.zzg(null);
        return s;
    }

    public final String zzx() {
        this.zza.zzl().zzt();
        return this.zzb;
    }

    public final String zzy() {
        this.zza.zzl().zzt();
        return this.zzc;
    }

    public final String zzz() {
        this.zza.zzl().zzt();
        return this.zzl;
    }
}

