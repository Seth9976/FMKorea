package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

public final class zzny implements zzlx {
    private final zzdz zza;
    private final zzct zzb;
    private final zzcv zzc;
    private final zznx zzd;
    private final SparseArray zze;
    private zzep zzf;
    private zzcp zzg;
    private zzej zzh;
    private boolean zzi;

    public zzny(zzdz zzdz0) {
        zzdz0.getClass();
        this.zza = zzdz0;
        this.zzf = new zzep(zzfk.zzv(), zzdz0, (Object object0, zzah zzah0) -> zzma zzma0 = (zzma)object0);
        zzct zzct0 = new zzct();
        this.zzb = zzct0;
        this.zzc = new zzcv();
        this.zzd = new zznx(zzct0);
        this.zze = new SparseArray();
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzA(zzam zzam0, zzie zzie0) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 1009, new zznl(zzly0, zzam0, zzie0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzB(long v) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 1010, new zzno(zzly0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzC(Exception exception0) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 0x3F6, new zzml(zzly0, exception0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzD(int v, long v1, long v2) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 0x3F3, new zzme(zzly0, v, v1, v2));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzE(int v, long v1) {
        zzly zzly0 = this.zzZ();
        this.zzW(zzly0, 0x3FA, new zzmw(zzly0, v, v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzF(Object object0, long v) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 26, new zzns(zzly0, object0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzG(Exception exception0) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 1030, new zzmj(zzly0, exception0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzH(String s, long v, long v1) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 0x3F8, new zzms(zzly0, s, v1, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzI(String s) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 0x3FB, new zzmd(zzly0, s));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzJ(zzid zzid0) {
        zzly zzly0 = this.zzZ();
        this.zzW(zzly0, 1020, new zznr(zzly0, zzid0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzK(zzid zzid0) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 0x3F7, new zzmx(zzly0, zzid0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzL(long v, int v1) {
        zzly zzly0 = this.zzZ();
        this.zzW(zzly0, 0x3FD, new zzmn(zzly0, v, v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzM(zzam zzam0, zzie zzie0) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 0x3F9, new zzmc(zzly0, zzam0, zzie0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzN() {
        zzej zzej0 = this.zzh;
        zzdy.zzb(zzej0);
        zzej0.zzh(() -> {
            zzly zzly0 = this.zzR();
            this.zzW(zzly0, 0x404, new zzmt(zzly0));
            this.zzf.zze();
        });
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzO(zzma zzma0) {
        this.zzf.zzf(zzma0);
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzP(zzcp zzcp0, Looper looper0) {
        zzdy.zzf(this.zzg == null || this.zzd.zzb.isEmpty());
        zzcp0.getClass();
        this.zzg = zzcp0;
        this.zzh = this.zza.zzb(looper0, null);
        this.zzf = this.zzf.zza(looper0, (zzma zzma0, zzah zzah0) -> zzma0.zzi(zzcp0, new zzlz(zzah0, this.zze)));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzQ(List list0, zzts zzts0) {
        zzcp zzcp0 = this.zzg;
        zzcp0.getClass();
        this.zzd.zzh(list0, zzts0, zzcp0);
    }

    protected final zzly zzR() {
        return this.zzX(this.zzd.zzb());
    }

    protected final zzly zzS(zzcw zzcw0, int v, zzts zzts0) {
        boolean z = true;
        zzts zzts1 = zzcw0.zzo() ? null : zzts0;
        long v1 = this.zza.zza();
        if(!zzcw0.equals(this.zzg.zzn()) || v != this.zzg.zzd()) {
            z = false;
        }
        long v2 = 0L;
        if(zzts1 == null || !zzts1.zzb()) {
            if(z) {
                v2 = this.zzg.zzj();
            }
            else if(!zzcw0.zzo()) {
                zzcw0.zze(v, this.zzc, 0L);
                v2 = zzfk.zzr(0L);
            }
        }
        else if(z && this.zzg.zzb() == zzts1.zzb && this.zzg.zzc() == zzts1.zzc) {
            v2 = this.zzg.zzk();
        }
        zzcw zzcw1 = this.zzg.zzn();
        int v3 = this.zzg.zzd();
        long v4 = this.zzg.zzk();
        long v5 = this.zzg.zzm();
        return new zzly(v1, zzcw0, v, zzts1, v2, zzcw1, v3, this.zzd.zzb(), v4, v5);
    }

    // 检测为 Lambda 实现
    public static void zzT(zzny zzny0) [...]

    // 检测为 Lambda 实现
    final void zzU(zzcp zzcp0, zzma zzma0, zzah zzah0) [...]

    @Override  // com.google.android.gms.internal.ads.zzxs
    public final void zzV(int v, long v1, long v2) {
        zzly zzly0 = this.zzX(this.zzd.zzc());
        this.zzW(zzly0, 1006, new zzmk(zzly0, v, v1, v2));
    }

    protected final void zzW(zzly zzly0, int v, zzem zzem0) {
        this.zze.put(v, zzly0);
        zzep zzep0 = this.zzf;
        zzep0.zzd(v, zzem0);
        zzep0.zzc();
    }

    private final zzly zzX(zzts zzts0) {
        this.zzg.getClass();
        zzcw zzcw0 = zzts0 == null ? null : this.zzd.zza(zzts0);
        if(zzts0 != null && zzcw0 != null) {
            return this.zzS(zzcw0, zzcw0.zzn(zzts0.zza, this.zzb).zzd, zzts0);
        }
        int v = this.zzg.zzd();
        zzcw zzcw1 = this.zzg.zzn();
        if(v >= zzcw1.zzc()) {
            zzcw1 = zzcw.zza;
        }
        return this.zzS(zzcw1, v, null);
    }

    private final zzly zzY(int v, zzts zzts0) {
        zzcp zzcp0 = this.zzg;
        zzcp0.getClass();
        if(zzts0 != null) {
            return this.zzd.zza(zzts0) == null ? this.zzS(zzcw.zza, v, zzts0) : this.zzX(zzts0);
        }
        zzcw zzcw0 = zzcp0.zzn();
        if(v >= zzcw0.zzc()) {
            zzcw0 = zzcw.zza;
        }
        return this.zzS(zzcw0, v, null);
    }

    private final zzly zzZ() {
        return this.zzX(this.zzd.zzd());
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zza(zzcl zzcl0) {
        zzly zzly0 = this.zzR();
        this.zzW(zzly0, 13, new zzmo(zzly0, zzcl0));
    }

    private final zzly zzaa() {
        return this.zzX(this.zzd.zze());
    }

    private final zzly zzab(zzcf zzcf0) {
        if(zzcf0 instanceof zzil) {
            zzbw zzbw0 = ((zzil)zzcf0).zzj;
            return zzbw0 == null ? this.zzR() : this.zzX(new zzts(zzbw0));
        }
        return this.zzR();
    }

    @Override  // com.google.android.gms.internal.ads.zzuc
    public final void zzac(int v, zzts zzts0, zzto zzto0) {
        zzly zzly0 = this.zzY(v, zzts0);
        this.zzW(zzly0, 1004, new zzmi(zzly0, zzto0));
    }

    @Override  // com.google.android.gms.internal.ads.zzuc
    public final void zzad(int v, zzts zzts0, zztj zztj0, zzto zzto0) {
        zzly zzly0 = this.zzY(v, zzts0);
        this.zzW(zzly0, 1002, new zzmy(zzly0, zztj0, zzto0));
    }

    @Override  // com.google.android.gms.internal.ads.zzuc
    public final void zzae(int v, zzts zzts0, zztj zztj0, zzto zzto0) {
        zzly zzly0 = this.zzY(v, zzts0);
        this.zzW(zzly0, 1001, new zzni(zzly0, zztj0, zzto0));
    }

    @Override  // com.google.android.gms.internal.ads.zzuc
    public final void zzaf(int v, zzts zzts0, zztj zztj0, zzto zzto0, IOException iOException0, boolean z) {
        zzly zzly0 = this.zzY(v, zzts0);
        this.zzW(zzly0, 1003, new zzmu(zzly0, zztj0, zzto0, iOException0, z));
    }

    @Override  // com.google.android.gms.internal.ads.zzuc
    public final void zzag(int v, zzts zzts0, zztj zztj0, zzto zzto0) {
        zzly zzly0 = this.zzY(v, zzts0);
        this.zzW(zzly0, 1000, new zznd(zzly0, zztj0, zzto0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzb(boolean z) {
        zzly zzly0 = this.zzR();
        this.zzW(zzly0, 3, new zznv(zzly0, z));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzc(boolean z) {
        zzly zzly0 = this.zzR();
        this.zzW(zzly0, 7, new zzne(zzly0, z));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzd(zzbp zzbp0, int v) {
        zzly zzly0 = this.zzR();
        this.zzW(zzly0, 1, new zznh(zzly0, zzbp0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zze(zzbv zzbv0) {
        zzly zzly0 = this.zzR();
        this.zzW(zzly0, 14, new zznk(zzly0, zzbv0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzf(boolean z, int v) {
        zzly zzly0 = this.zzR();
        this.zzW(zzly0, 5, new zznc(zzly0, z, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzg(zzch zzch0) {
        zzly zzly0 = this.zzR();
        this.zzW(zzly0, 12, new zzmg(zzly0, zzch0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzh(int v) {
        zzly zzly0 = this.zzR();
        this.zzW(zzly0, 4, new zzng(zzly0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzi(int v) {
        zzly zzly0 = this.zzR();
        this.zzW(zzly0, 6, new zznu(zzly0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzj(zzcf zzcf0) {
        zzly zzly0 = this.zzab(zzcf0);
        this.zzW(zzly0, 10, new zzmz(zzly0, zzcf0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzk(zzcf zzcf0) {
        zzly zzly0 = this.zzab(zzcf0);
        this.zzW(zzly0, 10, new zznj(zzly0, zzcf0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzl(boolean z, int v) {
        zzly zzly0 = this.zzR();
        this.zzW(zzly0, -1, new zzmb(zzly0, z, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzm(zzco zzco0, zzco zzco1, int v) {
        if(v == 1) {
            this.zzi = false;
            v = 1;
        }
        zzcp zzcp0 = this.zzg;
        zzcp0.getClass();
        this.zzd.zzg(zzcp0);
        zzly zzly0 = this.zzR();
        this.zzW(zzly0, 11, new zzmm(zzly0, v, zzco0, zzco1));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzn(boolean z) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 23, new zznf(zzly0, z));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzo(int v, int v1) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 24, new zznt(zzly0, v, v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzp(zzcw zzcw0, int v) {
        zzcp zzcp0 = this.zzg;
        zzcp0.getClass();
        this.zzd.zzi(zzcp0);
        zzly zzly0 = this.zzR();
        this.zzW(zzly0, 0, new zzmv(zzly0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzq(zzdh zzdh0) {
        zzly zzly0 = this.zzR();
        this.zzW(zzly0, 2, new zzmp(zzly0, zzdh0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzr(zzdn zzdn0) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 25, new zznq(zzly0, zzdn0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcm
    public final void zzs(float f) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 22, new zzmf(zzly0, f));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzt(zzma zzma0) {
        this.zzf.zzb(zzma0);
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzu() {
        if(!this.zzi) {
            zzly zzly0 = this.zzR();
            this.zzi = true;
            this.zzW(zzly0, -1, new zznp(zzly0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzv(Exception exception0) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 0x405, new zzmq(zzly0, exception0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzw(String s, long v, long v1) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 0x3F0, new zzna(zzly0, s, v1, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzx(String s) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 0x3F4, new zznw(zzly0, s));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzy(zzid zzid0) {
        zzly zzly0 = this.zzZ();
        this.zzW(zzly0, 0x3F5, new zznm(zzly0, zzid0));
    }

    @Override  // com.google.android.gms.internal.ads.zzlx
    public final void zzz(zzid zzid0) {
        zzly zzly0 = this.zzaa();
        this.zzW(zzly0, 1007, new zznb(zzly0, zzid0));
    }
}

