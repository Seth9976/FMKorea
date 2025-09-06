package com.facebook.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

@Keep
public class MediaView extends AdNativeComponentView {
    private AdViewConstructorParams mConstructorParams;
    private MediaViewApi mMediaViewApi;

    public MediaView(Context context0) {
        super(context0);
        this.initializeSelf(new AdViewConstructorParams(context0));
    }

    public MediaView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.initializeSelf(new AdViewConstructorParams(context0, attributeSet0));
    }

    public MediaView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.initializeSelf(new AdViewConstructorParams(context0, attributeSet0, v));
    }

    @TargetApi(21)
    public MediaView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.initializeSelf(new AdViewConstructorParams(context0, attributeSet0, v, v1));
    }

    public void destroy() {
        this.mMediaViewApi.destroy();
    }

    @Override  // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.mMediaViewApi.getAdContentsView();
    }

    public int getMediaHeight() {
        return this.mMediaViewApi.getMediaHeight();
    }

    public MediaViewApi getMediaViewApi() {
        return this.mMediaViewApi;
    }

    public int getMediaWidth() {
        return this.mMediaViewApi.getMediaWidth();
    }

    private void initializeSelf(AdViewConstructorParams adViewConstructorParams0) {
        this.mConstructorParams = adViewConstructorParams0;
        MediaViewApi mediaViewApi0 = DynamicLoaderFactory.makeLoader(adViewConstructorParams0.getContext()).createMediaViewApi();
        this.mMediaViewApi = mediaViewApi0;
        this.attachAdComponentViewApi(mediaViewApi0);
        this.mMediaViewApi.initialize(adViewConstructorParams0, this);
    }

    public void repair(Throwable throwable0) {
        class a implements Runnable {
            final MediaView f;

            @Override
            public void run() {
                MediaView.this.removeAllViews();
                MediaView.this.mAdComponentViewApi = null;
                MediaViewApi mediaViewApi0 = DynamicLoaderFactory.makeLoader(MediaView.this.mConstructorParams.getContext()).createMediaViewApi();
                MediaView.this.mMediaViewApi = mediaViewApi0;
                MediaViewApi mediaViewApi1 = MediaView.this.mMediaViewApi;
                MediaView.this.attachAdComponentViewApi(mediaViewApi1);
                MediaView.this.mMediaViewApi.initialize(MediaView.this.mConstructorParams, MediaView.this);
            }
        }

        this.post(new a(this));
    }

    public void setListener(MediaViewListener mediaViewListener0) {
        this.mMediaViewApi.setListener(mediaViewListener0);
    }

    public void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer0) {
        this.mMediaViewApi.setVideoRenderer(mediaViewVideoRenderer0);
    }
}

