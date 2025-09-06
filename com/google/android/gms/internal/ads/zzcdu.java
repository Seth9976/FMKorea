package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

public abstract class zzcdu implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcdu(zzccj zzccj0) {
        Context context0 = zzccj0.getContext();
        this.zza = context0;
        this.zzb = zzt.zzp().zzc(context0, zzccj0.zzn().zza);
        this.zzc = new WeakReference(zzccj0);
    }

    @Override  // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    static void zze(zzcdu zzcdu0, String s, Map map0) {
        zzccj zzccj0 = (zzccj)zzcdu0.zzc.get();
        if(zzccj0 != null) {
            zzccj0.zzd("onPrecacheEvent", map0);
        }
    }

    public abstract void zzf();

    public final void zzg(String s, String s1, String s2, String s3) {
        zzcdt zzcdt0 = new zzcdt(this, s, s1, s2, s3);
        zzbzt.zza.post(zzcdt0);
    }

    protected final void zzh(String s, String s1, int v) {
        zzcdr zzcdr0 = new zzcdr(this, s, s1, v);
        zzbzt.zza.post(zzcdr0);
    }

    public final void zzj(String s, String s1, long v) {
        zzcds zzcds0 = new zzcds(this, s, s1, v);
        zzbzt.zza.post(zzcds0);
    }

    public final void zzn(String s, String s1, int v, int v1, long v2, long v3, boolean z, int v4, int v5) {
        zzcdq zzcdq0 = new zzcdq(this, s, s1, v, v1, v2, v3, z, v4, v5);
        zzbzt.zza.post(zzcdq0);
    }

    public final void zzo(String s, String s1, long v, long v1, boolean z, long v2, long v3, long v4, int v5, int v6) {
        zzcdp zzcdp0 = new zzcdp(this, s, s1, v, v1, v2, v3, v4, z, v5, v6);
        zzbzt.zza.post(zzcdp0);
    }

    protected void zzp(int v) {
    }

    protected void zzq(int v) {
    }

    protected void zzr(int v) {
    }

    protected void zzs(int v) {
    }

    public abstract boolean zzt(String arg1);

    public boolean zzu(String s, String[] arr_s) {
        return this.zzt(s);
    }

    public boolean zzw(String s, String[] arr_s, zzcdm zzcdm0) {
        return this.zzt(s);
    }
}

