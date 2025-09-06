package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;

public final class zzfbb extends zzbvf {
    private final zzfar zza;
    private final zzfah zzb;
    private final zzfbs zzc;
    private zzdnq zzd;
    private boolean zze;

    public zzfbb(zzfar zzfar0, zzfah zzfah0, zzfbs zzfbs0) {
        this.zze = false;
        this.zza = zzfar0;
        this.zzb = zzfah0;
        this.zzc = zzfbs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdnq zzdnq0 = this.zzd;
        return zzdnq0 == null ? new Bundle() : zzdnq0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final zzdn zzc() {
        synchronized(this) {
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zzgF)).booleanValue()) {
                return null;
            }
            zzdnq zzdnq0 = this.zzd;
            return zzdnq0 != null ? zzdnq0.zzl() : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final String zzd() {
        synchronized(this) {
            zzdnq zzdnq0 = this.zzd;
            return zzdnq0 != null && zzdnq0.zzl() != null ? zzdnq0.zzl().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final void zze() {
        this.zzf(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final void zzf(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            Context context0 = null;
            this.zzb.zzg(null);
            if(this.zzd != null) {
                if(iObjectWrapper0 != null) {
                    context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
                }
                this.zzd.zzm().zza(context0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final void zzg(zzbvk zzbvk0) {
        synchronized(this) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            String s = zzbvk0.zzb;
            String s1 = (String)zzba.zzc().zzb(zzbbr.zzfk);
            if(s1 != null && s != null) {
                try {
                    if(Pattern.matches(s1, s)) {
                        return;
                    }
                }
                catch(RuntimeException runtimeException0) {
                    zzt.zzo().zzu(runtimeException0, "NonagonUtil.isPatternMatched");
                }
            }
            if(this.zzy() && !((Boolean)zzba.zzc().zzb(zzbbr.zzfm)).booleanValue()) {
                return;
            }
            zzfaj zzfaj0 = new zzfaj(null);
            this.zzd = null;
            this.zza.zzj(1);
            zzfaz zzfaz0 = new zzfaz(this);
            this.zza.zzb(zzbvk0.zza, zzbvk0.zzb, zzfaj0, zzfaz0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final void zzh() {
        this.zzi(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final void zzi(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            Preconditions.checkMainThread("pause must be called on the main UI thread.");
            if(this.zzd != null) {
                Context context0 = iObjectWrapper0 == null ? null : ((Context)ObjectWrapper.unwrap(iObjectWrapper0));
                this.zzd.zzm().zzb(context0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final void zzj() {
        this.zzk(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final void zzk(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            Preconditions.checkMainThread("resume must be called on the main UI thread.");
            if(this.zzd != null) {
                Context context0 = iObjectWrapper0 == null ? null : ((Context)ObjectWrapper.unwrap(iObjectWrapper0));
                this.zzd.zzm().zzc(context0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final void zzl(zzby zzby0) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if(zzby0 == null) {
            this.zzb.zzg(null);
            return;
        }
        zzfba zzfba0 = new zzfba(this, zzby0);
        this.zzb.zzg(zzfba0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final void zzm(String s) {
        synchronized(this) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
            this.zzc.zzb = s;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final void zzn(boolean z) {
        synchronized(this) {
            Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
            this.zze = z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final void zzo(zzbvj zzbvj0) {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbvj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final void zzp(String s) {
        synchronized(this) {
            Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
            this.zzc.zza = s;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final void zzq() {
        synchronized(this) {
            this.zzr(null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final void zzr(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            Activity activity0 = null;
            Preconditions.checkMainThread("showAd must be called on the main UI thread.");
            if(this.zzd != null) {
                if(iObjectWrapper0 != null) {
                    Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
                    if(object0 instanceof Activity) {
                        activity0 = (Activity)object0;
                    }
                }
                this.zzd.zzh(this.zze, activity0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final boolean zzs() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return this.zzy();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final boolean zzt() {
        return this.zzd != null && this.zzd.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvg
    public final void zzu(zzbve zzbve0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbve0);
    }

    static zzdnq zzv(zzfbb zzfbb0) {
        return zzfbb0.zzd;
    }

    static zzfbs zzw(zzfbb zzfbb0) {
        return zzfbb0.zzc;
    }

    static void zzx(zzfbb zzfbb0, zzdnq zzdnq0) {
        zzfbb0.zzd = zzdnq0;
    }

    private final boolean zzy() {
        synchronized(this) {
            return this.zzd != null && !this.zzd.zze();
        }
    }
}

