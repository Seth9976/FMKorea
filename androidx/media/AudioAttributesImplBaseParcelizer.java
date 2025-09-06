package androidx.media;

import androidx.versionedparcelable.a;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a a0) {
        AudioAttributesImplBase audioAttributesImplBase0 = new AudioAttributesImplBase();
        audioAttributesImplBase0.a = a0.p(audioAttributesImplBase0.a, 1);
        audioAttributesImplBase0.b = a0.p(audioAttributesImplBase0.b, 2);
        audioAttributesImplBase0.c = a0.p(audioAttributesImplBase0.c, 3);
        audioAttributesImplBase0.d = a0.p(audioAttributesImplBase0.d, 4);
        return audioAttributesImplBase0;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase0, a a0) {
        a0.F(audioAttributesImplBase0.a, 1);
        a0.F(audioAttributesImplBase0.b, 2);
        a0.F(audioAttributesImplBase0.c, 3);
        a0.F(audioAttributesImplBase0.d, 4);
    }
}

