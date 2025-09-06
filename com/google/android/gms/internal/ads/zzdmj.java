package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.a;
import androidx.collection.g;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class zzdmj extends zzbfp {
    private final Context zza;
    private final zzdic zzb;
    private zzdjc zzc;
    private zzdhx zzd;

    public zzdmj(Context context0, zzdic zzdic0, zzdjc zzdjc0, zzdhx zzdhx0) {
        this.zza = context0;
        this.zzb = zzdic0;
        this.zzc = zzdjc0;
        this.zzd = zzdhx0;
    }

    static zzdhx zzc(zzdmj zzdmj0) {
        return zzdmj0.zzd;
    }

    private final zzbej zzd(String s) {
        return new zzdmi(this, "_videoMediaView");
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final zzdq zze() {
        return this.zzb.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final zzbet zzf() {
        try {
            return this.zzd.zzc().zza();
        }
        catch(NullPointerException nullPointerException0) {
            zzt.zzo().zzu(nullPointerException0, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final zzbew zzg(String s) {
        return (zzbew)this.zzb.zzh().get(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final String zzj(String s) {
        return (String)this.zzb.zzi().get(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final List zzk() {
        try {
            g g0 = this.zzb.zzh();
            g g1 = this.zzb.zzi();
            String[] arr_s = new String[g0.size() + g1.size()];
            int v2 = 0;
            for(int v1 = 0; v1 < g0.size(); ++v1) {
                arr_s[v2] = (String)g0.j(v1);
                ++v2;
            }
            for(int v = 0; v < g1.size(); ++v) {
                arr_s[v2] = (String)g1.j(v);
                ++v2;
            }
            return Arrays.asList(arr_s);
        }
        catch(NullPointerException nullPointerException0) {
        }
        zzt.zzo().zzu(nullPointerException0, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
        return new ArrayList();
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final void zzl() {
        zzdhx zzdhx0 = this.zzd;
        if(zzdhx0 != null) {
            zzdhx0.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final void zzm() {
        try {
            String s = this.zzb.zzC();
            switch(s) {
                case 0: {
                    break;
                }
                case 5443: {
                    zzcaa.zzj("Illegal argument specified for omid partner name.");
                    return;
                }
                default: {
                    if(s.equals("Google")) {
                        zzcaa.zzj("Illegal argument specified for omid partner name.");
                        return;
                    }
                }
            }
            if(TextUtils.isEmpty(s)) {
                zzcaa.zzj("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            zzdhx zzdhx0 = this.zzd;
            if(zzdhx0 != null) {
                zzdhx0.zzf(s, false);
            }
            return;
        }
        catch(NullPointerException nullPointerException0) {
        }
        zzt.zzo().zzu(nullPointerException0, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final void zzn(String s) {
        zzdhx zzdhx0 = this.zzd;
        if(zzdhx0 != null) {
            zzdhx0.zzD(s);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final void zzo() {
        zzdhx zzdhx0 = this.zzd;
        if(zzdhx0 != null) {
            zzdhx0.zzG();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final void zzp(IObjectWrapper iObjectWrapper0) {
        Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
        if(!(object0 instanceof View)) {
            return;
        }
        if(this.zzb.zzu() == null) {
            return;
        }
        zzdhx zzdhx0 = this.zzd;
        if(zzdhx0 != null) {
            zzdhx0.zzH(((View)object0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzq() {
        if(this.zzd != null && !this.zzd.zzU()) {
            return false;
        }
        return this.zzb.zzr() == null ? false : this.zzb.zzs() == null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzr(IObjectWrapper iObjectWrapper0) {
        Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
        if(!(object0 instanceof ViewGroup)) {
            return false;
        }
        if(this.zzc != null && this.zzc.zzf(((ViewGroup)object0))) {
            this.zzb.zzq().zzao(this.zzd("_videoMediaView"));
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzs(IObjectWrapper iObjectWrapper0) {
        Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
        if(!(object0 instanceof ViewGroup)) {
            return false;
        }
        if(this.zzc != null && this.zzc.zzg(((ViewGroup)object0))) {
            this.zzb.zzs().zzao(this.zzd("_videoMediaView"));
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzt() {
        zzfip zzfip0 = this.zzb.zzu();
        if(zzfip0 != null) {
            zzt.zzA().zzi(zzfip0);
            if(this.zzb.zzr() != null) {
                this.zzb.zzr().zzd("onSdkLoaded", new a());
            }
            return true;
        }
        zzcaa.zzj("Trying to start OMID session before creation.");
        return false;
    }
}

