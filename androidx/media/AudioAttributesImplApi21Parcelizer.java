package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.a;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a a0) {
        AudioAttributesImplApi21 audioAttributesImplApi210 = new AudioAttributesImplApi21();
        audioAttributesImplApi210.a = (AudioAttributes)a0.r(audioAttributesImplApi210.a, 1);
        audioAttributesImplApi210.b = a0.p(audioAttributesImplApi210.b, 2);
        return audioAttributesImplApi210;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi210, a a0) {
        a0.H(audioAttributesImplApi210.a, 1);
        a0.F(audioAttributesImplApi210.b, 2);
    }
}

