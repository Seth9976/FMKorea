package androidx.core.app;

import android.app.Notification.Action.Builder;
import android.app.Notification.Action;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.appcompat.app.E;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class n implements l {
    static abstract class a {
        static Notification.Builder a(Notification.Builder notification$Builder0, Notification.Action notification$Action0) {
            return notification$Builder0.addAction(notification$Action0);
        }

        static Notification.Action.Builder b(Notification.Action.Builder notification$Action$Builder0, Bundle bundle0) {
            return notification$Action$Builder0.addExtras(bundle0);
        }

        static Notification.Action.Builder c(Notification.Action.Builder notification$Action$Builder0, RemoteInput remoteInput0) {
            return notification$Action$Builder0.addRemoteInput(remoteInput0);
        }

        static Notification.Action d(Notification.Action.Builder notification$Action$Builder0) {
            return notification$Action$Builder0.build();
        }

        static Notification.Action.Builder e(int v, CharSequence charSequence0, PendingIntent pendingIntent0) {
            return new Notification.Action.Builder(v, charSequence0, pendingIntent0);
        }

        static String f(Notification notification0) {
            return notification0.getGroup();
        }

        static Notification.Builder g(Notification.Builder notification$Builder0, String s) {
            return notification$Builder0.setGroup(s);
        }

        static Notification.Builder h(Notification.Builder notification$Builder0, boolean z) {
            return notification$Builder0.setGroupSummary(z);
        }

        static Notification.Builder i(Notification.Builder notification$Builder0, boolean z) {
            return notification$Builder0.setLocalOnly(z);
        }

        static Notification.Builder j(Notification.Builder notification$Builder0, String s) {
            return notification$Builder0.setSortKey(s);
        }
    }

    static abstract class b {
        static Notification.Builder a(Notification.Builder notification$Builder0, String s) {
            return notification$Builder0.addPerson(s);
        }

        static Notification.Builder b(Notification.Builder notification$Builder0, String s) {
            return notification$Builder0.setCategory(s);
        }

        static Notification.Builder c(Notification.Builder notification$Builder0, int v) {
            return notification$Builder0.setColor(v);
        }

        static Notification.Builder d(Notification.Builder notification$Builder0, Notification notification0) {
            return notification$Builder0.setPublicVersion(notification0);
        }

        static Notification.Builder e(Notification.Builder notification$Builder0, Uri uri0, Object object0) {
            return notification$Builder0.setSound(uri0, ((AudioAttributes)object0));
        }

        static Notification.Builder f(Notification.Builder notification$Builder0, int v) {
            return notification$Builder0.setVisibility(v);
        }
    }

    static abstract class c {
        static Notification.Action.Builder a(Icon icon0, CharSequence charSequence0, PendingIntent pendingIntent0) {
            return new Notification.Action.Builder(icon0, charSequence0, pendingIntent0);
        }

        static Notification.Builder b(Notification.Builder notification$Builder0, Icon icon0) {
            return notification$Builder0.setLargeIcon(icon0);
        }

        static Notification.Builder c(Notification.Builder notification$Builder0, Object object0) {
            return notification$Builder0.setSmallIcon(((Icon)object0));
        }
    }

    static abstract class d {
        static Notification.Action.Builder a(Notification.Action.Builder notification$Action$Builder0, boolean z) {
            return notification$Action$Builder0.setAllowGeneratedReplies(z);
        }

        static Notification.Builder b(Notification.Builder notification$Builder0, RemoteViews remoteViews0) {
            return notification$Builder0.setCustomBigContentView(remoteViews0);
        }

        static Notification.Builder c(Notification.Builder notification$Builder0, RemoteViews remoteViews0) {
            return notification$Builder0.setCustomContentView(remoteViews0);
        }

        static Notification.Builder d(Notification.Builder notification$Builder0, RemoteViews remoteViews0) {
            return notification$Builder0.setCustomHeadsUpContentView(remoteViews0);
        }

        static Notification.Builder e(Notification.Builder notification$Builder0, CharSequence[] arr_charSequence) {
            return notification$Builder0.setRemoteInputHistory(arr_charSequence);
        }
    }

    static abstract class e {
        static Notification.Builder a(Context context0, String s) {
            return new Notification.Builder(context0, s);
        }

        static Notification.Builder b(Notification.Builder notification$Builder0, int v) {
            return notification$Builder0.setBadgeIconType(v);
        }

        static Notification.Builder c(Notification.Builder notification$Builder0, boolean z) {
            return notification$Builder0.setColorized(z);
        }

        static Notification.Builder d(Notification.Builder notification$Builder0, int v) {
            return notification$Builder0.setGroupAlertBehavior(v);
        }

        static Notification.Builder e(Notification.Builder notification$Builder0, CharSequence charSequence0) {
            return notification$Builder0.setSettingsText(charSequence0);
        }

        static Notification.Builder f(Notification.Builder notification$Builder0, String s) {
            return notification$Builder0.setShortcutId(s);
        }

        static Notification.Builder g(Notification.Builder notification$Builder0, long v) {
            return notification$Builder0.setTimeoutAfter(v);
        }
    }

    static abstract class f {
        static Notification.Builder a(Notification.Builder notification$Builder0, Person person0) {
            return notification$Builder0.addPerson(person0);
        }

        static Notification.Action.Builder b(Notification.Action.Builder notification$Action$Builder0, int v) {
            return notification$Action$Builder0.setSemanticAction(v);
        }
    }

    static abstract class g {
        static Notification.Builder a(Notification.Builder notification$Builder0, boolean z) {
            return notification$Builder0.setAllowSystemGeneratedContextualActions(z);
        }

        static Notification.Builder b(Notification.Builder notification$Builder0, Notification.BubbleMetadata notification$BubbleMetadata0) {
            return notification$Builder0.setBubbleMetadata(notification$BubbleMetadata0);
        }

        static Notification.Action.Builder c(Notification.Action.Builder notification$Action$Builder0, boolean z) {
            return notification$Action$Builder0.setContextual(z);
        }

        static Notification.Builder d(Notification.Builder notification$Builder0, Object object0) {
            return notification$Builder0.setLocusId(((LocusId)object0));
        }
    }

    static abstract class h {
        static Notification.Action.Builder a(Notification.Action.Builder notification$Action$Builder0, boolean z) {
            return notification$Action$Builder0.setAuthenticationRequired(z);
        }

        static Notification.Builder b(Notification.Builder notification$Builder0, int v) {
            return notification$Builder0.setForegroundServiceBehavior(v);
        }
    }

    private final Context a;
    private final Notification.Builder b;
    private final androidx.core.app.m.e c;
    private RemoteViews d;
    private RemoteViews e;
    private final List f;
    private final Bundle g;
    private int h;
    private RemoteViews i;

    n(androidx.core.app.m.e m$e0) {
        this.f = new ArrayList();
        this.g = new Bundle();
        this.c = m$e0;
        Context context0 = m$e0.a;
        this.a = context0;
        this.b = Build.VERSION.SDK_INT >= 26 ? e.a(context0, m$e0.K) : new Notification.Builder(m$e0.a);
        Notification notification0 = m$e0.R;
        this.b.setWhen(notification0.when).setSmallIcon(notification0.icon, notification0.iconLevel).setContent(notification0.contentView).setTicker(notification0.tickerText, m$e0.i).setVibrate(notification0.vibrate).setLights(notification0.ledARGB, notification0.ledOnMS, notification0.ledOffMS).setOngoing((notification0.flags & 2) != 0).setOnlyAlertOnce((notification0.flags & 8) != 0).setAutoCancel((notification0.flags & 16) != 0).setDefaults(notification0.defaults).setContentTitle(m$e0.e).setContentText(m$e0.f).setContentInfo(m$e0.k).setContentIntent(m$e0.g).setDeleteIntent(notification0.deleteIntent).setFullScreenIntent(m$e0.h, (notification0.flags & 0x80) != 0).setNumber(m$e0.l).setProgress(m$e0.t, m$e0.u, m$e0.v);
        Icon icon0 = m$e0.j == null ? null : m$e0.j.m(context0);
        c.b(this.b, icon0);
        this.b.setSubText(m$e0.q).setUsesChronometer(m$e0.o).setPriority(m$e0.m);
        for(Object object0: m$e0.b) {
            this.b(((androidx.core.app.m.a)object0));
        }
        Bundle bundle0 = m$e0.D;
        if(bundle0 != null) {
            this.g.putAll(bundle0);
        }
        int v = Build.VERSION.SDK_INT;
        this.d = m$e0.H;
        this.e = m$e0.I;
        this.b.setShowWhen(m$e0.n);
        a.i(this.b, m$e0.z);
        a.g(this.b, m$e0.w);
        a.j(this.b, m$e0.y);
        a.h(this.b, m$e0.x);
        this.h = m$e0.O;
        b.b(this.b, m$e0.C);
        b.c(this.b, m$e0.E);
        b.f(this.b, m$e0.F);
        b.d(this.b, m$e0.G);
        b.e(this.b, notification0.sound, notification0.audioAttributes);
        List list0 = v < 28 ? n.e(n.g(m$e0.c), m$e0.U) : m$e0.U;
        if(list0 != null && !list0.isEmpty()) {
            for(Object object1: list0) {
                b.a(this.b, ((String)object1));
            }
        }
        this.i = m$e0.J;
        if(m$e0.d.size() > 0) {
            Bundle bundle1 = m$e0.d().getBundle("android.car.EXTENSIONS");
            if(bundle1 == null) {
                bundle1 = new Bundle();
            }
            Bundle bundle2 = new Bundle(bundle1);
            Bundle bundle3 = new Bundle();
            for(int v1 = 0; v1 < m$e0.d.size(); ++v1) {
                bundle3.putBundle(Integer.toString(v1), o.a(((androidx.core.app.m.a)m$e0.d.get(v1))));
            }
            bundle1.putBundle("invisible_actions", bundle3);
            bundle2.putBundle("invisible_actions", bundle3);
            m$e0.d().putBundle("android.car.EXTENSIONS", bundle1);
            this.g.putBundle("android.car.EXTENSIONS", bundle2);
        }
        int v2 = Build.VERSION.SDK_INT;
        Object object2 = m$e0.T;
        if(object2 != null) {
            c.c(this.b, object2);
        }
        if(v2 >= 24) {
            this.b.setExtras(m$e0.D);
            d.e(this.b, m$e0.s);
            RemoteViews remoteViews0 = m$e0.H;
            if(remoteViews0 != null) {
                d.c(this.b, remoteViews0);
            }
            RemoteViews remoteViews1 = m$e0.I;
            if(remoteViews1 != null) {
                d.b(this.b, remoteViews1);
            }
            RemoteViews remoteViews2 = m$e0.J;
            if(remoteViews2 != null) {
                d.d(this.b, remoteViews2);
            }
        }
        if(v2 >= 26) {
            e.b(this.b, m$e0.L);
            e.e(this.b, m$e0.r);
            e.f(this.b, m$e0.M);
            e.g(this.b, m$e0.N);
            e.d(this.b, m$e0.O);
            if(m$e0.B) {
                e.c(this.b, m$e0.A);
            }
            if(!TextUtils.isEmpty(m$e0.K)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if(v2 >= 28) {
            Iterator iterator2 = m$e0.c.iterator();
            if(iterator2.hasNext()) {
                Object object3 = iterator2.next();
                E.a(object3);
                throw null;
            }
        }
        if(v2 >= 29) {
            g.a(this.b, m$e0.Q);
            g.b(this.b, null);
        }
        if(v2 >= 0x1F) {
            int v3 = m$e0.P;
            if(v3 != 0) {
                h.b(this.b, v3);
            }
        }
        if(m$e0.S) {
            this.h = this.c.x ? 2 : 1;
            this.b.setVibrate(null);
            this.b.setSound(null);
            int v4 = notification0.defaults & -4;
            notification0.defaults = v4;
            this.b.setDefaults(v4);
            if(v2 >= 26) {
                if(TextUtils.isEmpty(this.c.w)) {
                    a.g(this.b, "silent");
                }
                e.d(this.b, this.h);
            }
        }
    }

    @Override  // androidx.core.app.l
    public Notification.Builder a() {
        return this.b;
    }

    private void b(androidx.core.app.m.a m$a0) {
        IconCompat iconCompat0 = m$a0.d();
        Notification.Action.Builder notification$Action$Builder0 = c.a((iconCompat0 == null ? null : iconCompat0.l()), m$a0.h(), m$a0.a());
        if(m$a0.e() != null) {
            RemoteInput[] arr_remoteInput = t.b(m$a0.e());
            for(int v = 0; v < arr_remoteInput.length; ++v) {
                a.c(notification$Action$Builder0, arr_remoteInput[v]);
            }
        }
        Bundle bundle0 = m$a0.c() == null ? new Bundle() : new Bundle(m$a0.c());
        bundle0.putBoolean("android.support.allowGeneratedReplies", m$a0.b());
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 24) {
            d.a(notification$Action$Builder0, m$a0.b());
        }
        bundle0.putInt("android.support.action.semanticAction", m$a0.f());
        if(v1 >= 28) {
            f.b(notification$Action$Builder0, m$a0.f());
        }
        if(v1 >= 29) {
            g.c(notification$Action$Builder0, m$a0.j());
        }
        if(v1 >= 0x1F) {
            h.a(notification$Action$Builder0, m$a0.i());
        }
        bundle0.putBoolean("android.support.action.showsUserInterface", m$a0.g());
        a.b(notification$Action$Builder0, bundle0);
        Notification.Action notification$Action0 = a.d(notification$Action$Builder0);
        a.a(this.b, notification$Action0);
    }

    public Notification c() {
        androidx.core.app.m.h m$h0 = this.c.p;
        if(m$h0 != null) {
            m$h0.b(this);
        }
        Notification notification0 = this.d();
        RemoteViews remoteViews0 = this.c.H;
        if(remoteViews0 != null) {
            notification0.contentView = remoteViews0;
        }
        if(m$h0 != null) {
            Bundle bundle0 = m.a(notification0);
            if(bundle0 != null) {
                m$h0.a(bundle0);
            }
        }
        return notification0;
    }

    protected Notification d() {
        int v = Build.VERSION.SDK_INT;
        if(v >= 26) {
            return this.b.build();
        }
        if(v >= 24) {
            Notification notification0 = this.b.build();
            if(this.h != 0) {
                if(a.f(notification0) != null && (notification0.flags & 0x200) != 0 && this.h == 2) {
                    this.h(notification0);
                }
                if(a.f(notification0) != null && (notification0.flags & 0x200) == 0 && this.h == 1) {
                    this.h(notification0);
                }
            }
            return notification0;
        }
        this.b.setExtras(this.g);
        Notification notification1 = this.b.build();
        RemoteViews remoteViews0 = this.d;
        if(remoteViews0 != null) {
            notification1.contentView = remoteViews0;
        }
        RemoteViews remoteViews1 = this.e;
        if(remoteViews1 != null) {
            notification1.bigContentView = remoteViews1;
        }
        RemoteViews remoteViews2 = this.i;
        if(remoteViews2 != null) {
            notification1.headsUpContentView = remoteViews2;
        }
        if(this.h != 0) {
            if(a.f(notification1) != null && (notification1.flags & 0x200) != 0 && this.h == 2) {
                this.h(notification1);
            }
            if(a.f(notification1) != null && (notification1.flags & 0x200) == 0 && this.h == 1) {
                this.h(notification1);
            }
        }
        return notification1;
    }

    private static List e(List list0, List list1) {
        if(list0 == null) {
            return list1;
        }
        if(list1 == null) {
            return list0;
        }
        androidx.collection.b b0 = new androidx.collection.b(list0.size() + list1.size());
        b0.addAll(list0);
        b0.addAll(list1);
        return new ArrayList(b0);
    }

    Context f() {
        return this.a;
    }

    private static List g(List list0) {
        if(list0 == null) {
            return null;
        }
        List list1 = new ArrayList(list0.size());
        Iterator iterator0 = list0.iterator();
        if(!iterator0.hasNext()) {
            return list1;
        }
        Object object0 = iterator0.next();
        E.a(object0);
        throw null;
    }

    private void h(Notification notification0) {
        notification0.sound = null;
        notification0.vibrate = null;
        notification0.defaults &= -4;
    }
}

