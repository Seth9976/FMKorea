package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzfl;

public final class VideoOptions {
    public static final class Builder {
        private boolean zza;
        private boolean zzb;
        private boolean zzc;

        public Builder() {
            this.zza = true;
            this.zzb = false;
            this.zzc = false;
        }

        public VideoOptions build() {
            return new VideoOptions(this, null);
        }

        public Builder setClickToExpandRequested(boolean z) {
            this.zzc = z;
            return this;
        }

        public Builder setCustomControlsRequested(boolean z) {
            this.zzb = z;
            return this;
        }

        public Builder setStartMuted(boolean z) {
            this.zza = z;
            return this;
        }
    }

    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    VideoOptions(Builder videoOptions$Builder0, zzi zzi0) {
        this.zza = videoOptions$Builder0.zza;
        this.zzb = videoOptions$Builder0.zzb;
        this.zzc = videoOptions$Builder0.zzc;
    }

    public VideoOptions(zzfl zzfl0) {
        this.zza = zzfl0.zza;
        this.zzb = zzfl0.zzb;
        this.zzc = zzfl0.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }
}

