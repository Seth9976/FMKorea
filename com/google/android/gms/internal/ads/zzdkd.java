package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.widget.ImageView.ScaleType;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdkd implements zzdik {
    private final zzbou zza;
    private final zzcxa zzb;
    private final zzcwg zzc;
    private final zzddu zzd;
    private final Context zze;
    private final zzfbe zzf;
    private final zzcag zzg;
    private final zzfca zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private final zzboq zzl;
    private final zzbor zzm;

    public zzdkd(zzboq zzboq0, zzbor zzbor0, zzbou zzbou0, zzcxa zzcxa0, zzcwg zzcwg0, zzddu zzddu0, Context context0, zzfbe zzfbe0, zzcag zzcag0, zzfca zzfca0) {
        this.zzi = false;
        this.zzj = false;
        this.zzk = true;
        this.zzl = zzboq0;
        this.zzm = zzbor0;
        this.zza = zzbou0;
        this.zzb = zzcxa0;
        this.zzc = zzcwg0;
        this.zzd = zzddu0;
        this.zze = context0;
        this.zzf = zzfbe0;
        this.zzg = zzcag0;
        this.zzh = zzfca0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final boolean zzA() {
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final boolean zzB() {
        return this.zzf.zzM;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final boolean zzC(Bundle bundle0) {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final int zza() {
        return 0;
    }

    private final void zzb(View view0) {
        try {
            if(this.zza != null && !this.zza.zzA()) {
                IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(view0);
                this.zza.zzw(iObjectWrapper2);
                this.zzc.onAdClicked();
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzjL)).booleanValue()) {
                    this.zzd.zzbK();
                    return;
                }
            }
            else if(this.zzl != null && !this.zzl.zzx()) {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(view0);
                this.zzl.zzs(iObjectWrapper0);
                this.zzc.onAdClicked();
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzjL)).booleanValue()) {
                    this.zzd.zzbK();
                    return;
                }
            }
            else if(this.zzm != null && !this.zzm.zzv()) {
                IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(view0);
                this.zzm.zzq(iObjectWrapper1);
                this.zzc.onAdClicked();
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzjL)).booleanValue()) {
                    this.zzd.zzbK();
                    return;
                }
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcaa.zzk("Failed to call handleClick", remoteException0);
    }

    private static final HashMap zzc(Map map0) {
        HashMap hashMap0 = new HashMap();
        if(map0 == null) {
            return hashMap0;
        }
        synchronized(map0) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                View view0 = (View)((WeakReference)map$Entry0.getValue()).get();
                if(view0 != null) {
                    hashMap0.put(((String)map$Entry0.getKey()), view0);
                }
            }
            return hashMap0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final JSONObject zze(View view0, Map map0, Map map1, ImageView.ScaleType imageView$ScaleType0) {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final JSONObject zzf(View view0, Map map0, Map map1, ImageView.ScaleType imageView$ScaleType0) {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzg() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzh() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzi() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzj(zzcw zzcw0) {
        zzcaa.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzk(View view0, View view1, Map map0, Map map1, boolean z, ImageView.ScaleType imageView$ScaleType0) {
        if(this.zzj && this.zzf.zzM) {
            return;
        }
        this.zzb(view0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzl(String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzm(Bundle bundle0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzo(View view0, View view1, Map map0, Map map1, boolean z, ImageView.ScaleType imageView$ScaleType0, int v) {
        if(!this.zzj) {
            zzcaa.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
            return;
        }
        if(!this.zzf.zzM) {
            zzcaa.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
            return;
        }
        this.zzb(view1);
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzp() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzq(View view0, Map map0, Map map1, ImageView.ScaleType imageView$ScaleType0) {
        try {
            if(!this.zzi) {
                this.zzi = zzt.zzs().zzn(this.zze, this.zzg.zza, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if(!this.zzk) {
                return;
            }
            if(this.zza != null && !this.zza.zzB()) {
                this.zza.zzx();
                this.zzb.zza();
                return;
            }
            if(this.zzl != null && !this.zzl.zzy()) {
                this.zzl.zzt();
                this.zzb.zza();
                return;
            }
            if(this.zzm != null && !this.zzm.zzw()) {
                this.zzm.zzr();
                this.zzb.zza();
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcaa.zzk("Failed to call recordImpression", remoteException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzr() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzs(View view0, MotionEvent motionEvent0, View view1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzt(Bundle bundle0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzu(View view0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzv() {
        this.zzj = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzw(zzcs zzcs0) {
        zzcaa.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzx(zzbgq zzbgq0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzy(View view0, Map map0, Map map1, View.OnTouchListener view$OnTouchListener0, View.OnClickListener view$OnClickListener0) {
        IObjectWrapper iObjectWrapper1;
        zzboq zzboq0;
        zzbou zzbou0;
        Object object2;
        Class class0;
        JSONArray jSONArray0;
        boolean z;
        IObjectWrapper iObjectWrapper0;
        try {
            iObjectWrapper0 = ObjectWrapper.wrap(view0);
            JSONObject jSONObject0 = this.zzf.zzak;
            z = true;
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbu)).booleanValue() && jSONObject0.length() != 0) {
                Map map2 = map0 == null ? new HashMap() : map0;
                Map map3 = map1 == null ? new HashMap() : map1;
                HashMap hashMap0 = new HashMap();
                hashMap0.putAll(map2);
                hashMap0.putAll(map3);
                Iterator iterator0 = jSONObject0.keys();
                while(true) {
                label_16:
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    jSONArray0 = jSONObject0.optJSONArray(s);
                    if(jSONArray0 == null) {
                        continue;
                    }
                    WeakReference weakReference0 = (WeakReference)hashMap0.get(s);
                    if(weakReference0 == null) {
                        goto label_54;
                    }
                    Object object1 = weakReference0.get();
                    if(object1 == null) {
                        goto label_54;
                    }
                    class0 = object1.getClass();
                    if(((Boolean)zzba.zzc().zzb(zzbbr.zzbv)).booleanValue() && s.equals("3010")) {
                        object2 = null;
                        zzbou0 = this.zza;
                        if(zzbou0 == null) {
                            zzboq0 = this.zzl;
                            if(zzboq0 == null) {
                                goto label_32;
                            }
                            else {
                                iObjectWrapper1 = zzboq0.zzk();
                                goto label_41;
                            }
                        }
                        iObjectWrapper1 = zzbou0.zzn();
                        goto label_41;
                    }
                    goto label_45;
                }
            }
            goto label_55;
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzk("Failed to call trackView", remoteException0);
            return;
        }
    label_32:
        zzbor zzbor0 = this.zzm;
        if(zzbor0 == null) {
            iObjectWrapper1 = null;
            goto label_41;
        }
        else {
            try {
                iObjectWrapper1 = zzbor0.zzj();
                goto label_41;
            }
            catch(RemoteException unused_ex) {
                goto label_43;
            }
        }
        iObjectWrapper1 = zzboq0.zzk();
    label_41:
        if(iObjectWrapper1 != null) {
            try {
                try {
                    object2 = ObjectWrapper.unwrap(iObjectWrapper1);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            label_43:
                if(object2 == null) {
                    goto label_54;
                }
                class0 = object2.getClass();
                try {
                label_45:
                    ArrayList arrayList0 = new ArrayList();
                    zzbu.zzc(jSONArray0, arrayList0);
                    ClassLoader classLoader0 = this.zze.getClassLoader();
                    Iterator iterator1 = arrayList0.iterator();
                label_49:
                    if(!iterator1.hasNext()) {
                        goto label_54;
                    }
                    Object object3 = iterator1.next();
                    String s1 = (String)object3;
                    goto label_52;
                }
                catch(JSONException unused_ex) {
                    goto label_16;
                }
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("Failed to call trackView", remoteException0);
                return;
            }
        }
        goto label_43;
        try {
        label_52:
            if(!Class.forName(s1, false, classLoader0).isAssignableFrom(class0)) {
                goto label_49;
            }
            goto label_16;
        }
        catch(Throwable unused_ex) {
        }
        goto label_49;
        try {
        label_54:
            z = false;
        label_55:
            this.zzk = z;
            HashMap hashMap1 = zzdkd.zzc(map0);
            HashMap hashMap2 = zzdkd.zzc(map1);
            zzbou zzbou1 = this.zza;
            if(zzbou1 != null) {
                zzbou1.zzy(iObjectWrapper0, ObjectWrapper.wrap(hashMap1), ObjectWrapper.wrap(hashMap2));
                return;
            }
            zzboq zzboq1 = this.zzl;
            if(zzboq1 != null) {
                zzboq1.zzv(iObjectWrapper0, ObjectWrapper.wrap(hashMap1), ObjectWrapper.wrap(hashMap2));
                this.zzl.zzu(iObjectWrapper0);
                return;
            }
            zzbor zzbor1 = this.zzm;
            if(zzbor1 != null) {
                zzbor1.zzt(iObjectWrapper0, ObjectWrapper.wrap(hashMap1), ObjectWrapper.wrap(hashMap2));
                this.zzm.zzs(iObjectWrapper0);
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcaa.zzk("Failed to call trackView", remoteException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzz(View view0, Map map0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(view0);
            zzbou zzbou0 = this.zza;
            if(zzbou0 != null) {
                zzbou0.zzz(iObjectWrapper0);
                return;
            }
            zzboq zzboq0 = this.zzl;
            if(zzboq0 != null) {
                zzboq0.zzw(iObjectWrapper0);
                return;
            }
            zzbor zzbor0 = this.zzm;
            if(zzbor0 != null) {
                zzbor0.zzu(iObjectWrapper0);
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcaa.zzk("Failed to call untrackView", remoteException0);
    }
}

