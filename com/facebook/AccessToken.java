package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.F;
import com.facebook.internal.G;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AccessToken implements Parcelable {
    static final class a implements Parcelable.Creator {
        public AccessToken a(Parcel parcel0) {
            return new AccessToken(parcel0);
        }

        public AccessToken[] b(int v) {
            return new AccessToken[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    public interface b {
        void a(e arg1);
    }

    public static final Parcelable.Creator CREATOR;
    private final Date f;
    private final Set g;
    private final Set h;
    private final Set i;
    private final String j;
    private final c k;
    private final Date l;
    private final String m;
    private final String n;
    private final Date o;
    private final String p;
    private static final Date q;
    private static final Date r;
    private static final Date s;
    private static final c t;

    static {
        Date date0 = new Date(0x7FFFFFFFFFFFFFFFL);
        AccessToken.q = date0;
        AccessToken.r = date0;
        AccessToken.s = new Date();
        AccessToken.t = c.h;
        AccessToken.CREATOR = new a();
    }

    AccessToken(Parcel parcel0) {
        this.f = new Date(parcel0.readLong());
        ArrayList arrayList0 = new ArrayList();
        parcel0.readStringList(arrayList0);
        this.g = Collections.unmodifiableSet(new HashSet(arrayList0));
        arrayList0.clear();
        parcel0.readStringList(arrayList0);
        this.h = Collections.unmodifiableSet(new HashSet(arrayList0));
        arrayList0.clear();
        parcel0.readStringList(arrayList0);
        this.i = Collections.unmodifiableSet(new HashSet(arrayList0));
        this.j = parcel0.readString();
        this.k = c.valueOf(parcel0.readString());
        this.l = new Date(parcel0.readLong());
        this.m = parcel0.readString();
        this.n = parcel0.readString();
        this.o = new Date(parcel0.readLong());
        this.p = parcel0.readString();
    }

    public AccessToken(String s, String s1, String s2, Collection collection0, Collection collection1, Collection collection2, c c0, Date date0, Date date1, Date date2) {
        this(s, s1, s2, collection0, collection1, collection2, c0, date0, date1, date2, null);
    }

    public AccessToken(String s, String s1, String s2, Collection collection0, Collection collection1, Collection collection2, c c0, Date date0, Date date1, Date date2, String s3) {
        G.j(s, "accessToken");
        G.j(s1, "applicationId");
        G.j(s2, "userId");
        if(date0 == null) {
            date0 = AccessToken.r;
        }
        this.f = date0;
        this.g = Collections.unmodifiableSet((collection0 == null ? new HashSet() : new HashSet(collection0)));
        this.h = Collections.unmodifiableSet((collection1 == null ? new HashSet() : new HashSet(collection1)));
        this.i = Collections.unmodifiableSet((collection2 == null ? new HashSet() : new HashSet(collection2)));
        this.j = s;
        if(c0 == null) {
            c0 = AccessToken.t;
        }
        this.k = c0;
        if(date1 == null) {
            date1 = AccessToken.s;
        }
        this.l = date1;
        this.m = s1;
        this.n = s2;
        if(date2 == null || date2.getTime() == 0L) {
            date2 = AccessToken.r;
        }
        this.o = date2;
        this.p = s3;
    }

    private void a(StringBuilder stringBuilder0) {
        stringBuilder0.append(" permissions:");
        if(this.g == null) {
            stringBuilder0.append("null");
            return;
        }
        stringBuilder0.append("[");
        stringBuilder0.append(TextUtils.join(", ", this.g));
        stringBuilder0.append("]");
    }

    static AccessToken b(AccessToken accessToken0) {
        Date date0 = new Date();
        Date date1 = new Date();
        return new AccessToken(accessToken0.j, accessToken0.m, accessToken0.r(), accessToken0.n(), accessToken0.i(), accessToken0.j(), accessToken0.k, date0, date1, accessToken0.o);
    }

    static AccessToken c(JSONObject jSONObject0) {
        if(jSONObject0.getInt("version") > 1) {
            throw new e("Unknown AccessToken serialization format.");
        }
        String s = jSONObject0.getString("token");
        Date date0 = new Date(jSONObject0.getLong("expires_at"));
        JSONArray jSONArray0 = jSONObject0.getJSONArray("permissions");
        JSONArray jSONArray1 = jSONObject0.getJSONArray("declined_permissions");
        JSONArray jSONArray2 = jSONObject0.optJSONArray("expired_permissions");
        Date date1 = new Date(jSONObject0.getLong("last_refresh"));
        c c0 = c.valueOf(jSONObject0.getString("source"));
        String s1 = jSONObject0.getString("application_id");
        String s2 = jSONObject0.getString("user_id");
        Date date2 = new Date(jSONObject0.optLong("data_access_expiration_time", 0L));
        String s3 = jSONObject0.optString("graph_domain", null);
        List list0 = F.S(jSONArray0);
        List list1 = F.S(jSONArray1);
        return jSONArray2 == null ? new AccessToken(s, s1, s2, list0, list1, new ArrayList(), c0, date0, date1, date2, s3) : new AccessToken(s, s1, s2, list0, list1, F.S(jSONArray2), c0, date0, date1, date2, s3);
    }

    static AccessToken d(Bundle bundle0) {
        List list0 = AccessToken.o(bundle0, "com.facebook.TokenCachingStrategy.Permissions");
        List list1 = AccessToken.o(bundle0, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        List list2 = AccessToken.o(bundle0, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
        String s = p.c(bundle0);
        if(F.P(s)) {
            s = h.f();
        }
        String s1 = p.f(bundle0);
        JSONObject jSONObject0 = F.c(s1);
        try {
            return new AccessToken(s1, s, jSONObject0.getString("id"), list0, list1, list2, p.e(bundle0), p.d(bundle0, "com.facebook.TokenCachingStrategy.ExpirationDate"), p.d(bundle0, "com.facebook.TokenCachingStrategy.LastRefreshDate"), null);
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static void e() {
        AccessToken accessToken0 = com.facebook.b.h().g();
        if(accessToken0 != null) {
            AccessToken.w(AccessToken.b(accessToken0));
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AccessToken)) {
            return false;
        }
        if(this.f.equals(((AccessToken)object0).f) && this.g.equals(((AccessToken)object0).g) && this.h.equals(((AccessToken)object0).h) && this.i.equals(((AccessToken)object0).i) && this.j.equals(((AccessToken)object0).j) && this.k == ((AccessToken)object0).k && this.l.equals(((AccessToken)object0).l)) {
            String s = this.m;
            if(s != null) {
                if(s.equals(((AccessToken)object0).m)) {
                label_10:
                    if(this.n.equals(((AccessToken)object0).n) && this.o.equals(((AccessToken)object0).o)) {
                        String s1 = ((AccessToken)object0).p;
                        return this.p == null ? s1 == null : this.p.equals(s1);
                    }
                }
            }
            else if(((AccessToken)object0).m == null) {
                goto label_10;
            }
        }
        return false;
    }

    public String f() {
        return this.m;
    }

    public static AccessToken g() {
        return com.facebook.b.h().g();
    }

    public Date h() {
        return this.o;
    }

    @Override
    public int hashCode() {
        int v = this.f.hashCode();
        int v1 = this.g.hashCode();
        int v2 = this.h.hashCode();
        int v3 = this.i.hashCode();
        int v4 = this.j.hashCode();
        int v5 = this.k.hashCode();
        int v6 = this.l.hashCode();
        int v7 = 0;
        int v8 = this.m == null ? 0 : this.m.hashCode();
        int v9 = this.n.hashCode();
        int v10 = this.o.hashCode();
        String s = this.p;
        if(s != null) {
            v7 = s.hashCode();
        }
        return ((((((((((v + 0x20F) * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v7;
    }

    public Set i() {
        return this.h;
    }

    public Set j() {
        return this.i;
    }

    public Date k() {
        return this.f;
    }

    public String l() {
        return this.p;
    }

    public Date m() {
        return this.l;
    }

    public Set n() {
        return this.g;
    }

    static List o(Bundle bundle0, String s) {
        ArrayList arrayList0 = bundle0.getStringArrayList(s);
        return arrayList0 == null ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(arrayList0));
    }

    public c p() {
        return this.k;
    }

    public String q() {
        return this.j;
    }

    public String r() {
        return this.n;
    }

    public static boolean s() {
        AccessToken accessToken0 = com.facebook.b.h().g();
        return accessToken0 != null && !accessToken0.u();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("{AccessToken");
        stringBuilder0.append(" token:");
        stringBuilder0.append(this.y());
        this.a(stringBuilder0);
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    public boolean u() {
        return new Date().after(this.f);
    }

    public static void w(AccessToken accessToken0) {
        com.facebook.b.h().m(accessToken0);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.f.getTime());
        parcel0.writeStringList(new ArrayList(this.g));
        parcel0.writeStringList(new ArrayList(this.h));
        parcel0.writeStringList(new ArrayList(this.i));
        parcel0.writeString(this.j);
        parcel0.writeString(this.k.name());
        parcel0.writeLong(this.l.getTime());
        parcel0.writeString(this.m);
        parcel0.writeString(this.n);
        parcel0.writeLong(this.o.getTime());
        parcel0.writeString(this.p);
    }

    JSONObject x() {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("version", 1);
        jSONObject0.put("token", this.j);
        jSONObject0.put("expires_at", this.f.getTime());
        jSONObject0.put("permissions", new JSONArray(this.g));
        jSONObject0.put("declined_permissions", new JSONArray(this.h));
        jSONObject0.put("expired_permissions", new JSONArray(this.i));
        jSONObject0.put("last_refresh", this.l.getTime());
        jSONObject0.put("source", this.k.name());
        jSONObject0.put("application_id", this.m);
        jSONObject0.put("user_id", this.n);
        jSONObject0.put("data_access_expiration_time", this.o.getTime());
        String s = this.p;
        if(s != null) {
            jSONObject0.put("graph_domain", s);
        }
        return jSONObject0;
    }

    private String y() {
        if(this.j == null) {
            return "null";
        }
        return h.x(q.g) ? this.j : "ACCESS_TOKEN_REMOVED";
    }
}

