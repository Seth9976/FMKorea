package com.google.android.gms.internal.ads;

import Z1.d;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import java.util.concurrent.Executor;

public final class zzefc implements zzedn {
    private final Context zza;
    private final zzdfq zzb;
    private final Executor zzc;
    private final zzfbd zzd;

    public zzefc(Context context0, Executor executor0, zzdfq zzdfq0, zzfbd zzfbd0) {
        this.zza = context0;
        this.zzb = zzdfq0;
        this.zzc = executor0;
        this.zzd = zzfbd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final d zza(zzfbr zzfbr0, zzfbe zzfbe0) {
        String s = zzefc.zzd(zzfbe0);
        if(s != null) {
            Uri uri0 = Uri.parse(s);
            return zzfye.zzn(zzfye.zzh(null), (Object object0) -> try {
                androidx.browser.customtabs.d d0 = new androidx.browser.customtabs.d.d().a();
                d0.a.setData(uri0);
                zzc zzc0 = new zzc(d0.a, null);
                zzcas zzcas0 = new zzcas();
                zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, null);
                zzdet zzdet0 = new zzdet(new zzefb(zzcas0), null);
                zzdeq zzdeq0 = this.zzb.zze(zzcst0, zzdet0);
                zzcas0.zzc(new AdOverlayInfoParcel(zzc0, null, zzdeq0.zza(), null, new zzcag(0, 0, false, false, false), null, null));
                this.zzd.zza();
                return zzfye.zzh(zzdeq0.zzg());
            }
            catch(Throwable throwable0) {
                zzcaa.zzh("Error in CustomTabsAdRenderer", throwable0);
                throw throwable0;
            }, this.zzc);
        }
        return zzfye.zzn(zzfye.zzh(null), (Object object0) -> try {
            androidx.browser.customtabs.d d0 = new androidx.browser.customtabs.d.d().a();
            d0.a.setData(null);
            zzc zzc0 = new zzc(d0.a, null);
            zzcas zzcas0 = new zzcas();
            zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, null);
            zzdet zzdet0 = new zzdet(new zzefb(zzcas0), null);
            zzdeq zzdeq0 = this.zzb.zze(zzcst0, zzdet0);
            zzcas0.zzc(new AdOverlayInfoParcel(zzc0, null, zzdeq0.zza(), null, new zzcag(0, 0, false, false, false), null, null));
            this.zzd.zza();
            return zzfye.zzh(zzdeq0.zzg());
        }
        catch(Throwable throwable0) {
            zzcaa.zzh("Error in CustomTabsAdRenderer", throwable0);
            throw throwable0;
        }, this.zzc);
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbr0, zzfbe zzfbe0) {
        return this.zza instanceof Activity && zzbcs.zzg(this.zza) && !TextUtils.isEmpty(zzefc.zzd(zzfbe0));
    }

    // 检测为 Lambda 实现
    final d zzc(Uri uri0, zzfbr zzfbr0, zzfbe zzfbe0, Object object0) [...]

    private static String zzd(zzfbe zzfbe0) {
        try {
            return zzfbe0.zzw.getString("tab_url");
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

