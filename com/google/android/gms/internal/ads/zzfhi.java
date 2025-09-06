package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;

public final class zzfhi implements zzfhg {
    private final Context zza;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private boolean zzm;
    private boolean zzn;
    private final int zzo;
    private int zzp;
    private int zzq;

    zzfhi(Context context0, int v) {
        this.zzb = 0L;
        this.zzc = -1L;
        this.zzd = false;
        this.zzp = 2;
        this.zzq = 2;
        this.zze = 0;
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzl = "";
        this.zzm = false;
        this.zzn = false;
        this.zza = context0;
        this.zzo = v;
    }

    public final zzfhi zzH(int v) {
        synchronized(this) {
            this.zzp = v;
        }
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhg
    public final zzfhg zza(zze zze0) {
        this.zzq(zze0);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhg
    public final zzfhg zzb(zzfbq zzfbq0) {
        this.zzr(zzfbq0);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhg
    public final zzfhg zzc(String s) {
        this.zzs(s);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhg
    public final zzfhg zzd(String s) {
        this.zzt(s);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhg
    public final zzfhg zze(String s) {
        this.zzu(s);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhg
    public final zzfhg zzf(boolean z) {
        this.zzv(z);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhg
    public final zzfhg zzg(Throwable throwable0) {
        this.zzw(throwable0);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhg
    public final zzfhg zzh() {
        this.zzx();
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhg
    public final zzfhg zzi() {
        this.zzy();
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhg
    public final boolean zzj() {
        synchronized(this) {
        }
        return this.zzn;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhg
    public final boolean zzk() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override  // com.google.android.gms.internal.ads.zzfhg
    public final zzfhk zzl() {
        synchronized(this) {
            if(this.zzm) {
                return null;
            }
            this.zzm = true;
            if(!this.zzn) {
                this.zzx();
            }
            if(this.zzc < 0L) {
                this.zzy();
            }
            return new zzfhk(this, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfhg
    public final zzfhg zzm(int v) {
        this.zzH(v);
        return this;
    }

    public final zzfhi zzq(zze zze0) {
        synchronized(this) {
            IBinder iBinder0 = zze0.zze;
            if(iBinder0 == null) {
                return this;
            }
            String s = ((zzcwb)iBinder0).zzk();
            if(!TextUtils.isEmpty(s)) {
                this.zzf = s;
            }
            String s1 = ((zzcwb)iBinder0).zzi();
            if(!TextUtils.isEmpty(s1)) {
                this.zzg = s1;
            }
            return this;
        }
    }

    public final zzfhi zzr(zzfbq zzfbq0) {
        synchronized(this) {
            if(!TextUtils.isEmpty(zzfbq0.zzb.zzb)) {
                this.zzf = zzfbq0.zzb.zzb;
            }
            for(Object object0: zzfbq0.zza) {
                zzfbe zzfbe0 = (zzfbe)object0;
                if(!TextUtils.isEmpty(zzfbe0.zzac)) {
                    this.zzg = zzfbe0.zzac;
                    break;
                }
                if(false) {
                    break;
                }
            }
            return this;
        }
    }

    public final zzfhi zzs(String s) {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zziu)).booleanValue()) {
                this.zzl = s;
            }
            return this;
        }
    }

    public final zzfhi zzt(String s) {
        synchronized(this) {
            this.zzh = s;
        }
        return this;
    }

    public final zzfhi zzu(String s) {
        synchronized(this) {
            this.zzi = s;
        }
        return this;
    }

    public final zzfhi zzv(boolean z) {
        synchronized(this) {
            this.zzd = z;
        }
        return this;
    }

    public final zzfhi zzw(Throwable throwable0) {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zziu)).booleanValue()) {
                this.zzk = zzbtf.zzd(throwable0);
                String s = zzbtf.zzc(throwable0);
                Object object0 = zzfrv.zzc(zzfqt.zzc('\n')).zzd(s).iterator().next();
                this.zzj = (String)object0;
            }
            return this;
        }
    }

    public final zzfhi zzx() {
        synchronized(this) {
            this.zze = zzt.zzq().zzn(this.zza);
            Resources resources0 = this.zza.getResources();
            int v1 = 2;
            if(resources0 != null) {
                Configuration configuration0 = resources0.getConfiguration();
                if(configuration0 != null) {
                    v1 = configuration0.orientation == 2 ? 4 : 3;
                }
            }
            this.zzq = v1;
            this.zzb = zzt.zzB().elapsedRealtime();
            this.zzn = true;
            return this;
        }
    }

    public final zzfhi zzy() {
        synchronized(this) {
            this.zzc = zzt.zzB().elapsedRealtime();
            return this;
        }
    }
}

