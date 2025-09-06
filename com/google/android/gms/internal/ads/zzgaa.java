package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class zzgaa {
    private final List zza;
    private final zzgjt zzb;
    private boolean zzc;

    public zzgaa() {
        this.zza = new ArrayList();
        this.zzb = zzgjt.zza;
        this.zzc = false;
    }

    public final zzgaa zza(zzfzy zzfzy0) {
        if(zzfzy0.zzf != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if(zzfzy0.zza) {
            this.zzd();
        }
        zzfzy0.zzf = this;
        this.zza.add(zzfzy0);
        return this;
    }

    public final zzgad zzb() {
        if(this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        zzgna zzgna0 = zzgnd.zzd();
        List list0 = this.zza;
        for(int v = 0; v < list0.size() - 1; ++v) {
            if(((zzfzy)list0.get(v)).zze == zzfzz.zza && ((zzfzy)list0.get(v + 1)).zze != zzfzz.zza) {
                throw new GeneralSecurityException("Entries with \'withRandomId()\' may only be followed by other entries with \'withRandomId()\'.");
            }
        }
        HashSet hashSet0 = new HashSet();
        Integer integer0 = null;
        Iterator iterator0 = this.zza.iterator();
        while(iterator0.hasNext()) {
            int v1 = 3;
            Object object0 = iterator0.next();
            if(((zzfzy)object0).zze == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if(((zzfzy)object0).zze == zzfzz.zza) {
                int v2;
                for(v2 = 0; v2 == 0 || hashSet0.contains(v2); v2 = v3) {
                    SecureRandom secureRandom0 = new SecureRandom();
                    byte[] arr_b = new byte[4];
                    int v3;
                    for(v3 = 0; v3 == 0; v3 = (arr_b[0] & 0x7F) << 24 | (arr_b[1] & 0xFF) << 16 | (arr_b[2] & 0xFF) << 8 | arr_b[3] & 0xFF) {
                        secureRandom0.nextBytes(arr_b);
                    }
                }
            }
            else {
                v2 = 0;
            }
            Integer integer1 = v2;
            if(hashSet0.contains(integer1)) {
                throw new GeneralSecurityException("Id " + v2 + " is used twice in the keyset");
            }
            hashSet0.add(integer1);
            zzgah zzgah0 = ((zzfzy)object0).zzd;
            zzfzu zzfzu0 = ((zzfzy)object0).zzc();
            if(!zzfzu.zza.equals(zzfzu0)) {
                if(zzfzu.zzb.equals(zzfzu0)) {
                    v1 = 4;
                }
                else {
                    if(!zzfzu.zzc.equals(zzfzu0)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    v1 = 5;
                }
            }
            zzghh zzghh0 = zzgah0 instanceof zzgfz ? ((zzgfz)zzgah0).zza() : zzggi.zzc().zzd(zzgah0, zzghd.class);
            zzgmq zzgmq0 = zzgar.zza(((zzghd)zzghh0).zzc());
            zzgnb zzgnb0 = zzgnc.zzd();
            zzgnb0.zzb(v2);
            zzgnb0.zzd(v1);
            zzgnb0.zza(zzgmq0);
            zzgnb0.zzc(((zzghd)zzghh0).zzc().zzf());
            zzgna0.zza(((zzgnc)zzgnb0.zzal()));
            if(((zzfzy)object0).zza) {
                if(integer0 != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                integer0 = integer1;
            }
        }
        if(integer0 == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzgna0.zzb(((int)integer0));
        return zzgad.zzb(((zzgnd)zzgna0.zzal()), this.zzb);
    }

    static void zzc(zzgaa zzgaa0) {
        zzgaa0.zzd();
    }

    private final void zzd() {
        for(Object object0: this.zza) {
            zzfzy.zzj(((zzfzy)object0), false);
        }
    }
}

