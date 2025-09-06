package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzdiw;
import com.google.android.gms.internal.ads.zzdiy;
import com.google.android.gms.internal.ads.zzdsp;
import com.google.android.gms.internal.ads.zzeka;
import com.google.android.gms.internal.ads.zzewe;
import com.google.android.gms.internal.ads.zzewf;
import com.google.android.gms.internal.ads.zzexs;
import com.google.android.gms.internal.ads.zzezj;
import com.google.android.gms.internal.ads.zzfax;
import java.util.HashMap;

public class ClientApi extends zzcd {
    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper0, String s, zzbof zzbof0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        return new zzeka(zzchd.zzb(context0, zzbof0, v), context0, s);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, zzbof zzbof0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzewe zzewe0 = zzchd.zzb(context0, zzbof0, v).zzs();
        zzewe0.zza(s);
        zzewe0.zzb(context0);
        zzewf zzewf0 = zzewe0.zzc();
        return v >= ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzfc)))) ? zzewf0.zza() : new zzew();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, zzbof zzbof0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzexs zzexs0 = zzchd.zzb(context0, zzbof0, v).zzt();
        zzexs0.zzc(context0);
        zzexs0.zza(zzq0);
        zzexs0.zzb(s);
        return zzexs0.zzd().zza();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, zzbof zzbof0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzezj zzezj0 = zzchd.zzb(context0, zzbof0, v).zzu();
        zzezj0.zzc(context0);
        zzezj0.zza(zzq0);
        zzezj0.zzb(s);
        return zzezj0.zzd().zza();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, int v) {
        return new zzs(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), zzq0, s, new zzcag(233012000, v, true, false));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper0, int v) {
        return zzchd.zzb(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), null, v).zzc();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper0, zzbof zzbof0, int v) {
        return zzchd.zzb(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), zzbof0, v).zzl();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbfa zzi(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1) {
        return new zzdiy(((FrameLayout)ObjectWrapper.unwrap(iObjectWrapper0)), ((FrameLayout)ObjectWrapper.unwrap(iObjectWrapper1)), 233012000);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbfg zzj(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) {
        return new zzdiw(((View)ObjectWrapper.unwrap(iObjectWrapper0)), ((HashMap)ObjectWrapper.unwrap(iObjectWrapper1)), ((HashMap)ObjectWrapper.unwrap(iObjectWrapper2)));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbjs zzk(IObjectWrapper iObjectWrapper0, zzbof zzbof0, int v, zzbjp zzbjp0) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzdsp zzdsp0 = zzchd.zzb(context0, zzbof0, v).zzj();
        zzdsp0.zzb(context0);
        zzdsp0.zza(zzbjp0);
        return zzdsp0.zzc().zzd();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbrv zzl(IObjectWrapper iObjectWrapper0, zzbof zzbof0, int v) {
        return zzchd.zzb(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), zzbof0, v).zzm();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbsc zzm(IObjectWrapper iObjectWrapper0) {
        Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
        AdOverlayInfoParcel adOverlayInfoParcel0 = AdOverlayInfoParcel.zza(activity0.getIntent());
        if(adOverlayInfoParcel0 == null) {
            return new zzt(activity0);
        }
        switch(adOverlayInfoParcel0.zzk) {
            case 1: {
                return new com.google.android.gms.ads.internal.overlay.zzs(activity0);
            }
            case 2: {
                return new zzae(activity0);
            }
            case 3: {
                return new zzaf(activity0);
            }
            case 4: {
                return new zzy(activity0, adOverlayInfoParcel0);
            }
            case 5: {
                return new zzac(activity0);
            }
            default: {
                return new zzt(activity0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbvg zzn(IObjectWrapper iObjectWrapper0, zzbof zzbof0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzfax zzfax0 = zzchd.zzb(context0, zzbof0, v).zzv();
        zzfax0.zzb(context0);
        return zzfax0.zzc().zzb();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbvw zzo(IObjectWrapper iObjectWrapper0, String s, zzbof zzbof0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzfax zzfax0 = zzchd.zzb(context0, zzbof0, v).zzv();
        zzfax0.zzb(context0);
        zzfax0.zza(s);
        return zzfax0.zzc().zza();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzce
    public final zzbyr zzp(IObjectWrapper iObjectWrapper0, zzbof zzbof0, int v) {
        return zzchd.zzb(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), zzbof0, v).zzp();
    }
}

