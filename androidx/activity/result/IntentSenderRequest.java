package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import z3.g;
import z3.k;

@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final class a {
        private final IntentSender a;
        private Intent b;
        private int c;
        private int d;

        public a(PendingIntent pendingIntent0) {
            k.e(pendingIntent0, "pendingIntent");
            IntentSender intentSender0 = pendingIntent0.getIntentSender();
            k.d(intentSender0, "pendingIntent.intentSender");
            this(intentSender0);
        }

        public a(IntentSender intentSender0) {
            k.e(intentSender0, "intentSender");
            super();
            this.a = intentSender0;
        }

        public final IntentSenderRequest a() {
            return new IntentSenderRequest(this.a, this.b, this.c, this.d);
        }

        public final a b(Intent intent0) {
            this.b = intent0;
            return this;
        }

        public final a c(int v, int v1) {
            this.d = v;
            this.c = v1;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        public IntentSenderRequest a(Parcel parcel0) {
            k.e(parcel0, "inParcel");
            return new IntentSenderRequest(parcel0);
        }

        public IntentSenderRequest[] b(int v) {
            return new IntentSenderRequest[v];
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

    public static final class c {
        private c() {
        }

        public c(g g0) {
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final IntentSender f;
    private final Intent g;
    private final int h;
    private final int i;
    public static final c j;

    static {
        IntentSenderRequest.j = new c(null);
        IntentSenderRequest.CREATOR = new b();
    }

    public IntentSenderRequest(IntentSender intentSender0, Intent intent0, int v, int v1) {
        k.e(intentSender0, "intentSender");
        super();
        this.f = intentSender0;
        this.g = intent0;
        this.h = v;
        this.i = v1;
    }

    public IntentSenderRequest(Parcel parcel0) {
        k.e(parcel0, "parcel");
        Parcelable parcelable0 = parcel0.readParcelable(IntentSender.class.getClassLoader());
        k.b(parcelable0);
        this(((IntentSender)parcelable0), ((Intent)parcel0.readParcelable(Intent.class.getClassLoader())), parcel0.readInt(), parcel0.readInt());
    }

    public final Intent a() {
        return this.g;
    }

    public final int b() {
        return this.h;
    }

    public final int c() {
        return this.i;
    }

    public final IntentSender d() {
        return this.f;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        k.e(parcel0, "dest");
        parcel0.writeParcelable(this.f, v);
        parcel0.writeParcelable(this.g, v);
        parcel0.writeInt(this.h);
        parcel0.writeInt(this.i);
    }
}

