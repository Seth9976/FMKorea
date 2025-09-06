package B0;

import android.media.AudioManager.OnAudioFocusChangeListener;
import co.median.android.MainActivity;

public final class m implements AudioManager.OnAudioFocusChangeListener {
    public final Object a;
    public final MainActivity b;

    public m(Object object0, MainActivity mainActivity0) {
        this.a = object0;
        this.b = mainActivity0;
    }

    @Override  // android.media.AudioManager$OnAudioFocusChangeListener
    public final void onAudioFocusChange(int v) {
        o.e(this.a, this.b, v);
    }
}

