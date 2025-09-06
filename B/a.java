package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public interface a extends IInterface {
    public static abstract class b.a.a extends Binder implements a {
        public b.a.a() {
            this.attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            }
            if(v == 0x5F4E5446) {
                parcel1.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
            switch(v) {
                case 2: {
                    this.q(parcel0.readInt(), ((Bundle)b.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 3: {
                    this.n(parcel0.readString(), ((Bundle)b.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 4: {
                    this.t(((Bundle)b.c(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 5: {
                    this.r(parcel0.readString(), ((Bundle)b.c(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 6: {
                    this.u(parcel0.readInt(), ((Uri)b.c(parcel0, Uri.CREATOR)), parcel0.readInt() != 0, ((Bundle)b.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 7: {
                    Bundle bundle0 = this.e(parcel0.readString(), ((Bundle)b.c(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    b.d(parcel1, bundle0, 1);
                    return true;
                }
                case 8: {
                    this.m(parcel0.readInt(), parcel0.readInt(), ((Bundle)b.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 9: {
                    this.p(((Bundle)b.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 10: {
                    this.b(parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), ((Bundle)b.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 11: {
                    this.i(((Bundle)b.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 12: {
                    this.k(((Bundle)b.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    public static abstract class b {
        private static Object c(Parcel parcel0, Parcelable.Creator parcelable$Creator0) {
            return parcel0.readInt() == 0 ? null : parcelable$Creator0.createFromParcel(parcel0);
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

    public static final String c;

    static {
        a.c = "android.support.customtabs.ICustomTabsCallback";
    }

    void b(int arg1, int arg2, int arg3, int arg4, int arg5, Bundle arg6);

    Bundle e(String arg1, Bundle arg2);

    void i(Bundle arg1);

    void k(Bundle arg1);

    void m(int arg1, int arg2, Bundle arg3);

    void n(String arg1, Bundle arg2);

    void p(Bundle arg1);

    void q(int arg1, Bundle arg2);

    void r(String arg1, Bundle arg2);

    void t(Bundle arg1);

    void u(int arg1, Uri arg2, boolean arg3, Bundle arg4);
}

