package androidx.core.app;

import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.InboxStyle;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

public abstract class m {
    public static class a {
        final Bundle a;
        private IconCompat b;
        private final t[] c;
        private final t[] d;
        private boolean e;
        boolean f;
        private final int g;
        private final boolean h;
        public int i;
        public CharSequence j;
        public PendingIntent k;
        private boolean l;

        public a(int v, CharSequence charSequence0, PendingIntent pendingIntent0) {
            this((v == 0 ? null : IconCompat.c(null, "", v)), charSequence0, pendingIntent0);
        }

        public a(IconCompat iconCompat0, CharSequence charSequence0, PendingIntent pendingIntent0) {
            this(iconCompat0, charSequence0, pendingIntent0, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat0, CharSequence charSequence0, PendingIntent pendingIntent0, Bundle bundle0, t[] arr_t, t[] arr_t1, boolean z, int v, boolean z1, boolean z2, boolean z3) {
            this.f = true;
            this.b = iconCompat0;
            if(iconCompat0 != null && iconCompat0.g() == 2) {
                this.i = iconCompat0.e();
            }
            this.j = e.e(charSequence0);
            this.k = pendingIntent0;
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
            this.a = bundle0;
            this.c = arr_t;
            this.d = arr_t1;
            this.e = z;
            this.g = v;
            this.f = z1;
            this.h = z2;
            this.l = z3;
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.e;
        }

        public Bundle c() {
            return this.a;
        }

        public IconCompat d() {
            if(this.b == null) {
                int v = this.i;
                if(v != 0) {
                    this.b = IconCompat.c(null, "", v);
                }
            }
            return this.b;
        }

        public t[] e() {
            return this.c;
        }

        public int f() {
            return this.g;
        }

        public boolean g() {
            return this.f;
        }

        public CharSequence h() {
            return this.j;
        }

        public boolean i() {
            return this.l;
        }

        public boolean j() {
            return this.h;
        }
    }

    public static class b extends h {
        static abstract class androidx.core.app.m.b.a {
            static void a(Notification.BigPictureStyle notification$BigPictureStyle0, Icon icon0) {
                notification$BigPictureStyle0.bigLargeIcon(icon0);
            }
        }

        static abstract class androidx.core.app.m.b.b {
            static void a(Notification.BigPictureStyle notification$BigPictureStyle0, Icon icon0) {
                notification$BigPictureStyle0.bigPicture(icon0);
            }

            static void b(Notification.BigPictureStyle notification$BigPictureStyle0, CharSequence charSequence0) {
                notification$BigPictureStyle0.setContentDescription(charSequence0);
            }

            static void c(Notification.BigPictureStyle notification$BigPictureStyle0, boolean z) {
                notification$BigPictureStyle0.showBigPictureWhenCollapsed(z);
            }
        }

        private IconCompat e;
        private IconCompat f;
        private boolean g;
        private CharSequence h;
        private boolean i;

        @Override  // androidx.core.app.m$h
        public void b(l l0) {
            Notification.BigPictureStyle notification$BigPictureStyle0 = new Notification.BigPictureStyle(l0.a()).setBigContentTitle(this.b);
            IconCompat iconCompat0 = this.e;
            Context context0 = null;
            if(iconCompat0 != null) {
                if(Build.VERSION.SDK_INT >= 0x1F) {
                    Context context1 = l0 instanceof n ? ((n)l0).f() : null;
                    androidx.core.app.m.b.b.a(notification$BigPictureStyle0, this.e.m(context1));
                }
                else if(iconCompat0.g() == 1) {
                    notification$BigPictureStyle0 = notification$BigPictureStyle0.bigPicture(this.e.d());
                }
            }
            if(this.g) {
                if(this.f == null) {
                    notification$BigPictureStyle0.bigLargeIcon(null);
                }
                else {
                    if(l0 instanceof n) {
                        context0 = ((n)l0).f();
                    }
                    androidx.core.app.m.b.a.a(notification$BigPictureStyle0, this.f.m(context0));
                }
            }
            if(this.d) {
                notification$BigPictureStyle0.setSummaryText(this.c);
            }
            if(Build.VERSION.SDK_INT >= 0x1F) {
                androidx.core.app.m.b.b.c(notification$BigPictureStyle0, this.i);
                androidx.core.app.m.b.b.b(notification$BigPictureStyle0, this.h);
            }
        }

        @Override  // androidx.core.app.m$h
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap0) {
            this.f = bitmap0 == null ? null : IconCompat.b(bitmap0);
            this.g = true;
            return this;
        }

        public b i(Bitmap bitmap0) {
            this.e = bitmap0 == null ? null : IconCompat.b(bitmap0);
            return this;
        }

        public b j(CharSequence charSequence0) {
            this.c = e.e(charSequence0);
            this.d = true;
            return this;
        }
    }

    public static class c extends h {
        private CharSequence e;

        @Override  // androidx.core.app.m$h
        public void a(Bundle bundle0) {
            super.a(bundle0);
        }

        @Override  // androidx.core.app.m$h
        public void b(l l0) {
            Notification.BigTextStyle notification$BigTextStyle0 = new Notification.BigTextStyle(l0.a()).setBigContentTitle(this.b).bigText(this.e);
            if(this.d) {
                notification$BigTextStyle0.setSummaryText(this.c);
            }
        }

        @Override  // androidx.core.app.m$h
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence0) {
            this.e = e.e(charSequence0);
            return this;
        }
    }

    public static abstract class d {
        public static Notification.BubbleMetadata a(d m$d0) [...] // Inlined contents
    }

    public static class e {
        static abstract class androidx.core.app.m.e.a {
            static AudioAttributes a(AudioAttributes.Builder audioAttributes$Builder0) {
                return audioAttributes$Builder0.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder audioAttributes$Builder0, int v) {
                return audioAttributes$Builder0.setContentType(v);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder audioAttributes$Builder0, int v) {
                return audioAttributes$Builder0.setLegacyStreamType(v);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder audioAttributes$Builder0, int v) {
                return audioAttributes$Builder0.setUsage(v);
            }
        }

        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        int P;
        boolean Q;
        Notification R;
        boolean S;
        Object T;
        public ArrayList U;
        public Context a;
        public ArrayList b;
        public ArrayList c;
        ArrayList d;
        CharSequence e;
        CharSequence f;
        PendingIntent g;
        PendingIntent h;
        RemoteViews i;
        IconCompat j;
        CharSequence k;
        int l;
        int m;
        boolean n;
        boolean o;
        h p;
        CharSequence q;
        CharSequence r;
        CharSequence[] s;
        int t;
        int u;
        boolean v;
        String w;
        boolean x;
        String y;
        boolean z;

        public e(Context context0) {
            this(context0, null);
        }

        public e(Context context0, String s) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.n = true;
            this.z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification0 = new Notification();
            this.R = notification0;
            this.a = context0;
            this.K = s;
            notification0.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.m = 0;
            this.U = new ArrayList();
            this.Q = true;
        }

        public e A(Uri uri0) {
            this.R.sound = uri0;
            this.R.audioStreamType = -1;
            AudioAttributes.Builder audioAttributes$Builder0 = androidx.core.app.m.e.a.e(androidx.core.app.m.e.a.c(androidx.core.app.m.e.a.b(), 4), 5);
            Notification notification0 = this.R;
            notification0.audioAttributes = androidx.core.app.m.e.a.a(audioAttributes$Builder0);
            return this;
        }

        public e B(h m$h0) {
            if(this.p != m$h0) {
                this.p = m$h0;
                if(m$h0 != null) {
                    m$h0.g(this);
                }
            }
            return this;
        }

        public e C(CharSequence charSequence0) {
            Notification notification0 = this.R;
            notification0.tickerText = e.e(charSequence0);
            return this;
        }

        public e D(long[] arr_v) {
            this.R.vibrate = arr_v;
            return this;
        }

        public e E(int v) {
            this.F = v;
            return this;
        }

        public e F(long v) {
            this.R.when = v;
            return this;
        }

        public e a(int v, CharSequence charSequence0, PendingIntent pendingIntent0) {
            this.b.add(new a(v, charSequence0, pendingIntent0));
            return this;
        }

        public Notification b() {
            return new n(this).c();
        }

        public e c(f m$f0) {
            m$f0.a(this);
            return this;
        }

        public Bundle d() {
            if(this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        protected static CharSequence e(CharSequence charSequence0) {
            if(charSequence0 == null) {
                return null;
            }
            return charSequence0.length() <= 0x1400 ? charSequence0 : charSequence0.subSequence(0, 0x1400);
        }

        public e f(boolean z) {
            this.o(16, z);
            return this;
        }

        public e g(String s) {
            this.K = s;
            return this;
        }

        public e h(int v) {
            this.E = v;
            return this;
        }

        public e i(RemoteViews remoteViews0) {
            this.R.contentView = remoteViews0;
            return this;
        }

        public e j(PendingIntent pendingIntent0) {
            this.g = pendingIntent0;
            return this;
        }

        public e k(CharSequence charSequence0) {
            this.f = e.e(charSequence0);
            return this;
        }

        public e l(CharSequence charSequence0) {
            this.e = e.e(charSequence0);
            return this;
        }

        public e m(int v) {
            Notification notification0 = this.R;
            notification0.defaults = v;
            if((v & 4) != 0) {
                notification0.flags |= 1;
            }
            return this;
        }

        public e n(PendingIntent pendingIntent0) {
            this.R.deleteIntent = pendingIntent0;
            return this;
        }

        private void o(int v, boolean z) {
            if(z) {
                this.R.flags |= v;
                return;
            }
            this.R.flags &= ~v;
        }

        public e p(String s) {
            this.w = s;
            return this;
        }

        public e q(int v) {
            this.O = v;
            return this;
        }

        public e r(boolean z) {
            this.x = z;
            return this;
        }

        public e s(Bitmap bitmap0) {
            this.j = bitmap0 == null ? null : IconCompat.b(m.c(this.a, bitmap0));
            return this;
        }

        public e t(int v, int v1, int v2) {
            this.R.ledARGB = v;
            this.R.ledOnMS = v1;
            this.R.ledOffMS = v2;
            this.R.flags = (v1 == 0 || v2 == 0 ? 0 : 1) | this.R.flags & -2;
            return this;
        }

        public e u(boolean z) {
            this.z = z;
            return this;
        }

        public e v(int v) {
            this.l = v;
            return this;
        }

        public e w(boolean z) {
            this.o(8, z);
            return this;
        }

        public e x(int v) {
            this.m = v;
            return this;
        }

        public e y(boolean z) {
            this.n = z;
            return this;
        }

        public e z(int v) {
            this.R.icon = v;
            return this;
        }
    }

    public interface f {
        e a(e arg1);
    }

    public static class g extends h {
        private ArrayList e;

        public g() {
            this.e = new ArrayList();
        }

        @Override  // androidx.core.app.m$h
        public void b(l l0) {
            Notification.InboxStyle notification$InboxStyle0 = new Notification.InboxStyle(l0.a()).setBigContentTitle(this.b);
            if(this.d) {
                notification$InboxStyle0.setSummaryText(this.c);
            }
            for(Object object0: this.e) {
                notification$InboxStyle0.addLine(((CharSequence)object0));
            }
        }

        @Override  // androidx.core.app.m$h
        protected String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public g h(CharSequence charSequence0) {
            if(charSequence0 != null) {
                this.e.add(e.e(charSequence0));
            }
            return this;
        }

        public g i(CharSequence charSequence0) {
            this.b = e.e(charSequence0);
            return this;
        }
    }

    public static abstract class h {
        protected e a;
        CharSequence b;
        CharSequence c;
        boolean d;

        public h() {
            this.d = false;
        }

        public void a(Bundle bundle0) {
            if(this.d) {
                bundle0.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence0 = this.b;
            if(charSequence0 != null) {
                bundle0.putCharSequence("android.title.big", charSequence0);
            }
            String s = this.c();
            if(s != null) {
                bundle0.putString("androidx.core.app.extra.COMPAT_TEMPLATE", s);
            }
        }

        public abstract void b(l arg1);

        protected abstract String c();

        public RemoteViews d(l l0) [...] // Inlined contents

        public RemoteViews e(l l0) [...] // Inlined contents

        public RemoteViews f(l l0) [...] // Inlined contents

        public void g(e m$e0) {
            if(this.a != m$e0) {
                this.a = m$e0;
                if(m$e0 != null) {
                    m$e0.B(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification0) {
        return notification0.extras;
    }

    public static boolean b(Notification notification0) {
        return (notification0.flags & 0x200) != 0;
    }

    public static Bitmap c(Context context0, Bitmap bitmap0) {
        if(bitmap0 != null && Build.VERSION.SDK_INT < 27) {
            Resources resources0 = context0.getResources();
            int v = resources0.getDimensionPixelSize(v.b.b);
            int v1 = resources0.getDimensionPixelSize(v.b.a);
            if(bitmap0.getWidth() <= v && bitmap0.getHeight() <= v1) {
                return bitmap0;
            }
            double f = Math.min(((double)v) / ((double)Math.max(1, bitmap0.getWidth())), ((double)v1) / ((double)Math.max(1, bitmap0.getHeight())));
            return Bitmap.createScaledBitmap(bitmap0, ((int)Math.ceil(((double)bitmap0.getWidth()) * f)), ((int)Math.ceil(((double)bitmap0.getHeight()) * f)), true);
        }
        return bitmap0;
    }
}

