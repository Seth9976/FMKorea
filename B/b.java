package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public interface b extends IInterface {
    public static abstract class a extends Binder implements b {
        static class b.b.a.a implements b {
            private IBinder f;

            b.b.a.a(IBinder iBinder0) {
                this.f = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.f;
            }

            @Override  // b.b
            public boolean f(b.a a0, Uri uri0, Bundle bundle0, List list0) {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeStrongInterface(a0);
                    boolean z = false;
                    b.b.b.d(parcel0, uri0, 0);
                    b.b.b.d(parcel0, bundle0, 0);
                    b.b.b.c(parcel0, list0, 0);
                    this.f.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // b.b
            public boolean h(long v) {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeLong(v);
                    boolean z = false;
                    this.f.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // b.b
            public boolean j(b.a a0) {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeStrongInterface(a0);
                    boolean z = false;
                    this.f.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // b.b
            public boolean o(b.a a0, Bundle bundle0) {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeStrongInterface(a0);
                    boolean z = false;
                    b.b.b.d(parcel0, bundle0, 0);
                    this.f.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public static b v(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return iInterface0 != null && iInterface0 instanceof b ? ((b)iInterface0) : new b.b.a.a(iBinder0);
        }
    }

    public static abstract class b.b.b {
        private static void c(Parcel parcel0, List list0, int v) {
            if(list0 == null) {
                parcel0.writeInt(-1);
                return;
            }
            int v1 = list0.size();
            parcel0.writeInt(v1);
            for(int v2 = 0; v2 < v1; ++v2) {
                b.b.b.d(parcel0, ((Parcelable)list0.get(v2)), v);
            }
        }

        private static void d(Parcel parcel0, Parcelable parcelable0, int v) {
            if(parcelable0 != null) {
                parcel0.writeInt(1);
                parcelable0.writeToParcel(parcel0, v);
                return;
            }
            parcel0.writeInt(0);
        }
    }

    public static final String d;

    static {
        b.d = "android.support.customtabs.ICustomTabsService";
    }

    boolean f(b.a arg1, Uri arg2, Bundle arg3, List arg4);

    boolean h(long arg1);

    boolean j(b.a arg1);

    boolean o(b.a arg1, Bundle arg2);
}

