package com.facebook.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AdComponentFrameLayout;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

@Keep
public abstract class MediaViewVideoRenderer extends AdComponentFrameLayout {
    private MediaViewVideoRendererApi mMediaViewVideoRendererApi;
    @Deprecated
    protected NativeAd nativeAd;
    @Deprecated
    protected VideoAutoplayBehavior videoAutoplayBehavior;

    public MediaViewVideoRenderer(Context context0) {
        super(context0);
        this.initialize(new AdViewConstructorParams(context0));
    }

    public MediaViewVideoRenderer(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.initialize(new AdViewConstructorParams(context0, attributeSet0));
    }

    public MediaViewVideoRenderer(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.initialize(new AdViewConstructorParams(context0, attributeSet0, v));
    }

    @TargetApi(21)
    public MediaViewVideoRenderer(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.initialize(new AdViewConstructorParams(context0, attributeSet0, v, v1));
    }

    @Override  // com.facebook.ads.internal.api.AdComponentFrameLayout
    public void addView(View view0) {
    }

    @Override  // com.facebook.ads.internal.api.AdComponentFrameLayout
    public void addView(View view0, int v) {
    }

    @Override  // com.facebook.ads.internal.api.AdComponentFrameLayout
    public void addView(View view0, int v, int v1) {
    }

    @Override  // com.facebook.ads.internal.api.AdComponentFrameLayout
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
    }

    @Override  // com.facebook.ads.internal.api.AdComponentFrameLayout
    public void addView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
    }

    @Deprecated
    public void destroy() {
    }

    public final void disengageSeek(VideoStartReason videoStartReason0) {
        this.mMediaViewVideoRendererApi.disengageSeek(videoStartReason0);
    }

    public final void engageSeek() {
        this.mMediaViewVideoRendererApi.engageSeek();
    }

    public final int getCurrentTimeMs() {
        return this.mMediaViewVideoRendererApi.getCurrentTimeMs();
    }

    public final int getDuration() {
        return this.mMediaViewVideoRendererApi.getDuration();
    }

    public MediaViewVideoRendererApi getMediaViewVideoRendererApi() {
        return this.mMediaViewVideoRendererApi;
    }

    @Deprecated
    final View getVideoView() {
        return this.mMediaViewVideoRendererApi.getVideoView();
    }

    public final float getVolume() {
        return this.mMediaViewVideoRendererApi.getVolume();
    }

    private void initialize(AdViewConstructorParams adViewConstructorParams0) {
        MediaViewVideoRendererApi mediaViewVideoRendererApi0 = DynamicLoaderFactory.makeLoader(adViewConstructorParams0.getContext()).createMediaViewVideoRendererApi();
        this.mMediaViewVideoRendererApi = mediaViewVideoRendererApi0;
        this.attachAdComponentViewApi(mediaViewVideoRendererApi0);
        this.mMediaViewVideoRendererApi.initialize(adViewConstructorParams0, this);
    }

    public void onCompleted() {
    }

    public void onError() {
    }

    public void onPaused() {
    }

    public void onPlayed() {
    }

    public void onPrepared() {
    }

    public void onSeek() {
    }

    public void onSeekDisengaged() {
    }

    public void onSeekEngaged() {
    }

    public void onVolumeChanged() {
    }

    public final void pause(boolean z) {
        this.mMediaViewVideoRendererApi.pause(z);
    }

    public final void play(VideoStartReason videoStartReason0) {
        this.mMediaViewVideoRendererApi.play(videoStartReason0);
    }

    public final void seekTo(int v) {
        this.mMediaViewVideoRendererApi.seekTo(v);
    }

    @Deprecated
    final void setListener(Object object0) {
    }

    @Deprecated
    public void setNativeAd(NativeAd nativeAd0) {
        this.nativeAd = nativeAd0;
        this.videoAutoplayBehavior = nativeAd0.getVideoAutoplayBehavior();
    }

    public final void setVolume(float f) {
        this.mMediaViewVideoRendererApi.setVolume(f);
    }

    public boolean shouldAllowBackgroundPlayback() {
        return false;
    }

    public final boolean shouldAutoplay() {
        return this.mMediaViewVideoRendererApi.shouldAutoplay();
    }

    @Deprecated
    public void unsetNativeAd() {
        this.nativeAd = null;
        this.videoAutoplayBehavior = VideoAutoplayBehavior.DEFAULT;
    }
}

