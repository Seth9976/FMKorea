package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class e {
    public static class a {
        int a;
        public final d b;
        public final c c;
        public final b d;
        public final androidx.constraintlayout.widget.e.e e;
        public HashMap f;

        public a() {
            this.b = new d();
            this.c = new c();
            this.d = new b();
            this.e = new androidx.constraintlayout.widget.e.e();
            this.f = new HashMap();
        }

        public void b(androidx.constraintlayout.widget.ConstraintLayout.b constraintLayout$b0) {
            b e$b0 = this.d;
            constraintLayout$b0.d = e$b0.h;
            constraintLayout$b0.e = e$b0.i;
            constraintLayout$b0.f = e$b0.j;
            constraintLayout$b0.g = e$b0.k;
            constraintLayout$b0.h = e$b0.l;
            constraintLayout$b0.i = e$b0.m;
            constraintLayout$b0.j = e$b0.n;
            constraintLayout$b0.k = e$b0.o;
            constraintLayout$b0.l = e$b0.p;
            constraintLayout$b0.p = e$b0.q;
            constraintLayout$b0.q = e$b0.r;
            constraintLayout$b0.r = e$b0.s;
            constraintLayout$b0.s = e$b0.t;
            constraintLayout$b0.leftMargin = e$b0.D;
            constraintLayout$b0.rightMargin = e$b0.E;
            constraintLayout$b0.topMargin = e$b0.F;
            constraintLayout$b0.bottomMargin = e$b0.G;
            constraintLayout$b0.x = e$b0.O;
            constraintLayout$b0.y = e$b0.N;
            constraintLayout$b0.u = e$b0.K;
            constraintLayout$b0.w = e$b0.M;
            constraintLayout$b0.z = e$b0.u;
            constraintLayout$b0.A = e$b0.v;
            constraintLayout$b0.m = e$b0.x;
            constraintLayout$b0.n = e$b0.y;
            constraintLayout$b0.o = e$b0.z;
            constraintLayout$b0.B = e$b0.w;
            constraintLayout$b0.Q = e$b0.A;
            constraintLayout$b0.R = e$b0.B;
            constraintLayout$b0.F = e$b0.P;
            constraintLayout$b0.E = e$b0.Q;
            constraintLayout$b0.H = e$b0.S;
            constraintLayout$b0.G = e$b0.R;
            constraintLayout$b0.T = e$b0.h0;
            constraintLayout$b0.U = e$b0.i0;
            constraintLayout$b0.I = e$b0.T;
            constraintLayout$b0.J = e$b0.U;
            constraintLayout$b0.M = e$b0.V;
            constraintLayout$b0.N = e$b0.W;
            constraintLayout$b0.K = e$b0.X;
            constraintLayout$b0.L = e$b0.Y;
            constraintLayout$b0.O = e$b0.Z;
            constraintLayout$b0.P = e$b0.a0;
            constraintLayout$b0.S = e$b0.C;
            constraintLayout$b0.c = e$b0.g;
            constraintLayout$b0.a = e$b0.e;
            constraintLayout$b0.b = e$b0.f;
            constraintLayout$b0.width = e$b0.c;
            constraintLayout$b0.height = e$b0.d;
            String s = e$b0.g0;
            if(s != null) {
                constraintLayout$b0.V = s;
            }
            constraintLayout$b0.setMarginStart(e$b0.I);
            constraintLayout$b0.setMarginEnd(this.d.H);
            constraintLayout$b0.a();
        }

        public a c() {
            a e$a0 = new a();
            e$a0.d.a(this.d);
            e$a0.c.a(this.c);
            e$a0.b.a(this.b);
            e$a0.e.a(this.e);
            e$a0.a = this.a;
            return e$a0;
        }

        @Override
        public Object clone() {
            return this.c();
        }

        private void d(int v, androidx.constraintlayout.widget.ConstraintLayout.b constraintLayout$b0) {
            this.a = v;
            b e$b0 = this.d;
            e$b0.h = constraintLayout$b0.d;
            e$b0.i = constraintLayout$b0.e;
            e$b0.j = constraintLayout$b0.f;
            e$b0.k = constraintLayout$b0.g;
            e$b0.l = constraintLayout$b0.h;
            e$b0.m = constraintLayout$b0.i;
            e$b0.n = constraintLayout$b0.j;
            e$b0.o = constraintLayout$b0.k;
            e$b0.p = constraintLayout$b0.l;
            e$b0.q = constraintLayout$b0.p;
            e$b0.r = constraintLayout$b0.q;
            e$b0.s = constraintLayout$b0.r;
            e$b0.t = constraintLayout$b0.s;
            e$b0.u = constraintLayout$b0.z;
            e$b0.v = constraintLayout$b0.A;
            e$b0.w = constraintLayout$b0.B;
            e$b0.x = constraintLayout$b0.m;
            e$b0.y = constraintLayout$b0.n;
            e$b0.z = constraintLayout$b0.o;
            e$b0.A = constraintLayout$b0.Q;
            e$b0.B = constraintLayout$b0.R;
            e$b0.C = constraintLayout$b0.S;
            e$b0.g = constraintLayout$b0.c;
            e$b0.e = constraintLayout$b0.a;
            e$b0.f = constraintLayout$b0.b;
            e$b0.c = constraintLayout$b0.width;
            e$b0.d = constraintLayout$b0.height;
            e$b0.D = constraintLayout$b0.leftMargin;
            e$b0.E = constraintLayout$b0.rightMargin;
            e$b0.F = constraintLayout$b0.topMargin;
            e$b0.G = constraintLayout$b0.bottomMargin;
            e$b0.P = constraintLayout$b0.F;
            e$b0.Q = constraintLayout$b0.E;
            e$b0.S = constraintLayout$b0.H;
            e$b0.R = constraintLayout$b0.G;
            e$b0.h0 = constraintLayout$b0.T;
            e$b0.i0 = constraintLayout$b0.U;
            e$b0.T = constraintLayout$b0.I;
            e$b0.U = constraintLayout$b0.J;
            e$b0.V = constraintLayout$b0.M;
            e$b0.W = constraintLayout$b0.N;
            e$b0.X = constraintLayout$b0.K;
            e$b0.Y = constraintLayout$b0.L;
            e$b0.Z = constraintLayout$b0.O;
            e$b0.a0 = constraintLayout$b0.P;
            e$b0.g0 = constraintLayout$b0.V;
            e$b0.K = constraintLayout$b0.u;
            e$b0.M = constraintLayout$b0.w;
            e$b0.J = constraintLayout$b0.t;
            e$b0.L = constraintLayout$b0.v;
            e$b0.O = constraintLayout$b0.x;
            e$b0.N = constraintLayout$b0.y;
            e$b0.H = constraintLayout$b0.getMarginEnd();
            this.d.I = constraintLayout$b0.getMarginStart();
        }
    }

    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public float P;
        public float Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public int V;
        public int W;
        public int X;
        public int Y;
        public float Z;
        public boolean a;
        public float a0;
        public boolean b;
        public int b0;
        public int c;
        public int c0;
        public int d;
        public int d0;
        public int e;
        public int[] e0;
        public int f;
        public String f0;
        public float g;
        public String g0;
        public int h;
        public boolean h0;
        public int i;
        public boolean i0;
        public int j;
        public boolean j0;
        public int k;
        private static SparseIntArray k0;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public float u;
        public float v;
        public String w;
        public int x;
        public int y;
        public float z;

        static {
            SparseIntArray sparseIntArray0 = new SparseIntArray();
            b.k0 = sparseIntArray0;
            sparseIntArray0.append(i.R3, 24);
            b.k0.append(i.S3, 25);
            b.k0.append(i.U3, 28);
            b.k0.append(i.V3, 29);
            b.k0.append(i.a4, 35);
            b.k0.append(i.Z3, 34);
            b.k0.append(i.C3, 4);
            b.k0.append(i.B3, 3);
            b.k0.append(i.z3, 1);
            b.k0.append(i.f4, 6);
            b.k0.append(i.g4, 7);
            b.k0.append(i.J3, 17);
            b.k0.append(i.K3, 18);
            b.k0.append(i.L3, 19);
            b.k0.append(i.k3, 26);
            b.k0.append(i.W3, 0x1F);
            b.k0.append(i.X3, 0x20);
            b.k0.append(i.I3, 10);
            b.k0.append(i.H3, 9);
            b.k0.append(i.j4, 13);
            b.k0.append(i.m4, 16);
            b.k0.append(i.k4, 14);
            b.k0.append(i.h4, 11);
            b.k0.append(i.l4, 15);
            b.k0.append(i.i4, 12);
            b.k0.append(i.d4, 38);
            b.k0.append(i.P3, 37);
            b.k0.append(i.O3, 39);
            b.k0.append(i.c4, 40);
            b.k0.append(i.N3, 20);
            b.k0.append(i.b4, 36);
            b.k0.append(i.G3, 5);
            b.k0.append(i.Q3, 76);
            b.k0.append(i.Y3, 76);
            b.k0.append(i.T3, 76);
            b.k0.append(i.A3, 76);
            b.k0.append(i.y3, 76);
            b.k0.append(i.n3, 23);
            b.k0.append(i.p3, 27);
            b.k0.append(i.r3, 30);
            b.k0.append(i.s3, 8);
            b.k0.append(i.o3, 33);
            b.k0.append(i.q3, 2);
            b.k0.append(i.l3, 22);
            b.k0.append(i.m3, 21);
            b.k0.append(i.D3, 61);
            b.k0.append(i.F3, 62);
            b.k0.append(i.E3, 0x3F);
            b.k0.append(i.e4, 69);
            b.k0.append(i.M3, 70);
            b.k0.append(i.w3, 71);
            b.k0.append(i.u3, 72);
            b.k0.append(i.v3, 73);
            b.k0.append(i.x3, 74);
            b.k0.append(i.t3, 75);
        }

        public b() {
            this.a = false;
            this.b = false;
            this.e = -1;
            this.f = -1;
            this.g = -1.0f;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 0.5f;
            this.v = 0.5f;
            this.w = null;
            this.x = -1;
            this.y = 0;
            this.z = 0.0f;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1.0f;
            this.Q = -1.0f;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = -1;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = 1.0f;
            this.a0 = 1.0f;
            this.b0 = -1;
            this.c0 = 0;
            this.d0 = -1;
            this.h0 = false;
            this.i0 = false;
            this.j0 = true;
        }

        public void a(b e$b0) {
            this.a = e$b0.a;
            this.c = e$b0.c;
            this.b = e$b0.b;
            this.d = e$b0.d;
            this.e = e$b0.e;
            this.f = e$b0.f;
            this.g = e$b0.g;
            this.h = e$b0.h;
            this.i = e$b0.i;
            this.j = e$b0.j;
            this.k = e$b0.k;
            this.l = e$b0.l;
            this.m = e$b0.m;
            this.n = e$b0.n;
            this.o = e$b0.o;
            this.p = e$b0.p;
            this.q = e$b0.q;
            this.r = e$b0.r;
            this.s = e$b0.s;
            this.t = e$b0.t;
            this.u = e$b0.u;
            this.v = e$b0.v;
            this.w = e$b0.w;
            this.x = e$b0.x;
            this.y = e$b0.y;
            this.z = e$b0.z;
            this.A = e$b0.A;
            this.B = e$b0.B;
            this.C = e$b0.C;
            this.D = e$b0.D;
            this.E = e$b0.E;
            this.F = e$b0.F;
            this.G = e$b0.G;
            this.H = e$b0.H;
            this.I = e$b0.I;
            this.J = e$b0.J;
            this.K = e$b0.K;
            this.L = e$b0.L;
            this.M = e$b0.M;
            this.N = e$b0.N;
            this.O = e$b0.O;
            this.P = e$b0.P;
            this.Q = e$b0.Q;
            this.R = e$b0.R;
            this.S = e$b0.S;
            this.T = e$b0.T;
            this.U = e$b0.U;
            this.V = e$b0.V;
            this.W = e$b0.W;
            this.X = e$b0.X;
            this.Y = e$b0.Y;
            this.Z = e$b0.Z;
            this.a0 = e$b0.a0;
            this.b0 = e$b0.b0;
            this.c0 = e$b0.c0;
            this.d0 = e$b0.d0;
            this.g0 = e$b0.g0;
            int[] arr_v = e$b0.e0;
            this.e0 = arr_v == null ? null : Arrays.copyOf(arr_v, arr_v.length);
            this.f0 = e$b0.f0;
            this.h0 = e$b0.h0;
            this.i0 = e$b0.i0;
            this.j0 = e$b0.j0;
        }

        void b(Context context0, AttributeSet attributeSet0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, i.j3);
            this.b = true;
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(b.k0.get(v2)) {
                    case 1: {
                        this.p = e.m(typedArray0, v2, this.p);
                        break;
                    }
                    case 2: {
                        this.G = typedArray0.getDimensionPixelSize(v2, this.G);
                        break;
                    }
                    case 3: {
                        this.o = e.m(typedArray0, v2, this.o);
                        break;
                    }
                    case 4: {
                        this.n = e.m(typedArray0, v2, this.n);
                        break;
                    }
                    case 5: {
                        this.w = typedArray0.getString(v2);
                        break;
                    }
                    case 6: {
                        this.A = typedArray0.getDimensionPixelOffset(v2, this.A);
                        break;
                    }
                    case 7: {
                        this.B = typedArray0.getDimensionPixelOffset(v2, this.B);
                        break;
                    }
                    case 8: {
                        this.H = typedArray0.getDimensionPixelSize(v2, this.H);
                        break;
                    }
                    case 9: {
                        this.t = e.m(typedArray0, v2, this.t);
                        break;
                    }
                    case 10: {
                        this.s = e.m(typedArray0, v2, this.s);
                        break;
                    }
                    case 11: {
                        this.M = typedArray0.getDimensionPixelSize(v2, this.M);
                        break;
                    }
                    case 12: {
                        this.N = typedArray0.getDimensionPixelSize(v2, this.N);
                        break;
                    }
                    case 13: {
                        this.J = typedArray0.getDimensionPixelSize(v2, this.J);
                        break;
                    }
                    case 14: {
                        this.L = typedArray0.getDimensionPixelSize(v2, this.L);
                        break;
                    }
                    case 15: {
                        this.O = typedArray0.getDimensionPixelSize(v2, this.O);
                        break;
                    }
                    case 16: {
                        this.K = typedArray0.getDimensionPixelSize(v2, this.K);
                        break;
                    }
                    case 17: {
                        this.e = typedArray0.getDimensionPixelOffset(v2, this.e);
                        break;
                    }
                    case 18: {
                        this.f = typedArray0.getDimensionPixelOffset(v2, this.f);
                        break;
                    }
                    case 19: {
                        this.g = typedArray0.getFloat(v2, this.g);
                        break;
                    }
                    case 20: {
                        this.u = typedArray0.getFloat(v2, this.u);
                        break;
                    }
                    case 21: {
                        this.d = typedArray0.getLayoutDimension(v2, this.d);
                        break;
                    }
                    case 22: {
                        this.c = typedArray0.getLayoutDimension(v2, this.c);
                        break;
                    }
                    case 23: {
                        this.D = typedArray0.getDimensionPixelSize(v2, this.D);
                        break;
                    }
                    case 24: {
                        this.h = e.m(typedArray0, v2, this.h);
                        break;
                    }
                    case 25: {
                        this.i = e.m(typedArray0, v2, this.i);
                        break;
                    }
                    case 26: {
                        this.C = typedArray0.getInt(v2, this.C);
                        break;
                    }
                    case 27: {
                        this.E = typedArray0.getDimensionPixelSize(v2, this.E);
                        break;
                    }
                    case 28: {
                        this.j = e.m(typedArray0, v2, this.j);
                        break;
                    }
                    case 29: {
                        this.k = e.m(typedArray0, v2, this.k);
                        break;
                    }
                    case 30: {
                        this.I = typedArray0.getDimensionPixelSize(v2, this.I);
                        break;
                    }
                    case 0x1F: {
                        this.q = e.m(typedArray0, v2, this.q);
                        break;
                    }
                    case 0x20: {
                        this.r = e.m(typedArray0, v2, this.r);
                        break;
                    }
                    case 33: {
                        this.F = typedArray0.getDimensionPixelSize(v2, this.F);
                        break;
                    }
                    case 34: {
                        this.m = e.m(typedArray0, v2, this.m);
                        break;
                    }
                    case 35: {
                        this.l = e.m(typedArray0, v2, this.l);
                        break;
                    }
                    case 36: {
                        this.v = typedArray0.getFloat(v2, this.v);
                        break;
                    }
                    case 37: {
                        this.Q = typedArray0.getFloat(v2, this.Q);
                        break;
                    }
                    case 38: {
                        this.P = typedArray0.getFloat(v2, this.P);
                        break;
                    }
                    case 39: {
                        this.R = typedArray0.getInt(v2, this.R);
                        break;
                    }
                    case 40: {
                        this.S = typedArray0.getInt(v2, this.S);
                        break;
                    }
                    case 54: {
                        this.T = typedArray0.getInt(v2, this.T);
                        break;
                    }
                    case 55: {
                        this.U = typedArray0.getInt(v2, this.U);
                        break;
                    }
                    case 56: {
                        this.V = typedArray0.getDimensionPixelSize(v2, this.V);
                        break;
                    }
                    case 57: {
                        this.W = typedArray0.getDimensionPixelSize(v2, this.W);
                        break;
                    }
                    case 58: {
                        this.X = typedArray0.getDimensionPixelSize(v2, this.X);
                        break;
                    }
                    case 59: {
                        this.Y = typedArray0.getDimensionPixelSize(v2, this.Y);
                        break;
                    }
                    case 61: {
                        this.x = e.m(typedArray0, v2, this.x);
                        break;
                    }
                    case 62: {
                        this.y = typedArray0.getDimensionPixelSize(v2, this.y);
                        break;
                    }
                    case 0x3F: {
                        this.z = typedArray0.getFloat(v2, this.z);
                        break;
                    }
                    case 69: {
                        this.Z = typedArray0.getFloat(v2, 1.0f);
                        break;
                    }
                    case 70: {
                        this.a0 = typedArray0.getFloat(v2, 1.0f);
                        break;
                    }
                    case 71: {
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    }
                    case 72: {
                        this.b0 = typedArray0.getInt(v2, this.b0);
                        break;
                    }
                    case 73: {
                        this.c0 = typedArray0.getDimensionPixelSize(v2, this.c0);
                        break;
                    }
                    case 74: {
                        this.f0 = typedArray0.getString(v2);
                        break;
                    }
                    case 75: {
                        this.j0 = typedArray0.getBoolean(v2, this.j0);
                        break;
                    }
                    case 76: {
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(v2) + "   " + b.k0.get(v2));
                        break;
                    }
                    case 77: {
                        this.g0 = typedArray0.getString(v2);
                        break;
                    }
                    case 80: {
                        this.h0 = typedArray0.getBoolean(v2, this.h0);
                        break;
                    }
                    case 81: {
                        this.i0 = typedArray0.getBoolean(v2, this.i0);
                        break;
                    }
                    default: {
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(v2) + "   " + b.k0.get(v2));
                    }
                }
            }
            typedArray0.recycle();
        }
    }

    public static class c {
        public boolean a;
        public int b;
        public String c;
        public int d;
        public int e;
        public float f;
        public float g;
        private static SparseIntArray h;

        static {
            SparseIntArray sparseIntArray0 = new SparseIntArray();
            c.h = sparseIntArray0;
            sparseIntArray0.append(i.x4, 1);
            c.h.append(i.z4, 2);
            c.h.append(i.A4, 3);
            c.h.append(i.w4, 4);
            c.h.append(i.v4, 5);
            c.h.append(i.y4, 6);
        }

        public c() {
            this.a = false;
            this.b = -1;
            this.c = null;
            this.d = -1;
            this.e = 0;
            this.f = NaNf;
            this.g = NaNf;
        }

        public void a(c e$c0) {
            this.a = e$c0.a;
            this.b = e$c0.b;
            this.c = e$c0.c;
            this.d = e$c0.d;
            this.e = e$c0.e;
            this.g = e$c0.g;
            this.f = e$c0.f;
        }

        void b(Context context0, AttributeSet attributeSet0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, i.u4);
            this.a = true;
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(c.h.get(v2)) {
                    case 1: {
                        this.g = typedArray0.getFloat(v2, this.g);
                        break;
                    }
                    case 2: {
                        this.d = typedArray0.getInt(v2, this.d);
                        break;
                    }
                    case 3: {
                        if(typedArray0.peekValue(v2).type == 3) {
                            this.c = typedArray0.getString(v2);
                        }
                        else {
                            String[] arr_s = p.a.c;
                            this.c = arr_s[typedArray0.getInteger(v2, 0)];
                        }
                        break;
                    }
                    case 4: {
                        this.e = typedArray0.getInt(v2, 0);
                        break;
                    }
                    case 5: {
                        this.b = e.m(typedArray0, v2, this.b);
                        break;
                    }
                    case 6: {
                        this.f = typedArray0.getFloat(v2, this.f);
                    }
                }
            }
            typedArray0.recycle();
        }
    }

    public static class d {
        public boolean a;
        public int b;
        public int c;
        public float d;
        public float e;

        public d() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = 1.0f;
            this.e = NaNf;
        }

        public void a(d e$d0) {
            this.a = e$d0.a;
            this.b = e$d0.b;
            this.d = e$d0.d;
            this.e = e$d0.e;
            this.c = e$d0.c;
        }

        void b(Context context0, AttributeSet attributeSet0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, i.J4);
            this.a = true;
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == i.L4) {
                    this.d = typedArray0.getFloat(v2, this.d);
                }
                else if(v2 == i.K4) {
                    this.b = typedArray0.getInt(v2, this.b);
                    this.b = e.d[this.b];
                }
                else if(v2 == i.N4) {
                    this.c = typedArray0.getInt(v2, this.c);
                }
                else if(v2 == i.M4) {
                    this.e = typedArray0.getFloat(v2, this.e);
                }
            }
            typedArray0.recycle();
        }
    }

    public static class androidx.constraintlayout.widget.e.e {
        public boolean a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public float j;
        public float k;
        public boolean l;
        public float m;
        private static SparseIntArray n;

        static {
            SparseIntArray sparseIntArray0 = new SparseIntArray();
            androidx.constraintlayout.widget.e.e.n = sparseIntArray0;
            sparseIntArray0.append(i.h5, 1);
            androidx.constraintlayout.widget.e.e.n.append(i.i5, 2);
            androidx.constraintlayout.widget.e.e.n.append(i.j5, 3);
            androidx.constraintlayout.widget.e.e.n.append(i.f5, 4);
            androidx.constraintlayout.widget.e.e.n.append(i.g5, 5);
            androidx.constraintlayout.widget.e.e.n.append(i.b5, 6);
            androidx.constraintlayout.widget.e.e.n.append(i.c5, 7);
            androidx.constraintlayout.widget.e.e.n.append(i.d5, 8);
            androidx.constraintlayout.widget.e.e.n.append(i.e5, 9);
            androidx.constraintlayout.widget.e.e.n.append(i.k5, 10);
            androidx.constraintlayout.widget.e.e.n.append(i.l5, 11);
        }

        public androidx.constraintlayout.widget.e.e() {
            this.a = false;
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 1.0f;
            this.f = 1.0f;
            this.g = NaNf;
            this.h = NaNf;
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = false;
            this.m = 0.0f;
        }

        public void a(androidx.constraintlayout.widget.e.e e$e0) {
            this.a = e$e0.a;
            this.b = e$e0.b;
            this.c = e$e0.c;
            this.d = e$e0.d;
            this.e = e$e0.e;
            this.f = e$e0.f;
            this.g = e$e0.g;
            this.h = e$e0.h;
            this.i = e$e0.i;
            this.j = e$e0.j;
            this.k = e$e0.k;
            this.l = e$e0.l;
            this.m = e$e0.m;
        }

        void b(Context context0, AttributeSet attributeSet0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, i.a5);
            this.a = true;
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(androidx.constraintlayout.widget.e.e.n.get(v2)) {
                    case 1: {
                        this.b = typedArray0.getFloat(v2, this.b);
                        break;
                    }
                    case 2: {
                        this.c = typedArray0.getFloat(v2, this.c);
                        break;
                    }
                    case 3: {
                        this.d = typedArray0.getFloat(v2, this.d);
                        break;
                    }
                    case 4: {
                        this.e = typedArray0.getFloat(v2, this.e);
                        break;
                    }
                    case 5: {
                        this.f = typedArray0.getFloat(v2, this.f);
                        break;
                    }
                    case 6: {
                        this.g = typedArray0.getDimension(v2, this.g);
                        break;
                    }
                    case 7: {
                        this.h = typedArray0.getDimension(v2, this.h);
                        break;
                    }
                    case 8: {
                        this.i = typedArray0.getDimension(v2, this.i);
                        break;
                    }
                    case 9: {
                        this.j = typedArray0.getDimension(v2, this.j);
                        break;
                    }
                    case 10: {
                        this.k = typedArray0.getDimension(v2, this.k);
                        break;
                    }
                    case 11: {
                        this.l = true;
                        this.m = typedArray0.getDimension(v2, this.m);
                    }
                }
            }
            typedArray0.recycle();
        }
    }

    private HashMap a;
    private boolean b;
    private HashMap c;
    private static final int[] d;
    private static SparseIntArray e;

    static {
        e.d = new int[]{0, 4, 8};
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        e.e = sparseIntArray0;
        sparseIntArray0.append(i.u0, 25);
        e.e.append(i.v0, 26);
        e.e.append(i.x0, 29);
        e.e.append(i.y0, 30);
        e.e.append(i.E0, 36);
        e.e.append(i.D0, 35);
        e.e.append(i.c0, 4);
        e.e.append(i.b0, 3);
        e.e.append(i.Z, 1);
        e.e.append(i.M0, 6);
        e.e.append(i.N0, 7);
        e.e.append(i.j0, 17);
        e.e.append(i.k0, 18);
        e.e.append(i.l0, 19);
        e.e.append(i.s, 27);
        e.e.append(i.z0, 0x20);
        e.e.append(i.A0, 33);
        e.e.append(i.i0, 10);
        e.e.append(i.h0, 9);
        e.e.append(i.Q0, 13);
        e.e.append(i.T0, 16);
        e.e.append(i.R0, 14);
        e.e.append(i.O0, 11);
        e.e.append(i.S0, 15);
        e.e.append(i.P0, 12);
        e.e.append(i.H0, 40);
        e.e.append(i.s0, 39);
        e.e.append(i.r0, 41);
        e.e.append(i.G0, 42);
        e.e.append(i.q0, 20);
        e.e.append(i.F0, 37);
        e.e.append(i.g0, 5);
        e.e.append(i.t0, 82);
        e.e.append(i.C0, 82);
        e.e.append(i.w0, 82);
        e.e.append(i.a0, 82);
        e.e.append(i.Y, 82);
        e.e.append(i.x, 24);
        e.e.append(i.z, 28);
        e.e.append(i.L, 0x1F);
        e.e.append(i.M, 8);
        e.e.append(i.y, 34);
        e.e.append(i.A, 2);
        e.e.append(i.v, 23);
        e.e.append(i.w, 21);
        e.e.append(i.u, 22);
        e.e.append(i.B, 43);
        e.e.append(i.O, 44);
        e.e.append(i.J, 45);
        e.e.append(i.K, 46);
        e.e.append(i.I, 60);
        e.e.append(i.G, 0x2F);
        e.e.append(i.H, 0x30);
        e.e.append(i.C, 49);
        e.e.append(i.D, 50);
        e.e.append(i.E, 51);
        e.e.append(i.F, 52);
        e.e.append(i.N, 53);
        e.e.append(i.I0, 54);
        e.e.append(i.m0, 55);
        e.e.append(i.J0, 56);
        e.e.append(i.n0, 57);
        e.e.append(i.K0, 58);
        e.e.append(i.o0, 59);
        e.e.append(i.d0, 61);
        e.e.append(i.f0, 62);
        e.e.append(i.e0, 0x3F);
        e.e.append(i.P, 0x40);
        e.e.append(i.X0, 65);
        e.e.append(i.V, 66);
        e.e.append(i.Y0, 67);
        e.e.append(i.V0, 0x4F);
        e.e.append(i.t, 38);
        e.e.append(i.U0, 68);
        e.e.append(i.L0, 69);
        e.e.append(i.p0, 70);
        e.e.append(i.T, 71);
        e.e.append(i.R, 72);
        e.e.append(i.S, 73);
        e.e.append(i.U, 74);
        e.e.append(i.Q, 75);
        e.e.append(i.W0, 76);
        e.e.append(i.B0, 77);
        e.e.append(i.Z0, 78);
        e.e.append(i.X, 80);
        e.e.append(i.W, 81);
    }

    public e() {
        this.a = new HashMap();
        this.b = true;
        this.c = new HashMap();
    }

    public void c(ConstraintLayout constraintLayout0) {
        this.d(constraintLayout0, true);
        constraintLayout0.setConstraintSet(null);
        constraintLayout0.requestLayout();
    }

    void d(ConstraintLayout constraintLayout0, boolean z) {
        int v = constraintLayout0.getChildCount();
        HashSet hashSet0 = new HashSet(this.c.keySet());
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = constraintLayout0.getChildAt(v1);
            int v2 = view0.getId();
            if(this.c.containsKey(v2)) {
                if(this.b && v2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if(v2 != -1) {
                    if(this.c.containsKey(v2)) {
                        hashSet0.remove(v2);
                        a e$a0 = (a)this.c.get(v2);
                        if(view0 instanceof androidx.constraintlayout.widget.a) {
                            e$a0.d.d0 = 1;
                        }
                        int v3 = e$a0.d.d0;
                        if(v3 != -1 && v3 == 1) {
                            ((androidx.constraintlayout.widget.a)view0).setId(v2);
                            ((androidx.constraintlayout.widget.a)view0).setType(e$a0.d.b0);
                            ((androidx.constraintlayout.widget.a)view0).setMargin(e$a0.d.c0);
                            ((androidx.constraintlayout.widget.a)view0).setAllowsGoneWidget(e$a0.d.j0);
                            b e$b0 = e$a0.d;
                            int[] arr_v = e$b0.e0;
                            if(arr_v == null) {
                                String s = e$b0.f0;
                                if(s != null) {
                                    e$b0.e0 = this.h(((androidx.constraintlayout.widget.a)view0), s);
                                    ((androidx.constraintlayout.widget.a)view0).setReferencedIds(e$a0.d.e0);
                                }
                            }
                            else {
                                ((androidx.constraintlayout.widget.a)view0).setReferencedIds(arr_v);
                            }
                        }
                        androidx.constraintlayout.widget.ConstraintLayout.b constraintLayout$b0 = (androidx.constraintlayout.widget.ConstraintLayout.b)view0.getLayoutParams();
                        constraintLayout$b0.a();
                        e$a0.b(constraintLayout$b0);
                        if(z) {
                            androidx.constraintlayout.widget.b.c(view0, e$a0.f);
                        }
                        view0.setLayoutParams(constraintLayout$b0);
                        d e$d0 = e$a0.b;
                        if(e$d0.c == 0) {
                            view0.setVisibility(e$d0.b);
                        }
                        view0.setAlpha(e$a0.b.d);
                        view0.setRotation(e$a0.e.b);
                        view0.setRotationX(e$a0.e.c);
                        view0.setRotationY(e$a0.e.d);
                        view0.setScaleX(e$a0.e.e);
                        view0.setScaleY(e$a0.e.f);
                        if(!Float.isNaN(e$a0.e.g)) {
                            view0.setPivotX(e$a0.e.g);
                        }
                        if(!Float.isNaN(e$a0.e.h)) {
                            view0.setPivotY(e$a0.e.h);
                        }
                        view0.setTranslationX(e$a0.e.i);
                        view0.setTranslationY(e$a0.e.j);
                        view0.setTranslationZ(e$a0.e.k);
                        androidx.constraintlayout.widget.e.e e$e0 = e$a0.e;
                        if(e$e0.l) {
                            view0.setElevation(e$e0.m);
                        }
                    }
                    else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + v2);
                    }
                }
            }
            else {
                Log.w("ConstraintSet", "id unknown " + q.a.a(view0));
            }
        }
        for(Object object0: hashSet0) {
            Integer integer0 = (Integer)object0;
            a e$a1 = (a)this.c.get(integer0);
            int v4 = e$a1.d.d0;
            if(v4 != -1 && v4 == 1) {
                androidx.constraintlayout.widget.a a0 = new androidx.constraintlayout.widget.a(constraintLayout0.getContext());
                a0.setId(((int)integer0));
                b e$b1 = e$a1.d;
                int[] arr_v1 = e$b1.e0;
                if(arr_v1 == null) {
                    String s1 = e$b1.f0;
                    if(s1 != null) {
                        e$b1.e0 = this.h(a0, s1);
                        a0.setReferencedIds(e$a1.d.e0);
                    }
                }
                else {
                    a0.setReferencedIds(arr_v1);
                }
                a0.setType(e$a1.d.b0);
                a0.setMargin(e$a1.d.c0);
                androidx.constraintlayout.widget.ConstraintLayout.b constraintLayout$b1 = constraintLayout0.d();
                a0.m();
                e$a1.b(constraintLayout$b1);
                constraintLayout0.addView(a0, constraintLayout$b1);
            }
            if(e$a1.d.a) {
                g g0 = new g(constraintLayout0.getContext());
                g0.setId(((int)integer0));
                androidx.constraintlayout.widget.ConstraintLayout.b constraintLayout$b2 = constraintLayout0.d();
                e$a1.b(constraintLayout$b2);
                constraintLayout0.addView(g0, constraintLayout$b2);
            }
        }
    }

    public void e(Context context0, int v) {
        this.f(((ConstraintLayout)LayoutInflater.from(context0).inflate(v, null)));
    }

    public void f(ConstraintLayout constraintLayout0) {
        int v = constraintLayout0.getChildCount();
        this.c.clear();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = constraintLayout0.getChildAt(v1);
            androidx.constraintlayout.widget.ConstraintLayout.b constraintLayout$b0 = (androidx.constraintlayout.widget.ConstraintLayout.b)view0.getLayoutParams();
            int v2 = view0.getId();
            if(this.b && v2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if(!this.c.containsKey(v2)) {
                this.c.put(v2, new a());
            }
            a e$a0 = (a)this.c.get(v2);
            e$a0.f = androidx.constraintlayout.widget.b.a(this.a, view0);
            e$a0.d(v2, constraintLayout$b0);
            e$a0.b.b = view0.getVisibility();
            e$a0.b.d = view0.getAlpha();
            e$a0.e.b = view0.getRotation();
            e$a0.e.c = view0.getRotationX();
            e$a0.e.d = view0.getRotationY();
            e$a0.e.e = view0.getScaleX();
            e$a0.e.f = view0.getScaleY();
            float f = view0.getPivotX();
            float f1 = view0.getPivotY();
            if(((double)f) != 0.0 || ((double)f1) != 0.0) {
                e$a0.e.g = f;
                e$a0.e.h = f1;
            }
            e$a0.e.i = view0.getTranslationX();
            e$a0.e.j = view0.getTranslationY();
            e$a0.e.k = view0.getTranslationZ();
            androidx.constraintlayout.widget.e.e e$e0 = e$a0.e;
            if(e$e0.l) {
                e$e0.m = view0.getElevation();
            }
            if(view0 instanceof androidx.constraintlayout.widget.a) {
                e$a0.d.j0 = ((androidx.constraintlayout.widget.a)view0).n();
                e$a0.d.e0 = ((androidx.constraintlayout.widget.a)view0).getReferencedIds();
                e$a0.d.b0 = ((androidx.constraintlayout.widget.a)view0).getType();
                e$a0.d.c0 = ((androidx.constraintlayout.widget.a)view0).getMargin();
            }
        }
    }

    public void g(int v, int v1, int v2, float f) {
        a e$a0 = this.j(v);
        e$a0.d.x = v1;
        e$a0.d.y = v2;
        e$a0.d.z = f;
    }

    private int[] h(View view0, String s) {
        int v2;
        String[] arr_s = s.split(",");
        Context context0 = view0.getContext();
        int[] arr_v = new int[arr_s.length];
        int v = 0;
        int v1;
        for(v1 = 0; v < arr_s.length; ++v1) {
            String s1 = arr_s[v].trim();
            try {
                v2 = 0;
                v2 = h.class.getField(s1).getInt(null);
            }
            catch(Exception unused_ex) {
            }
            if(v2 == 0) {
                v2 = context0.getResources().getIdentifier(s1, "id", "com.fmkorea.m.fmk");
            }
            if(v2 == 0 && view0.isInEditMode() && view0.getParent() instanceof ConstraintLayout) {
                Object object0 = ((ConstraintLayout)view0.getParent()).f(0, s1);
                if(object0 != null && object0 instanceof Integer) {
                    v2 = (int)(((Integer)object0));
                }
            }
            arr_v[v1] = v2;
            ++v;
        }
        return v1 == arr_s.length ? arr_v : Arrays.copyOf(arr_v, v1);
    }

    private a i(Context context0, AttributeSet attributeSet0) {
        a e$a0 = new a();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, i.r);
        this.n(context0, e$a0, typedArray0);
        typedArray0.recycle();
        return e$a0;
    }

    private a j(int v) {
        if(!this.c.containsKey(v)) {
            this.c.put(v, new a());
        }
        return (a)this.c.get(v);
    }

    public void k(Context context0, int v) {
        XmlResourceParser xmlResourceParser0 = context0.getResources().getXml(v);
        try {
            int v1 = xmlResourceParser0.getEventType();
            while(true) {
                switch(v1) {
                    case 0: {
                        xmlResourceParser0.getName();
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                    case 1: {
                        return;
                    }
                    default: {
                        if(v1 == 2) {
                            String s = xmlResourceParser0.getName();
                            a e$a0 = this.i(context0, Xml.asAttributeSet(xmlResourceParser0));
                            if(s.equalsIgnoreCase("Guideline")) {
                                e$a0.d.a = true;
                            }
                            this.c.put(e$a0.a, e$a0);
                        }
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                }
            }
            goto label_18;
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            goto label_18;
        }
        xmlPullParserException0.printStackTrace();
        return;
    label_18:
        iOException0.printStackTrace();
    }

    public void l(Context context0, XmlPullParser xmlPullParser0) {
        try {
            int v = xmlPullParser0.getEventType();
            a e$a0 = null;
            while(true) {
                switch(v) {
                    case 0: {
                        xmlPullParser0.getName();
                        v = xmlPullParser0.next();
                        break;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        switch(xmlPullParser0.getName()) {
                            case "Barrier": {
                                e$a0 = this.i(context0, Xml.asAttributeSet(xmlPullParser0));
                                e$a0.d.d0 = 1;
                                break;
                            }
                            case "Constraint": {
                                e$a0 = this.i(context0, Xml.asAttributeSet(xmlPullParser0));
                                break;
                            }
                            case "CustomAttribute": {
                                if(e$a0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                androidx.constraintlayout.widget.b.b(context0, xmlPullParser0, e$a0.f);
                                break;
                            }
                            case "Guideline": {
                                e$a0 = this.i(context0, Xml.asAttributeSet(xmlPullParser0));
                                e$a0.d.a = true;
                                e$a0.d.b = true;
                                break;
                            }
                            case "Layout": {
                                if(e$a0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                AttributeSet attributeSet0 = Xml.asAttributeSet(xmlPullParser0);
                                e$a0.d.b(context0, attributeSet0);
                                break;
                            }
                            case "Motion": {
                                if(e$a0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                AttributeSet attributeSet1 = Xml.asAttributeSet(xmlPullParser0);
                                e$a0.c.b(context0, attributeSet1);
                                break;
                            }
                            case "PropertySet": {
                                if(e$a0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                AttributeSet attributeSet2 = Xml.asAttributeSet(xmlPullParser0);
                                e$a0.b.b(context0, attributeSet2);
                                break;
                            }
                            case "Transform": {
                                if(e$a0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                AttributeSet attributeSet3 = Xml.asAttributeSet(xmlPullParser0);
                                e$a0.e.b(context0, attributeSet3);
                            }
                        }
                        v = xmlPullParser0.next();
                        break;
                    }
                    case 3: {
                        String s = xmlPullParser0.getName();
                        if("ConstraintSet".equals(s)) {
                            return;
                        }
                        if(s.equalsIgnoreCase("Constraint")) {
                            this.c.put(e$a0.a, e$a0);
                            e$a0 = null;
                        }
                        v = xmlPullParser0.next();
                        break;
                    }
                    default: {
                        v = xmlPullParser0.next();
                        break;
                    }
                }
            }
            goto label_55;
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            goto label_55;
        }
        xmlPullParserException0.printStackTrace();
        return;
    label_55:
        iOException0.printStackTrace();
    }

    private static int m(TypedArray typedArray0, int v, int v1) {
        int v2 = typedArray0.getResourceId(v, v1);
        return v2 == -1 ? typedArray0.getInt(v, -1) : v2;
    }

    private void n(Context context0, a e$a0, TypedArray typedArray0) {
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 != i.t && i.L != v2 && i.M != v2) {
                e$a0.c.a = true;
                e$a0.d.b = true;
                e$a0.b.a = true;
                e$a0.e.a = true;
            }
            switch(e.e.get(v2)) {
                case 1: {
                    e$a0.d.p = e.m(typedArray0, v2, e$a0.d.p);
                    break;
                }
                case 2: {
                    e$a0.d.G = typedArray0.getDimensionPixelSize(v2, e$a0.d.G);
                    break;
                }
                case 3: {
                    e$a0.d.o = e.m(typedArray0, v2, e$a0.d.o);
                    break;
                }
                case 4: {
                    e$a0.d.n = e.m(typedArray0, v2, e$a0.d.n);
                    break;
                }
                case 5: {
                    e$a0.d.w = typedArray0.getString(v2);
                    break;
                }
                case 6: {
                    e$a0.d.A = typedArray0.getDimensionPixelOffset(v2, e$a0.d.A);
                    break;
                }
                case 7: {
                    e$a0.d.B = typedArray0.getDimensionPixelOffset(v2, e$a0.d.B);
                    break;
                }
                case 8: {
                    e$a0.d.H = typedArray0.getDimensionPixelSize(v2, e$a0.d.H);
                    break;
                }
                case 9: {
                    e$a0.d.t = e.m(typedArray0, v2, e$a0.d.t);
                    break;
                }
                case 10: {
                    e$a0.d.s = e.m(typedArray0, v2, e$a0.d.s);
                    break;
                }
                case 11: {
                    e$a0.d.M = typedArray0.getDimensionPixelSize(v2, e$a0.d.M);
                    break;
                }
                case 12: {
                    e$a0.d.N = typedArray0.getDimensionPixelSize(v2, e$a0.d.N);
                    break;
                }
                case 13: {
                    e$a0.d.J = typedArray0.getDimensionPixelSize(v2, e$a0.d.J);
                    break;
                }
                case 14: {
                    e$a0.d.L = typedArray0.getDimensionPixelSize(v2, e$a0.d.L);
                    break;
                }
                case 15: {
                    e$a0.d.O = typedArray0.getDimensionPixelSize(v2, e$a0.d.O);
                    break;
                }
                case 16: {
                    e$a0.d.K = typedArray0.getDimensionPixelSize(v2, e$a0.d.K);
                    break;
                }
                case 17: {
                    e$a0.d.e = typedArray0.getDimensionPixelOffset(v2, e$a0.d.e);
                    break;
                }
                case 18: {
                    e$a0.d.f = typedArray0.getDimensionPixelOffset(v2, e$a0.d.f);
                    break;
                }
                case 19: {
                    e$a0.d.g = typedArray0.getFloat(v2, e$a0.d.g);
                    break;
                }
                case 20: {
                    e$a0.d.u = typedArray0.getFloat(v2, e$a0.d.u);
                    break;
                }
                case 21: {
                    e$a0.d.d = typedArray0.getLayoutDimension(v2, e$a0.d.d);
                    break;
                }
                case 22: {
                    e$a0.b.b = typedArray0.getInt(v2, e$a0.b.b);
                    e$a0.b.b = e.d[e$a0.b.b];
                    break;
                }
                case 23: {
                    e$a0.d.c = typedArray0.getLayoutDimension(v2, e$a0.d.c);
                    break;
                }
                case 24: {
                    e$a0.d.D = typedArray0.getDimensionPixelSize(v2, e$a0.d.D);
                    break;
                }
                case 25: {
                    e$a0.d.h = e.m(typedArray0, v2, e$a0.d.h);
                    break;
                }
                case 26: {
                    e$a0.d.i = e.m(typedArray0, v2, e$a0.d.i);
                    break;
                }
                case 27: {
                    e$a0.d.C = typedArray0.getInt(v2, e$a0.d.C);
                    break;
                }
                case 28: {
                    e$a0.d.E = typedArray0.getDimensionPixelSize(v2, e$a0.d.E);
                    break;
                }
                case 29: {
                    e$a0.d.j = e.m(typedArray0, v2, e$a0.d.j);
                    break;
                }
                case 30: {
                    e$a0.d.k = e.m(typedArray0, v2, e$a0.d.k);
                    break;
                }
                case 0x1F: {
                    e$a0.d.I = typedArray0.getDimensionPixelSize(v2, e$a0.d.I);
                    break;
                }
                case 0x20: {
                    e$a0.d.q = e.m(typedArray0, v2, e$a0.d.q);
                    break;
                }
                case 33: {
                    e$a0.d.r = e.m(typedArray0, v2, e$a0.d.r);
                    break;
                }
                case 34: {
                    e$a0.d.F = typedArray0.getDimensionPixelSize(v2, e$a0.d.F);
                    break;
                }
                case 35: {
                    e$a0.d.m = e.m(typedArray0, v2, e$a0.d.m);
                    break;
                }
                case 36: {
                    e$a0.d.l = e.m(typedArray0, v2, e$a0.d.l);
                    break;
                }
                case 37: {
                    e$a0.d.v = typedArray0.getFloat(v2, e$a0.d.v);
                    break;
                }
                case 38: {
                    e$a0.a = typedArray0.getResourceId(v2, e$a0.a);
                    break;
                }
                case 39: {
                    e$a0.d.Q = typedArray0.getFloat(v2, e$a0.d.Q);
                    break;
                }
                case 40: {
                    e$a0.d.P = typedArray0.getFloat(v2, e$a0.d.P);
                    break;
                }
                case 41: {
                    e$a0.d.R = typedArray0.getInt(v2, e$a0.d.R);
                    break;
                }
                case 42: {
                    e$a0.d.S = typedArray0.getInt(v2, e$a0.d.S);
                    break;
                }
                case 43: {
                    e$a0.b.d = typedArray0.getFloat(v2, e$a0.b.d);
                    break;
                }
                case 44: {
                    e$a0.e.l = true;
                    e$a0.e.m = typedArray0.getDimension(v2, e$a0.e.m);
                    break;
                }
                case 45: {
                    e$a0.e.c = typedArray0.getFloat(v2, e$a0.e.c);
                    break;
                }
                case 46: {
                    e$a0.e.d = typedArray0.getFloat(v2, e$a0.e.d);
                    break;
                }
                case 0x2F: {
                    e$a0.e.e = typedArray0.getFloat(v2, e$a0.e.e);
                    break;
                }
                case 0x30: {
                    e$a0.e.f = typedArray0.getFloat(v2, e$a0.e.f);
                    break;
                }
                case 49: {
                    e$a0.e.g = typedArray0.getDimension(v2, e$a0.e.g);
                    break;
                }
                case 50: {
                    e$a0.e.h = typedArray0.getDimension(v2, e$a0.e.h);
                    break;
                }
                case 51: {
                    e$a0.e.i = typedArray0.getDimension(v2, e$a0.e.i);
                    break;
                }
                case 52: {
                    e$a0.e.j = typedArray0.getDimension(v2, e$a0.e.j);
                    break;
                }
                case 53: {
                    e$a0.e.k = typedArray0.getDimension(v2, e$a0.e.k);
                    break;
                }
                case 54: {
                    e$a0.d.T = typedArray0.getInt(v2, e$a0.d.T);
                    break;
                }
                case 55: {
                    e$a0.d.U = typedArray0.getInt(v2, e$a0.d.U);
                    break;
                }
                case 56: {
                    e$a0.d.V = typedArray0.getDimensionPixelSize(v2, e$a0.d.V);
                    break;
                }
                case 57: {
                    e$a0.d.W = typedArray0.getDimensionPixelSize(v2, e$a0.d.W);
                    break;
                }
                case 58: {
                    e$a0.d.X = typedArray0.getDimensionPixelSize(v2, e$a0.d.X);
                    break;
                }
                case 59: {
                    e$a0.d.Y = typedArray0.getDimensionPixelSize(v2, e$a0.d.Y);
                    break;
                }
                case 60: {
                    e$a0.e.b = typedArray0.getFloat(v2, e$a0.e.b);
                    break;
                }
                case 61: {
                    e$a0.d.x = e.m(typedArray0, v2, e$a0.d.x);
                    break;
                }
                case 62: {
                    e$a0.d.y = typedArray0.getDimensionPixelSize(v2, e$a0.d.y);
                    break;
                }
                case 0x3F: {
                    e$a0.d.z = typedArray0.getFloat(v2, e$a0.d.z);
                    break;
                }
                case 0x40: {
                    e$a0.c.b = e.m(typedArray0, v2, e$a0.c.b);
                    break;
                }
                case 65: {
                    if(typedArray0.peekValue(v2).type == 3) {
                        e$a0.c.c = typedArray0.getString(v2);
                    }
                    else {
                        String[] arr_s = p.a.c;
                        e$a0.c.c = arr_s[typedArray0.getInteger(v2, 0)];
                    }
                    break;
                }
                case 66: {
                    e$a0.c.e = typedArray0.getInt(v2, 0);
                    break;
                }
                case 67: {
                    e$a0.c.g = typedArray0.getFloat(v2, e$a0.c.g);
                    break;
                }
                case 68: {
                    e$a0.b.e = typedArray0.getFloat(v2, e$a0.b.e);
                    break;
                }
                case 69: {
                    e$a0.d.Z = typedArray0.getFloat(v2, 1.0f);
                    break;
                }
                case 70: {
                    e$a0.d.a0 = typedArray0.getFloat(v2, 1.0f);
                    break;
                }
                case 71: {
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                }
                case 72: {
                    e$a0.d.b0 = typedArray0.getInt(v2, e$a0.d.b0);
                    break;
                }
                case 73: {
                    e$a0.d.c0 = typedArray0.getDimensionPixelSize(v2, e$a0.d.c0);
                    break;
                }
                case 74: {
                    e$a0.d.f0 = typedArray0.getString(v2);
                    break;
                }
                case 75: {
                    e$a0.d.j0 = typedArray0.getBoolean(v2, e$a0.d.j0);
                    break;
                }
                case 76: {
                    e$a0.c.d = typedArray0.getInt(v2, e$a0.c.d);
                    break;
                }
                case 77: {
                    e$a0.d.g0 = typedArray0.getString(v2);
                    break;
                }
                case 78: {
                    e$a0.b.c = typedArray0.getInt(v2, e$a0.b.c);
                    break;
                }
                case 0x4F: {
                    e$a0.c.f = typedArray0.getFloat(v2, e$a0.c.f);
                    break;
                }
                case 80: {
                    e$a0.d.h0 = typedArray0.getBoolean(v2, e$a0.d.h0);
                    break;
                }
                case 81: {
                    e$a0.d.i0 = typedArray0.getBoolean(v2, e$a0.d.i0);
                    break;
                }
                case 82: {
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(v2) + "   " + e.e.get(v2));
                    break;
                }
                default: {
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(v2) + "   " + e.e.get(v2));
                }
            }
        }
    }
}

