package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

public final class zzcdd implements zzgi {
    private final Context zza;
    private final zzgi zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzawq zzi;
    private boolean zzj;
    private boolean zzk;
    private final AtomicLong zzl;
    private zzgn zzm;

    public zzcdd(Context context0, zzgi zzgi0, String s, int v, zzhk zzhk0, zzcdc zzcdc0) {
        this.zza = context0;
        this.zzb = zzgi0;
        this.zzc = s;
        this.zzd = v;
        this.zzj = false;
        this.zzk = false;
        this.zzl = new AtomicLong(-1L);
        this.zze = ((Boolean)zzba.zzc().zzb(zzbbr.zzbN)).booleanValue();
    }

    @Override  // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] arr_b, int v, int v1) {
        if(!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream0 = this.zzf;
        return inputStream0 == null ? this.zzb.zza(arr_b, v, v1) : inputStream0.read(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgn0) {
        if(this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        this.zzh = zzgn0.zza;
        this.zzm = zzgn0;
        this.zzi = zzawq.zza(zzgn0.zza);
        zzawn zzawn0 = null;
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzee)).booleanValue()) {
            if(this.zzi != null) {
                this.zzi.zzh = zzgn0.zzf;
                this.zzi.zzi = zzfrx.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzawn0 = zzt.zzc().zzb(this.zzi);
            }
            if(zzawn0 != null && zzawn0.zze()) {
                this.zzj = zzawn0.zzg();
                this.zzk = zzawn0.zzf();
                if(!this.zzg()) {
                    this.zzf = zzawn0.zzc();
                    return -1L;
                }
            }
        }
        else if(this.zzi != null) {
            this.zzi.zzh = zzgn0.zzf;
            this.zzi.zzi = zzfrx.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            long v = (long)(this.zzi.zzg ? ((Long)zzba.zzc().zzb(zzbbr.zzeg)) : ((Long)zzba.zzc().zzb(zzbbr.zzef)));
            zzt.zzB().elapsedRealtime();
            Future future0 = zzaxb.zza(this.zza, this.zzi);
            try {
                try {
                    zzaxc zzaxc0 = (zzaxc)future0.get(v, TimeUnit.MILLISECONDS);
                    this.zzj = zzaxc0.zzf();
                    this.zzk = zzaxc0.zze();
                    if(!this.zzg()) {
                        this.zzf = zzaxc0.zzc();
                        goto label_29;
                    }
                    goto label_31;
                }
                catch(ExecutionException | TimeoutException unused_ex) {
                }
                catch(InterruptedException unused_ex) {
                    goto label_23;
                }
                future0.cancel(false);
            }
            catch(Throwable unused_ex) {
                zzt.zzB().elapsedRealtime();
                throw null;
            }
            zzt.zzB().elapsedRealtime();
            throw null;
            try {
            label_23:
                future0.cancel(false);
                Thread.currentThread().interrupt();
            }
            catch(Throwable unused_ex) {
                zzt.zzB().elapsedRealtime();
                throw null;
            }
            zzt.zzB().elapsedRealtime();
            throw null;
        label_29:
            zzt.zzB().elapsedRealtime();
            throw null;
        label_31:
            zzt.zzB().elapsedRealtime();
            throw null;
        }
        if(this.zzi != null) {
            this.zzm = new zzgn(Uri.parse(this.zzi.zza), null, zzgn0.zze, zzgn0.zzf, zzgn0.zzg, null, zzgn0.zzi);
        }
        return this.zzb.zzb(this.zzm);
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzh;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        if(!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream0 = this.zzf;
        if(inputStream0 != null) {
            IOUtils.closeQuietly(inputStream0);
            this.zzf = null;
            return;
        }
        this.zzb.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Map zze() {
        return Collections.emptyMap();
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzf(zzhk zzhk0) {
    }

    private final boolean zzg() {
        if(!this.zze) {
            return false;
        }
        return !((Boolean)zzba.zzc().zzb(zzbbr.zzeh)).booleanValue() || this.zzj ? ((Boolean)zzba.zzc().zzb(zzbbr.zzei)).booleanValue() && !this.zzk : true;
    }
}

