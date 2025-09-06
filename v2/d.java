package V2;

import R2.b;
import java.util.ArrayList;
import java.util.Map;

public final class d extends n {
    static enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1;

    }

    @Override  // V2.n
    public b a(String s, O2.a a0, int v, int v1, Map map0) {
        if(a0 != O2.a.j) {
            throw new IllegalArgumentException("Can only encode CODE_128, but got " + a0);
        }
        return super.a(s, a0, v, v1, map0);
    }

    @Override  // V2.n
    public boolean[] c(String s) {
        int v = s.length();
        if(v <= 0 || v > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got " + v);
        }
        int v1 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            int v3 = s.charAt(v2);
            if(v3 != 0xF1 && v3 != 0xF2 && v3 != 0xF3 && v3 != 0xF4 && v3 > 0x7F) {
                throw new IllegalArgumentException("Bad character in input: " + ((char)v3));
            }
        }
        ArrayList arrayList0 = new ArrayList();
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        int v7 = 1;
        while(true) {
            int v8 = 103;
            if(v4 >= v) {
                break;
            }
            int v9 = d.f(s, v4, v6);
            int v10 = 100;
            if(v9 == v6) {
                switch(s.charAt(v4)) {
                    case 0xF1: {
                        v10 = 102;
                        break;
                    }
                    case 0xF2: {
                        v10 = 97;
                        break;
                    }
                    case 0xF3: {
                        v10 = 0x60;
                        break;
                    }
                    case 0xF4: {
                        if(v6 == 101) {
                            v10 = 101;
                        }
                        break;
                    }
                    default: {
                        switch(v6) {
                            case 100: {
                                v10 = s.charAt(v4) - 0x20;
                                break;
                            }
                            case 101: {
                                int v11 = s.charAt(v4);
                                int v12 = v11 - 0x20;
                                v10 = v12 >= 0 ? v12 : v11 + 0x40;
                                break;
                            }
                            default: {
                                v10 = Integer.parseInt(s.substring(v4, v4 + 2));
                                ++v4;
                            }
                        }
                    }
                }
                ++v4;
            }
            else {
                if(v6 != 0) {
                    v8 = v9;
                }
                else if(v9 == 100) {
                    v8 = 104;
                }
                else if(v9 != 101) {
                    v8 = 105;
                }
                v10 = v8;
                v6 = v9;
            }
            arrayList0.add(c.a[v10]);
            v5 += v10 * v7;
            if(v4 != 0) {
                ++v7;
            }
        }
        arrayList0.add(c.a[v5 % 103]);
        arrayList0.add(c.a[106]);
        int v13 = 0;
        for(Object object0: arrayList0) {
            int[] arr_v = (int[])object0;
            for(int v14 = 0; v14 < arr_v.length; ++v14) {
                v13 += arr_v[v14];
            }
        }
        boolean[] arr_z = new boolean[v13];
        for(Object object1: arrayList0) {
            v1 += n.b(arr_z, v1, ((int[])object1), true);
        }
        return arr_z;
    }

    private static int f(CharSequence charSequence0, int v, int v1) {
        a d$a0 = d.g(charSequence0, v);
        a d$a1 = a.g;
        if(d$a0 == d$a1) {
            return 100;
        }
        a d$a2 = a.f;
        if(d$a0 == d$a2) {
            if(v < charSequence0.length()) {
                int v2 = charSequence0.charAt(v);
                return v2 >= 0x20 && (v1 != 101 || v2 >= 0x60) ? 100 : 101;
            }
            return 100;
        }
        switch(v1) {
            case 99: {
                return 99;
            }
            case 100: {
                a d$a3 = a.i;
                if(d$a0 == d$a3) {
                    return 100;
                }
                a d$a4 = d.g(charSequence0, v + 2);
                if(d$a4 != d$a2 && d$a4 != d$a1) {
                    if(d$a4 == d$a3) {
                        return d.g(charSequence0, v + 3) == a.h ? 99 : 100;
                    }
                    int v3 = v + 4;
                    a d$a5;
                    while((d$a5 = d.g(charSequence0, v3)) == a.h) {
                        v3 += 2;
                    }
                    return d$a5 == a.g ? 100 : 99;
                }
                return 100;
            }
            default: {
                if(d$a0 == a.i) {
                    d$a0 = d.g(charSequence0, v + 1);
                }
                return d$a0 == a.h ? 99 : 100;
            }
        }
    }

    private static a g(CharSequence charSequence0, int v) {
        int v1 = charSequence0.length();
        if(v >= v1) {
            return a.f;
        }
        int v2 = charSequence0.charAt(v);
        if(v2 == 0xF1) {
            return a.i;
        }
        if(v2 >= 0x30 && v2 <= 57) {
            if(v + 1 >= v1) {
                return a.g;
            }
            int v3 = charSequence0.charAt(v + 1);
            return v3 < 0x30 || v3 > 57 ? a.g : a.h;
        }
        return a.f;
    }
}

