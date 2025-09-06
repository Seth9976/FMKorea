package com.google.android.gms.internal.ads;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

class zzfog {
    static final String zza;
    final zzfoh zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    static {
        zzfog.zza = "00000000-0000-0000-0000-000000000000";
    }

    zzfog(Context context0, String s, String s1, String s2) {
        this.zzb = zzfoh.zzb(context0);
        this.zzc = s;
        this.zzd = s + "_3p";
        this.zze = s1;
        this.zzf = s1 + "_3p";
        this.zzg = s2;
    }

    // 去混淆评级： 低(20)
    final long zza(boolean z) {
        return z ? this.zzb.zza(this.zzf, -1L) : this.zzb.zza(this.zze, -1L);
    }

    final zzfof zzb(String s, String s1, long v, boolean z) {
        boolean z1 = true;
        if(s != null) {
            try {
                UUID.fromString(s);
            }
            catch(IllegalArgumentException unused_ex) {
                return new zzfof();
            }
            if(s.equals("00000000-0000-0000-0000-000000000000")) {
                return new zzfof();
            }
            String s2 = this.zze(true);
            String s3 = this.zzb.zzc("paid_3p_hash_key", null);
            if(s2 != null && s3 != null && !s2.equals(this.zzh(s, s1, s3))) {
                return this.zzc(s, s1);
            }
        }
        if(s == null) {
            z1 = false;
        }
        long v1 = System.currentTimeMillis();
        if(v1 < 0L) {
            throw new IllegalStateException(this.zzg + ": Invalid negative current timestamp. Updating PAID failed");
        }
        long v2 = this.zza(z1);
        if(v2 != -1L) {
            if(v1 < v2) {
                this.zzb.zzd((z1 ? this.zzf : this.zze), v1);
            }
            else if(v1 >= v2 + v) {
                return this.zzc(s, s1);
            }
        }
        String s4 = this.zze(z1);
        return s4 != null || z ? new zzfof(s4, this.zza(z1)) : this.zzc(s, s1);
    }

    final zzfof zzc(String s, String s1) {
        if(s == null) {
            return this.zzd("5832e1d5-f04a-45fe-8c8f-13520136050b", false);
        }
        this.zzb.zzd("paid_3p_hash_key", "ab0f94e1-a0df-4780-9111-8c2943d3a8d8");
        return this.zzd(this.zzh(s, s1, "ab0f94e1-a0df-4780-9111-8c2943d3a8d8"), true);
    }

    final zzfof zzd(String s, boolean z) {
        long v = System.currentTimeMillis();
        if(v < 0L) {
            throw new IllegalStateException(this.zzg + ": Invalid negative current timestamp. Updating PAID failed");
        }
        this.zzb.zzd((z ? this.zzf : this.zze), v);
        this.zzb.zzd((z ? this.zzd : this.zzc), s);
        return new zzfof(s, v);
    }

    // 去混淆评级： 低(20)
    final String zze(boolean z) {
        return z ? this.zzb.zzc(this.zzd, null) : this.zzb.zzc(this.zzc, null);
    }

    final void zzf(boolean z) {
        this.zzb.zze((z ? this.zzf : this.zze));
        this.zzb.zze((z ? this.zzd : this.zzc));
    }

    final boolean zzg(boolean z) {
        return this.zzb.zzg(this.zzc);
    }

    private final String zzh(String s, String s1, String s2) {
        if(s1 != null && s2 != null) {
            return UUID.nameUUIDFromBytes((s + s1 + s2).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.zzg);
        stringBuilder0.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        String s3 = "not null";
        stringBuilder0.append((s1 == null ? "null" : "not null"));
        stringBuilder0.append(", hashKey is ");
        if(s2 == null) {
            s3 = "null";
        }
        stringBuilder0.append(s3);
        throw new IllegalArgumentException(stringBuilder0.toString());
    }
}

