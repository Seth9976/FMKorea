package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration.Builder;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus.State;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzbkx;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbzp;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzfrx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public final class zzej {
    private static zzej zza;
    private final Object zzb;
    private final ArrayList zzc;
    private boolean zzd;
    private boolean zze;
    private final Object zzf;
    private zzco zzg;
    private OnAdInspectorClosedListener zzh;
    private RequestConfiguration zzi;

    private zzej() {
        this.zzb = new Object();
        this.zzd = false;
        this.zze = false;
        this.zzf = new Object();
        this.zzh = null;
        this.zzi = new Builder().build();
        this.zzc = new ArrayList();
    }

    private final void zzA(Context context0) {
        if(this.zzg == null) {
            this.zzg = (zzco)new zzaq(zzay.zza(), context0).zzd(context0, false);
        }
    }

    private final void zzB(RequestConfiguration requestConfiguration0) {
        try {
            this.zzg.zzu(new zzff(requestConfiguration0));
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Unable to set request configuration parcel.", remoteException0);
        }
    }

    public final float zza() {
        synchronized(this.zzf) {
            zzco zzco0 = this.zzg;
            float f = 1.0f;
            if(zzco0 == null) {
                return 1.0f;
            }
            try {
                f = zzco0.zze();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to get app volume.", remoteException0);
            }
            return f;
        }
    }

    static OnAdInspectorClosedListener zzb(zzej zzej0) {
        return zzej0.zzh;
    }

    public final RequestConfiguration zzc() {
        return this.zzi;
    }

    static InitializationStatus zzd(List list0) {
        return zzej.zzy(list0);
    }

    public final InitializationStatus zze() {
        synchronized(this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                return zzej.zzy(this.zzg.zzg());
            }
            catch(RemoteException unused_ex) {
                zzcaa.zzg("Unable to get Initialization status.");
                return new zzeb(this);
            }
        }
    }

    public static zzej zzf() {
        synchronized(zzej.class) {
            if(zzej.zza == null) {
                zzej.zza = new zzej();
            }
            return zzej.zza;
        }
    }

    static Object zzg(zzej zzej0) {
        return zzej0.zzb;
    }

    public final String zzh() {
        synchronized(this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                return zzfrx.zzc(this.zzg.zzf());
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to get internal version.", remoteException0);
                return "";
            }
        }
    }

    static ArrayList zzi(zzej zzej0) {
        return zzej0.zzc;
    }

    static void zzj(zzej zzej0, boolean z) {
        zzej0.zze = true;
    }

    static void zzk(zzej zzej0, boolean z) {
        zzej0.zzd = false;
    }

    public final void zzl(Context context0) {
        synchronized(this.zzf) {
            this.zzA(context0);
            try {
                this.zzg.zzi();
            }
            catch(RemoteException unused_ex) {
                zzcaa.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzm(boolean z) {
        synchronized(this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to enable/disable Same App Key.");
            try {
                this.zzg.zzj(z);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh(("Unable to " + (z ? "enable" : "disable") + " Same App Key."), remoteException0);
                if(remoteException0.getMessage() != null && remoteException0.getMessage().toLowerCase(Locale.ROOT).contains("paid")) {
                    throw new IllegalStateException(remoteException0);
                }
            }
        }
    }

    public final void zzn(Context context0, String s, OnInitializationCompleteListener onInitializationCompleteListener0) {
        synchronized(this.zzb) {
            if(this.zzd) {
                if(onInitializationCompleteListener0 != null) {
                    this.zzc.add(onInitializationCompleteListener0);
                }
                return;
            }
            if(this.zze) {
                if(onInitializationCompleteListener0 != null) {
                    onInitializationCompleteListener0.onInitializationComplete(this.zze());
                }
                return;
            }
            this.zzd = true;
            if(onInitializationCompleteListener0 != null) {
                this.zzc.add(onInitializationCompleteListener0);
            }
        }
        if(context0 == null) {
            throw new IllegalArgumentException("Context cannot be null.");
        }
        synchronized(this.zzf) {
            try {
                this.zzA(context0);
                this.zzg.zzs(new zzei(this, null));
                this.zzg.zzo(new zzboc());
                if(this.zzi.getTagForChildDirectedTreatment() != -1 || this.zzi.getTagForUnderAgeOfConsent() != -1) {
                    this.zzB(this.zzi);
                }
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("MobileAdsSettingManager initialization failed", remoteException0);
            }
        }
        zzbbr.zza(context0);
        if(((Boolean)zzbdi.zza.zze()).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzkb)).booleanValue()) {
            zzcaa.zze("Initializing on bg thread");
            zzec zzec0 = () -> synchronized(this.zzf) {
                this.zzz(context0, null);
            };
            zzbzp.zza.execute(zzec0);
        }
        else if(!((Boolean)zzbdi.zzb.zze()).booleanValue() || !((Boolean)zzba.zzc().zzb(zzbbr.zzkb)).booleanValue()) {
            zzcaa.zze("Initializing on calling thread");
            this.zzz(context0, null);
        }
        else {
            zzed zzed0 = () -> synchronized(this.zzf) {
                this.zzz(context0, null);
            };
            zzbzp.zzb.execute(zzed0);
        }
    }

    // 检测为 Lambda 实现
    final void zzo(Context context0, String s) [...]

    // 检测为 Lambda 实现
    final void zzp(Context context0, String s) [...]

    public final void zzq(Context context0, OnAdInspectorClosedListener onAdInspectorClosedListener0) {
        synchronized(this.zzf) {
            this.zzA(context0);
            this.zzh = onAdInspectorClosedListener0;
            try {
                this.zzg.zzm(new zzeg(null));
            }
            catch(RemoteException unused_ex) {
                zzcaa.zzg("Unable to open the ad inspector.");
                if(onAdInspectorClosedListener0 != null) {
                    onAdInspectorClosedListener0.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", "com.google.android.gms.ads"));
                }
            }
        }
    }

    public final void zzr(Context context0, String s) {
        synchronized(this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzg.zzn(ObjectWrapper.wrap(context0), s);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to open debug menu.", remoteException0);
            }
        }
    }

    public final void zzs(Class class0) {
        synchronized(this.zzf) {
            try {
                this.zzg.zzh(class0.getCanonicalName());
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to register RtbAdapter", remoteException0);
            }
        }
    }

    public final void zzt(boolean z) {
        synchronized(this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzg.zzp(z);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to set app mute state.", remoteException0);
            }
        }
    }

    public final void zzu(float f) {
        boolean z = true;
        Preconditions.checkArgument(Float.compare(f, 0.0f) >= 0 && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized(this.zzf) {
            if(this.zzg == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzg.zzq(f);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to set app volume.", remoteException0);
            }
        }
    }

    public final void zzv(String s) {
        synchronized(this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzg.zzt(s);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to set plugin.", remoteException0);
            }
        }
    }

    public final void zzw(RequestConfiguration requestConfiguration0) {
        Preconditions.checkArgument(requestConfiguration0 != null, "Null passed to setRequestConfiguration.");
        synchronized(this.zzf) {
            RequestConfiguration requestConfiguration1 = this.zzi;
            this.zzi = requestConfiguration0;
            if(this.zzg == null) {
                return;
            }
            if(requestConfiguration1.getTagForChildDirectedTreatment() != requestConfiguration0.getTagForChildDirectedTreatment() || requestConfiguration1.getTagForUnderAgeOfConsent() != requestConfiguration0.getTagForUnderAgeOfConsent()) {
                this.zzB(requestConfiguration0);
            }
        }
    }

    public final boolean zzx() {
        synchronized(this.zzf) {
            zzco zzco0 = this.zzg;
            boolean z = false;
            if(zzco0 == null) {
                return false;
            }
            try {
                z = zzco0.zzv();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Unable to get app mute state.", remoteException0);
            }
            return z;
        }
    }

    private static InitializationStatus zzy(List list0) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            hashMap0.put(((zzbko)object0).zza, new zzbkw((((zzbko)object0).zzb ? State.READY : State.NOT_READY), ((zzbko)object0).zzd, ((zzbko)object0).zzc));
        }
        return new zzbkx(hashMap0);
    }

    private final void zzz(Context context0, String s) {
        try {
            zzbny.zza().zzb(context0, null);
            this.zzg.zzk();
            this.zzg.zzl(null, ObjectWrapper.wrap(null));
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzk("MobileAdsSettingManager initialization failed", remoteException0);
        }
    }
}

