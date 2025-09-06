package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaut;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaa;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzea {
    final zzaz zza;
    private final zzboc zzb;
    private final zzp zzc;
    private final AtomicBoolean zzd;
    private final VideoController zze;
    private zza zzf;
    private AdListener zzg;
    private AdSize[] zzh;
    private AppEventListener zzi;
    private zzbu zzj;
    private VideoOptions zzk;
    private String zzl;
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    private OnPaidEventListener zzp;

    public zzea(ViewGroup viewGroup0) {
        this(viewGroup0, null, false, zzp.zza, null, 0);
    }

    public zzea(ViewGroup viewGroup0, int v) {
        this(viewGroup0, null, false, zzp.zza, null, v);
    }

    public zzea(ViewGroup viewGroup0, AttributeSet attributeSet0, boolean z) {
        this(viewGroup0, attributeSet0, z, zzp.zza, null, 0);
    }

    public zzea(ViewGroup viewGroup0, AttributeSet attributeSet0, boolean z, int v) {
        this(viewGroup0, attributeSet0, z, zzp.zza, null, v);
    }

    zzea(ViewGroup viewGroup0, AttributeSet attributeSet0, boolean z, zzp zzp0, zzbu zzbu0, int v) {
        zzq zzq0;
        this.zzb = new zzboc();
        this.zze = new VideoController();
        this.zza = new zzdz(this);
        this.zzm = viewGroup0;
        this.zzc = zzp0;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = v;
        if(attributeSet0 != null) {
            Context context0 = viewGroup0.getContext();
            try {
                zzy zzy0 = new zzy(context0, attributeSet0);
                this.zzh = zzy0.zzb(z);
                this.zzl = zzy0.zza();
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                zzay.zzb().zzl(viewGroup0, new zzq(context0, AdSize.BANNER), illegalArgumentException0.getMessage(), illegalArgumentException0.getMessage());
                return;
            }
            if(viewGroup0.isInEditMode()) {
                zzbzt zzbzt0 = zzay.zzb();
                AdSize adSize0 = this.zzh[0];
                int v1 = this.zzn;
                if(adSize0.equals(AdSize.INVALID)) {
                    zzq0 = zzq.zze();
                }
                else {
                    zzq zzq1 = new zzq(context0, adSize0);
                    zzq1.zzj = zzea.zzD(v1);
                    zzq0 = zzq1;
                }
                zzbzt0.zzm(viewGroup0, zzq0, "Ads by Google");
            }
        }
    }

    public final boolean zzA() {
        zzbu zzbu0 = this.zzj;
        if(zzbu0 != null) {
            try {
                return zzbu0.zzY();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        return false;
    }

    public final AdSize[] zzB() {
        return this.zzh;
    }

    private static zzq zzC(Context context0, AdSize[] arr_adSize, int v) {
        for(int v1 = 0; v1 < arr_adSize.length; ++v1) {
            if(arr_adSize[v1].equals(AdSize.INVALID)) {
                return zzq.zze();
            }
        }
        zzq zzq0 = new zzq(context0, arr_adSize);
        zzq0.zzj = zzea.zzD(v);
        return zzq0;
    }

    private static boolean zzD(int v) {
        return v == 1;
    }

    public final AdListener zza() {
        return this.zzg;
    }

    public final AdSize zzb() {
        zzbu zzbu0 = this.zzj;
        if(zzbu0 != null) {
            try {
                zzq zzq0 = zzbu0.zzg();
                if(zzq0 != null) {
                    return zzb.zzc(zzq0.zze, zzq0.zzb, zzq0.zza);
                }
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        return this.zzh == null ? null : this.zzh[0];
    }

    public final OnPaidEventListener zzc() {
        return this.zzp;
    }

    public final ResponseInfo zzd() {
        zzbu zzbu0 = this.zzj;
        if(zzbu0 != null) {
            try {
                return ResponseInfo.zza(zzbu0.zzk());
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
                return ResponseInfo.zza(null);
            }
        }
        return ResponseInfo.zza(null);
    }

    static VideoController zze(zzea zzea0) {
        return zzea0.zze;
    }

    public final VideoController zzf() {
        return this.zze;
    }

    public final VideoOptions zzg() {
        return this.zzk;
    }

    public final AppEventListener zzh() {
        return this.zzi;
    }

    public final zzdq zzi() {
        zzbu zzbu0 = this.zzj;
        if(zzbu0 != null) {
            try {
                return zzbu0.zzl();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        return null;
    }

    public final String zzj() {
        if(this.zzl == null) {
            zzbu zzbu0 = this.zzj;
            if(zzbu0 != null) {
                try {
                    this.zzl = zzbu0.zzr();
                    return this.zzl;
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzl("#007 Could not call remote method.", remoteException0);
                }
            }
        }
        return this.zzl;
    }

    public final void zzk() {
        try {
            zzbu zzbu0 = this.zzj;
            if(zzbu0 != null) {
                zzbu0.zzx();
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    // 检测为 Lambda 实现
    final void zzl(IObjectWrapper iObjectWrapper0) [...]

    public final void zzm(zzdx zzdx0) {
        zzbu zzbu1;
        try {
            if(this.zzj == null) {
                if(this.zzh == null || this.zzl == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context0 = this.zzm.getContext();
                zzq zzq0 = zzea.zzC(context0, this.zzh, this.zzn);
                zzbu zzbu0 = "search_v2".equals(zzq0.zza) ? ((zzbu)new zzal(zzay.zza(), context0, zzq0, this.zzl).zzd(context0, false)) : ((zzbu)new zzaj(zzay.zza(), context0, zzq0, this.zzl, this.zzb).zzd(context0, false));
                this.zzj = zzbu0;
                zzbu0.zzD(new zzg(this.zza));
                zza zza0 = this.zzf;
                if(zza0 != null) {
                    this.zzj.zzC(new com.google.android.gms.ads.internal.client.zzb(zza0));
                }
                AppEventListener appEventListener0 = this.zzi;
                if(appEventListener0 != null) {
                    this.zzj.zzG(new zzaut(appEventListener0));
                }
                if(this.zzk != null) {
                    this.zzj.zzU(new zzfl(this.zzk));
                }
                this.zzj.zzP(new zzfe(this.zzp));
                this.zzj.zzN(this.zzo);
                zzbu1 = this.zzj;
                if(zzbu1 != null) {
                    goto label_20;
                }
            }
            goto label_31;
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            return;
        }
        try {
        label_20:
            IObjectWrapper iObjectWrapper0 = zzbu1.zzn();
            if(iObjectWrapper0 != null) {
                if(!((Boolean)zzbdi.zzf.zze()).booleanValue() || !((Boolean)zzba.zzc().zzb(zzbbr.zzkc)).booleanValue()) {
                    View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
                    this.zzm.addView(view0);
                }
                else {
                    zzdy zzdy0 = () -> {
                        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
                        this.zzm.addView(view0);
                    };
                    zzbzt.zza.post(zzdy0);
                }
            }
            goto label_31;
        }
        catch(RemoteException remoteException1) {
        }
        try {
            zzcaa.zzl("#007 Could not call remote method.", remoteException1);
        label_31:
            zzbu zzbu2 = this.zzj;
            if(zzbu2 == null) {
                throw null;
            }
            Context context1 = this.zzm.getContext();
            zzbu2.zzaa(this.zzc.zza(context1, zzdx0));
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcaa.zzl("#007 Could not call remote method.", remoteException0);
    }

    public final void zzn() {
        try {
            zzbu zzbu0 = this.zzj;
            if(zzbu0 != null) {
                zzbu0.zzz();
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzo() {
        if(this.zzd.getAndSet(true)) {
            return;
        }
        try {
            zzbu zzbu0 = this.zzj;
            if(zzbu0 != null) {
                zzbu0.zzA();
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzp() {
        try {
            zzbu zzbu0 = this.zzj;
            if(zzbu0 != null) {
                zzbu0.zzB();
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzq(zza zza0) {
        try {
            this.zzf = zza0;
            zzbu zzbu0 = this.zzj;
            if(zzbu0 != null) {
                zzbu0.zzC((zza0 == null ? null : new com.google.android.gms.ads.internal.client.zzb(zza0)));
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcaa.zzl("#007 Could not call remote method.", remoteException0);
    }

    public final void zzr(AdListener adListener0) {
        this.zzg = adListener0;
        this.zza.zza(adListener0);
    }

    public final void zzs(AdSize[] arr_adSize) {
        if(this.zzh != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        this.zzt(arr_adSize);
    }

    public final void zzt(AdSize[] arr_adSize) {
        this.zzh = arr_adSize;
        zzbu zzbu0 = this.zzj;
        if(zzbu0 != null) {
            try {
                zzbu0.zzF(zzea.zzC(this.zzm.getContext(), this.zzh, this.zzn));
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        this.zzm.requestLayout();
    }

    public final void zzu(String s) {
        if(this.zzl != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzl = s;
    }

    public final void zzv(AppEventListener appEventListener0) {
        try {
            this.zzi = appEventListener0;
            zzbu zzbu0 = this.zzj;
            if(zzbu0 != null) {
                zzbu0.zzG((appEventListener0 == null ? null : new zzaut(appEventListener0)));
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcaa.zzl("#007 Could not call remote method.", remoteException0);
    }

    public final void zzw(boolean z) {
        try {
            this.zzo = z;
            zzbu zzbu0 = this.zzj;
            if(zzbu0 != null) {
                zzbu0.zzN(z);
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzx(OnPaidEventListener onPaidEventListener0) {
        try {
            this.zzp = onPaidEventListener0;
            zzbu zzbu0 = this.zzj;
            if(zzbu0 != null) {
                zzbu0.zzP(new zzfe(onPaidEventListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzy(VideoOptions videoOptions0) {
        try {
            this.zzk = videoOptions0;
            zzbu zzbu0 = this.zzj;
            if(zzbu0 != null) {
                zzbu0.zzU((videoOptions0 == null ? null : new zzfl(videoOptions0)));
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final boolean zzz(zzbu zzbu0) {
        IObjectWrapper iObjectWrapper0;
        try {
            iObjectWrapper0 = zzbu0.zzn();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            return false;
        }
        if(iObjectWrapper0 == null) {
            return false;
        }
        if(((View)ObjectWrapper.unwrap(iObjectWrapper0)).getParent() != null) {
            return false;
        }
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
        this.zzm.addView(view0);
        this.zzj = zzbu0;
        return true;
    }
}

