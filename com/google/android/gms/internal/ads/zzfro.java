package com.google.android.gms.internal.ads;

final class zzfro extends zzfrt {
    final zzfrp zza;

    zzfro(zzfrp zzfrp0, zzfrv zzfrv0, CharSequence charSequence0) {
        this.zza = zzfrp0;
        super(zzfrv0, charSequence0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfrt
    final int zzc(int v) {
        return v + 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfrt
    final int zzd(int v) {
        zzfqt zzfqt0 = this.zza.zza;
        CharSequence charSequence0 = this.zzb;
        int v1 = charSequence0.length();
        zzfri.zzb(v, v1, "index");
        while(v < v1) {
            if(!zzfqt0.zzb(charSequence0.charAt(v))) {
                ++v;
                continue;
            }
            return v;
        }
        return -1;
    }
}

