package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public ActivityResult a(Parcel parcel0) {
            return new ActivityResult(parcel0);
        }

        public ActivityResult[] b(int v) {
            return new ActivityResult[v];
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

    public static final Parcelable.Creator CREATOR;
    private final int f;
    private final Intent g;

    static {
        ActivityResult.CREATOR = new a();
    }

    public ActivityResult(int v, Intent intent0) {
        this.f = v;
        this.g = intent0;
    }

    ActivityResult(Parcel parcel0) {
        this.f = parcel0.readInt();
        this.g = parcel0.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel0));
    }

    public Intent a() {
        return this.g;
    }

    public int b() {
        return this.f;
    }

    public static String c(int v) {
        switch(v) {
            case -1: {
                return "RESULT_OK";
            }
            case 0: {
                return "RESULT_CANCELED";
            }
            default: {
                return String.valueOf(v);
            }
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return "ActivityResult{resultCode=" + ActivityResult.c(this.f) + ", data=" + this.g + '}';
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.f);
        parcel0.writeInt((this.g == null ? 0 : 1));
        Intent intent0 = this.g;
        if(intent0 != null) {
            intent0.writeToParcel(parcel0, v);
        }
    }
}

