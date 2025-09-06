package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

public final class zzgar {
    public static final int zza;
    private static final Logger zzb;
    private static final AtomicReference zzc;
    private static final ConcurrentMap zzd;
    private static final ConcurrentMap zze;
    private static final ConcurrentMap zzf;
    private static final ConcurrentMap zzg;

    static {
        zzgar.zzb = Logger.getLogger("com.google.android.gms.internal.ads.zzgar");
        zzgar.zzc = new AtomicReference(new zzfzt());
        zzgar.zzd = new ConcurrentHashMap();
        zzgar.zze = new ConcurrentHashMap();
        zzgar.zzf = new ConcurrentHashMap();
        zzgar.zzg = new ConcurrentHashMap();
    }

    public static zzgmq zza(zzgmv zzgmv0) {
        synchronized(zzgar.class) {
            zzfzq zzfzq0 = ((zzfzt)zzgar.zzc.get()).zzb(zzgmv0.zzh());
            if(((Boolean)zzgar.zze.get(zzgmv0.zzh())).booleanValue()) {
                return zzfzq0.zza(zzgmv0.zzg());
            }
        }
        throw new GeneralSecurityException("newKey-operation not permitted for key type " + zzgmv0.zzh());
    }

    public static Class zzb(Class class0) {
        try {
            return zzggg.zza().zzb(class0);
        }
        catch(GeneralSecurityException unused_ex) {
            return null;
        }
    }

    public static Object zzc(String s, zzgqi zzgqi0, Class class0) {
        return ((zzfzt)zzgar.zzc.get()).zza(s, class0).zzb(zzgqi0);
    }

    static Map zzd() {
        synchronized(zzgar.class) {
            return Collections.unmodifiableMap(zzgar.zzg);
        }
    }

    public static void zze(zzgfw zzgfw0, boolean z) {
        synchronized(zzgar.class) {
            zzfzt zzfzt0 = new zzfzt(((zzfzt)zzgar.zzc.get()));
            zzfzt0.zzc(zzgfw0);
            Map map0 = zzgfw0.zza().zzc();
            String s = zzgfw0.zzd();
            zzgar.zzg(s, map0, true);
            if(!((zzfzt)zzgar.zzc.get()).zzd(s)) {
                zzgaq zzgaq0 = new zzgaq(zzgfw0);
                zzgar.zzd.put(s, zzgaq0);
                for(Object object0: zzgfw0.zza().zzc().entrySet()) {
                    String s1 = (String)((Map.Entry)object0).getKey();
                    zzfzv zzfzv0 = zzfzv.zzc(s, ((zzgta)((zzgfu)((Map.Entry)object0).getValue()).zza).zzax(), ((zzgfu)((Map.Entry)object0).getValue()).zzb);
                    zzgar.zzg.put(s1, zzfzv0);
                }
            }
            zzgar.zze.put(s, Boolean.TRUE);
            zzgar.zzc.set(zzfzt0);
        }
    }

    public static void zzf(zzgap zzgap0) {
        synchronized(zzgar.class) {
            zzggg.zza().zzf(zzgap0);
        }
    }

    private static void zzg(String s, Map map0, boolean z) {
        synchronized(zzgar.class) {
            if(zzgar.zze.containsKey(s) && !((Boolean)zzgar.zze.get(s)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + s);
            }
            if(((zzfzt)zzgar.zzc.get()).zzd(s)) {
                for(Object object0: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    Object object1 = map$Entry0.getKey();
                    if(!zzgar.zzg.containsKey(object1)) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String)map$Entry0.getKey()) + " from an existing key manager of type " + s);
                    }
                }
            }
            else {
                for(Object object2: map0.entrySet()) {
                    Map.Entry map$Entry1 = (Map.Entry)object2;
                    Object object3 = map$Entry1.getKey();
                    if(zzgar.zzg.containsKey(object3)) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String)map$Entry1.getKey()));
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
    }
}

