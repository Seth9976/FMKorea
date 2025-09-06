package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class zzbsz {
    private final View zza;
    private final Map zzb;
    private final zzbyr zzc;

    public zzbsz(zzbsy zzbsy0) {
        View view0 = zzbsy0.zza;
        this.zza = view0;
        Map map0 = zzbsy0.zzb;
        this.zzb = map0;
        zzbyr zzbyr0 = zzbst.zza(zzbsy0.zza.getContext());
        this.zzc = zzbyr0;
        if(zzbyr0 != null && !map0.isEmpty()) {
            try {
                zzbyr0.zzf(new zzbta(ObjectWrapper.wrap(view0).asBinder(), ObjectWrapper.wrap(map0).asBinder()));
            }
            catch(RemoteException unused_ex) {
                zzcaa.zzg("Failed to call remote method.");
            }
        }
    }

    public final void zza(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            if(this.zzc == null) {
                zzcaa.zzj("Failed to get internal reporting info generator in recordClick.");
            }
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                zzbsx zzbsx0 = new zzbsx(this, list0);
                this.zzc.zzg(list0, iObjectWrapper0, zzbsx0);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzg(("RemoteException recording click: " + remoteException0.toString()));
            }
            return;
        }
        zzcaa.zzj("No click urls were passed to recordClick");
    }

    public final void zzb(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            zzbyr zzbyr0 = this.zzc;
            if(zzbyr0 != null) {
                try {
                    zzbyr0.zzh(list0, ObjectWrapper.wrap(this.zza), new zzbsw(this, list0));
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzg(("RemoteException recording impression urls: " + remoteException0.toString()));
                }
                return;
            }
            zzcaa.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        zzcaa.zzj("No impression urls were passed to recordImpression");
    }

    public final void zzc(MotionEvent motionEvent0) {
        zzbyr zzbyr0 = this.zzc;
        if(zzbyr0 != null) {
            try {
                zzbyr0.zzj(ObjectWrapper.wrap(motionEvent0));
            }
            catch(RemoteException unused_ex) {
                zzcaa.zzg("Failed to call remote method.");
            }
            return;
        }
        zzcaa.zze("Failed to get internal reporting info generator.");
    }

    public final void zzd(Uri uri0, UpdateClickUrlCallback updateClickUrlCallback0) {
        try {
            ArrayList arrayList0 = new ArrayList(Arrays.asList(new Uri[]{uri0}));
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
            zzbsv zzbsv0 = new zzbsv(this, updateClickUrlCallback0);
            this.zzc.zzk(arrayList0, iObjectWrapper0, zzbsv0);
        }
        catch(RemoteException unused_ex) {
        }
    }

    public final void zze(List list0, UpdateImpressionUrlsCallback updateImpressionUrlsCallback0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
            zzbsu zzbsu0 = new zzbsu(this, updateImpressionUrlsCallback0);
            this.zzc.zzl(list0, iObjectWrapper0, zzbsu0);
        }
        catch(RemoteException unused_ex) {
        }
    }
}

