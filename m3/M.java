package m3;

import F3.e;
import F3.f;
import G3.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import z3.b;
import z3.k;

abstract class m extends l {
    public static e j(Object[] arr_object) {
        public static final class a implements e {
            final Object[] a;

            public a(Object[] arr_object) {
                this.a = arr_object;
                super();
            }

            @Override  // F3.e
            public Iterator iterator() {
                return b.a(this.a);
            }
        }

        k.e(arr_object, "<this>");
        return arr_object.length == 0 ? f.e() : new a(arr_object);
    }

    public static boolean k(Object[] arr_object, Object object0) {
        k.e(arr_object, "<this>");
        return m.p(arr_object, object0) >= 0;
    }

    public static List l(Object[] arr_object) {
        k.e(arr_object, "<this>");
        return (List)m.m(arr_object, new ArrayList());
    }

    public static final Collection m(Object[] arr_object, Collection collection0) {
        k.e(arr_object, "<this>");
        k.e(collection0, "destination");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(object0 != null) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    public static final int n(Object[] arr_object) {
        k.e(arr_object, "<this>");
        return arr_object.length - 1;
    }

    public static Object o(Object[] arr_object, int v) {
        k.e(arr_object, "<this>");
        return v < 0 || v >= arr_object.length ? null : arr_object[v];
    }

    public static final int p(Object[] arr_object, Object object0) {
        k.e(arr_object, "<this>");
        int v = 0;
        if(object0 == null) {
            while(v < arr_object.length) {
                if(arr_object[v] == null) {
                    return v;
                }
                ++v;
            }
            return -1;
        }
        while(v < arr_object.length) {
            if(k.a(object0, arr_object[v])) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public static final Appendable q(Object[] arr_object, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, y3.l l0) {
        k.e(arr_object, "<this>");
        k.e(appendable0, "buffer");
        k.e(charSequence0, "separator");
        k.e(charSequence1, "prefix");
        k.e(charSequence2, "postfix");
        k.e(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            Object object0 = arr_object[v1];
            ++v2;
            if(v2 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v2 > v) {
                break;
            }
            h.a(appendable0, object0, l0);
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    public static final String r(Object[] arr_object, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, y3.l l0) {
        k.e(arr_object, "<this>");
        k.e(charSequence0, "separator");
        k.e(charSequence1, "prefix");
        k.e(charSequence2, "postfix");
        k.e(charSequence3, "truncated");
        return ((StringBuilder)m.q(arr_object, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, l0)).toString();
    }

    public static String s(Object[] arr_object, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, y3.l l0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 8) != 0) {
            v = -1;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            l0 = null;
        }
        return m.r(arr_object, charSequence0, charSequence5, charSequence4, v, charSequence3, l0);
    }

    public static char t(char[] arr_c) {
        k.e(arr_c, "<this>");
        switch(arr_c.length) {
            case 0: {
                throw new NoSuchElementException("Array is empty.");
            }
            case 1: {
                return arr_c[0];
            }
            default: {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    public static Object u(Object[] arr_object) {
        k.e(arr_object, "<this>");
        return arr_object.length == 1 ? arr_object[0] : null;
    }

    public static final Collection v(Object[] arr_object, Collection collection0) {
        k.e(arr_object, "<this>");
        k.e(collection0, "destination");
        for(int v = 0; v < arr_object.length; ++v) {
            collection0.add(arr_object[v]);
        }
        return collection0;
    }

    public static List w(Object[] arr_object) {
        k.e(arr_object, "<this>");
        switch(arr_object.length) {
            case 0: {
                return o.i();
            }
            case 1: {
                return o.e(arr_object[0]);
            }
            default: {
                return m.x(arr_object);
            }
        }
    }

    public static final List x(Object[] arr_object) {
        k.e(arr_object, "<this>");
        return new ArrayList(q.h(arr_object));
    }
}

