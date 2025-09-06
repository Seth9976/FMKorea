package a2;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

public final class l {
    static abstract class a {
    }

    public static final class b {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;

        public l a() {
            return new l(this.b, this.a, this.c, this.d, this.e, this.f, this.g, null);
        }

        public b b(String s) {
            this.a = Preconditions.checkNotEmpty(s, "ApiKey must be set.");
            return this;
        }

        public b c(String s) {
            this.b = Preconditions.checkNotEmpty(s, "ApplicationId must be set.");
            return this;
        }

        public b d(String s) {
            this.e = s;
            return this;
        }

        public b e(String s) {
            this.g = s;
            return this;
        }
    }

    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    private l(String s, String s1, String s2, String s3, String s4, String s5, String s6) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(s), "ApplicationId must be set.");
        this.b = s;
        this.a = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.g = s6;
    }

    l(String s, String s1, String s2, String s3, String s4, String s5, String s6, a l$a0) {
        this(s, s1, s2, s3, s4, s5, s6);
    }

    public static l a(Context context0) {
        StringResourceValueReader stringResourceValueReader0 = new StringResourceValueReader(context0);
        String s = stringResourceValueReader0.getString("google_app_id");
        return TextUtils.isEmpty(s) ? null : new l(s, stringResourceValueReader0.getString("google_api_key"), stringResourceValueReader0.getString("firebase_database_url"), stringResourceValueReader0.getString("ga_trackingId"), stringResourceValueReader0.getString("gcm_defaultSenderId"), stringResourceValueReader0.getString("google_storage_bucket"), stringResourceValueReader0.getString("project_id"));
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.g;
    }

    // 去混淆评级： 中等(80)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof l ? Objects.equal(this.b, ((l)object0).b) && Objects.equal(this.a, ((l)object0).a) && Objects.equal(this.c, ((l)object0).c) && Objects.equal(this.d, ((l)object0).d) && Objects.equal(this.e, ((l)object0).e) && Objects.equal(this.f, ((l)object0).f) && Objects.equal(this.g, ((l)object0).g) : false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.b).add("apiKey", this.a).add("databaseUrl", this.c).add("gcmSenderId", this.e).add("storageBucket", this.f).add("projectId", this.g).toString();
    }
}

