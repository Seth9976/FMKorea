package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

final class zzfmp implements zzflf {
    private final Object zza;
    private final zzfmq zzb;
    private final zzfnb zzc;
    private final zzflc zzd;

    zzfmp(Object object0, zzfmq zzfmq0, zzfnb zzfnb0, zzflc zzflc0) {
        this.zza = object0;
        this.zzb = zzfmq0;
        this.zzc = zzfnb0;
        this.zzd = zzflc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzflf
    public final String zza(Context context0, String s, String s1, View view0, Activity activity0) {
        synchronized(this) {
            Map map0 = this.zzc.zza();
            map0.put("f", "c");
            map0.put("ctx", context0);
            map0.put("cs", s1);
            map0.put("aid", null);
            map0.put("view", view0);
            map0.put("act", activity0);
            return zzfmp.zzi(this.zzj(null, map0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzflf
    public final String zzb(Context context0, String s, View view0, Activity activity0) {
        synchronized(this) {
            Map map0 = this.zzc.zzc();
            map0.put("f", "v");
            map0.put("ctx", context0);
            map0.put("aid", null);
            map0.put("view", view0);
            map0.put("act", activity0);
            return zzfmp.zzi(this.zzj(null, map0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzflf
    public final String zzc(Context context0, String s) {
        synchronized(this) {
            Map map0 = this.zzc.zzb();
            map0.put("f", "q");
            map0.put("ctx", context0);
            map0.put("aid", null);
            return zzfmp.zzi(this.zzj(null, map0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzflf
    public final void zzd(String s, MotionEvent motionEvent0) {
        synchronized(this) {
            try {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("t", new Throwable());
                hashMap0.put("aid", null);
                hashMap0.put("evt", motionEvent0);
                this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap0);
                this.zzd.zzd(3003, 0L);
            }
            catch(Exception exception0) {
                throw new zzfmz(2005, exception0);
            }
        }
    }

    public final int zze() {
        synchronized(this) {
            try {
                return (int)(((Integer)this.zza.getClass().getDeclaredMethod("lcs", null).invoke(this.zza, null)));
            }
            catch(Exception exception0) {
                throw new zzfmz(2006, exception0);
            }
        }
    }

    final zzfmq zzf() {
        return this.zzb;
    }

    public final void zzg() {
        synchronized(this) {
            try {
                this.zza.getClass().getDeclaredMethod("close", null).invoke(this.zza, null);
                this.zzd.zzd(3001, 0L);
            }
            catch(Exception exception0) {
                throw new zzfmz(2003, exception0);
            }
        }
    }

    final boolean zzh() {
        synchronized(this) {
            try {
                return ((Boolean)this.zza.getClass().getDeclaredMethod("init", null).invoke(this.zza, null)).booleanValue();
            }
            catch(Exception exception0) {
                throw new zzfmz(2001, exception0);
            }
        }
    }

    private static String zzi(byte[] arr_b) {
        if(arr_b == null) {
            return null;
        }
        zzape zzape0 = zzapf.zza();
        zzape0.zzc(5);
        zzape0.zza(zzgqi.zzv(arr_b, 0, arr_b.length));
        return Base64.encodeToString(((zzapf)zzape0.zzal()).zzax(), 11);
    }

    private final byte[] zzj(Map map0, Map map1) {
        synchronized(this) {
            long v1 = System.currentTimeMillis();
            try {
                return (byte[])this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map1);
            }
            catch(Exception exception0) {
                this.zzd.zzc(2007, System.currentTimeMillis() - v1, exception0);
                return null;
            }
        }
    }
}

