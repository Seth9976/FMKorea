package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class a {
    public static BigDecimal a(BigDecimal bigDecimal0) {
        return bigDecimal0.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal0.stripTrailingZeros();
    }
}

