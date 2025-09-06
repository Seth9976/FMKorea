package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

public final class zzboc extends zzboe {
    private static final zzbqg zza;

    static {
        zzboc.zza = new zzbqg();
    }

    @Override  // com.google.android.gms.internal.ads.zzbof
    public final zzboi zzb(String s) {
        try {
            Class class0 = Class.forName(s, false, zzboc.class.getClassLoader());
            if(MediationAdapter.class.isAssignableFrom(class0)) {
                return new zzbpf(((MediationAdapter)class0.getDeclaredConstructor(null).newInstance(null)));
            }
            if(Adapter.class.isAssignableFrom(class0)) {
                return new zzbpf(((Adapter)class0.getDeclaredConstructor(null).newInstance(null)));
            }
            zzcaa.zzj(("Could not instantiate mediation adapter: " + s + " (not a valid adapter)."));
        }
        catch(Throwable unused_ex) {
        }
        try {
            zzcaa.zze("Reflection failed, retrying using direct instantiation");
            if("com.google.ads.mediation.admob.AdMobAdapter".equals(s)) {
                return new zzbpf(new AdMobAdapter());
            }
            if("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(s)) {
                return new zzbpf(new CustomEventAdapter());
            }
        }
        catch(Throwable throwable0) {
            zzcaa.zzk(("Could not instantiate mediation adapter: " + s + ". "), throwable0);
        }
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbof
    public final zzbqc zzc(String s) {
        try {
            return new zzbqo(((RtbAdapter)Class.forName(s, false, zzbqg.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null)));
        }
        catch(Throwable unused_ex) {
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbof
    public final boolean zzd(String s) {
        try {
            Class class0 = Class.forName(s, false, zzboc.class.getClassLoader());
            return Adapter.class.isAssignableFrom(class0);
        }
        catch(Throwable unused_ex) {
            zzcaa.zzj(("Could not load custom event implementation class as Adapter: " + s + ", assuming old custom event implementation."));
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbof
    public final boolean zze(String s) {
        try {
            Class class0 = Class.forName(s, false, zzboc.class.getClassLoader());
            return CustomEvent.class.isAssignableFrom(class0);
        }
        catch(Throwable unused_ex) {
            zzcaa.zzj(("Could not load custom event implementation class: " + s + ", trying Adapter implementation class."));
            return false;
        }
    }
}

