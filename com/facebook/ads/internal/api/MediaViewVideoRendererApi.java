package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.VideoStartReason;

@Keep
public interface MediaViewVideoRendererApi extends AdComponentViewApiProvider {
    void destroy();

    void disengageSeek(VideoStartReason arg1);

    void engageSeek();

    int getCurrentTimeMs();

    int getDuration();

    View getVideoView();

    float getVolume();

    void initialize(AdViewConstructorParams arg1, MediaViewVideoRenderer arg2);

    void pause(boolean arg1);

    void play(VideoStartReason arg1);

    void seekTo(int arg1);

    void setVolume(float arg1);

    boolean shouldAutoplay();
}

