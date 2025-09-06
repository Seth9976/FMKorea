package u0;

public final class b {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public b(boolean z, boolean z1, boolean z2, boolean z3) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        if(this.a != ((b)object0).a) {
            return false;
        }
        if(this.b != ((b)object0).b) {
            return false;
        }
        return this.c == ((b)object0).c ? this.d == ((b)object0).d : false;
    }

    @Override
    public int hashCode() {
        int v = this.a;
        int v1 = 1;
        if(v) {
            v = 1;
        }
        int v2 = this.b;
        if(v2) {
            v2 = 1;
        }
        int v3 = this.c;
        if(v3) {
            v3 = 1;
        }
        if(!this.d) {
            v1 = false;
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    public String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ')';
    }
}

