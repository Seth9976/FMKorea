package V2;

import O2.a;
import R2.b;
import java.util.Map;

public final class f extends n {
    @Override  // V2.n
    public b a(String s, a a0, int v, int v1, Map map0) {
        if(a0 != a.h) {
            throw new IllegalArgumentException("Can only encode CODE_39, but got " + a0);
        }
        return super.a(s, a0, v, v1, map0);
    }

    @Override  // V2.n
    public boolean[] c(String s) {
        int v = s.length();
        if(v > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + v);
        }
        for(int v1 = 0; v1 < v; ++v1) {
            if("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(s.charAt(v1)) < 0) {
                s = f.g(s);
                v = s.length();
                if(v > 80) {
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + v + " (extended full ASCII mode)");
                }
                break;
            }
        }
        int[] arr_v = new int[9];
        int v2 = v + 25;
        for(int v3 = 0; v3 < v; ++v3) {
            f.f(e.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(s.charAt(v3))], arr_v);
            for(int v4 = 0; v4 < 9; ++v4) {
                v2 += arr_v[v4];
            }
        }
        boolean[] arr_z = new boolean[v2];
        f.f(0x94, arr_v);
        int v5 = n.b(arr_z, 0, arr_v, true);
        int[] arr_v1 = {1};
        int v6 = v5 + n.b(arr_z, v5, arr_v1, false);
        for(int v7 = 0; v7 < v; ++v7) {
            f.f(e.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(s.charAt(v7))], arr_v);
            int v8 = v6 + n.b(arr_z, v6, arr_v, true);
            v6 = v8 + n.b(arr_z, v8, arr_v1, false);
        }
        f.f(0x94, arr_v);
        n.b(arr_z, v6, arr_v, true);
        return arr_z;
    }

    private static void f(int v, int[] arr_v) {
        for(int v1 = 0; true; ++v1) {
            int v2 = 1;
            if(v1 >= 9) {
                break;
            }
            if((1 << 8 - v1 & v) != 0) {
                v2 = 2;
            }
            arr_v[v1] = v2;
        }
    }

    private static String g(String s) {
        int v = s.length();
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            switch(v2) {
                case 0: {
                    stringBuilder0.append("%U");
                    break;
                }
                case 0x20: 
                case 45: 
                case 46: {
                    stringBuilder0.append(((char)v2));
                    break;
                }
                case 0x40: {
                    stringBuilder0.append("%V");
                    break;
                }
                case 0x60: {
                    stringBuilder0.append("%W");
                    break;
                }
                default: {
                    if(v2 <= 26) {
                        stringBuilder0.append('$');
                        stringBuilder0.append(((char)(v2 + 0x40)));
                    }
                    else if(v2 < 0x20) {
                        stringBuilder0.append('%');
                        stringBuilder0.append(((char)(v2 + 38)));
                    }
                    else if(v2 <= 44 || v2 == 0x2F || v2 == 58) {
                        stringBuilder0.append('/');
                        stringBuilder0.append(((char)(v2 + 0x20)));
                    }
                    else if(v2 <= 57) {
                        stringBuilder0.append(((char)v2));
                    }
                    else if(v2 <= 0x3F) {
                        stringBuilder0.append('%');
                        stringBuilder0.append(((char)(v2 + 11)));
                    }
                    else if(v2 <= 90) {
                        stringBuilder0.append(((char)v2));
                    }
                    else if(v2 <= 0x5F) {
                        stringBuilder0.append('%');
                        stringBuilder0.append(((char)(v2 - 16)));
                    }
                    else if(v2 <= 0x7A) {
                        stringBuilder0.append('+');
                        stringBuilder0.append(((char)(v2 - 0x20)));
                    }
                    else {
                        if(v2 > 0x7F) {
                            throw new IllegalArgumentException("Requested content contains a non-encodable character: \'" + s.charAt(v1) + "\'");
                        }
                        stringBuilder0.append('%');
                        stringBuilder0.append(((char)(v2 - 43)));
                    }
                    break;
                }
            }
        }
        return stringBuilder0.toString();
    }
}

