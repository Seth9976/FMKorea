package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

public final class zzfda {
    public static ParcelFileDescriptor zza(InputStream inputStream0) {
        ParcelFileDescriptor[] arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor0 = arr_parcelFileDescriptor[0];
        zzfcz zzfcz0 = new zzfcz(inputStream0, arr_parcelFileDescriptor[1]);
        zzcan.zza.execute(zzfcz0);
        return parcelFileDescriptor0;
    }
}

