package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
public interface MediaViewListener {
    void onComplete(MediaView arg1);

    void onEnterFullscreen(MediaView arg1);

    void onExitFullscreen(MediaView arg1);

    void onFullscreenBackground(MediaView arg1);

    void onFullscreenForeground(MediaView arg1);

    void onPause(MediaView arg1);

    void onPlay(MediaView arg1);

    void onVolumeChange(MediaView arg1, float arg2);
}

