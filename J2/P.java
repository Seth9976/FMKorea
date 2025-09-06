package j2;

import java.io.File;
import java.io.IOException;
import o2.f;

class p {
    private final String a;
    private final f b;

    public p(String s, f f0) {
        this.a = s;
        this.b = f0;
    }

    public boolean a() {
        try {
            return this.b().createNewFile();
        }
        catch(IOException iOException0) {
            g2.f.f().e("Error creating marker: " + this.a, iOException0);
            return false;
        }
    }

    private File b() {
        return this.b.e(this.a);
    }

    public boolean c() {
        return this.b().exists();
    }

    public boolean d() {
        return this.b().delete();
    }
}

