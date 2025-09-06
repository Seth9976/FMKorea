package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

public final class zzagc implements zzabb {
    public static final zzabi zza;
    private static final zzaep zzb;
    private final zzfb zzc;
    private final zzabu zzd;
    private final zzabq zze;
    private final zzabs zzf;
    private final zzace zzg;
    private zzabe zzh;
    private zzace zzi;
    private zzace zzj;
    private int zzk;
    private zzbz zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzage zzq;
    private boolean zzr;

    static {
        zzagc.zza = (Uri uri0, Map map0) -> new zzabb[]{new zzagc(0)};
        zzagc.zzb = zzagb.zza;
    }

    public zzagc() {
        this(0);
    }

    public zzagc(int v) {
        this.zzc = new zzfb(10);
        this.zzd = new zzabu();
        this.zze = new zzabq();
        this.zzm = 0x8000000000000001L;
        this.zzf = new zzabs();
        zzaba zzaba0 = new zzaba();
        this.zzg = zzaba0;
        this.zzj = zzaba0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        zzdy.zzb(this.zzi);
        int v = this.zzf(zzabc0);
        if(v == -1 && this.zzq instanceof zzafy) {
            long v1 = this.zzg(this.zzn);
            if(this.zzq.zze() != v1) {
                zzafy zzafy0 = (zzafy)this.zzq;
                throw null;
            }
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabe0) {
        this.zzh = zzabe0;
        zzace zzace0 = zzabe0.zzv(0, 1);
        this.zzi = zzace0;
        this.zzj = zzace0;
        this.zzh.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long v, long v1) {
        this.zzk = 0;
        this.zzm = 0x8000000000000001L;
        this.zzn = 0L;
        this.zzp = 0;
        if(this.zzq instanceof zzafy) {
            throw null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabc0) {
        return this.zzk(zzabc0, true);
    }

    public final void zze() {
        this.zzr = true;
    }

    private final int zzf(zzabc zzabc0) {
        long v9;
        zzage zzage0;
        int v2;
        int v1;
        if(this.zzk == 0) {
            try {
                this.zzk(zzabc0, false);
            }
            catch(EOFException unused_ex) {
                return -1;
            }
        }
        if(this.zzq == null) {
            zzfb zzfb0 = new zzfb(this.zzd.zzc);
            ((zzaar)zzabc0).zzm(zzfb0.zzI(), 0, this.zzd.zzc, false);
            zzabu zzabu0 = this.zzd;
            int v = 21;
            if((zzabu0.zza & 1) == 0) {
                if(zzabu0.zze == 1) {
                    v = 13;
                }
                v1 = v;
            }
            else if(zzabu0.zze != 1) {
                v1 = 36;
            }
            else {
                v1 = 21;
            }
            if(zzfb0.zzd() >= v1 + 4) {
                zzfb0.zzG(v1);
                switch(zzfb0.zzf()) {
                    case 0x496E666F: {
                        v2 = 0x496E666F;
                        break;
                    }
                    case 1483304551: {
                        v2 = 1483304551;
                        break;
                    }
                    default: {
                        goto label_26;
                    }
                }
            }
            else {
            label_26:
                if(zzfb0.zzd() >= 40) {
                    zzfb0.zzG(36);
                    v2 = zzfb0.zzf() == 1447187017 ? 1447187017 : 0;
                }
                else {
                    v2 = 0;
                }
            }
            if(v2 == 0x496E666F || v2 == 1483304551) {
                zzagg zzagg0 = zzagg.zza(zzabc0.zzd(), zzabc0.zzf(), this.zzd, zzfb0);
                if(zzagg0 != null && !this.zze.zza()) {
                    zzabc0.zzj();
                    ((zzaar)zzabc0).zzl(v1 + 0x8D, false);
                    ((zzaar)zzabc0).zzm(this.zzc.zzI(), 0, 3, false);
                    this.zzc.zzG(0);
                    zzabq zzabq0 = this.zze;
                    int v3 = this.zzc.zzn();
                    if(v3 >> 12 > 0 || (v3 & 0xFFF) > 0) {
                        zzabq0.zza = v3 >> 12;
                        zzabq0.zzb = v3 & 0xFFF;
                    }
                }
                ((zzaar)zzabc0).zzo(this.zzd.zzc, false);
                zzage0 = zzagg0 == null || zzagg0.zzh() || v2 != 0x496E666F ? zzagg0 : this.zzh(zzabc0, false);
            }
            else if(v2 == 1447187017) {
                zzage0 = zzagf.zza(zzabc0.zzd(), zzabc0.zzf(), this.zzd, zzfb0);
                ((zzaar)zzabc0).zzo(this.zzd.zzc, false);
            }
            else {
                zzabc0.zzj();
                zzage0 = null;
            }
            zzage zzage1 = null;
            zzbz zzbz0 = this.zzl;
            long v4 = zzabc0.zzf();
            if(zzbz0 != null) {
                int v5 = zzbz0.zza();
                for(int v6 = 0; v6 < v5; ++v6) {
                    zzby zzby0 = zzbz0.zzb(v6);
                    if(zzby0 instanceof zzaew) {
                        int v7 = zzbz0.zza();
                        for(int v8 = 0; true; ++v8) {
                            v9 = 0x8000000000000001L;
                            if(v8 >= v7) {
                                break;
                            }
                            zzby zzby1 = zzbz0.zzb(v8);
                            if(zzby1 instanceof zzafa && ((zzafa)zzby1).zzf.equals("TLEN")) {
                                v9 = zzfk.zzp(Long.parseLong(((String)((zzafa)zzby1).zzc.get(0))));
                                break;
                            }
                        }
                        zzage1 = zzafz.zza(v4, ((zzaew)zzby0), v9);
                        break;
                    }
                }
            }
            if(this.zzr) {
                zzage0 = new zzagd();
            }
            else {
                if(zzage1 != null) {
                    zzage0 = zzage1;
                }
                else if(zzage0 == null) {
                    zzage0 = null;
                }
                if(zzage0 == null) {
                    zzage0 = this.zzh(zzabc0, false);
                }
                else {
                    zzage0.zzh();
                }
            }
            this.zzq = zzage0;
            this.zzh.zzN(zzage0);
            zzace zzace0 = this.zzj;
            zzak zzak0 = new zzak();
            zzak0.zzS(this.zzd.zzb);
            zzak0.zzL(0x1000);
            zzak0.zzw(this.zzd.zze);
            zzak0.zzT(this.zzd.zzd);
            zzak0.zzC(this.zze.zza);
            zzak0.zzD(this.zze.zzb);
            zzak0.zzM(this.zzl);
            zzace0.zzk(zzak0.zzY());
            this.zzo = zzabc0.zzf();
        }
        else {
            long v10 = this.zzo;
            if(v10 != 0L) {
                long v11 = zzabc0.zzf();
                if(v11 < v10) {
                    ((zzaar)zzabc0).zzo(((int)(v10 - v11)), false);
                }
            }
        }
        int v12 = this.zzp;
        if(v12 == 0) {
            zzabc0.zzj();
            if(!this.zzj(zzabc0)) {
                this.zzc.zzG(0);
                int v13 = this.zzc.zzf();
                if(zzagc.zzi(v13, ((long)this.zzk)) && zzabv.zzb(v13) != -1) {
                    this.zzd.zza(v13);
                    if(this.zzm == 0x8000000000000001L) {
                        this.zzm = this.zzq.zzc(zzabc0.zzf());
                    }
                    int v14 = this.zzd.zzc;
                    this.zzp = v14;
                    if(this.zzq instanceof zzafy) {
                        throw null;
                    }
                    v12 = v14;
                    goto label_132;
                }
                ((zzaar)zzabc0).zzo(1, false);
                this.zzk = 0;
                return 0;
            }
        }
        else {
        label_132:
            int v15 = this.zzj.zze(zzabc0, v12, true);
            if(v15 != -1) {
                int v16 = this.zzp - v15;
                this.zzp = v16;
                if(v16 > 0) {
                    return 0;
                }
                this.zzj.zzs(this.zzg(this.zzn), 1, this.zzd.zzc, 0, null);
                this.zzn += (long)this.zzd.zzg;
                this.zzp = 0;
                return 0;
            }
        }
        return -1;
    }

    private final long zzg(long v) {
        return this.zzm + v * 1000000L / ((long)this.zzd.zzd);
    }

    private final zzage zzh(zzabc zzabc0, boolean z) {
        ((zzaar)zzabc0).zzm(this.zzc.zzI(), 0, 4, false);
        this.zzc.zzG(0);
        int v = this.zzc.zzf();
        this.zzd.zza(v);
        return new zzafx(zzabc0.zzd(), zzabc0.zzf(), this.zzd, false);
    }

    private static boolean zzi(int v, long v1) {
        return ((long)(v & 0xFFFE0C00)) == (v1 & 0xFFFFFFFFFFFE0C00L);
    }

    private final boolean zzj(zzabc zzabc0) {
        zzage zzage0 = this.zzq;
        if(zzage0 != null) {
            long v = zzage0.zzb();
            if(v != -1L && zzabc0.zze() > v - 4L) {
                return true;
            }
        }
        try {
            return !zzabc0.zzm(this.zzc.zzI(), 0, 4, true);
        }
        catch(EOFException unused_ex) {
            return true;
        }
    }

    private final boolean zzk(zzabc zzabc0, boolean z) {
        int v1;
        int v;
        zzabc0.zzj();
        if(Long.compare(zzabc0.zzf(), 0L) == 0) {
            zzbz zzbz0 = this.zzf.zza(zzabc0, null);
            this.zzl = zzbz0;
            if(zzbz0 != null) {
                this.zze.zzb(zzbz0);
            }
            v = (int)zzabc0.zze();
            if(!z) {
                ((zzaar)zzabc0).zzo(v, false);
            }
        }
        else {
            v = 0;
        }
        v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(true) {
            if(this.zzj(zzabc0)) {
                if(v2 <= 0) {
                    throw new EOFException();
                }
                goto label_29;
            }
            this.zzc.zzG(0);
            int v4 = this.zzc.zzf();
            if(v1 == 0 || zzagc.zzi(v4, ((long)v1))) {
                int v5 = zzabv.zzb(v4);
                if(v5 != -1) {
                    ++v2;
                    if(v2 == 1) {
                        this.zzd.zza(v4);
                        v1 = v4;
                    }
                    else if(v2 == 4) {
                        goto label_29;
                    }
                    ((zzaar)zzabc0).zzl(v5 - 4, false);
                    continue;
                label_29:
                    if(z) {
                        ((zzaar)zzabc0).zzo(v + v3, false);
                    }
                    else {
                        zzabc0.zzj();
                    }
                    this.zzk = v1;
                    return true;
                }
            }
            if(v3 == (z ? 0x8000 : 0x20000)) {
                if(!z) {
                    throw zzcd.zza("Searched too many bytes.", null);
                }
                return false;
            }
            if(z) {
                zzabc0.zzj();
                ((zzaar)zzabc0).zzl(v + (v3 + 1), false);
            }
            else {
                ((zzaar)zzabc0).zzo(1, false);
            }
            v1 = 0;
            ++v3;
            v2 = 0;
        }
    }
}

