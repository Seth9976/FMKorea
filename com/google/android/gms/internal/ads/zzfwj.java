package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

public final class zzfwj {
    public static int zza(int v, int v1, RoundingMode roundingMode0) {
        int v5;
        roundingMode0.getClass();
        int v2 = v - v / 8 * 8;
        if(v2 == 0) {
            return v / 8;
        }
        int v3 = 1;
        int v4 = (v ^ 8) >> 0x1F | 1;
        switch(zzfwi.zza[roundingMode0.ordinal()]) {
            case 1: {
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            }
            case 2: {
                return v / 8;
            }
            case 3: {
                return v4 >= 0 ? v / 8 : v / 8 + v4;
            }
            case 4: {
                return v / 8 + v4;
            }
            case 5: {
                return v4 <= 0 ? v / 8 : v / 8 + v4;
            }
            case 6: 
            case 7: 
            case 8: {
                v5 = Math.abs(v2) * 2 - 8;
                if(v5 == 0) {
                    if(roundingMode0 != RoundingMode.HALF_UP) {
                        if(roundingMode0 != RoundingMode.HALF_EVEN) {
                            v3 = 0;
                        }
                        return (v / 8 & 1 & v3) == 0 ? v / 8 : v / 8 + v4;
                    }
                    return v / 8 + v4;
                }
                return v5 <= 0 ? v / 8 : v / 8 + v4;
            }
            default: {
                throw new AssertionError();
            }
        }
    }
}

