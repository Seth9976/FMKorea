package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class zzcea extends zzcdu implements zzhk {
    private String zzd;
    private final zzcci zze;
    private boolean zzf;
    private final zzcdz zzg;
    private final zzcdf zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcea(zzccj zzccj0, zzcci zzcci0) {
        super(zzccj0);
        this.zze = zzcci0;
        this.zzg = new zzcdz();
        this.zzh = new zzcdf();
        this.zzk = new Object();
        this.zzl = (String)zzfre.zzd((zzccj0 == null ? null : zzccj0.zzbl())).zzb("");
        this.zzm = zzccj0 == null ? 0 : zzccj0.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzhk
    public final void zza(zzgi zzgi0, zzgn zzgn0, boolean z, int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzhk
    public final void zzb(zzgi zzgi0, zzgn zzgn0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzhk
    public final void zzc(zzgi zzgi0, zzgn zzgn0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzhk
    public final void zzd(zzgi zzgi0, zzgn zzgn0, boolean z) {
        if(zzgi0 instanceof zzgv) {
            this.zzg.zzb(((zzgv)zzgi0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcdu
    public final void zzf() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final ByteBuffer zzk() {
        synchronized(this.zzk) {
            ByteBuffer byteBuffer0 = this.zzi;
            if(byteBuffer0 != null && !this.zzj) {
                byteBuffer0.flip();
                this.zzj = true;
            }
            this.zzf = true;
            return this.zzi;
        }
    }

    public final boolean zzl() {
        return this.zzn;
    }

    protected static final String zzm(String s) {
        return "cache:" + zzbzt.zze(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcdu
    public final boolean zzt(String s) {
        String s2;
        long v2;
        this.zzd = s;
        String s1 = zzcea.zzm(s);
        try {
            zzgq zzgq0 = new zzgq();
            zzgq0.zzf(this.zzb);
            zzgq0.zzc(this.zze.zzd);
            zzgq0.zzd(this.zze.zzf);
            zzgq0.zzb(true);
            zzgq0.zze(this);
            zzgv zzgv0 = zzgq0.zzg();
            if(this.zze.zzj) {
                zzgv0 = new zzcdd(this.zza, zzgv0, this.zzl, this.zzm, null, null);
            }
            zzgv0.zzb(new zzgn(Uri.parse(s)));
            zzccj zzccj0 = (zzccj)this.zzc.get();
            if(zzccj0 != null) {
                zzccj0.zzt(s1, this);
            }
            Clock clock0 = zzt.zzB();
            long v = clock0.currentTimeMillis();
            long v1 = (long)(((Long)zzba.zzc().zzb(zzbbr.zzy)));
            v2 = (long)(((Long)zzba.zzc().zzb(zzbbr.zzx)));
            this.zzi = ByteBuffer.allocate(this.zze.zzc);
            byte[] arr_b = new byte[0x2000];
            long v3 = v;
            while(true) {
            label_22:
                int v4 = zzgv0.zza(arr_b, 0, Math.min(this.zzi.remaining(), 0x2000));
                if(v4 == -1) {
                    this.zzn = true;
                    this.zzj(s, s1, ((long)(((int)this.zzh.zza(this.zzi)))));
                    return true;
                }
                synchronized(this.zzk) {
                    if(!this.zzf) {
                        this.zzi.put(arr_b, 0, v4);
                    }
                }
                if(this.zzi.remaining() <= 0) {
                    this.zzv();
                    return true;
                }
                if(this.zzf) {
                    goto label_47;
                }
                long v6 = clock0.currentTimeMillis();
                if(v6 - v3 >= v1) {
                    this.zzv();
                    v3 = v6;
                }
                if(v6 - v > 1000L * v2) {
                    s2 = "downloadTimeout";
                    break;
                }
            }
        }
        catch(Exception exception0) {
            s2 = "error";
            goto label_54;
        }
        try {
            throw new IOException("Timeout exceeded. Limit: " + v2 + " sec");
        }
        catch(Exception exception0) {
            goto label_54;
        }
        goto label_22;
        try {
        label_47:
            s2 = "externalAbort";
        }
        catch(Exception exception0) {
            s2 = "error";
            goto label_54;
        }
        try {
            throw new IOException("Precache abort at " + this.zzi.limit() + " bytes");
        }
        catch(Exception exception0) {
        }
    label_54:
        String s3 = exception0.getClass().getCanonicalName() + ":" + exception0.getMessage();
        zzcaa.zzj(("Failed to preload url " + s + " Exception: " + s3));
        this.zzg(s, s1, s2, s3);
        return false;
    }

    private final void zzv() {
        int v = (int)this.zzg.zza();
        int v1 = (int)this.zzh.zza(this.zzi);
        int v2 = this.zzi.position();
        int v3 = Math.round(((float)v1) * (((float)v2) / ((float)v)));
        int v4 = zzcca.zzs();
        int v5 = zzcca.zzu();
        this.zzn(this.zzd, zzcea.zzm(this.zzd), v2, v, ((long)v3), ((long)v1), v3 > 0, v4, v5);
    }
}

