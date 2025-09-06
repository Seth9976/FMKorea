package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.internal.F;
import com.facebook.internal.G;
import org.json.JSONException;
import org.json.JSONObject;

public final class Profile implements Parcelable {
    static final class b implements Parcelable.Creator {
        public Profile a(Parcel parcel0) {
            return new Profile(parcel0, null);
        }

        public Profile[] b(int v) {
            return new Profile[v];
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

    public static final Parcelable.Creator CREATOR = null;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final Uri k;
    private static final String l = "Profile";

    static {
        Profile.CREATOR = new b();
    }

    private Profile(Parcel parcel0) {
        this.f = parcel0.readString();
        this.g = parcel0.readString();
        this.h = parcel0.readString();
        this.i = parcel0.readString();
        this.j = parcel0.readString();
        String s = parcel0.readString();
        this.k = s == null ? null : Uri.parse(s);
    }

    Profile(Parcel parcel0, a profile$a0) {
        this(parcel0);
    }

    public Profile(String s, String s1, String s2, String s3, String s4, Uri uri0) {
        G.j(s, "id");
        this.f = s;
        this.g = s1;
        this.h = s2;
        this.i = s3;
        this.j = s4;
        this.k = uri0;
    }

    Profile(JSONObject jSONObject0) {
        Uri uri0 = null;
        this.f = jSONObject0.optString("id", null);
        this.g = jSONObject0.optString("first_name", null);
        this.h = jSONObject0.optString("middle_name", null);
        this.i = jSONObject0.optString("last_name", null);
        this.j = jSONObject0.optString("name", null);
        String s = jSONObject0.optString("link_uri", null);
        if(s != null) {
            uri0 = Uri.parse(s);
        }
        this.k = uri0;
    }

    // 去混淆评级： 低(20)
    static String a() [...] // 潜在的解密器

    public static void b() {
        static final class a implements com.facebook.internal.F.a {
            @Override  // com.facebook.internal.F$a
            public void a(JSONObject jSONObject0) {
                String s = jSONObject0.optString("id");
                if(s == null) {
                    Log.w("Profile", "No user ID returned on Me request");
                    return;
                }
                String s1 = jSONObject0.optString("link");
                Profile.d(new Profile(s, jSONObject0.optString("first_name"), jSONObject0.optString("middle_name"), jSONObject0.optString("last_name"), jSONObject0.optString("name"), (s1 == null ? null : Uri.parse(s1))));
            }

            @Override  // com.facebook.internal.F$a
            public void b(e e0) {
                Log.e("Profile", "Got unexpected exception: " + e0);
            }
        }

        AccessToken accessToken0 = AccessToken.g();
        if(!AccessToken.s()) {
            Profile.d(null);
            return;
        }
        F.x(accessToken0.q(), new a());
    }

    public static Profile c() {
        return s.b().a();
    }

    public static void d(Profile profile0) {
        s.b().e(profile0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    JSONObject e() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("id", this.f);
            jSONObject0.put("first_name", this.g);
            jSONObject0.put("middle_name", this.h);
            jSONObject0.put("last_name", this.i);
            jSONObject0.put("name", this.j);
            Uri uri0 = this.k;
            if(uri0 != null) {
                jSONObject0.put("link_uri", uri0.toString());
                return jSONObject0;
            }
            return jSONObject0;
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Profile)) {
            return false;
        }
        String s = this.f;
        if(s != null) {
            if(s.equals(((Profile)object0).f)) {
            label_9:
                String s1 = this.g;
                if(s1 != null) {
                    if(s1.equals(((Profile)object0).g)) {
                    label_14:
                        String s2 = this.h;
                        if(s2 != null) {
                            if(s2.equals(((Profile)object0).h)) {
                            label_19:
                                String s3 = this.i;
                                if(s3 != null) {
                                    if(s3.equals(((Profile)object0).i)) {
                                    label_24:
                                        String s4 = this.j;
                                        if(s4 != null) {
                                            if(s4.equals(((Profile)object0).j)) {
                                            label_29:
                                                Uri uri0 = ((Profile)object0).k;
                                                return this.k == null ? uri0 == null : this.k.equals(uri0);
                                            }
                                        }
                                        else if(((Profile)object0).j == null) {
                                            goto label_29;
                                        }
                                    }
                                }
                                else if(((Profile)object0).i == null) {
                                    goto label_24;
                                }
                            }
                        }
                        else if(((Profile)object0).h == null) {
                            goto label_19;
                        }
                    }
                }
                else if(((Profile)object0).g == null) {
                    goto label_14;
                }
            }
        }
        else if(((Profile)object0).f == null) {
            goto label_9;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = this.f.hashCode() + 0x20F;
        String s = this.g;
        if(s != null) {
            v = v * 0x1F + s.hashCode();
        }
        String s1 = this.h;
        if(s1 != null) {
            v = v * 0x1F + s1.hashCode();
        }
        String s2 = this.i;
        if(s2 != null) {
            v = v * 0x1F + s2.hashCode();
        }
        String s3 = this.j;
        if(s3 != null) {
            v = v * 0x1F + s3.hashCode();
        }
        return this.k == null ? v : v * 0x1F + this.k.hashCode();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.f);
        parcel0.writeString(this.g);
        parcel0.writeString(this.h);
        parcel0.writeString(this.i);
        parcel0.writeString(this.j);
        parcel0.writeString((this.k == null ? null : this.k.toString()));
    }
}

