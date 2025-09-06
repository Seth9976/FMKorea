package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {
    AudioAttributes a;
    int b;

    AudioAttributesImplApi21() {
        this.b = -1;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof AudioAttributesImplApi21 ? this.a.equals(((AudioAttributesImplApi21)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }
}

