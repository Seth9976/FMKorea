package com.google.android.gms.ads.nativead;

import com.google.android.gms.ads.VideoOptions;

public final class NativeAdOptions {
    public @interface AdChoicesPlacement {
    }

    public static final class Builder {
        private boolean zza;
        private int zzb;
        private boolean zzc;
        private VideoOptions zzd;
        private int zze;
        private boolean zzf;
        private boolean zzg;
        private int zzh;

        public Builder() {
            this.zza = false;
            this.zzb = 0;
            this.zzc = false;
            this.zze = 1;
            this.zzf = false;
            this.zzg = false;
            this.zzh = 0;
        }

        public NativeAdOptions build() {
            return new NativeAdOptions(this, null);
        }

        public Builder enableCustomClickGestureDirection(@SwipeGestureDirection int v, boolean z) {
            this.zzg = z;
            this.zzh = v;
            return this;
        }

        public Builder setAdChoicesPlacement(@AdChoicesPlacement int v) {
            this.zze = v;
            return this;
        }

        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int v) {
            this.zzb = v;
            return this;
        }

        public Builder setRequestCustomMuteThisAd(boolean z) {
            this.zzf = z;
            return this;
        }

        public Builder setRequestMultipleImages(boolean z) {
            this.zzc = z;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean z) {
            this.zza = z;
            return this;
        }

        public Builder setVideoOptions(VideoOptions videoOptions0) {
            this.zzd = videoOptions0;
            return this;
        }

        static int zza(Builder nativeAdOptions$Builder0) {
            return nativeAdOptions$Builder0.zze;
        }

        static int zzb(Builder nativeAdOptions$Builder0) {
            return nativeAdOptions$Builder0.zzh;
        }

        static int zzc(Builder nativeAdOptions$Builder0) {
            return nativeAdOptions$Builder0.zzb;
        }

        static VideoOptions zzd(Builder nativeAdOptions$Builder0) {
            return nativeAdOptions$Builder0.zzd;
        }

        static boolean zze(Builder nativeAdOptions$Builder0) {
            return nativeAdOptions$Builder0.zzg;
        }

        static boolean zzf(Builder nativeAdOptions$Builder0) {
            return nativeAdOptions$Builder0.zzc;
        }

        static boolean zzg(Builder nativeAdOptions$Builder0) {
            return nativeAdOptions$Builder0.zza;
        }

        static boolean zzh(Builder nativeAdOptions$Builder0) {
            return nativeAdOptions$Builder0.zzf;
        }
    }

    public @interface NativeMediaAspectRatio {
    }

    public @interface SwipeGestureDirection {
    }

    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
    public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
    public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
    public static final int SWIPE_GESTURE_DIRECTION_UP = 4;
    private final boolean zza;
    private final int zzb;
    private final boolean zzc;
    private final int zzd;
    private final VideoOptions zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int zzh;

    NativeAdOptions(Builder nativeAdOptions$Builder0, zza zza0) {
        this.zza = Builder.zzg(nativeAdOptions$Builder0);
        this.zzb = Builder.zzc(nativeAdOptions$Builder0);
        this.zzc = Builder.zzf(nativeAdOptions$Builder0);
        this.zzd = Builder.zza(nativeAdOptions$Builder0);
        this.zze = Builder.zzd(nativeAdOptions$Builder0);
        this.zzf = Builder.zzh(nativeAdOptions$Builder0);
        this.zzg = Builder.zze(nativeAdOptions$Builder0);
        this.zzh = Builder.zzb(nativeAdOptions$Builder0);
    }

    public int getAdChoicesPlacement() {
        return this.zzd;
    }

    public int getMediaAspectRatio() {
        return this.zzb;
    }

    public VideoOptions getVideoOptions() {
        return this.zze;
    }

    public boolean shouldRequestMultipleImages() {
        return this.zzc;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.zza;
    }

    public final int zza() {
        return this.zzh;
    }

    public final boolean zzb() {
        return this.zzg;
    }

    public final boolean zzc() {
        return this.zzf;
    }
}

