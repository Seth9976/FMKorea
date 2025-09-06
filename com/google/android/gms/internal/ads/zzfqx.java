package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

public final class zzfqx {
    static final CharSequence zza(Object object0) {
        object0.getClass();
        return object0 instanceof CharSequence ? ((CharSequence)object0) : object0.toString();
    }

    public static final StringBuilder zzb(StringBuilder stringBuilder0, Iterable iterable0, String s) {
        Iterator iterator0 = iterable0.iterator();
        try {
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                stringBuilder0.append(zzfqx.zza(object0));
                while(iterator0.hasNext()) {
                    stringBuilder0.append(s);
                    Object object1 = iterator0.next();
                    stringBuilder0.append(zzfqx.zza(object1));
                }
            }
            return stringBuilder0;
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }
}

