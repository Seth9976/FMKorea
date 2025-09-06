package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class f {
    static final class a extends b {
        private volatile i b;
        private volatile n c;

        a(f f0) {
            super(f0);
        }

        @Override  // androidx.emoji2.text.f$b
        void a() {
            class androidx.emoji2.text.f.a.a extends androidx.emoji2.text.f.i {
                final a a;

                @Override  // androidx.emoji2.text.f$i
                public void a(Throwable throwable0) {
                    a.this.a.n(throwable0);
                }

                @Override  // androidx.emoji2.text.f$i
                public void b(n n0) {
                    a.this.d(n0);
                }
            }

            try {
                androidx.emoji2.text.f.a.a f$a$a0 = new androidx.emoji2.text.f.a.a(this);
                this.a.f.a(f$a$a0);
            }
            catch(Throwable throwable0) {
                this.a.n(throwable0);
            }
        }

        @Override  // androidx.emoji2.text.f$b
        CharSequence b(CharSequence charSequence0, int v, int v1, int v2, boolean z) {
            return this.b.h(charSequence0, v, v1, v2, z);
        }

        @Override  // androidx.emoji2.text.f$b
        void c(EditorInfo editorInfo0) {
            editorInfo0.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.c.e());
            editorInfo0.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.a.h);
        }

        void d(n n0) {
            if(n0 == null) {
                IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("metadataRepo cannot be null");
                this.a.n(illegalArgumentException0);
                return;
            }
            this.c = n0;
            n n1 = this.c;
            j f$j0 = this.a.g;
            e f$e0 = this.a.n;
            Set set0 = h.a();
            this.b = new i(n1, f$j0, f$e0, this.a.i, this.a.j, set0);
            this.a.o();
        }
    }

    static abstract class b {
        final f a;

        b(f f0) {
            this.a = f0;
        }

        abstract void a();

        abstract CharSequence b(CharSequence arg1, int arg2, int arg3, int arg4, boolean arg5);

        abstract void c(EditorInfo arg1);
    }

    public static abstract class c {
        final androidx.emoji2.text.f.h a;
        j b;
        boolean c;
        boolean d;
        int[] e;
        Set f;
        boolean g;
        int h;
        int i;
        e j;

        protected c(androidx.emoji2.text.f.h f$h0) {
            this.h = 0xFF00FF00;
            this.i = 0;
            this.j = new androidx.emoji2.text.e();
            B.h.h(f$h0, "metadataLoader cannot be null.");
            this.a = f$h0;
        }

        protected final androidx.emoji2.text.f.h a() {
            return this.a;
        }

        public c b(int v) {
            this.i = v;
            return this;
        }
    }

    public static class d implements j {
        @Override  // androidx.emoji2.text.f$j
        public androidx.emoji2.text.j a(p p0) {
            return new q(p0);
        }
    }

    public interface e {
        boolean a(CharSequence arg1, int arg2, int arg3, int arg4);
    }

    public static abstract class androidx.emoji2.text.f.f {
        public void a(Throwable throwable0) {
        }

        public void b() {
        }
    }

    static class g implements Runnable {
        private final List f;
        private final Throwable g;
        private final int h;

        g(androidx.emoji2.text.f.f f$f0, int v) {
            this(Arrays.asList(new androidx.emoji2.text.f.f[]{((androidx.emoji2.text.f.f)B.h.h(f$f0, "initCallback cannot be null"))}), v, null);
        }

        g(Collection collection0, int v) {
            this(collection0, v, null);
        }

        g(Collection collection0, int v, Throwable throwable0) {
            B.h.h(collection0, "initCallbacks cannot be null");
            this.f = new ArrayList(collection0);
            this.h = v;
            this.g = throwable0;
        }

        @Override
        public void run() {
            int v = this.f.size();
            int v1 = 0;
            if(this.h != 1) {
                while(v1 < v) {
                    ((androidx.emoji2.text.f.f)this.f.get(v1)).a(this.g);
                    ++v1;
                }
                return;
            }
            while(v1 < v) {
                ((androidx.emoji2.text.f.f)this.f.get(v1)).b();
                ++v1;
            }
        }
    }

    public interface androidx.emoji2.text.f.h {
        void a(androidx.emoji2.text.f.i arg1);
    }

    public static abstract class androidx.emoji2.text.f.i {
        public abstract void a(Throwable arg1);

        public abstract void b(n arg1);
    }

    public interface j {
        androidx.emoji2.text.j a(p arg1);
    }

    private final ReadWriteLock a;
    private final Set b;
    private volatile int c;
    private final Handler d;
    private final b e;
    final androidx.emoji2.text.f.h f;
    private final j g;
    final boolean h;
    final boolean i;
    final int[] j;
    private final boolean k;
    private final int l;
    private final int m;
    private final e n;
    private static final Object o;
    private static final Object p;
    private static volatile f q;

    static {
        f.o = new Object();
        f.p = new Object();
    }

    private f(c f$c0) {
        this.a = new ReentrantReadWriteLock();
        this.c = 3;
        this.h = f$c0.c;
        this.i = f$c0.d;
        this.j = f$c0.e;
        this.k = f$c0.g;
        this.l = f$c0.h;
        this.f = f$c0.a;
        this.m = f$c0.i;
        this.n = f$c0.j;
        this.d = new Handler(Looper.getMainLooper());
        androidx.collection.b b0 = new androidx.collection.b();
        this.b = b0;
        j f$j0 = f$c0.b;
        if(f$j0 == null) {
            f$j0 = new d();
        }
        this.g = f$j0;
        if(f$c0.f != null && !f$c0.f.isEmpty()) {
            b0.addAll(f$c0.f);
        }
        this.e = new a(this);
        this.m();
    }

    public static f c() {
        synchronized(f.o) {
            f f0 = f.q;
            B.h.i(f0 != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            return f0;
        }
    }

    public int d() {
        return this.l;
    }

    public int e() {
        this.a.readLock().lock();
        int v = this.c;
        this.a.readLock().unlock();
        return v;
    }

    public static boolean f(InputConnection inputConnection0, Editable editable0, int v, int v1, boolean z) {
        return i.b(inputConnection0, editable0, v, v1, z);
    }

    public static boolean g(Editable editable0, int v, KeyEvent keyEvent0) {
        return i.c(editable0, v, keyEvent0);
    }

    public static f h(c f$c0) {
        f f0 = f.q;
        if(f0 == null) {
            synchronized(f.o) {
                f0 = f.q;
                if(f0 == null) {
                    f0 = new f(f$c0);
                    f.q = f0;
                }
            }
        }
        return f0;
    }

    public static boolean i() [...] // 潜在的解密器

    public boolean j() {
        return this.k;
    }

    private boolean k() {
        return this.e() == 1;
    }

    public void l() {
        B.h.i(this.m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if(this.k()) {
            return;
        }
        this.a.writeLock().lock();
        if(this.c == 0) {
            this.a.writeLock().unlock();
            return;
        }
        this.c = 0;
        this.a.writeLock().unlock();
        this.e.a();
    }

    private void m() {
        this.a.writeLock().lock();
        if(this.m == 0) {
            this.c = 0;
        }
        this.a.writeLock().unlock();
        if(this.e() == 0) {
            this.e.a();
        }
    }

    void n(Throwable throwable0) {
        ArrayList arrayList0 = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList0.addAll(this.b);
            this.b.clear();
        }
        finally {
            this.a.writeLock().unlock();
        }
        g f$g0 = new g(arrayList0, this.c, throwable0);
        this.d.post(f$g0);
    }

    void o() {
        ArrayList arrayList0 = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList0.addAll(this.b);
            this.b.clear();
        }
        finally {
            this.a.writeLock().unlock();
        }
        g f$g0 = new g(arrayList0, this.c);
        this.d.post(f$g0);
    }

    public CharSequence p(CharSequence charSequence0) {
        return charSequence0 == null ? this.q(null, 0, 0) : this.q(charSequence0, 0, charSequence0.length());
    }

    public CharSequence q(CharSequence charSequence0, int v, int v1) {
        return this.r(charSequence0, v, v1, 0x7FFFFFFF);
    }

    public CharSequence r(CharSequence charSequence0, int v, int v1, int v2) {
        return this.s(charSequence0, v, v1, v2, 0);
    }

    public CharSequence s(CharSequence charSequence0, int v, int v1, int v2, int v3) {
        B.h.i(this.k(), "Not initialized yet");
        B.h.e(v, "start cannot be negative");
        B.h.e(v1, "end cannot be negative");
        B.h.e(v2, "maxEmojiCount cannot be negative");
        boolean z = false;
        B.h.b(v <= v1, "start should be <= than end");
        if(charSequence0 == null) {
            return null;
        }
        B.h.b(v <= charSequence0.length(), "start should be < than charSequence length");
        B.h.b(v1 <= charSequence0.length(), "end should be < than charSequence length");
        if(charSequence0.length() != 0 && v != v1) {
            switch(v3) {
                case 1: {
                    return this.e.b(charSequence0, v, v1, v2, true);
                }
                case 2: {
                    break;
                }
                default: {
                    z = this.h;
                    break;
                }
            }
            return this.e.b(charSequence0, v, v1, v2, z);
        }
        return charSequence0;
    }

    public void t(androidx.emoji2.text.f.f f$f0) {
        B.h.h(f$f0, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if(this.c == 1 || this.c == 2) {
                g f$g0 = new g(f$f0, this.c);
                this.d.post(f$g0);
            }
            else {
                this.b.add(f$f0);
            }
        }
        finally {
            this.a.writeLock().unlock();
        }
    }

    public void u(androidx.emoji2.text.f.f f$f0) {
        B.h.h(f$f0, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            this.b.remove(f$f0);
        }
        finally {
            this.a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo0) {
        if(this.k() && editorInfo0 != null) {
            if(editorInfo0.extras == null) {
                editorInfo0.extras = new Bundle();
            }
            this.e.c(editorInfo0);
        }
    }
}

