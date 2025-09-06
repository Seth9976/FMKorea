package com.google.android.gms.internal.ads;

final class zzagw {
    public final zzace zza;
    public final zzahi zzb;
    public final zzfb zzc;
    public zzahj zzd;
    public zzags zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzfb zzj;
    private final zzfb zzk;
    private boolean zzl;

    public zzagw(zzace zzace0, zzahj zzahj0, zzags zzags0) {
        this.zza = zzace0;
        this.zzd = zzahj0;
        this.zze = zzags0;
        this.zzb = new zzahi();
        this.zzc = new zzfb();
        this.zzj = new zzfb(1);
        this.zzk = new zzfb();
        this.zzh(zzahj0, zzags0);
    }

    public final int zza() {
        int v;
        if(!this.zzl) {
            v = this.zzd.zzg[this.zzf];
            return this.zzf() == null ? v : v | 0x40000000;
        }
        v = this.zzb.zzj[this.zzf] ? 1 : 0;
        return this.zzf() == null ? v : v | 0x40000000;
    }

    public final int zzb() {
        return this.zzl ? this.zzb.zzh[this.zzf] : this.zzd.zzd[this.zzf];
    }

    public final int zzc(int v, int v1) {
        zzfb zzfb0;
        zzahh zzahh0 = this.zzf();
        if(zzahh0 == null) {
            return 0;
        }
        int v2 = zzahh0.zzd;
        if(v2 == 0) {
            this.zzk.zzE(zzahh0.zze, zzahh0.zze.length);
            zzfb0 = this.zzk;
            v2 = zzahh0.zze.length;
        }
        else {
            zzfb0 = this.zzb.zzn;
        }
        boolean z = this.zzb.zzb(this.zzf);
        int v3 = !z && v1 == 0 ? 0 : 1;
        this.zzj.zzI()[0] = (byte)((1 == v3 ? 0x80 : 0) | v2);
        this.zzj.zzG(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzfb0, v2, 1);
        if(v3 == 0) {
            return v2 + 1;
        }
        if(!z) {
            this.zzc.zzD(8);
            byte[] arr_b = this.zzc.zzI();
            arr_b[0] = 0;
            arr_b[1] = 1;
            arr_b[2] = 0;
            arr_b[3] = (byte)v1;
            arr_b[4] = (byte)(v >> 24 & 0xFF);
            arr_b[5] = (byte)(v >> 16 & 0xFF);
            arr_b[6] = (byte)(v >> 8 & 0xFF);
            arr_b[7] = (byte)(v & 0xFF);
            this.zza.zzr(this.zzc, 8, 1);
            return v2 + 9;
        }
        zzfb zzfb1 = this.zzb.zzn;
        int v4 = zzfb1.zzp();
        zzfb1.zzH(-2);
        int v5 = v4 * 6 + 2;
        if(v1 != 0) {
            this.zzc.zzD(v5);
            byte[] arr_b1 = this.zzc.zzI();
            zzfb1.zzC(arr_b1, 0, v5);
            int v6 = ((arr_b1[2] & 0xFF) << 8 | arr_b1[3] & 0xFF) + v1;
            arr_b1[2] = (byte)(v6 >> 8 & 0xFF);
            arr_b1[3] = (byte)(v6 & 0xFF);
            zzfb1 = this.zzc;
        }
        this.zza.zzr(zzfb1, v5, 1);
        return v2 + 1 + v5;
    }

    public final long zzd() {
        return this.zzl ? this.zzb.zzf[this.zzh] : this.zzd.zzc[this.zzf];
    }

    public final long zze() {
        return this.zzl ? this.zzb.zzi[this.zzf] : this.zzd.zzf[this.zzf];
    }

    public final zzahh zzf() {
        if(!this.zzl) {
            return null;
        }
        zzahh zzahh0 = this.zzb.zzm == null ? this.zzd.zza.zza(this.zzb.zza.zza) : this.zzb.zzm;
        return zzahh0 == null || !zzahh0.zza ? null : zzahh0;
    }

    static void zzg(zzagw zzagw0, boolean z) {
        zzagw0.zzl = true;
    }

    public final void zzh(zzahj zzahj0, zzags zzags0) {
        this.zzd = zzahj0;
        this.zze = zzags0;
        this.zza.zzk(zzahj0.zza.zzf);
        this.zzi();
    }

    public final void zzi() {
        this.zzb.zzd = 0;
        this.zzb.zzp = 0L;
        this.zzb.zzq = false;
        this.zzb.zzk = false;
        this.zzb.zzo = false;
        this.zzb.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        ++this.zzf;
        if(!this.zzl) {
            return false;
        }
        int v = this.zzg + 1;
        this.zzg = v;
        int v1 = this.zzh;
        if(v == this.zzb.zzg[v1]) {
            this.zzh = v1 + 1;
            this.zzg = 0;
            return false;
        }
        return true;
    }
}

