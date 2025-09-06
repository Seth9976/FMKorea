package B0;

import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioManager;
import co.median.android.MainActivity;

public final class n implements AudioManager.OnAudioFocusChangeListener {
    public final Object a;
    public final MainActivity b;
    public final AudioManager c;

    public n(Object object0, MainActivity mainActivity0, AudioManager audioManager0) {
        this.a = object0;
        this.b = mainActivity0;
        this.c = audioManager0;
    }

    @Override  // android.media.AudioManager$OnAudioFocusChangeListener
    public final void onAudioFocusChange(int v) {
        o.f(this.a, this.b, this.c, v);
    }
}

