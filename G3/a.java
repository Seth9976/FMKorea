package g3;

import android.content.ContentValues;
import android.database.Cursor;
import com.onesignal.O1;
import com.onesignal.Q0;
import com.onesignal.m1;
import e3.b;
import e3.c;
import h3.d;
import h3.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import z3.k;

public final class a {
    public abstract class g3.a.a {
        public static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            arr_v[c.g.ordinal()] = 1;
            arr_v[c.h.ordinal()] = 2;
            g3.a.a.a = arr_v;
        }
    }

    private final Q0 a;
    private final O1 b;
    private final m1 c;

    public a(Q0 q00, O1 o10, m1 m10) {
        k.e(q00, "logger");
        k.e(o10, "dbHelper");
        k.e(m10, "preferences");
        super();
        this.a = q00;
        this.b = o10;
        this.c = m10;
    }

    private final void a(List list0, JSONArray jSONArray0, b b0) {
        if(jSONArray0 != null) {
            int v = jSONArray0.length();
            if(v > 0) {
                for(int v1 = 0; true; ++v1) {
                    try {
                        String s = jSONArray0.getString(v1);
                        k.d(s, "influenceId");
                        list0.add(new h3.a(s, b0));
                    }
                    catch(JSONException jSONException0) {
                        jSONException0.printStackTrace();
                    }
                    if(v1 + 1 >= v) {
                        break;
                    }
                }
            }
        }
    }

    private final void b(List list0, e e0) {
        if(e0 != null) {
            this.a(list0, e0.a(), b.h);
            this.a(list0, e0.b(), b.i);
        }
    }

    public final void c(String s, String s1) {
        synchronized(this) {
            k.e(s, "notificationTableName");
            k.e(s1, "notificationIdColumnName");
            k.d(Locale.ROOT, "ROOT");
            k.d("notification", "(this as java.lang.String).toLowerCase(locale)");
            this.b.g("cached_unique_outcome", "NOT EXISTS(SELECT NULL FROM " + s + " n WHERE n." + s1 + " = channel_influence_id AND channel_type = \"" + "notification" + "\")", null);
        }
    }

    public final void d(h3.b b0) {
        synchronized(this) {
            k.e(b0, "event");
            this.b.g("outcome", "timestamp = ?", new String[]{String.valueOf(b0.c())});
        }
    }

    public final List e() {
        synchronized(this) {
            List list0 = new ArrayList();
            Cursor cursor0 = null;
            try {
                cursor0 = this.b.f("outcome", null, null, null, null, null, null);
                if(cursor0.moveToFirst()) {
                    do {
                        String s = cursor0.getString(cursor0.getColumnIndex("notification_influence_type"));
                        c c0 = c.f.a(s);
                        String s1 = cursor0.getString(cursor0.getColumnIndex("iam_influence_type"));
                        c c1 = c.f.a(s1);
                        String s2 = cursor0.getString(cursor0.getColumnIndex("notification_ids"));
                        if(s2 == null) {
                            s2 = "[]";
                        }
                        String s3 = cursor0.getString(cursor0.getColumnIndex("iam_ids"));
                        if(s3 == null) {
                            s3 = "[]";
                        }
                        String s4 = cursor0.getString(cursor0.getColumnIndex("name"));
                        float f = cursor0.getFloat(cursor0.getColumnIndex("weight"));
                        long v1 = cursor0.getLong(cursor0.getColumnIndex("timestamp"));
                        try {
                            e e0 = new e(null, null, 3, null);
                            e e1 = new e(null, null, 3, null);
                            d d0 = this.h(c0, e0, e1, s2);
                            this.f(c1, e0, e1, s3, d0);
                            if(d0 == null) {
                                d0 = new d(null, null);
                            }
                            k.d(s4, "name");
                            list0.add(new h3.b(s4, d0, f, v1));
                        }
                        catch(JSONException jSONException0) {
                            this.a.c("Generating JSONArray from notifications ids outcome:JSON Failed.", jSONException0);
                        }
                    }
                    while(cursor0.moveToNext());
                }
            }
            catch(Throwable throwable0) {
                if(cursor0 != null && !cursor0.isClosed()) {
                    cursor0.close();
                }
                throw throwable0;
            }
            if(!cursor0.isClosed()) {
                cursor0.close();
            }
            return list0;
        }
    }

    private final d f(c c0, e e0, e e1, String s, d d0) {
        switch(g3.a.a.a[c0.ordinal()]) {
            case 1: {
                e0.c(new JSONArray(s));
                d0 = d0 == null ? null : d0.c(e0);
                return d0 == null ? new d(e0, null) : d0;
            }
            case 2: {
                e1.c(new JSONArray(s));
                d0 = d0 == null ? null : d0.e(e1);
                return d0 == null ? new d(null, e1) : d0;
            }
            default: {
                return d0;
            }
        }
    }

    public final List g(String s, List list0) {
        synchronized(this) {
            k.e(s, "name");
            k.e(list0, "influences");
            List list1 = new ArrayList();
            Cursor cursor0 = null;
            try {
                try {
                    Iterator iterator0 = list0.iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            goto label_39;
                        }
                        Object object0 = iterator0.next();
                        e3.a a0 = (e3.a)object0;
                        JSONArray jSONArray0 = new JSONArray();
                        JSONArray jSONArray1 = a0.b();
                        if(jSONArray1 != null) {
                            int v1 = jSONArray1.length();
                            if(v1 > 0) {
                                for(int v2 = 0; true; ++v2) {
                                    String s1 = jSONArray1.getString(v2);
                                    cursor0 = this.b.b("cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", new String[]{s1, a0.c().toString(), s}, null, null, null, "1");
                                    if(cursor0.getCount() == 0) {
                                        jSONArray0.put(s1);
                                    }
                                    if(v2 + 1 >= v1) {
                                        break;
                                    }
                                }
                            }
                            if(jSONArray0.length() > 0) {
                                e3.a a1 = a0.a();
                                a1.e(jSONArray0);
                                list1.add(a1);
                            }
                        }
                    }
                }
                catch(JSONException jSONException0) {
                }
                jSONException0.printStackTrace();
            }
            catch(Throwable throwable0) {
                goto label_35;
            }
            if(cursor0 != null && !cursor0.isClosed()) {
                cursor0.close();
                return list1;
            label_35:
                if(cursor0 != null && !cursor0.isClosed()) {
                    cursor0.close();
                }
                throw throwable0;
            label_39:
                if(cursor0 != null && !cursor0.isClosed()) {
                    cursor0.close();
                }
            }
            return list1;
        }
    }

    private final d h(c c0, e e0, e e1, String s) {
        switch(g3.a.a.a[c0.ordinal()]) {
            case 1: {
                e0.d(new JSONArray(s));
                return new d(e0, null);
            }
            case 2: {
                e1.d(new JSONArray(s));
                return new d(null, e1);
            }
            default: {
                return null;
            }
        }
    }

    public final Set i() {
        String s = this.c.f();
        return this.c.c(s, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", null);
    }

    public final boolean j() {
        String s = this.c.f();
        String s1 = this.c.h();
        return this.c.j(s, s1, false);
    }

    public final void k(h3.b b0) {
        c c2;
        c c1;
        synchronized(this) {
            k.e(b0, "eventParams");
            JSONArray jSONArray0 = new JSONArray();
            JSONArray jSONArray1 = new JSONArray();
            c c0 = c.i;
            d d0 = b0.b();
            if(d0 == null) {
                c2 = c0;
            }
            else {
                e e0 = d0.a();
                if(e0 == null) {
                    c2 = c0;
                }
                else {
                    JSONArray jSONArray2 = e0.b();
                    if(jSONArray2 == null) {
                        c1 = c0;
                    }
                    else if(jSONArray2.length() > 0) {
                        c1 = c.g;
                        jSONArray0 = jSONArray2;
                    }
                    else {
                        c1 = c0;
                    }
                    JSONArray jSONArray3 = e0.a();
                    if(jSONArray3 != null && jSONArray3.length() > 0) {
                        c0 = c.g;
                        jSONArray1 = jSONArray3;
                    }
                    c2 = c0;
                    c0 = c1;
                }
            }
            d d1 = b0.b();
            if(d1 != null) {
                e e1 = d1.b();
                if(e1 != null) {
                    JSONArray jSONArray4 = e1.b();
                    if(jSONArray4 != null && jSONArray4.length() > 0) {
                        c0 = c.h;
                        jSONArray0 = jSONArray4;
                    }
                    JSONArray jSONArray5 = e1.a();
                    if(jSONArray5 != null && jSONArray5.length() > 0) {
                        c2 = c.h;
                        jSONArray1 = jSONArray5;
                    }
                }
            }
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("notification_ids", jSONArray0.toString());
            contentValues0.put("iam_ids", jSONArray1.toString());
            String s = c0.toString();
            if(s != null) {
                String s1 = s.toLowerCase();
                k.d(s1, "(this as java.lang.String).toLowerCase()");
                contentValues0.put("notification_influence_type", s1);
                String s2 = c2.toString();
                if(s2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String s3 = s2.toLowerCase();
                k.d(s3, "(this as java.lang.String).toLowerCase()");
                contentValues0.put("iam_influence_type", s3);
                contentValues0.put("name", b0.a());
                contentValues0.put("weight", b0.d());
                contentValues0.put("timestamp", b0.c());
                this.b.j("outcome", null, contentValues0);
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final void l(Set set0) {
        String s = this.c.f();
        k.b(set0);
        this.c.g(s, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set0);
    }

    public final void m(h3.b b0) {
        synchronized(this) {
            k.e(b0, "eventParams");
            this.a.d("OneSignal saveUniqueOutcomeEventParams: " + b0);
            String s = b0.a();
            ArrayList arrayList0 = new ArrayList();
            d d0 = b0.b();
            d d1 = b0.b();
            this.b(arrayList0, (d0 == null ? null : d0.a()));
            this.b(arrayList0, (d1 == null ? null : d1.b()));
            for(Object object0: arrayList0) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("channel_influence_id", ((h3.a)object0).b());
                contentValues0.put("channel_type", ((h3.a)object0).a().toString());
                contentValues0.put("name", s);
                this.b.j("cached_unique_outcome", null, contentValues0);
            }
        }
    }
}

