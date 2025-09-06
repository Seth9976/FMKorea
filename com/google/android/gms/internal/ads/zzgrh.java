package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

final class zzgrh {
    final zzgug zza;
    private static final zzgrh zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        zzgrh.zzb = new zzgrh(true);
    }

    private zzgrh() {
        this.zza = new zzgtw(16);
    }

    private zzgrh(boolean z) {
        zzgtw zzgtw0 = new zzgtw(0);
        super();
        this.zza = zzgtw0;
        this.zzb();
        this.zzb();
    }

    @Override
    public final Object clone() {
        zzgrh zzgrh0 = new zzgrh();
        for(int v = 0; v < this.zza.zzb(); ++v) {
            Map.Entry map$Entry0 = this.zza.zzg(v);
            zzgrh0.zzc(((zzgrg)map$Entry0.getKey()), map$Entry0.getValue());
        }
        for(Object object0: this.zza.zzc()) {
            zzgrh0.zzc(((zzgrg)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        zzgrh0.zzd = this.zzd;
        return zzgrh0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzgrh ? this.zza.equals(((zzgrh)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public static zzgrh zza() {
        throw null;
    }

    public final void zzb() {
        if(!this.zzc) {
            for(int v = 0; v < this.zza.zzb(); ++v) {
                Map.Entry map$Entry0 = this.zza.zzg(v);
                if(map$Entry0.getValue() instanceof zzgrq) {
                    ((zzgrq)map$Entry0.getValue()).zzaS();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzc(zzgrg zzgrg0, Object object0) {
        if(zzgrg0.zzc()) {
            if(!(object0 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(((List)object0));
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                zzgrh.zzd(zzgrg0, arrayList0.get(v1));
            }
            object0 = arrayList0;
        }
        else {
            zzgrh.zzd(zzgrg0, object0);
        }
        if(object0 instanceof zzgsf) {
            this.zzd = true;
        }
        this.zza.zze(zzgrg0, object0);
    }

    private static final void zzd(zzgrg zzgrg0, Object object0) {
        boolean z;
        zzgva zzgva0 = zzgrg0.zzb();
        object0.getClass();
        switch(zzgva0.zza().ordinal()) {
            case 0: {
                z = object0 instanceof Integer;
                goto label_15;
            }
            case 1: {
                z = object0 instanceof Long;
                goto label_15;
            }
            case 2: {
                z = object0 instanceof Float;
                goto label_15;
            }
            case 3: {
                z = object0 instanceof Double;
                goto label_15;
            }
            case 4: {
                z = object0 instanceof Boolean;
                goto label_15;
            }
            case 5: {
                z = object0 instanceof String;
            label_15:
                if(z) {
                    return;
                }
                break;
            }
            case 6: {
                if(object0 instanceof zzgqi || object0 instanceof byte[]) {
                    return;
                }
                break;
            }
            case 7: {
                if(object0 instanceof Integer || object0 instanceof zzgrs) {
                    return;
                }
                break;
            }
            case 8: {
                if(object0 instanceof zzgta || object0 instanceof zzgsf) {
                    return;
                }
            }
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", zzgrg0.zza(), zzgrg0.zzb().zza(), object0.getClass().getName()));
    }
}

