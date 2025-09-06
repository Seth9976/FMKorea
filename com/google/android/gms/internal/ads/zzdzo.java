package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import org.json.JSONObject;

public final class zzdzo extends zzbty {
    private final Context zza;
    private final zzfyo zzb;
    private final zzeag zzc;
    private final zzcmp zzd;
    private final ArrayDeque zze;
    private final zzfhu zzf;
    private final zzbuz zzg;
    private final zzead zzh;

    public zzdzo(Context context0, zzfyo zzfyo0, zzbuz zzbuz0, zzcmp zzcmp0, zzeag zzeag0, ArrayDeque arrayDeque0, zzead zzead0, zzfhu zzfhu0) {
        zzbbr.zza(context0);
        this.zza = context0;
        this.zzb = zzfyo0;
        this.zzg = zzbuz0;
        this.zzc = zzeag0;
        this.zzd = zzcmp0;
        this.zze = arrayDeque0;
        this.zzh = zzead0;
        this.zzf = zzfhu0;
    }

    public final d zzb(zzbun zzbun0, int v) {
        if(!((Boolean)zzbdq.zza.zze()).booleanValue()) {
            return zzfye.zzg(new Exception("Split request is disabled."));
        }
        zzfdu zzfdu0 = zzbun0.zzi;
        if(zzfdu0 == null) {
            return zzfye.zzg(new Exception("Pool configuration missing from request."));
        }
        if(zzfdu0.zzc != 0 && zzfdu0.zzd != 0) {
            zzcag zzcag0 = zzcag.zza();
            zzbni zzbni0 = zzt.zzf().zzb(this.zza, zzcag0, this.zzf);
            zzeth zzeth0 = this.zzd.zzq(zzbun0, v);
            zzfge zzfge0 = zzeth0.zzc();
            d d0 = zzdzo.zzm(zzbun0, zzfge0, zzeth0);
            zzfhr zzfhr0 = zzeth0.zzd();
            zzfhg zzfhg0 = zzfhf.zza(this.zza, 9);
            d d1 = zzdzo.zzl(d0, zzfge0, zzbni0, zzfhr0, zzfhg0);
            return zzfge0.zza(zzffy.zzy, new d[]{d0, d1}).zza(() -> {
                String s = ((zzbuq)d1.get()).zzc();
                Object object0 = d0.get();
                this.zzn(new zzdzl(((zzbuq)d1.get()), ((JSONObject)object0), zzbun0.zzh, s, zzfhg0));
                return new ByteArrayInputStream(s.getBytes(zzfqu.zzc));
            }).zza();
        }
        return zzfye.zzg(new Exception("Caching is disabled."));
    }

    public final d zzc(zzbun zzbun0, int v) {
        d d2;
        zzdzl zzdzl0 = null;
        zzcag zzcag0 = zzcag.zza();
        zzbni zzbni0 = zzt.zzf().zzb(this.zza, zzcag0, this.zzf);
        zzeth zzeth0 = this.zzd.zzq(zzbun0, v);
        zzbmy zzbmy0 = zzbni0.zza("google.afma.response.normalize", zzdzn.zza, zzbnf.zzb);
        if(((Boolean)zzbdq.zza.zze()).booleanValue()) {
            zzdzl0 = this.zzk(zzbun0.zzh);
            if(zzdzl0 == null) {
                zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        else if(zzbun0.zzj != null && !zzbun0.zzj.isEmpty()) {
            zze.zza("Request contained a PoolKey but split request is disabled.");
        }
        zzfhg zzfhg0 = zzdzl0 == null ? zzfhf.zza(this.zza, 9) : zzdzl0.zze;
        zzfhr zzfhr0 = zzeth0.zzd();
        zzfhr0.zzd(zzbun0.zza.getStringArrayList("ad_types"));
        zzeaf zzeaf0 = new zzeaf(zzbun0.zzg, zzfhr0, zzfhg0);
        zzeac zzeac0 = new zzeac(this.zza, zzbun0.zzb.zza, this.zzg, v);
        zzfge zzfge0 = zzeth0.zzc();
        zzfhg zzfhg1 = zzfhf.zza(this.zza, 11);
        if(zzdzl0 == null) {
            d d0 = zzdzo.zzm(zzbun0, zzfge0, zzeth0);
            d d1 = zzdzo.zzl(d0, zzfge0, zzbni0, zzfhr0, zzfhg0);
            zzfhg zzfhg2 = zzfhf.zza(this.zza, 10);
            zzffj zzffj0 = zzfge0.zza(zzffy.zzi, new d[]{d1, d0}).zza(new zzdzc(d0, d1)).zze(zzeaf0).zze(new zzfhm(zzfhg2)).zze(zzeac0).zza();
            zzfhq.zza(zzffj0, zzfhr0, zzfhg2);
            zzfhq.zzd(zzffj0, zzfhg1);
            d2 = zzfge0.zza(zzffy.zzk, new d[]{d0, d1, zzffj0}).zza(new zzdzd(zzffj0, d0, d1)).zzf(zzbmy0).zza();
        }
        else {
            zzeae zzeae0 = new zzeae(zzdzl0.zzb, zzdzl0.zza);
            zzfhg zzfhg3 = zzfhf.zza(this.zza, 10);
            d d3 = zzfye.zzh(zzeae0);
            zzffj zzffj1 = zzfge0.zzb(zzffy.zzi, d3).zze(zzeaf0).zze(new zzfhm(zzfhg3)).zze(zzeac0).zza();
            zzfhq.zza(zzffj1, zzfhr0, zzfhg3);
            d d4 = zzfye.zzh(zzdzl0);
            zzfhq.zzd(zzffj1, zzfhg1);
            d2 = zzfge0.zza(zzffy.zzk, new d[]{zzffj1, d4}).zza(new zzdzh(zzffj1, d4)).zzf(zzbmy0).zza();
        }
        zzfhq.zza(d2, zzfhr0, zzfhg1);
        return d2;
    }

    public final d zzd(zzbun zzbun0, int v) {
        zzcag zzcag0 = zzcag.zza();
        zzbni zzbni0 = zzt.zzf().zzb(this.zza, zzcag0, this.zzf);
        if(!((Boolean)zzbdv.zza.zze()).booleanValue()) {
            return zzfye.zzg(new Exception("Signal collection disabled."));
        }
        zzeth zzeth0 = this.zzd.zzq(zzbun0, v);
        zzesm zzesm0 = zzeth0.zza();
        zzbmy zzbmy0 = zzbni0.zza("google.afma.request.getSignals", zzbnf.zza, zzbnf.zzb);
        zzfhg zzfhg0 = zzfhf.zza(this.zza, 22);
        zzfge zzfge0 = zzeth0.zzc();
        d d0 = zzfye.zzh(zzbun0.zza);
        d d1 = zzfge0.zzb(zzffy.zzl, d0).zze(new zzfhm(zzfhg0)).zzf(new zzdzg(zzesm0)).zzb(zzffy.zzm).zzf(zzbmy0).zza();
        zzfhr zzfhr0 = zzeth0.zzd();
        zzfhr0.zzd(zzbun0.zza.getStringArrayList("ad_types"));
        zzfhq.zzb(d1, zzfhr0, zzfhg0);
        if(((Boolean)zzbdk.zze.zze()).booleanValue()) {
            this.zzc.getClass();
            d1.addListener(new zzdzb(this.zzc), this.zzb);
        }
        return d1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbtz
    public final void zze(zzbun zzbun0, zzbuj zzbuj0) {
        this.zzp(this.zzb(zzbun0, Binder.getCallingUid()), zzbuj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbtz
    public final void zzf(zzbun zzbun0, zzbuj zzbuj0) {
        this.zzp(this.zzd(zzbun0, Binder.getCallingUid()), zzbuj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbtz
    public final void zzg(zzbun zzbun0, zzbuj zzbuj0) {
        d d0 = this.zzc(zzbun0, Binder.getCallingUid());
        this.zzp(d0, zzbuj0);
        if(((Boolean)zzbdk.zzc.zze()).booleanValue()) {
            this.zzc.getClass();
            d0.addListener(new zzdzb(this.zzc), this.zzb);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbtz
    public final void zzh(String s, zzbuj zzbuj0) {
        this.zzp(this.zzi(s), zzbuj0);
    }

    public final d zzi(String s) {
        if(!((Boolean)zzbdq.zza.zze()).booleanValue()) {
            return zzfye.zzg(new Exception("Split request is disabled."));
        }
        zzdzj zzdzj0 = new zzdzj(this);
        return this.zzk(s) == null ? zzfye.zzg(new Exception("URL to be removed not found for cache key: " + s)) : zzfye.zzh(zzdzj0);
    }

    // 检测为 Lambda 实现
    final InputStream zzj(d d0, d d1, zzbun zzbun0, zzfhg zzfhg0) [...]

    private final zzdzl zzk(String s) {
        synchronized(this) {
            Iterator iterator0 = this.zze.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                zzdzl zzdzl0 = (zzdzl)object0;
                if(zzdzl0.zzc.equals(s)) {
                    iterator0.remove();
                    return zzdzl0;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
    }

    private static d zzl(d d0, zzfge zzfge0, zzbni zzbni0, zzfhr zzfhr0, zzfhg zzfhg0) {
        zzbmy zzbmy0 = zzbni0.zza("AFMA_getAdDictionary", zzbnf.zza, (JSONObject jSONObject0) -> new zzbuq(jSONObject0));
        zzfhq.zzd(d0, zzfhg0);
        d d1 = zzfge0.zzb(zzffy.zzg, d0).zzf(zzbmy0).zza();
        zzfhq.zzc(d1, zzfhr0, zzfhg0);
        return d1;
    }

    private static d zzm(zzbun zzbun0, zzfge zzfge0, zzeth zzeth0) {
        zzdyz zzdyz0 = new zzdyz(zzeth0);
        d d0 = zzfye.zzh(zzbun0.zza);
        return zzfge0.zzb(zzffy.zze, d0).zzf(zzdyz0).zze(zzdza.zza).zza();
    }

    private final void zzn(zzdzl zzdzl0) {
        synchronized(this) {
            this.zzo();
            this.zze.addLast(zzdzl0);
        }
    }

    private final void zzo() {
        synchronized(this) {
            int v1 = ((Long)zzbdq.zzc.zze()).intValue();
            while(this.zze.size() >= v1) {
                this.zze.removeFirst();
            }
        }
    }

    private final void zzp(d d0, zzbuj zzbuj0) {
        zzfye.zzr(zzfye.zzn(d0, new zzdzi(this), zzcan.zza), new zzdzk(this, zzbuj0), zzcan.zzf);
    }
}

