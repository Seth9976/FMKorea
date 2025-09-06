package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

public final class zzdmc extends zzblc implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbeh {
    private View zza;
    private zzdq zzb;
    private zzdhx zzc;
    private boolean zzd;
    private boolean zze;

    public zzdmc(zzdhx zzdhx0, zzdic zzdic0) {
        this.zza = zzdic0.zzf();
        this.zzb = zzdic0.zzj();
        this.zzc = zzdhx0;
        this.zzd = false;
        this.zze = false;
        if(zzdic0.zzs() != null) {
            zzdic0.zzs().zzam(this);
        }
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.zzg();
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        this.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzbld
    public final zzdq zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if(this.zzd) {
            zzcaa.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzbld
    public final zzbet zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if(this.zzd) {
            zzcaa.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzc == null || this.zzc.zzc() == null ? null : this.zzc.zzc().zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbld
    public final void zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzh();
        zzdhx zzdhx0 = this.zzc;
        if(zzdhx0 != null) {
            zzdhx0.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzbld
    public final void zze(IObjectWrapper iObjectWrapper0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzf(iObjectWrapper0, new zzdmb(this));
    }

    @Override  // com.google.android.gms.internal.ads.zzbld
    public final void zzf(IObjectWrapper iObjectWrapper0, zzblg zzblg0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if(this.zzd) {
            zzcaa.zzg("Instream ad can not be shown after destroy().");
            zzdmc.zzi(zzblg0, 2);
            return;
        }
        View view0 = this.zza;
        if(view0 != null && this.zzb != null) {
            if(this.zze) {
                zzcaa.zzg("Instream ad should not be used again.");
                zzdmc.zzi(zzblg0, 1);
                return;
            }
            this.zze = true;
            this.zzh();
            ((ViewGroup)ObjectWrapper.unwrap(iObjectWrapper0)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            zzcba.zza(this.zza, this);
            zzcba.zzb(this.zza, this);
            this.zzg();
            try {
                zzblg0.zzf();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
            return;
        }
        zzcaa.zzg(("Instream internal error: " + (view0 == null ? "can not get video view." : "can not get video controller.")));
        zzdmc.zzi(zzblg0, 0);
    }

    private final void zzg() {
        zzdhx zzdhx0 = this.zzc;
        if(zzdhx0 != null) {
            View view0 = this.zza;
            if(view0 != null) {
                zzdhx0.zzz(view0, Collections.emptyMap(), Collections.emptyMap(), zzdhx.zzV(this.zza));
            }
        }
    }

    private final void zzh() {
        View view0 = this.zza;
        if(view0 == null) {
            return;
        }
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 instanceof ViewGroup) {
            ((ViewGroup)viewParent0).removeView(this.zza);
        }
    }

    private static final void zzi(zzblg zzblg0, int v) {
        try {
            zzblg0.zze(v);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

