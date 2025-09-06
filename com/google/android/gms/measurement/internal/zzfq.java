package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfq {
    private static final AtomicReference zza;
    private static final AtomicReference zzb;
    private static final AtomicReference zzc;
    private final zzfp zzd;

    static {
        zzfq.zza = new AtomicReference();
        zzfq.zzb = new AtomicReference();
        zzfq.zzc = new AtomicReference();
    }

    public zzfq(zzfp zzfp0) {
        this.zzd = zzfp0;
    }

    private static String zza(String s, String[] arr_s, String[] arr_s1, AtomicReference atomicReference0) {
        String[] arr_s2;
        Preconditions.checkNotNull(arr_s);
        Preconditions.checkNotNull(arr_s1);
        Preconditions.checkNotNull(atomicReference0);
        int v = 0;
        Preconditions.checkArgument(arr_s.length == arr_s1.length);
        while(v < arr_s.length) {
            String s1 = arr_s[v];
            if(s != s1 && (s == null || !s.equals(s1))) {
                ++v;
                continue;
            }
            synchronized(atomicReference0) {
                arr_s2 = (String[])atomicReference0.get();
                if(arr_s2 == null) {
                    arr_s2 = new String[arr_s1.length];
                    atomicReference0.set(arr_s2);
                }
                if(arr_s2[v] == null) {
                    arr_s2[v] = arr_s1[v] + "(" + arr_s[v] + ")";
                }
            }
            return arr_s2[v];
        }
        return s;
    }

    private final String zza(Object[] arr_object) {
        if(arr_object == null) {
            return "[]";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("[");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            String s = object0 instanceof Bundle ? this.zza(((Bundle)object0)) : String.valueOf(object0);
            if(s != null) {
                if(stringBuilder0.length() != 1) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(s);
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    protected final String zza(Bundle bundle0) {
        String s;
        if(bundle0 == null) {
            return null;
        }
        if(!this.zzd.zza()) {
            return bundle0.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Bundle[{");
        for(Object object0: bundle0.keySet()) {
            if(stringBuilder0.length() != 8) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(this.zzb(((String)object0)));
            stringBuilder0.append("=");
            Object object1 = bundle0.get(((String)object0));
            if(object1 instanceof Bundle) {
                s = this.zza(new Object[]{object1});
            }
            else if(object1 instanceof Object[]) {
                s = this.zza(((Object[])object1));
            }
            else {
                s = object1 instanceof ArrayList ? this.zza(((ArrayList)object1).toArray()) : String.valueOf(object1);
            }
            stringBuilder0.append(s);
        }
        stringBuilder0.append("}]");
        return stringBuilder0.toString();
    }

    protected final String zza(zzbg zzbg0) {
        String s = null;
        if(zzbg0 == null) {
            return null;
        }
        if(!this.zzd.zza()) {
            return zzbg0.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("origin=");
        stringBuilder0.append(zzbg0.zzc);
        stringBuilder0.append(",name=");
        stringBuilder0.append(this.zza(zzbg0.zza));
        stringBuilder0.append(",params=");
        zzbb zzbb0 = zzbg0.zzb;
        if(zzbb0 != null) {
            s = this.zzd.zza() ? this.zza(zzbb0.zzb()) : zzbb0.toString();
        }
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    protected final String zza(String s) {
        if(s == null) {
            return null;
        }
        return this.zzd.zza() ? zzfq.zza(s, zzii.zzc, zzii.zza, zzfq.zza) : s;
    }

    protected final String zzb(String s) {
        if(s == null) {
            return null;
        }
        return this.zzd.zza() ? zzfq.zza(s, zzik.zzb, zzik.zza, zzfq.zzb) : s;
    }

    protected final String zzc(String s) {
        if(s == null) {
            return null;
        }
        if(!this.zzd.zza()) {
            return s;
        }
        return s.startsWith("_exp_") ? "experiment_id(" + s + ")" : zzfq.zza(s, zzij.zzb, zzij.zza, zzfq.zzc);
    }
}

