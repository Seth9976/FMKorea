package androidx.work;

import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import z0.c;

public final class WorkerParameters {
    public static class a {
        public List a;
        public List b;
        public Network c;

        public a() {
            this.a = Collections.emptyList();
            this.b = Collections.emptyList();
        }
    }

    private UUID a;
    private d b;
    private Set c;
    private a d;
    private int e;
    private Executor f;
    private c g;
    private w h;
    private p i;
    private g j;
    private int k;

    public WorkerParameters(UUID uUID0, d d0, Collection collection0, a workerParameters$a0, int v, int v1, Executor executor0, c c0, w w0, p p0, g g0) {
        this.a = uUID0;
        this.b = d0;
        this.c = new HashSet(collection0);
        this.d = workerParameters$a0;
        this.e = v;
        this.k = v1;
        this.f = executor0;
        this.g = c0;
        this.h = w0;
        this.i = p0;
        this.j = g0;
    }

    public Executor a() {
        return this.f;
    }

    public g b() {
        return this.j;
    }

    public UUID c() {
        return this.a;
    }

    public d d() {
        return this.b;
    }

    public Network e() {
        return this.d.c;
    }

    public p f() {
        return this.i;
    }

    public int g() {
        return this.e;
    }

    public Set h() {
        return this.c;
    }

    public c i() {
        return this.g;
    }

    public List j() {
        return this.d.a;
    }

    public List k() {
        return this.d.b;
    }

    public w l() {
        return this.h;
    }
}

