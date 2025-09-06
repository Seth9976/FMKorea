package m1;

import java.util.Set;
import k1.b;
import k1.e;
import k1.f;
import k1.g;

final class q implements g {
    private final Set a;
    private final p b;
    private final t c;

    q(Set set0, p p0, t t0) {
        this.a = set0;
        this.b = p0;
        this.c = t0;
    }

    @Override  // k1.g
    public f a(String s, Class class0, b b0, e e0) {
        if(!this.a.contains(b0)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", b0, this.a));
        }
        return new s(this.b, s, b0, e0, this.c);
    }
}

