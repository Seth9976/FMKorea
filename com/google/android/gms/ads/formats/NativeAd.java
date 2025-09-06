package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

@Deprecated
public abstract class NativeAd {
    @Deprecated
    public static abstract class AdChoicesInfo {
        public abstract List getImages();

        public abstract CharSequence getText();
    }

    @Deprecated
    public static abstract class Image {
        public abstract Drawable getDrawable();

        public abstract double getScale();

        public abstract Uri getUri();

        public int zza() {
            return -1;
        }

        public int zzb() {
            return -1;
        }
    }

    public static final String ASSET_ADCHOICES_CONTAINER_VIEW = "1098";

    @Deprecated
    public abstract void performClick(Bundle arg1);

    @Deprecated
    public abstract boolean recordImpression(Bundle arg1);

    @Deprecated
    public abstract void reportTouchEvent(Bundle arg1);
}

