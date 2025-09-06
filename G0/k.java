package g0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface k extends IInterface {
    public static abstract class a extends Binder implements k {
        static class g0.k.a.a implements k {
            private IBinder f;

            g0.k.a.a(IBinder iBinder0) {
                this.f = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.f;
            }

            @Override  // g0.k
            public int d(j j0, String s) {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcel0.writeStrongInterface(j0);
                    parcel0.writeString(s);
                    this.f.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // g0.k
            public void s(int v, String[] arr_s) {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcel0.writeInt(v);
                    parcel0.writeStringArray(arr_s);
                    this.f.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        public a() {
            this.attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            switch(v) {
                case 1: {
                    int v2 = this.d(g0.j.a.v(parcel0.readStrongBinder()), parcel0.readString());
                    parcel1.writeNoException();
                    parcel1.writeInt(v2);
                    return true;
                }
                case 2: {
                    this.l(g0.j.a.v(parcel0.readStrongBinder()), parcel0.readInt());
                    parcel1.writeNoException();
                    return true;
                }
                case 3: {
                    this.s(parcel0.readInt(), parcel0.createStringArray());
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }

        public static k v(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return iInterface0 != null && iInterface0 instanceof k ? ((k)iInterface0) : new g0.k.a.a(iBinder0);
        }
    }

    int d(j arg1, String arg2);

    void l(j arg1, int arg2);

    void s(int arg1, String[] arg2);
}

