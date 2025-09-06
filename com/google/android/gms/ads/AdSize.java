package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaa;

public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER = null;
    public static final AdSize FLUID = null;
    public static final AdSize FULL_BANNER = null;
    public static final int FULL_WIDTH = -1;
    public static final AdSize INVALID;
    public static final AdSize LARGE_BANNER;
    public static final AdSize LEADERBOARD;
    public static final AdSize MEDIUM_RECTANGLE;
    public static final AdSize SEARCH;
    @Deprecated
    public static final AdSize SMART_BANNER;
    public static final AdSize WIDE_SKYSCRAPER;
    public static final AdSize zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;

    static {
        AdSize.BANNER = new AdSize(320, 50, "320x50_mb");
        AdSize.FULL_BANNER = new AdSize(468, 60, "468x60_as");
        AdSize.LARGE_BANNER = new AdSize(320, 100, "320x100_as");
        AdSize.LEADERBOARD = new AdSize(728, 90, "728x90_as");
        AdSize.MEDIUM_RECTANGLE = new AdSize(300, 0xFA, "300x250_as");
        AdSize.WIDE_SKYSCRAPER = new AdSize(0xA0, 600, "160x600_as");
        AdSize.SMART_BANNER = new AdSize(-1, -2, "smart_banner");
        AdSize.FLUID = new AdSize(-3, -4, "fluid");
        AdSize.INVALID = new AdSize(0, 0, "invalid");
        AdSize.zza = new AdSize(50, 50, "50x50_mb");
        AdSize.SEARCH = new AdSize(-3, 0, "search_v2");
    }

    public AdSize(int v, int v1) {
        this(v, v1, (v == -1 ? "FULL" : String.valueOf(v)) + "x" + (v1 == -2 ? "AUTO" : String.valueOf(v1)) + "_as");
    }

    AdSize(int v, int v1, String s) {
        if(v < 0 && (v != -3 && v != -1)) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + v);
        }
        if(v1 < 0 && (v1 != -4 && v1 != -2)) {
            throw new IllegalArgumentException("Invalid height for AdSize: " + v1);
        }
        this.zzb = v;
        this.zzc = v1;
        this.zzd = s;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        return object0 instanceof AdSize ? this.zzb == ((AdSize)object0).zzb && this.zzc == ((AdSize)object0).zzc && this.zzd.equals(((AdSize)object0).zzd) : false;
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context0, int v) {
        AdSize adSize0 = zzbzt.zzc(context0, v, 50, 0);
        adSize0.zze = true;
        return adSize0;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context0, int v) {
        int v1 = zzbzt.zza(context0, 0);
        if(v1 == -1) {
            return AdSize.INVALID;
        }
        AdSize adSize0 = new AdSize(v, 0);
        adSize0.zzg = v1;
        adSize0.zzf = true;
        return adSize0;
    }

    public static AdSize getCurrentOrientationInterscrollerAdSize(Context context0, int v) {
        return AdSize.zzj(v, zzbzt.zza(context0, 0));
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(Context context0) {
        switch(this.zzc) {
            case -4: 
            case -3: {
                return -1;
            }
            case -2: {
                return zzq.zza(context0.getResources().getDisplayMetrics());
            }
            default: {
                return zzbzt.zzx(context0, this.zzc);
            }
        }
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int v, int v1) {
        AdSize adSize0 = new AdSize(v, 0);
        adSize0.zzg = v1;
        adSize0.zzf = true;
        if(v1 < 0x20) {
            zzcaa.zzj(("The maximum height set for the inline adaptive ad size was " + v1 + " dp, which is below the minimum recommended value of 32 dp."));
        }
        return adSize0;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context0, int v) {
        AdSize adSize0 = zzbzt.zzc(context0, v, 50, 2);
        adSize0.zze = true;
        return adSize0;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context0, int v) {
        int v1 = zzbzt.zza(context0, 2);
        AdSize adSize0 = new AdSize(v, 0);
        if(v1 == -1) {
            return AdSize.INVALID;
        }
        adSize0.zzg = v1;
        adSize0.zzf = true;
        return adSize0;
    }

    public static AdSize getLandscapeInterscrollerAdSize(Context context0, int v) {
        return AdSize.zzj(v, zzbzt.zza(context0, 2));
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context0, int v) {
        AdSize adSize0 = zzbzt.zzc(context0, v, 50, 1);
        adSize0.zze = true;
        return adSize0;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context0, int v) {
        int v1 = zzbzt.zza(context0, 1);
        AdSize adSize0 = new AdSize(v, 0);
        if(v1 == -1) {
            return AdSize.INVALID;
        }
        adSize0.zzg = v1;
        adSize0.zzf = true;
        return adSize0;
    }

    public static AdSize getPortraitInterscrollerAdSize(Context context0, int v) {
        return AdSize.zzj(v, zzbzt.zza(context0, 1));
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(Context context0) {
        switch(this.zzb) {
            case -3: {
                return -1;
            }
            case -1: {
                return context0.getResources().getDisplayMetrics().widthPixels;
            }
            default: {
                return zzbzt.zzx(context0, this.zzb);
            }
        }
    }

    @Override
    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    @Override
    public String toString() {
        return this.zzd;
    }

    final int zza() {
        return this.zzi;
    }

    final int zzb() {
        return this.zzg;
    }

    final void zzc(int v) {
        this.zzg = v;
    }

    final void zzd(int v) {
        this.zzi = v;
    }

    final void zze(boolean z) {
        this.zzf = true;
    }

    final void zzf(boolean z) {
        this.zzh = true;
    }

    final boolean zzg() {
        return this.zze;
    }

    final boolean zzh() {
        return this.zzf;
    }

    final boolean zzi() {
        return this.zzh;
    }

    private static AdSize zzj(int v, int v1) {
        if(v1 == -1) {
            return AdSize.INVALID;
        }
        AdSize adSize0 = new AdSize(v, 0);
        adSize0.zzi = v1;
        adSize0.zzh = true;
        return adSize0;
    }
}

