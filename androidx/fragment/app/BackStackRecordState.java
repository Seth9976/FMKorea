package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.h.b;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public BackStackRecordState a(Parcel parcel0) {
            return new BackStackRecordState(parcel0);
        }

        public BackStackRecordState[] b(int v) {
            return new BackStackRecordState[v];
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
    final int[] f;
    final ArrayList g;
    final int[] h;
    final int[] i;
    final int j;
    final String k;
    final int l;
    final int m;
    final CharSequence n;
    final int o;
    final CharSequence p;
    final ArrayList q;
    final ArrayList r;
    final boolean s;

    static {
        BackStackRecordState.CREATOR = new a();
    }

    BackStackRecordState(Parcel parcel0) {
        this.f = parcel0.createIntArray();
        this.g = parcel0.createStringArrayList();
        this.h = parcel0.createIntArray();
        this.i = parcel0.createIntArray();
        this.j = parcel0.readInt();
        this.k = parcel0.readString();
        this.l = parcel0.readInt();
        this.m = parcel0.readInt();
        Parcelable.Creator parcelable$Creator0 = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.n = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
        this.o = parcel0.readInt();
        this.p = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
        this.q = parcel0.createStringArrayList();
        this.r = parcel0.createStringArrayList();
        this.s = parcel0.readInt() != 0;
    }

    BackStackRecordState(androidx.fragment.app.a a0) {
        int v = a0.c.size();
        this.f = new int[v * 6];
        if(!a0.i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.g = new ArrayList(v);
        this.h = new int[v];
        this.i = new int[v];
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            androidx.fragment.app.z.a z$a0 = (androidx.fragment.app.z.a)a0.c.get(v1);
            this.f[v2] = z$a0.a;
            this.g.add((z$a0.b == null ? null : z$a0.b.mWho));
            this.f[v2 + 1] = z$a0.c;
            this.f[v2 + 2] = z$a0.d;
            this.f[v2 + 3] = z$a0.e;
            int v3 = v2 + 5;
            this.f[v2 + 4] = z$a0.f;
            v2 += 6;
            this.f[v3] = z$a0.g;
            this.h[v1] = z$a0.h.ordinal();
            this.i[v1] = z$a0.i.ordinal();
        }
        this.j = a0.h;
        this.k = a0.k;
        this.l = a0.v;
        this.m = a0.l;
        this.n = a0.m;
        this.o = a0.n;
        this.p = a0.o;
        this.q = a0.p;
        this.r = a0.q;
        this.s = a0.r;
    }

    private void a(androidx.fragment.app.a a0) {
        int v = 0;
        for(int v1 = 0; true; ++v1) {
            boolean z = true;
            if(v >= this.f.length) {
                break;
            }
            androidx.fragment.app.z.a z$a0 = new androidx.fragment.app.z.a();
            z$a0.a = this.f[v];
            if(FragmentManager.H0(2)) {
                Log.v("FragmentManager", "Instantiate " + a0 + " op #" + v1 + " base fragment #" + this.f[v + 1]);
            }
            b[] arr_h$b = b.values();
            z$a0.h = arr_h$b[this.h[v1]];
            b[] arr_h$b1 = b.values();
            z$a0.i = arr_h$b1[this.i[v1]];
            int[] arr_v = this.f;
            if(arr_v[v + 1] == 0) {
                z = false;
            }
            z$a0.c = z;
            int v2 = arr_v[v + 2];
            z$a0.d = v2;
            int v3 = arr_v[v + 3];
            z$a0.e = v3;
            int v4 = v + 5;
            int v5 = arr_v[v + 4];
            z$a0.f = v5;
            v += 6;
            int v6 = arr_v[v4];
            z$a0.g = v6;
            a0.d = v2;
            a0.e = v3;
            a0.f = v5;
            a0.g = v6;
            a0.e(z$a0);
        }
        a0.h = this.j;
        a0.k = this.k;
        a0.i = true;
        a0.l = this.m;
        a0.m = this.n;
        a0.n = this.o;
        a0.o = this.p;
        a0.p = this.q;
        a0.q = this.r;
        a0.r = this.s;
    }

    public androidx.fragment.app.a b(FragmentManager fragmentManager0) {
        androidx.fragment.app.a a0 = new androidx.fragment.app.a(fragmentManager0);
        this.a(a0);
        a0.v = this.l;
        for(int v = 0; v < this.g.size(); ++v) {
            String s = (String)this.g.get(v);
            if(s != null) {
                androidx.fragment.app.z.a z$a0 = (androidx.fragment.app.z.a)a0.c.get(v);
                z$a0.b = fragmentManager0.f0(s);
            }
        }
        a0.q(1);
        return a0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeIntArray(this.f);
        parcel0.writeStringList(this.g);
        parcel0.writeIntArray(this.h);
        parcel0.writeIntArray(this.i);
        parcel0.writeInt(this.j);
        parcel0.writeString(this.k);
        parcel0.writeInt(this.l);
        parcel0.writeInt(this.m);
        TextUtils.writeToParcel(this.n, parcel0, 0);
        parcel0.writeInt(this.o);
        TextUtils.writeToParcel(this.p, parcel0, 0);
        parcel0.writeStringList(this.q);
        parcel0.writeStringList(this.r);
        parcel0.writeInt(((int)this.s));
    }
}

