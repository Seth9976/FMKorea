package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzgad {
    private final zzgnd zza;
    private final List zzb;
    private final zzgjt zzc;

    private zzgad(zzgnd zzgnd0, List list0) {
        this.zza = zzgnd0;
        this.zzb = list0;
        this.zzc = zzgjt.zza;
    }

    private zzgad(zzgnd zzgnd0, List list0, zzgjt zzgjt0) {
        this.zza = zzgnd0;
        this.zzb = list0;
        this.zzc = zzgjt0;
    }

    @Override
    public final String toString() {
        zzgnf zzgnf0 = zzgni.zza();
        zzgnf0.zzb(this.zza.zzc());
        for(Object object0: this.zza.zzh()) {
            zzgng zzgng0 = zzgnh.zza();
            zzgng0.zzc(((zzgnc)object0).zzc().zzg());
            zzgng0.zzd(((zzgnc)object0).zzk());
            zzgng0.zzb(((zzgnc)object0).zzf());
            zzgng0.zza(((zzgnc)object0).zza());
            zzgnf0.zza(((zzgnh)zzgng0.zzal()));
        }
        return ((zzgni)zzgnf0.zzal()).toString();
    }

    static final zzgad zza(zzgnd zzgnd0) {
        zzgad.zzi(zzgnd0);
        return new zzgad(zzgnd0, zzgad.zzh(zzgnd0));
    }

    static final zzgad zzb(zzgnd zzgnd0, zzgjt zzgjt0) {
        zzgad.zzi(zzgnd0);
        return new zzgad(zzgnd0, zzgad.zzh(zzgnd0), zzgjt0);
    }

    public static final zzgad zzc(zzgah zzgah0) {
        zzgaa zzgaa0 = new zzgaa();
        zzfzy zzfzy0 = new zzfzy(zzgah0, null);
        zzfzy0.zze();
        zzfzy0.zzd();
        zzgaa0.zza(zzfzy0);
        return zzgaa0.zzb();
    }

    final zzgnd zzd() {
        return this.zza;
    }

    public final Object zze(zzfzm zzfzm0, Class class0) {
        Class class1 = zzgar.zzb(class0);
        if(class1 == null) {
            throw new GeneralSecurityException("No wrapper found for " + class0.getName());
        }
        int v1 = this.zza.zzc();
        int v2 = 0;
        boolean z = false;
        int v3 = 1;
        for(Object object0: this.zza.zzh()) {
            zzgnc zzgnc0 = (zzgnc)object0;
            if(zzgnc0.zzk() == 3) {
                if(!zzgnc0.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", zzgnc0.zza()));
                }
                if(zzgnc0.zzf() == zzgnw.zza) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", zzgnc0.zza()));
                }
                if(zzgnc0.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", zzgnc0.zza()));
                }
                if(zzgnc0.zza() == v1) {
                    if(z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                v3 &= (zzgnc0.zzc().zzc() == zzgmp.zzd ? 1 : 0);
                ++v2;
            }
        }
        if(v2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if(!z && v3 == 0) {
            throw new GeneralSecurityException("keyset doesn\'t contain a valid primary key");
        }
        zzgaj zzgaj0 = new zzgaj(class1, null);
        zzgaj0.zzc(this.zzc);
        for(int v = 0; v < this.zza.zza(); ++v) {
            zzgnc zzgnc1 = this.zza.zze(v);
            if(zzgnc1.zzk() == 3) {
                Object object1 = zzgad.zzg(((zzgfl)zzfzm0), zzgnc1, class1);
                Object object2 = this.zzb.get(v) == null ? null : zzgad.zzj(((zzgfl)zzfzm0), ((zzgac)this.zzb.get(v)).zza(), class1);
                if(object2 == null && object1 == null) {
                    throw new GeneralSecurityException("Unable to get primitive " + class1.toString() + " for key of type " + zzgnc1.zzc().zzg());
                }
                if(zzgnc1.zza() == this.zza.zzc()) {
                    zzgaj0.zzb(object2, object1, zzgnc1);
                }
                else {
                    zzgaj0.zza(object2, object1, zzgnc1);
                }
            }
        }
        return zzggg.zza().zzd(zzgaj0.zzd(), class0);
    }

    private static zzghc zzf(zzgnc zzgnc0) {
        Integer integer0 = zzgnc0.zzf() == zzgnw.zzd ? null : zzgnc0.zza();
        try {
            return zzghc.zza(zzgnc0.zzc().zzg(), zzgnc0.zzc().zzf(), zzgnc0.zzc().zzc(), zzgnc0.zzf(), integer0);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new zzghp("Creating a protokey serialization failed", generalSecurityException0);
        }
    }

    private static Object zzg(zzgfl zzgfl0, zzgnc zzgnc0, Class class0) {
        try {
            zzgmq zzgmq0 = zzgnc0.zzc();
            return zzgar.zzc(zzgmq0.zzg(), zzgmq0.zzf(), class0);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            if(!generalSecurityException0.getMessage().contains("No key manager found for key type ") && !generalSecurityException0.getMessage().contains(" not supported by key manager of type ")) {
                throw generalSecurityException0;
            }
            return null;
        }
        catch(UnsupportedOperationException unused_ex) {
            return null;
        }
    }

    private static List zzh(zzgnd zzgnd0) {
        zzfzu zzfzu0;
        ArrayList arrayList0 = new ArrayList(zzgnd0.zza());
        for(Object object0: zzgnd0.zzh()) {
            zzgnc zzgnc0 = (zzgnc)object0;
            int v = zzgnc0.zza();
            zzghc zzghc0 = zzgad.zzf(zzgnc0);
            try {
                zzfzp zzfzp0 = zzggi.zzc().zza(zzghc0, zzgas.zza());
                switch(zzgnc0.zzk() - 2) {
                    case 1: {
                        zzfzu0 = zzfzu.zza;
                        break;
                    }
                    case 2: {
                        zzfzu0 = zzfzu.zzb;
                        break;
                    }
                    case 3: {
                        zzfzu0 = zzfzu.zzc;
                        break;
                    }
                    default: {
                        goto label_17;
                    }
                }
                arrayList0.add(new zzgac(zzfzp0, zzfzu0, v, v == zzgnd0.zzc(), null));
                continue;
            }
            catch(GeneralSecurityException unused_ex) {
            }
        label_17:
            arrayList0.add(null);
        }
        return Collections.unmodifiableList(arrayList0);
    }

    private static void zzi(zzgnd zzgnd0) {
        if(zzgnd0 == null || zzgnd0.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static final Object zzj(zzgfl zzgfl0, zzfzp zzfzp0, Class class0) {
        try {
            return zzggg.zza().zzc(zzfzp0, class0);
        }
        catch(GeneralSecurityException unused_ex) {
            return null;
        }
    }
}

