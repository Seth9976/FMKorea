package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzabq {
    public int zza;
    public int zzb;
    private static final Pattern zzc;

    static {
        zzabq.zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    }

    public zzabq() {
        this.zza = -1;
        this.zzb = -1;
    }

    public final boolean zza() {
        return this.zza != -1 && this.zzb != -1;
    }

    public final boolean zzb(zzbz zzbz0) {
        for(int v = 0; v < zzbz0.zza(); ++v) {
            zzby zzby0 = zzbz0.zzb(v);
            if(zzby0 instanceof zzael) {
                if("iTunSMPB".equals(((zzael)zzby0).zzb) && this.zzc(((zzael)zzby0).zzc)) {
                    return true;
                }
            }
            else if(zzby0 instanceof zzaeu && "com.apple.iTunes".equals(((zzaeu)zzby0).zza) && "iTunSMPB".equals(((zzaeu)zzby0).zzb) && this.zzc(((zzaeu)zzby0).zzc)) {
                return true;
            }
        }
        return false;
    }

    private final boolean zzc(String s) {
        Matcher matcher0 = zzabq.zzc.matcher(s);
        if(matcher0.find()) {
            try {
                int v = Integer.parseInt(matcher0.group(1), 16);
                int v1 = Integer.parseInt(matcher0.group(2), 16);
                if(v > 0 || v1 > 0) {
                    this.zza = v;
                    this.zzb = v1;
                    return true;
                }
                return false;
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return false;
    }
}

