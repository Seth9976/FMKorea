package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import org.json.JSONObject;

public final class zzdzy extends zzbuc {
    private final Context zza;
    private final zzetx zzb;
    private final zzetv zzc;
    private final zzeag zzd;
    private final zzfyo zze;
    private final zzead zzf;
    private final zzbuz zzg;

    zzdzy(Context context0, zzetx zzetx0, zzetv zzetv0, zzead zzead0, zzeag zzeag0, zzfyo zzfyo0, zzbuz zzbuz0) {
        this.zza = context0;
        this.zzb = zzetx0;
        this.zzc = zzetv0;
        this.zzf = zzead0;
        this.zzd = zzeag0;
        this.zze = zzfyo0;
        this.zzg = zzbuz0;
    }

    public final d zzb(zzbtv zzbtv0, int v) {
        d d0;
        String s = zzbtv0.zza;
        int v1 = zzbtv0.zzb;
        Bundle bundle0 = zzbtv0.zzc;
        HashMap hashMap0 = new HashMap();
        if(bundle0 != null) {
            for(Object object0: bundle0.keySet()) {
                String s1 = (String)object0;
                String s2 = bundle0.getString(s1);
                if(s2 != null) {
                    hashMap0.put(s1, s2);
                }
            }
        }
        zzeaa zzeaa0 = new zzeaa(s, v1, hashMap0, zzbtv0.zzd, "", zzbtv0.zze);
        zzevc zzevc0 = new zzevc(zzbtv0);
        this.zzc.zza(zzevc0);
        zzetw zzetw0 = this.zzc.zzb();
        if(zzeaa0.zzf) {
            String s3 = zzbtv0.zza;
            if(!TextUtils.isEmpty("googleads.g.doubleclick.net;pubads.g.doubleclick.net")) {
                String s4 = Uri.parse(s3).getHost();
                if(!TextUtils.isEmpty(s4)) {
                    for(Object object1: zzfrv.zzc(zzfqt.zzc(';')).zzd("googleads.g.doubleclick.net;pubads.g.doubleclick.net")) {
                        if(!s4.endsWith(((String)object1))) {
                            continue;
                        }
                        d0 = zzfye.zzm(zzetw0.zza().zza(new JSONObject()), new zzdzw(zzeaa0), this.zze);
                        goto label_29;
                    }
                }
            }
        }
        d0 = zzfye.zzh(zzeaa0);
    label_29:
        zzfge zzfge0 = zzetw0.zzb();
        zzeac zzeac0 = new zzeac(this.zza, "", this.zzg, v);
        return zzfye.zzn(zzfge0.zzb(zzffy.zzi, d0).zze(zzeac0).zza(), zzdzs.zza, this.zze);
    }

    private final void zzc(d d0, zzbug zzbug0) {
        zzfye.zzr(zzfye.zzn(zzfxv.zzu(d0), new zzdzq(this), zzcan.zza), new zzdzx(this, zzbug0), zzcan.zzf);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zze(zzbtv zzbtv0, zzbug zzbug0) {
        this.zzc(this.zzb(zzbtv0, Binder.getCallingUid()), zzbug0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbud
    public final void zzf(zzbtr zzbtr0, zzbug zzbug0) {
        zzetm zzetm0 = new zzetm(zzbtr0, Binder.getCallingUid());
        this.zzb.zza(zzetm0);
        zzety zzety0 = this.zzb.zzb();
        zzffj zzffj0 = zzety0.zzb().zzb(zzffy.zze, zzfye.zzi()).zzf(new zzdzv(zzety0)).zze(zzdzu.zza).zzf((/* 缺少Lambda参数 */) -> zzfye.zzh(new ByteArrayInputStream(((JSONObject)object0).toString().getBytes(StandardCharsets.UTF_8)))).zza();
        this.zzc(zzffj0, zzbug0);
        if(((Boolean)zzbdk.zzd.zze()).booleanValue()) {
            this.zzd.getClass();
            zzffj0.addListener(new zzdzr(this.zzd), this.zze);
        }
    }
}

