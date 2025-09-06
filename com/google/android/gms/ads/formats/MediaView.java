package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import com.google.android.gms.ads.MediaContent;

@Deprecated
public class MediaView extends FrameLayout {
    private MediaContent zza;
    private ImageView.ScaleType zzb;

    public MediaView(Context context0) {
        super(context0);
    }

    public MediaView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public MediaView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @TargetApi(21)
    public MediaView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
    }

    public void setImageScaleType(ImageView.ScaleType imageView$ScaleType0) {
        this.zzb = imageView$ScaleType0;
    }

    public void setMediaContent(MediaContent mediaContent0) {
        this.zza = mediaContent0;
    }
}

