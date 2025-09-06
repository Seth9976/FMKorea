package com.google.android.gms.internal.ads;

abstract class zzfrt extends zzfqn {
    final CharSequence zzb;
    final zzfqt zzc;
    int zzd;
    int zze;

    protected zzfrt(zzfrv zzfrv0, CharSequence charSequence0) {
        this.zzd = 0;
        this.zzc = zzfrv.zza(zzfrv0);
        this.zze = 0x7FFFFFFF;
        this.zzb = charSequence0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqn
    protected final Object zza() {
        int v3;
        int v = this.zzd;
        int v1;
        while((v1 = this.zzd) != -1) {
            int v2 = this.zzd(v1);
            if(v2 == -1) {
                v2 = this.zzb.length();
                this.zzd = -1;
                v3 = -1;
            }
            else {
                v3 = this.zzc(v2);
                this.zzd = v3;
            }
            if(v3 == v) {
                this.zzd = v3 + 1;
                if(v3 + 1 <= this.zzb.length()) {
                    continue;
                }
                this.zzd = -1;
                continue;
            }
            if(v < v2) {
                this.zzb.charAt(v);
            }
            if(v < v2) {
                this.zzb.charAt(v2 - 1);
            }
            int v4 = this.zze;
            if(v4 == 1) {
                v2 = this.zzb.length();
                this.zzd = -1;
                if(v2 > v) {
                    this.zzb.charAt(v2 - 1);
                    return this.zzb.subSequence(v, v2).toString();
                }
            }
            else {
                this.zze = v4 - 1;
            }
            return this.zzb.subSequence(v, v2).toString();
        }
        this.zzb();
        return null;
    }

    abstract int zzc(int arg1);

    abstract int zzd(int arg1);
}

