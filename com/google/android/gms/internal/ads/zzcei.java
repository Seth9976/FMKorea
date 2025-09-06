package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

public final class zzcei extends zzgc {
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
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private d zzo;
    private final AtomicLong zzp;
    private final zzcel zzq;

    public zzcei(Context context0, zzgi zzgi0, String s, int v, zzhk zzhk0, zzcel zzcel0) {
        super(false);
        this.zza = context0;
        this.zzb = zzgi0;
        this.zzq = zzcel0;
        this.zzc = s;
        this.zzd = v;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean)zzba.zzc().zzb(zzbbr.zzbN)).booleanValue();
        this.zzf(zzhk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] arr_b, int v, int v1) {
        if(!this.zzg) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream0 = this.zzf;
        int v2 = inputStream0 == null ? this.zzb.zza(arr_b, v, v1) : inputStream0.read(arr_b, v, v1);
        if(!this.zze || this.zzf != null) {
            this.zzg(v2);
        }
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgn0) {
        boolean z1;
        zzaxc zzaxc0;
        zzawn zzawn0;
        if(this.zzg) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z = true;
        this.zzg = true;
        this.zzh = zzgn0.zza;
        if(!this.zze) {
            this.zzj(zzgn0);
        }
        this.zzi = zzawq.zza(zzgn0.zza);
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzee)).booleanValue()) {
            if(this.zzi == null) {
                zzawn0 = null;
            }
            else {
                this.zzi.zzh = zzgn0.zzf;
                this.zzi.zzi = zzfrx.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzawn0 = zzt.zzc().zzb(this.zzi);
            }
            if(zzawn0 != null && zzawn0.zze()) {
                this.zzj = zzawn0.zzd();
                this.zzl = zzawn0.zzg();
                this.zzm = zzawn0.zzf();
                this.zzn = zzawn0.zza();
                this.zzk = true;
                if(!this.zzr()) {
                    this.zzf = zzawn0.zzc();
                    if(this.zze) {
                        this.zzj(zzgn0);
                    }
                    return -1L;
                }
            }
        }
        else if(this.zzi != null) {
            this.zzi.zzh = zzgn0.zzf;
            this.zzi.zzi = zzfrx.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            long v = (long)(this.zzi.zzg ? ((Long)zzba.zzc().zzb(zzbbr.zzeg)) : ((Long)zzba.zzc().zzb(zzbbr.zzef)));
            long v1 = zzt.zzB().elapsedRealtime();
            Future future0 = zzaxb.zza(this.zza, this.zzi);
            try {
                zzaxc0 = (zzaxc)future0.get(v, TimeUnit.MILLISECONDS);
            }
            catch(ExecutionException | TimeoutException unused_ex) {
                z1 = false;
                goto label_34;
            }
            catch(InterruptedException unused_ex) {
                z1 = false;
                goto label_37;
            }
            catch(Throwable throwable0) {
                z = false;
                goto label_49;
            }
            try {
                this.zzj = zzaxc0.zzd();
                this.zzl = zzaxc0.zzf();
                this.zzm = zzaxc0.zze();
                this.zzn = zzaxc0.zza();
                if(!this.zzr()) {
                    this.zzf = zzaxc0.zzc();
                    if(this.zze) {
                        this.zzj(zzgn0);
                    }
                    goto label_54;
                }
                goto label_59;
            }
            catch(ExecutionException | TimeoutException unused_ex) {
            }
            catch(InterruptedException unused_ex) {
                goto label_36;
            }
            catch(Throwable throwable0) {
                goto label_49;
            }
            z1 = true;
            try {
            label_34:
                future0.cancel(true);
                goto label_43;
            label_36:
                z1 = true;
            label_37:
                future0.cancel(true);
                Thread.currentThread().interrupt();
            }
            catch(Throwable throwable0) {
                z = z1;
                goto label_49;
            }
        label_43:
            long v2 = zzt.zzB().elapsedRealtime() - v1;
            this.zzq.zza.zzab(z1, v2);
            this.zzk = z1;
            String s = "Cache connection took " + v2 + "ms";
            goto label_63;
        label_49:
            long v3 = zzt.zzB().elapsedRealtime() - v1;
            this.zzq.zza.zzab(z, v3);
            this.zzk = z;
            zze.zza(("Cache connection took " + v3 + "ms"));
            throw throwable0;
        label_54:
            long v4 = zzt.zzB().elapsedRealtime() - v1;
            this.zzq.zza.zzab(true, v4);
            this.zzk = true;
            zze.zza(("Cache connection took " + v4 + "ms"));
            return -1L;
        label_59:
            long v5 = zzt.zzB().elapsedRealtime() - v1;
            this.zzq.zza.zzab(true, v5);
            this.zzk = true;
            s = "Cache connection took " + v5 + "ms";
        label_63:
            zze.zza(s);
        }
        this.zzk = false;
        if(this.zzi != null) {
            zzgn0 = new zzgn(Uri.parse(this.zzi.zza), null, zzgn0.zze, zzgn0.zzf, zzgn0.zzg, null, zzgn0.zzi);
        }
        return this.zzb.zzb(zzgn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzh;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        if(!this.zzg) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        boolean z = false;
        this.zzg = false;
        this.zzh = null;
        if(!this.zze || this.zzf != null) {
            z = true;
        }
        InputStream inputStream0 = this.zzf;
        if(inputStream0 == null) {
            this.zzb.zzd();
        }
        else {
            IOUtils.closeQuietly(inputStream0);
            this.zzf = null;
        }
        if(z) {
            this.zzh();
        }
    }

    public final long zzk() {
        return this.zzn;
    }

    public final long zzl() {
        if(this.zzi == null) {
            return -1L;
        }
        if(this.zzp.get() != -1L) {
            return this.zzp.get();
        }
        synchronized(this) {
            if(this.zzo == null) {
                zzceh zzceh0 = () -> zzt.zzc().zza(this.zzi);
                this.zzo = zzcan.zza.zzb(zzceh0);
            }
        }
        if(!this.zzo.isDone()) {
            return -1L;
        }
        try {
            long v1 = (long)(((Long)this.zzo.get()));
            this.zzp.compareAndSet(-1L, v1);
            return this.zzp.get();
        }
        catch(ExecutionException | InterruptedException unused_ex) {
            return -1L;
        }
    }

    // 检测为 Lambda 实现
    final Long zzm() [...]

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }

    private final boolean zzr() {
        if(!this.zze) {
            return false;
        }
        return !((Boolean)zzba.zzc().zzb(zzbbr.zzeh)).booleanValue() || this.zzl ? ((Boolean)zzba.zzc().zzb(zzbbr.zzei)).booleanValue() && !this.zzm : true;
    }
}

