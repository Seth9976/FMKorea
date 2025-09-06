package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff.Mode;

abstract class c {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.f.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.h.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.i.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.j.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.k.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.l.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.m.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.n.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.o.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.p.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.q.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.r.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.s.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.t.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.u.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.v.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.w.ordinal()] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.x.ordinal()] = 19;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.y.ordinal()] = 20;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.z.ordinal()] = 21;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.A.ordinal()] = 22;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.B.ordinal()] = 23;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.C.ordinal()] = 24;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.D.ordinal()] = 25;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.E.ordinal()] = 26;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.F.ordinal()] = 27;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.G.ordinal()] = 28;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.H.ordinal()] = 29;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static abstract class androidx.core.graphics.c.b {
        static Object a(b b0) {
            switch(b0) {
                case 1: {
                    return BlendMode.CLEAR;
                }
                case 2: {
                    return BlendMode.SRC;
                }
                case 3: {
                    return BlendMode.DST;
                }
                case 4: {
                    return BlendMode.SRC_OVER;
                }
                case 5: {
                    return BlendMode.DST_OVER;
                }
                case 6: {
                    return BlendMode.SRC_IN;
                }
                case 7: {
                    return BlendMode.DST_IN;
                }
                case 8: {
                    return BlendMode.SRC_OUT;
                }
                case 9: {
                    return BlendMode.DST_OUT;
                }
                case 10: {
                    return BlendMode.SRC_ATOP;
                }
                case 11: {
                    return BlendMode.DST_ATOP;
                }
                case 12: {
                    return BlendMode.XOR;
                }
                case 13: {
                    return BlendMode.PLUS;
                }
                case 14: {
                    return BlendMode.MODULATE;
                }
                case 15: {
                    return BlendMode.SCREEN;
                }
                case 16: {
                    return BlendMode.OVERLAY;
                }
                case 17: {
                    return BlendMode.DARKEN;
                }
                case 18: {
                    return BlendMode.LIGHTEN;
                }
                case 19: {
                    return BlendMode.COLOR_DODGE;
                }
                case 20: {
                    return BlendMode.COLOR_BURN;
                }
                case 21: {
                    return BlendMode.HARD_LIGHT;
                }
                case 22: {
                    return BlendMode.SOFT_LIGHT;
                }
                case 23: {
                    return BlendMode.DIFFERENCE;
                }
                case 24: {
                    return BlendMode.EXCLUSION;
                }
                case 25: {
                    return BlendMode.MULTIPLY;
                }
                case 26: {
                    return BlendMode.HUE;
                }
                case 27: {
                    return BlendMode.SATURATION;
                }
                case 28: {
                    return BlendMode.COLOR;
                }
                case 29: {
                    return BlendMode.LUMINOSITY;
                }
                default: {
                    return null;
                }
            }
        }
    }

    static PorterDuff.Mode a(b b0) {
        if(b0 == null) {
            return null;
        }
        switch(b0) {
            case 1: {
                return PorterDuff.Mode.CLEAR;
            }
            case 2: {
                return PorterDuff.Mode.SRC;
            }
            case 3: {
                return PorterDuff.Mode.DST;
            }
            case 4: {
                return PorterDuff.Mode.SRC_OVER;
            }
            case 5: {
                return PorterDuff.Mode.DST_OVER;
            }
            case 6: {
                return PorterDuff.Mode.SRC_IN;
            }
            case 7: {
                return PorterDuff.Mode.DST_IN;
            }
            case 8: {
                return PorterDuff.Mode.SRC_OUT;
            }
            case 9: {
                return PorterDuff.Mode.DST_OUT;
            }
            case 10: {
                return PorterDuff.Mode.SRC_ATOP;
            }
            case 11: {
                return PorterDuff.Mode.DST_ATOP;
            }
            case 12: {
                return PorterDuff.Mode.XOR;
            }
            case 13: {
                return PorterDuff.Mode.ADD;
            }
            case 14: {
                return PorterDuff.Mode.MULTIPLY;
            }
            case 15: {
                return PorterDuff.Mode.SCREEN;
            }
            case 16: {
                return PorterDuff.Mode.OVERLAY;
            }
            case 17: {
                return PorterDuff.Mode.DARKEN;
            }
            case 18: {
                return PorterDuff.Mode.LIGHTEN;
            }
            default: {
                return null;
            }
        }
    }
}

