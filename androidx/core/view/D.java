package androidx.core.view;

import B.h;
import android.content.ClipData;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ContentInfo.Builder;
import android.view.ContentInfo;
import java.util.Objects;

public final class d {
    public static final class a {
        private final c a;

        public a(ClipData clipData0, int v) {
            if(Build.VERSION.SDK_INT >= 0x1F) {
                this.a = new b(clipData0, v);
                return;
            }
            this.a = new androidx.core.view.d.d(clipData0, v);
        }

        public d a() {
            return this.a.build();
        }

        public a b(Bundle bundle0) {
            this.a.setExtras(bundle0);
            return this;
        }

        public a c(int v) {
            this.a.setFlags(v);
            return this;
        }

        public a d(Uri uri0) {
            this.a.a(uri0);
            return this;
        }
    }

    static final class b implements c {
        private final ContentInfo.Builder a;

        b(ClipData clipData0, int v) {
            this.a = g.a(clipData0, v);
        }

        @Override  // androidx.core.view.d$c
        public void a(Uri uri0) {
            this.a.setLinkUri(uri0);
        }

        @Override  // androidx.core.view.d$c
        public d build() {
            return new d(new e(this.a.build()));
        }

        @Override  // androidx.core.view.d$c
        public void setExtras(Bundle bundle0) {
            this.a.setExtras(bundle0);
        }

        @Override  // androidx.core.view.d$c
        public void setFlags(int v) {
            this.a.setFlags(v);
        }
    }

    interface c {
        void a(Uri arg1);

        d build();

        void setExtras(Bundle arg1);

        void setFlags(int arg1);
    }

    static final class androidx.core.view.d.d implements c {
        ClipData a;
        int b;
        int c;
        Uri d;
        Bundle e;

        androidx.core.view.d.d(ClipData clipData0, int v) {
            this.a = clipData0;
            this.b = v;
        }

        @Override  // androidx.core.view.d$c
        public void a(Uri uri0) {
            this.d = uri0;
        }

        @Override  // androidx.core.view.d$c
        public d build() {
            return new d(new androidx.core.view.d.g(this));
        }

        @Override  // androidx.core.view.d$c
        public void setExtras(Bundle bundle0) {
            this.e = bundle0;
        }

        @Override  // androidx.core.view.d$c
        public void setFlags(int v) {
            this.c = v;
        }
    }

    static final class e implements f {
        private final ContentInfo a;

        e(ContentInfo contentInfo0) {
            this.a = androidx.core.view.c.a(h.g(contentInfo0));
        }

        @Override  // androidx.core.view.d$f
        public ClipData a() {
            return this.a.getClip();
        }

        @Override  // androidx.core.view.d$f
        public ContentInfo b() {
            return this.a;
        }

        @Override  // androidx.core.view.d$f
        public int c() {
            return this.a.getSource();
        }

        @Override  // androidx.core.view.d$f
        public int getFlags() {
            return this.a.getFlags();
        }

        @Override
        public String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    interface f {
        ClipData a();

        ContentInfo b();

        int c();

        int getFlags();
    }

    static final class androidx.core.view.d.g implements f {
        private final ClipData a;
        private final int b;
        private final int c;
        private final Uri d;
        private final Bundle e;

        androidx.core.view.d.g(androidx.core.view.d.d d$d0) {
            this.a = (ClipData)h.g(d$d0.a);
            this.b = h.c(d$d0.b, 0, 5, "source");
            this.c = h.f(d$d0.c, 1);
            this.d = d$d0.d;
            this.e = d$d0.e;
        }

        @Override  // androidx.core.view.d$f
        public ClipData a() {
            return this.a;
        }

        @Override  // androidx.core.view.d$f
        public ContentInfo b() {
            return null;
        }

        @Override  // androidx.core.view.d$f
        public int c() {
            return this.b;
        }

        @Override  // androidx.core.view.d$f
        public int getFlags() {
            return this.c;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("ContentInfoCompat{clip=");
            stringBuilder0.append(this.a.getDescription());
            stringBuilder0.append(", source=");
            stringBuilder0.append(d.e(this.b));
            stringBuilder0.append(", flags=");
            stringBuilder0.append(d.a(this.c));
            String s = "";
            stringBuilder0.append((this.d == null ? "" : ", hasLinkUri(" + this.d.toString().length() + ")"));
            if(this.e != null) {
                s = ", hasExtras";
            }
            stringBuilder0.append(s);
            stringBuilder0.append("}");
            return stringBuilder0.toString();
        }
    }

    private final f a;

    d(f d$f0) {
        this.a = d$f0;
    }

    static String a(int v) {
        return (v & 1) == 0 ? String.valueOf(v) : "FLAG_CONVERT_TO_PLAIN_TEXT";
    }

    public ClipData b() {
        return this.a.a();
    }

    public int c() {
        return this.a.getFlags();
    }

    public int d() {
        return this.a.c();
    }

    static String e(int v) {
        switch(v) {
            case 0: {
                return "SOURCE_APP";
            }
            case 1: {
                return "SOURCE_CLIPBOARD";
            }
            case 2: {
                return "SOURCE_INPUT_METHOD";
            }
            case 3: {
                return "SOURCE_DRAG_AND_DROP";
            }
            case 4: {
                return "SOURCE_AUTOFILL";
            }
            case 5: {
                return "SOURCE_PROCESS_TEXT";
            }
            default: {
                return String.valueOf(v);
            }
        }
    }

    public ContentInfo f() {
        ContentInfo contentInfo0 = this.a.b();
        Objects.requireNonNull(contentInfo0);
        return contentInfo0;
    }

    public static d g(ContentInfo contentInfo0) {
        return new d(new e(contentInfo0));
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

