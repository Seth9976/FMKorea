package g0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface j extends IInterface {
    public static abstract class a extends Binder implements j {
        static class g0.j.a.a implements j {
            private IBinder f;

            g0.j.a.a(IBinder iBinder0) {
                this.f = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.f;
            }

            @Override  // g0.j
            public void c(String[] arr_s) {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcel0.writeStringArray(arr_s);
                    this.f.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        public a() {
            this.attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            switch(v) {
                case 1: {
                    this.c(parcel0.createStringArray());
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }

        public static j v(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return iInterface0 != null && iInterface0 instanceof j ? ((j)iInterface0) : new g0.j.a.a(iBinder0);
        }
    }

    void c(String[] arg1);
}

