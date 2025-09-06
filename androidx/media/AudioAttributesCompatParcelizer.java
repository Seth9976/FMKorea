package androidx.media;

import androidx.versionedparcelable.a;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a a0) {
        AudioAttributesCompat audioAttributesCompat0 = new AudioAttributesCompat();
        audioAttributesCompat0.a = (AudioAttributesImpl)a0.v(audioAttributesCompat0.a, 1);
        return audioAttributesCompat0;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat0, a a0) {
        a0.M(audioAttributesCompat0.a, 1);
    }
}

