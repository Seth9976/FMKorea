package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class zzgaj {
    private final Class zza;
    private ConcurrentMap zzb;
    private final List zzc;
    private zzgak zzd;
    private zzgjt zze;

    zzgaj(Class class0, zzgai zzgai0) {
        this.zzb = new ConcurrentHashMap();
        this.zzc = new ArrayList();
        this.zza = class0;
        this.zze = zzgjt.zza;
    }

    public final zzgaj zza(Object object0, Object object1, zzgnc zzgnc0) {
        this.zze(object0, object1, zzgnc0, false);
        return this;
    }

    public final zzgaj zzb(Object object0, Object object1, zzgnc zzgnc0) {
        this.zze(object0, object1, zzgnc0, true);
        return this;
    }

    public final zzgaj zzc(zzgjt zzgjt0) {
        if(this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzgjt0;
        return this;
    }

    public final zzgao zzd() {
        ConcurrentMap concurrentMap0 = this.zzb;
        if(concurrentMap0 == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzgao zzgao0 = new zzgao(concurrentMap0, this.zzc, this.zzd, this.zze, this.zza, null);
        this.zzb = null;
        return zzgao0;
    }

    private final zzgaj zze(Object object0, Object object1, zzgnc zzgnc0, boolean z) {
        byte[] arr_b;
        if(this.zzb == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if(object0 == null && object1 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if(zzgnc0.zzk() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        zzfzp zzfzp0 = zzggi.zzc().zza(zzghc.zza(zzgnc0.zzc().zzg(), zzgnc0.zzc().zzf(), zzgnc0.zzc().zzc(), zzgnc0.zzf(), (zzgnc0.zzf() == zzgnw.zzd ? null : zzgnc0.zza())), zzgas.zza());
        int v = zzgnc0.zzf().ordinal();
        if(v == 1) {
            arr_b = ByteBuffer.allocate(5).put(1).putInt(zzgnc0.zza()).array();
        }
        else {
            switch(v) {
                case 2: {
                    arr_b = ByteBuffer.allocate(5).put(0).putInt(zzgnc0.zza()).array();
                    break;
                }
                case 3: {
                    arr_b = zzfzn.zza;
                    break;
                }
                default: {
                    if(v != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    arr_b = ByteBuffer.allocate(5).put(0).putInt(zzgnc0.zza()).array();
                }
            }
        }
        zzgak zzgak0 = new zzgak(object0, object1, arr_b, zzgnc0.zzk(), zzgnc0.zzf(), zzgnc0.zza(), zzgnc0.zzc().zzg(), zzfzp0);
        ConcurrentMap concurrentMap0 = this.zzb;
        List list0 = this.zzc;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(zzgak0);
        zzgam zzgam0 = new zzgam(zzgak0.zzg(), null);
        List list1 = (List)concurrentMap0.put(zzgam0, Collections.unmodifiableList(arrayList0));
        if(list1 != null) {
            ArrayList arrayList1 = new ArrayList();
            arrayList1.addAll(list1);
            arrayList1.add(zzgak0);
            concurrentMap0.put(zzgam0, Collections.unmodifiableList(arrayList1));
        }
        list0.add(zzgak0);
        if(z) {
            if(this.zzd != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.zzd = zzgak0;
            return this;
        }
        return this;
    }
}

