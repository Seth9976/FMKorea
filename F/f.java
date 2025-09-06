package F;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.inputmethod.InputContentInfo;

public final class f {
    static final class a implements c {
        final InputContentInfo a;

        a(Uri uri0, ClipDescription clipDescription0, Uri uri1) {
            this.a = new InputContentInfo(uri0, clipDescription0, uri1);
        }

        a(Object object0) {
            this.a = (InputContentInfo)object0;
        }

        @Override  // F.f$c
        public Uri a() {
            return this.a.getContentUri();
        }

        @Override  // F.f$c
        public void b() {
            this.a.requestPermission();
        }

        @Override  // F.f$c
        public Uri c() {
            return this.a.getLinkUri();
        }

        @Override  // F.f$c
        public Object d() {
            return this.a;
        }

        @Override  // F.f$c
        public ClipDescription getDescription() {
            return this.a.getDescription();
        }
    }

    static final class b implements c {
        private final Uri a;
        private final ClipDescription b;
        private final Uri c;

        b(Uri uri0, ClipDescription clipDescription0, Uri uri1) {
            this.a = uri0;
            this.b = clipDescription0;
            this.c = uri1;
        }

        @Override  // F.f$c
        public Uri a() {
            return this.a;
        }

        @Override  // F.f$c
        public void b() {
        }

        @Override  // F.f$c
        public Uri c() {
            return this.c;
        }

        @Override  // F.f$c
        public Object d() {
            return null;
        }

        @Override  // F.f$c
        public ClipDescription getDescription() {
            return this.b;
        }
    }

    interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    private final c a;

    private f(c f$c0) {
        this.a = f$c0;
    }

    public f(Uri uri0, ClipDescription clipDescription0, Uri uri1) {
        if(Build.VERSION.SDK_INT >= 25) {
            this.a = new a(uri0, clipDescription0, uri1);
            return;
        }
        this.a = new b(uri0, clipDescription0, uri1);
    }

    public Uri a() {
        return this.a.a();
    }

    public ClipDescription b() {
        return this.a.getDescription();
    }

    public Uri c() {
        return this.a.c();
    }

    public void d() {
        this.a.b();
    }

    public Object e() {
        return this.a.d();
    }

    public static f f(Object object0) {
        if(object0 == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 25 ? new f(new a(object0)) : null;
    }
}

