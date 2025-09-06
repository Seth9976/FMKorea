package androidx.media;

import java.util.Arrays;

class AudioAttributesImplBase implements AudioAttributesImpl {
    int a;
    int b;
    int c;
    int d;

    AudioAttributesImplBase() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        int v = this.c;
        int v1 = this.c();
        if(v1 == 6) {
            return (v | 4) & 273;
        }
        if(v1 == 7) {
            v |= 1;
        }
        return v & 273;
    }

    public int c() {
        int v = this.d;
        return v == -1 ? AudioAttributesCompat.a(false, this.c, this.a) : v;
    }

    public int d() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof AudioAttributesImplBase ? this.b == ((AudioAttributesImplBase)object0).a() && this.c == ((AudioAttributesImplBase)object0).b() && this.a == ((AudioAttributesImplBase)object0).d() && this.d == ((AudioAttributesImplBase)object0).d : false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.a, this.d});
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AudioAttributesCompat:");
        if(this.d != -1) {
            stringBuilder0.append(" stream=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(" derived");
        }
        stringBuilder0.append(" usage=");
        stringBuilder0.append(AudioAttributesCompat.b(this.a));
        stringBuilder0.append(" content=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(" flags=0x");
        stringBuilder0.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder0.toString();
    }
}

