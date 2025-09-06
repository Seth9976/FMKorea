package com.google.android.gms.internal.ads;

final class zzqj implements zzpb {
    final zzqk zza;

    zzqj(zzqk zzqk0, zzqi zzqi0) {
        this.zza = zzqk0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzpb
    public final void zza(Exception exception0) {
        zzes.zzd("MediaCodecAudioRenderer", "Audio sink error", exception0);
        zzqk.zzaa(this.zza).zzb(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zzpb
    public final void zzb() {
        zzqk zzqk0 = this.zza;
        if(zzqk.zzZ(zzqk0) != null) {
            zzqk.zzZ(zzqk0).zzb();
        }
    }
}

