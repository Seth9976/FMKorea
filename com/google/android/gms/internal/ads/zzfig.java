package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzfig {
    private final zzehc zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfbs zzf;
    private final zzfbt zzg;
    private final Clock zzh;
    private final zzaqx zzi;

    public zzfig(zzehc zzehc0, zzcag zzcag0, String s, String s1, Context context0, zzfbs zzfbs0, zzfbt zzfbt0, Clock clock0, zzaqx zzaqx0) {
        this.zza = zzehc0;
        this.zzb = zzcag0.zza;
        this.zzc = s;
        this.zzd = s1;
        this.zze = context0;
        this.zzf = zzfbs0;
        this.zzg = zzfbt0;
        this.zzh = clock0;
        this.zzi = zzaqx0;
    }

    // 检测为 Lambda 实现
    static String zza(zzfbs zzfbs0) [...]

    // 检测为 Lambda 实现
    static String zzb(zzfbs zzfbs0) [...]

    public final List zzc(zzfbr zzfbr0, zzfbe zzfbe0, List list0) {
        return this.zzd(zzfbr0, zzfbe0, false, "", "", list0);
    }

    // This method was un-flattened
    public final List zzd(zzfbr zzfbr0, zzfbe zzfbe0, boolean z, String s, String s1, List list0) {
        List list1 = new ArrayList();
        Iterator iterator0 = list0.iterator();
        while(true) {
            int v = 1;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            String s2 = zzfig.zzi(zzfig.zzi(zzfig.zzi(((String)object0), "@gw_adlocid@", zzfbr0.zza.zza.zzf), "@gw_adnetrefresh@", (z ? "1" : "0")), "@gw_sdkver@", this.zzb);
            if(zzfbe0 != null) {
                s2 = zzbyh.zzc(zzfig.zzi(zzfig.zzi(zzfig.zzi(s2, "@gw_qdata@", zzfbe0.zzz), "@gw_adnetid@", zzfbe0.zzy), "@gw_allocid@", zzfbe0.zzx), this.zze, zzfbe0.zzX);
            }
            boolean z1 = false;
            String s3 = zzfig.zzi(zzfig.zzi(zzfig.zzi(s2, "@gw_adnetstatus@", this.zza.zzf()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzdl)).booleanValue() && !TextUtils.isEmpty(s)) {
                z1 = true;
                v = !TextUtils.isEmpty(s1);
                goto label_15;
            }
            else if(!TextUtils.isEmpty(s1)) {
            label_15:
                Uri uri0 = Uri.parse(s3);
                if(this.zzi.zzf(uri0)) {
                    Uri.Builder uri$Builder0 = Uri.parse(s3).buildUpon();
                    if(z1) {
                        uri$Builder0 = uri$Builder0.appendQueryParameter("ms", s);
                    }
                    if(v != 0) {
                        uri$Builder0 = uri$Builder0.appendQueryParameter("attok", s1);
                    }
                    s3 = uri$Builder0.build().toString();
                }
            }
            list1.add(s3);
        }
        return list1;
    }

    public final List zze(zzfbe zzfbe0, List list0, zzbvd zzbvd0) {
        zzfre zzfre0;
        String s1;
        String s;
        List list1 = new ArrayList();
        long v = this.zzh.currentTimeMillis();
        try {
            s = zzbvd0.zzc();
            s1 = Integer.toString(zzbvd0.zzb());
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Unable to determine award type and amount.", remoteException0);
            return list1;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzdm)).booleanValue()) {
            zzfbt zzfbt0 = this.zzg;
            zzfre0 = zzfbt0 == null ? zzfre.zzc() : zzfre.zzd(zzfbt0.zza);
        }
        else {
            zzfre0 = zzfre.zzd(this.zzf);
        }
        String s2 = (String)zzfre0.zza((zzfbs zzfbs0) -> zzfig.zzh(zzfbs0.zza)).zzb("");
        String s3 = (String)zzfre0.zza((zzfbs zzfbs0) -> zzfig.zzh(zzfbs0.zzb)).zzb("");
        for(Object object0: list0) {
            list1.add(zzbyh.zzc(zzfig.zzi(zzfig.zzi(zzfig.zzi(zzfig.zzi(zzfig.zzi(zzfig.zzi(((String)object0), "@gw_rwd_userid@", Uri.encode(s2)), "@gw_rwd_custom_data@", Uri.encode(s3)), "@gw_tmstmp@", Long.toString(v)), "@gw_rwd_itm@", Uri.encode(s)), "@gw_rwd_amt@", s1), "@gw_sdkver@", this.zzb), this.zze, zzfbe0.zzX));
        }
        return list1;
    }

    public static final List zzf(int v, int v1, List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(zzfig.zzi(((String)object0), "@gw_mpe@", "2." + v1));
        }
        return list1;
    }

    public static final List zzg(List list0, String s) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(zzfig.zzi(((String)object0), "@gw_adnetstatus@", s));
        }
        return list1;
    }

    private static String zzh(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        return zzbzz.zzk() ? "fakeForAdDebugLog" : s;
    }

    private static String zzi(String s, String s1, String s2) {
        if(TextUtils.isEmpty(s2)) {
            s2 = "";
        }
        return s.replaceAll(s1, s2);
    }
}

