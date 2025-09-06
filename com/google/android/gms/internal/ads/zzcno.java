package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzcno implements zzcms {
    private final CookieManager zza;

    public zzcno(Context context0) {
        this.zza = zzt.zzq().zzb(context0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcms
    public final void zza(Map map0) {
        if(this.zza == null) {
            return;
        }
        if(((String)map0.get("clear")) != null) {
            String s = (String)zzba.zzc().zzb(zzbbr.zzaL);
            String s1 = this.zza.getCookie(s);
            if(s1 != null) {
                List list0 = zzfrv.zzc(zzfqt.zzc(';')).zzf(s1);
                for(int v = 0; v < list0.size(); ++v) {
                    CookieManager cookieManager0 = this.zza;
                    String s2 = (String)list0.get(v);
                    Iterator iterator0 = zzfrv.zzc(zzfqt.zzc('=')).zzd(s2).iterator();
                    iterator0.getClass();
                    if(!iterator0.hasNext()) {
                        throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (" + 0 + ")");
                    }
                    Object object0 = iterator0.next();
                    cookieManager0.setCookie(s, ((String)object0) + ((String)zzba.zzc().zzb(zzbbr.zzax)));
                }
            }
            return;
        }
        String s3 = (String)map0.get("cookie");
        if(TextUtils.isEmpty(s3)) {
            return;
        }
        String s4 = (String)zzba.zzc().zzb(zzbbr.zzaL);
        this.zza.setCookie(s4, s3);
    }
}

