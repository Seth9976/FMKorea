package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView.ScaleType;
import androidx.collection.a;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdhx extends zzcse {
    private final zzauh zzA;
    public static final zzfud zzc;
    private final Executor zzd;
    private final zzdic zze;
    private final zzdik zzf;
    private final zzdjc zzg;
    private final zzdih zzh;
    private final zzdin zzi;
    private final zzgyn zzj;
    private final zzgyn zzk;
    private final zzgyn zzl;
    private final zzgyn zzm;
    private final zzgyn zzn;
    private zzdjy zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbxn zzs;
    private final zzaqx zzt;
    private final zzcag zzu;
    private final Context zzv;
    private final zzdhz zzw;
    private final zzela zzx;
    private final Map zzy;
    private final List zzz;

    static {
        zzdhx.zzc = zzfud.zzq("3010", "3008", "1005", "1009", "2011", "2007");
    }

    public zzdhx(zzcsd zzcsd0, Executor executor0, zzdic zzdic0, zzdik zzdik0, zzdjc zzdjc0, zzdih zzdih0, zzdin zzdin0, zzgyn zzgyn0, zzgyn zzgyn1, zzgyn zzgyn2, zzgyn zzgyn3, zzgyn zzgyn4, zzbxn zzbxn0, zzaqx zzaqx0, zzcag zzcag0, Context context0, zzdhz zzdhz0, zzela zzela0, zzauh zzauh0) {
        super(zzcsd0);
        this.zzd = executor0;
        this.zze = zzdic0;
        this.zzf = zzdik0;
        this.zzg = zzdjc0;
        this.zzh = zzdih0;
        this.zzi = zzdin0;
        this.zzj = zzgyn0;
        this.zzk = zzgyn1;
        this.zzl = zzgyn2;
        this.zzm = zzgyn3;
        this.zzn = zzgyn4;
        this.zzs = zzbxn0;
        this.zzt = zzaqx0;
        this.zzu = zzcag0;
        this.zzv = context0;
        this.zzw = zzdhz0;
        this.zzx = zzela0;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
        this.zzA = zzauh0;
    }

    public final void zzA(zzcw zzcw0) {
        synchronized(this) {
            this.zzf.zzj(zzcw0);
        }
    }

    public final void zzB(View view0, View view1, Map map0, Map map1, boolean z) {
        synchronized(this) {
            this.zzg.zzc(this.zzo);
            ImageView.ScaleType imageView$ScaleType0 = this.zzY();
            this.zzf.zzk(view0, view1, map0, map1, z, imageView$ScaleType0);
            if(this.zzr) {
                zzdic zzdic0 = this.zze;
                if(zzdic0.zzs() != null) {
                    zzdic0.zzs().zzd("onSdkAdUserInteractionClick", new a());
                }
            }
        }
    }

    public final void zzC(View view0, int v) {
        synchronized(this) {
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zzkm)).booleanValue()) {
                return;
            }
            zzdjy zzdjy0 = this.zzo;
            if(zzdjy0 == null) {
                zzcaa.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                return;
            }
            zzdhn zzdhn0 = () -> {
                View view1 = this.zzo.zzf();
                Map map0 = this.zzo.zzl();
                Map map1 = this.zzo.zzm();
                ImageView.ScaleType imageView$ScaleType0 = this.zzY();
                this.zzf.zzo(view0, view1, map0, map1, zzdjy0 instanceof zzdiw, imageView$ScaleType0, v);
            };
            this.zzd.execute(zzdhn0);
        }
    }

    public final void zzD(String s) {
        synchronized(this) {
            this.zzf.zzl(s);
        }
    }

    public final void zzE(Bundle bundle0) {
        synchronized(this) {
            this.zzf.zzm(bundle0);
        }
    }

    public final void zzF() {
        synchronized(this) {
            zzdjy zzdjy0 = this.zzo;
            if(zzdjy0 == null) {
                zzcaa.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                return;
            }
            zzdhr zzdhr0 = () -> {
                View view0 = this.zzo.zzf();
                Map map0 = this.zzo.zzl();
                Map map1 = this.zzo.zzm();
                ImageView.ScaleType imageView$ScaleType0 = this.zzY();
                this.zzf.zzo(null, view0, map0, map1, zzdjy0 instanceof zzdiw, imageView$ScaleType0, 0);
            };
            this.zzd.execute(zzdhr0);
        }
    }

    public final void zzG() {
        synchronized(this) {
            if(this.zzq) {
                return;
            }
            this.zzf.zzr();
        }
    }

    public final void zzH(View view0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzeX)).booleanValue()) {
            zzcas zzcas0 = this.zze.zzp();
            if(zzcas0 == null) {
                return;
            }
            zzfye.zzr(zzcas0, new zzdhw(this, view0), this.zzd);
            return;
        }
        this.zzab(view0, this.zze.zzu());
    }

    public final void zzI(View view0, MotionEvent motionEvent0, View view1) {
        synchronized(this) {
            this.zzf.zzs(view0, motionEvent0, view1);
        }
    }

    public final void zzJ(Bundle bundle0) {
        synchronized(this) {
            this.zzf.zzt(bundle0);
        }
    }

    public final void zzK(View view0) {
        synchronized(this) {
            this.zzf.zzu(view0);
        }
    }

    public final void zzL() {
        synchronized(this) {
            this.zzf.zzv();
        }
    }

    public final void zzM(zzcs zzcs0) {
        synchronized(this) {
            this.zzf.zzw(zzcs0);
        }
    }

    public final void zzN(zzdg zzdg0) {
        synchronized(this) {
            this.zzx.zza(zzdg0);
        }
    }

    public final void zzO(zzbgq zzbgq0) {
        synchronized(this) {
            this.zzf.zzx(zzbgq0);
        }
    }

    public final void zzP(zzdjy zzdjy0) {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbF)).booleanValue()) {
                zzdhs zzdhs0 = () -> this.zzac(zzdjy0);
                zzs.zza.post(zzdhs0);
                return;
            }
            this.zzac(zzdjy0);
        }
    }

    public final void zzQ(zzdjy zzdjy0) {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbF)).booleanValue()) {
                zzdho zzdho0 = () -> this.zzad(zzdjy0);
                zzs.zza.post(zzdho0);
                return;
            }
            this.zzad(zzdjy0);
        }
    }

    public final boolean zzR() {
        return this.zzh.zze();
    }

    public final boolean zzS() {
        synchronized(this) {
            return this.zzf.zzA();
        }
    }

    public final boolean zzT() {
        synchronized(this) {
            return this.zzf.zzB();
        }
    }

    public final boolean zzU() {
        return this.zzh.zzd();
    }

    public static boolean zzV(View view0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjD)).booleanValue()) {
            long v = zzs.zzt(view0);
            return view0.isShown() && view0.getGlobalVisibleRect(new Rect(), null) && v >= ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzjE))))));
        }
        return view0.isShown() && view0.getGlobalVisibleRect(new Rect(), null);
    }

    public final boolean zzW(Bundle bundle0) {
        synchronized(this) {
            if(this.zzq) {
                return true;
            }
            boolean z = this.zzf.zzC(bundle0);
            this.zzq = z;
            return z;
        }
    }

    private final View zzX(Map map0) {
        synchronized(this) {
            if(map0 == null) {
                return null;
            }
            zzfud zzfud0 = zzdhx.zzc;
            int v1 = zzfud0.size();
            int v2 = 0;
            while(v2 < v1) {
                WeakReference weakReference0 = (WeakReference)map0.get(((String)zzfud0.get(v2)));
                ++v2;
                if(weakReference0 != null) {
                    return (View)weakReference0.get();
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
    }

    private final ImageView.ScaleType zzY() {
        synchronized(this) {
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zzhF)).booleanValue()) {
                return null;
            }
            zzdjy zzdjy0 = this.zzo;
            if(zzdjy0 == null) {
                zzcaa.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
                return null;
            }
            IObjectWrapper iObjectWrapper0 = zzdjy0.zzj();
            return iObjectWrapper0 != null ? ((ImageView.ScaleType)ObjectWrapper.unwrap(iObjectWrapper0)) : zzdjc.zza;
        }
    }

    private final void zzZ(String s, boolean z) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzeX)).booleanValue()) {
            d d0 = this.zze.zzw();
            if(d0 == null) {
                return;
            }
            zzfye.zzr(d0, new zzdhv(this, "Google", true), this.zzd);
            return;
        }
        this.zzf("Google", true);
    }

    public final int zza() {
        synchronized(this) {
            return this.zzf.zza();
        }
    }

    private final void zzaa(View view0, Map map0, Map map1) {
        synchronized(this) {
            this.zzg.zzd(this.zzo);
            ImageView.ScaleType imageView$ScaleType0 = this.zzY();
            this.zzf.zzq(view0, map0, map1, imageView$ScaleType0);
            this.zzq = true;
        }
    }

    private final void zzab(View view0, zzfip zzfip0) {
        zzcfi zzcfi0 = this.zze.zzr();
        if(this.zzh.zzd() && zzfip0 != null && zzcfi0 != null && view0 != null) {
            zzt.zzA().zzh(zzfip0, view0);
        }
    }

    private final void zzac(zzdjy zzdjy0) {
        synchronized(this) {
            if(this.zzp) {
                return;
            }
            this.zzo = zzdjy0;
            this.zzg.zze(zzdjy0);
            View view0 = zzdjy0.zzf();
            Map map0 = zzdjy0.zzm();
            Map map1 = zzdjy0.zzn();
            this.zzf.zzy(view0, map0, map1, zzdjy0, zzdjy0);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzcr)).booleanValue()) {
                View view1 = zzdjy0.zzf();
                this.zzt.zzc().zzo(view1);
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbH)).booleanValue()) {
                zzfbe zzfbe0 = this.zzb;
                if(zzfbe0.zzal) {
                    Iterator iterator0 = zzfbe0.zzak.keys();
                    if(iterator0 != null) {
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            String s = (String)object0;
                            WeakReference weakReference0 = (WeakReference)this.zzo.zzl().get(s);
                            this.zzy.put(s, Boolean.FALSE);
                            if(weakReference0 != null) {
                                View view2 = (View)weakReference0.get();
                                if(view2 != null) {
                                    zzaug zzaug0 = new zzaug(this.zzv, view2);
                                    this.zzz.add(zzaug0);
                                    zzaug0.zzc(new zzdhu(this, s));
                                }
                            }
                        }
                    }
                }
            }
            if(zzdjy0.zzi() != null) {
                zzdjy0.zzi().zzc(this.zzs);
            }
        }
    }

    private final void zzad(zzdjy zzdjy0) {
        View view0 = zzdjy0.zzf();
        Map map0 = zzdjy0.zzl();
        this.zzf.zzz(view0, map0);
        if(zzdjy0.zzh() != null) {
            zzdjy0.zzh().setClickable(false);
            zzdjy0.zzh().removeAllViews();
        }
        if(zzdjy0.zzi() != null) {
            zzdjy0.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcse
    public final void zzb() {
        synchronized(this) {
            this.zzp = true;
            zzdht zzdht0 = () -> {
                this.zzf.zzi();
                this.zze.zzI();
            };
            this.zzd.execute(zzdht0);
            super.zzb();
        }
    }

    public final zzdhz zzc() {
        return this.zzw;
    }

    static zzdic zzd(zzdhx zzdhx0) {
        return zzdhx0.zze;
    }

    static zzdjy zze(zzdhx zzdhx0) {
        return zzdhx0.zzo;
    }

    public final zzfip zzf(String s, boolean z) {
        zzedi zzedi0;
        zzedh zzedh0;
        String s2;
        String s1;
        if(this.zzh.zzd() && !TextUtils.isEmpty(s)) {
            int v = 0;
            zzcfi zzcfi0 = this.zze.zzr();
            zzcfi zzcfi1 = this.zze.zzs();
            if(zzcfi0 == null && zzcfi1 == null) {
                zzcaa.zzj("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            boolean z1 = zzcfi1 != null;
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzeV)).booleanValue()) {
                this.zzh.zza();
                int v1 = this.zzh.zza().zzb();
                switch(v1 - 1) {
                    case 0: {
                        if(zzcfi1 != null) {
                            z1 = true;
                            break;
                        }
                        zzcaa.zzj("Omid media type was video but there was no video webview.");
                        return null;
                    }
                    case 1: {
                        if(zzcfi0 != null) {
                            z1 = false;
                            v = 1;
                            break;
                        }
                        zzcaa.zzj("Omid media type was display but there was no display webview.");
                        return null;
                    }
                    default: {
                        switch(v1) {
                            case 1: {
                                s1 = "VIDEO";
                                break;
                            }
                            case 2: {
                                s1 = "DISPLAY";
                                break;
                            }
                            default: {
                                s1 = "UNKNOWN";
                            }
                        }
                        zzcaa.zzj(("Unknown omid media type: " + s1 + ". Not initializing Omid."));
                        return null;
                    }
                }
            }
            else {
                v = zzcfi0 == null ? 0 : 1;
            }
            if(v == 0) {
                s2 = "javascript";
                zzcfi0 = zzcfi1;
            }
            else {
                s2 = null;
            }
            zzcfi0.zzG();
            if(!zzt.zzA().zzj(this.zzv)) {
                zzcaa.zzj("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            String s3 = this.zzu.zzb + "." + this.zzu.zzc;
            if(z1) {
                zzedh0 = zzedh.zzc;
                zzedi0 = zzedi.zzb;
            }
            else {
                zzedh0 = zzedh.zzb;
                zzedi0 = this.zze.zzc() == 3 ? zzedi.zzd : zzedi.zzc;
            }
            zzfip zzfip0 = zzt.zzA().zzb(s3, zzcfi0.zzG(), "", "javascript", s2, s, zzedi0, zzedh0, this.zzb.zzam);
            if(zzfip0 == null) {
                zzcaa.zzj("Failed to create omid session in InternalNativeAd");
                return null;
            }
            this.zze.zzW(zzfip0);
            zzcfi0.zzap(zzfip0);
            if(z1) {
                zzt.zzA().zzh(zzfip0, zzcfi1.zzF());
                this.zzr = true;
            }
            if(z) {
                zzt.zzA().zzi(zzfip0);
                zzcfi0.zzd("onSdkLoaded", new a());
            }
            return zzfip0;
        }
        return null;
    }

    // 去混淆评级： 低(20)
    public final String zzg() {
        return "";
    }

    static Map zzh(zzdhx zzdhx0) {
        return zzdhx0.zzy;
    }

    public final JSONObject zzi(View view0, Map map0, Map map1) {
        synchronized(this) {
            ImageView.ScaleType imageView$ScaleType0 = this.zzY();
            return this.zzf.zze(view0, map0, map1, imageView$ScaleType0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcse
    public final void zzj() {
        zzdhp zzdhp0 = () -> {
            try {
                zzdic zzdic0 = this.zze;
                switch(zzdic0.zzc()) {
                    case 1: {
                        if(this.zzi.zzb() != null) {
                            this.zzZ("Google", true);
                            this.zzi.zzb().zze(((zzbfn)this.zzj.zzb()));
                        }
                        break;
                    }
                    case 2: {
                        if(this.zzi.zza() != null) {
                            this.zzZ("Google", true);
                            this.zzi.zza().zze(((zzbfl)this.zzk.zzb()));
                            return;
                        }
                        break;
                    }
                    case 3: {
                        String s = zzdic0.zzA();
                        if(this.zzi.zzd(s) != null) {
                            if(this.zze.zzs() != null) {
                                this.zzf("Google", true);
                            }
                            String s1 = this.zze.zzA();
                            this.zzi.zzd(s1).zze(((zzbfq)this.zzn.zzb()));
                            return;
                        }
                        break;
                    }
                    case 6: {
                        if(this.zzi.zzf() != null) {
                            this.zzZ("Google", true);
                            this.zzi.zzf().zze(((zzbgt)this.zzl.zzb()));
                            return;
                        }
                        break;
                    }
                    case 7: {
                        zzdin zzdin0 = this.zzi;
                        if(zzdin0.zzg() != null) {
                            zzdin0.zzg().zzg(((zzbld)this.zzm.zzb()));
                            return;
                        }
                        break;
                    }
                    default: {
                        zzcaa.zzg("Wrong native template id!");
                        return;
                    }
                }
                return;
            }
            catch(RemoteException remoteException0) {
            }
            zzcaa.zzh("RemoteException when notifyAdLoad is called", remoteException0);
        };
        this.zzd.execute(zzdhp0);
        if(this.zze.zzc() != 7) {
            this.zzf.getClass();
            zzdhq zzdhq0 = new zzdhq(this.zzf);
            this.zzd.execute(zzdhq0);
        }
        super.zzj();
    }

    public final JSONObject zzk(View view0, Map map0, Map map1) {
        synchronized(this) {
            ImageView.ScaleType imageView$ScaleType0 = this.zzY();
            return this.zzf.zzf(view0, map0, map1, imageView$ScaleType0);
        }
    }

    // 检测为 Lambda 实现
    public static void zzq(zzdhx zzdhx0) [...]

    static void zzr(zzdhx zzdhx0, View view0, zzfip zzfip0) {
        zzdhx0.zzab(view0, zzfip0);
    }

    public final void zzs(View view0) {
        zzfip zzfip0 = this.zze.zzu();
        if(this.zzh.zzd() && zzfip0 != null && view0 != null) {
            zzt.zzA().zzf(zzfip0, view0);
        }
    }

    public final void zzt() {
        synchronized(this) {
            this.zzf.zzh();
        }
    }

    // 检测为 Lambda 实现
    final void zzu() [...]

    // 检测为 Lambda 实现
    final void zzv(View view0, boolean z, int v) [...]

    // 检测为 Lambda 实现
    final void zzw(boolean z) [...]

    // 检测为 Lambda 实现
    final void zzx(zzdjy zzdjy0) [...]

    // 检测为 Lambda 实现
    final void zzy(zzdjy zzdjy0) [...]

    public final void zzz(View view0, Map map0, Map map1, boolean z) {
        synchronized(this) {
            if(this.zzq) {
                return;
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbH)).booleanValue() && this.zzb.zzal) {
                for(Object object0: this.zzy.keySet()) {
                    if(!((Boolean)this.zzy.get(((String)object0))).booleanValue()) {
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(!z) {
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzdH)).booleanValue() && map0 != null) {
                    for(Object object1: map0.entrySet()) {
                        View view1 = (View)((WeakReference)((Map.Entry)object1).getValue()).get();
                        if(view1 != null && zzdhx.zzV(view1)) {
                            this.zzaa(view0, map0, map1);
                            return;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return;
            }
            View view2 = this.zzX(map0);
            if(view2 == null) {
                this.zzaa(view0, map0, map1);
                return;
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzdI)).booleanValue()) {
                if(zzdhx.zzV(view2)) {
                    this.zzaa(view0, map0, map1);
                    return;
                }
                return;
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzdJ)).booleanValue()) {
                Rect rect0 = new Rect();
                if(view2.getGlobalVisibleRect(rect0, null) && view2.getHeight() == rect0.height() && view2.getWidth() == rect0.width()) {
                    this.zzaa(view0, map0, map1);
                    return;
                }
                return;
            }
            this.zzaa(view0, map0, map1);
        }
    }
}

