package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Map;

public final class zzacm implements zzabb {
    public static final zzabi zza;
    private static final int[] zzb;
    private static final int[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzabe zzp;
    private zzace zzq;
    private zzaca zzr;
    private boolean zzs;

    static {
        zzacm.zza = (Uri uri0, Map map0) -> new zzabb[]{new zzacm(0)};
        zzacm.zzb = new int[]{13, 14, 16, 18, 20, 21, 27, 0x20, 6, 7, 6, 6, 1, 1, 1, 1};
        zzacm.zzc = new int[]{18, 24, 33, 37, 41, 0x2F, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzacm.zzd = "#!AMR\n".getBytes(zzfqu.zzc);
        zzacm.zze = "#!AMR-WB\n".getBytes(zzfqu.zzc);
        zzacm.zzf = 61;
    }

    public zzacm() {
        this(0);
    }

    public zzacm(int v) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        zzdy.zzb(this.zzq);
        if(zzabc0.zzf() == 0L && !this.zzg(zzabc0)) {
            throw zzcd.zza("Could not find AMR header.", null);
        }
        if(!this.zzs) {
            this.zzs = true;
            boolean z = this.zzh;
            zzace zzace0 = this.zzq;
            zzak zzak0 = new zzak();
            zzak0.zzS((z ? "audio/amr-wb" : "audio/3gpp"));
            zzak0.zzL(zzacm.zzf);
            zzak0.zzw(1);
            zzak0.zzT((z ? 16000 : 8000));
            zzace0.zzk(zzak0.zzY());
        }
        int v = this.zze(zzabc0);
        if(this.zzl) {
            return v;
        }
        zzabz zzabz0 = new zzabz(0x8000000000000001L, 0L);
        this.zzr = zzabz0;
        this.zzp.zzN(zzabz0);
        this.zzl = true;
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabe0) {
        this.zzp = zzabe0;
        this.zzq = zzabe0.zzv(0, 1);
        zzabe0.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long v, long v1) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabc0) {
        return this.zzg(zzabc0);
    }

    private final int zze(zzabc zzabc0) {
        int v3;
        int v = this.zzk;
        if(v == 0) {
            try {
                zzabc0.zzj();
                ((zzaar)zzabc0).zzm(this.zzg, 0, 1, false);
                int v1 = this.zzg[0];
                if((v1 & 0x83) > 0) {
                    throw zzcd.zza(("Invalid padding bits for frame header " + v1), null);
                }
                String s = "WB";
                boolean z = this.zzh;
                int v2 = v1 >> 3 & 15;
                if((!z || v2 >= 10 && v2 <= 13) && (z || v2 >= 12 && v2 <= 14)) {
                    if(!z) {
                        s = "NB";
                    }
                    throw zzcd.zza(("Illegal AMR " + s + " frame type " + v2), null);
                }
                v = z ? zzacm.zzc[v2] : zzacm.zzb[v2];
                this.zzj = v;
                this.zzk = v;
                v3 = this.zzm;
            }
            catch(EOFException unused_ex) {
                return -1;
            }
            if(v3 == -1) {
                this.zzm = v;
                v3 = v;
            }
            if(v3 == v) {
                ++this.zzn;
            }
        }
        int v4 = zzacc.zza(this.zzq, zzabc0, v, true);
        if(v4 == -1) {
            return -1;
        }
        int v5 = this.zzk - v4;
        this.zzk = v5;
        if(v5 > 0) {
            return 0;
        }
        this.zzq.zzs(this.zzi, 1, this.zzj, 0, null);
        this.zzi += 20000L;
        return 0;
    }

    private static boolean zzf(zzabc zzabc0, byte[] arr_b) {
        zzabc0.zzj();
        byte[] arr_b1 = new byte[arr_b.length];
        ((zzaar)zzabc0).zzm(arr_b1, 0, arr_b.length, false);
        return Arrays.equals(arr_b1, arr_b);
    }

    private final boolean zzg(zzabc zzabc0) {
        byte[] arr_b = zzacm.zzd;
        if(zzacm.zzf(zzabc0, arr_b)) {
            this.zzh = false;
            ((zzaar)zzabc0).zzo(arr_b.length, false);
            return true;
        }
        byte[] arr_b1 = zzacm.zze;
        if(zzacm.zzf(zzabc0, arr_b1)) {
            this.zzh = true;
            ((zzaar)zzabc0).zzo(arr_b1.length, false);
            return true;
        }
        return false;
    }
}

