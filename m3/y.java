package m3;

import G3.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import l3.r;
import z3.k;

abstract class y extends x {
    public static final Object A(List list0) {
        k.e(list0, "<this>");
        switch(list0.size()) {
            case 0: {
                throw new NoSuchElementException("List is empty.");
            }
            case 1: {
                return list0.get(0);
            }
            default: {
                throw new IllegalArgumentException("List has more than one element.");
            }
        }
    }

    public static List B(Iterable iterable0) {
        k.e(iterable0, "<this>");
        if(iterable0 instanceof Collection) {
            if(((Collection)iterable0).size() <= 1) {
                return o.F(iterable0);
            }
            Object[] arr_object = ((Collection)iterable0).toArray(new Comparable[0]);
            l.h(((Comparable[])arr_object));
            return i.c(arr_object);
        }
        List list0 = y.G(iterable0);
        u.o(list0);
        return list0;
    }

    public static List C(Iterable iterable0, Comparator comparator0) {
        k.e(iterable0, "<this>");
        k.e(comparator0, "comparator");
        if(iterable0 instanceof Collection) {
            if(((Collection)iterable0).size() <= 1) {
                return o.F(iterable0);
            }
            Object[] arr_object = ((Collection)iterable0).toArray(new Object[0]);
            l.i(arr_object, comparator0);
            return i.c(arr_object);
        }
        List list0 = y.G(iterable0);
        o.p(list0, comparator0);
        return list0;
    }

    public static final Collection D(Iterable iterable0, Collection collection0) {
        k.e(iterable0, "<this>");
        k.e(collection0, "destination");
        for(Object object0: iterable0) {
            collection0.add(object0);
        }
        return collection0;
    }

    public static int[] E(Collection collection0) {
        k.e(collection0, "<this>");
        int[] arr_v = new int[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_v[v] = ((Number)object0).intValue();
            ++v;
        }
        return arr_v;
    }

    public static List F(Iterable iterable0) {
        k.e(iterable0, "<this>");
        if(iterable0 instanceof Collection) {
            switch(((Collection)iterable0).size()) {
                case 0: {
                    return o.i();
                }
                case 1: {
                    if(iterable0 instanceof List) {
                        return o.e(((List)iterable0).get(0));
                    }
                    Object object0 = ((Collection)iterable0).iterator().next();
                    return o.e(object0);
                }
                default: {
                    return o.H(((Collection)iterable0));
                }
            }
        }
        return q.l(y.G(iterable0));
    }

    public static final List G(Iterable iterable0) {
        k.e(iterable0, "<this>");
        return iterable0 instanceof Collection ? o.H(((Collection)iterable0)) : ((List)y.D(iterable0, new ArrayList()));
    }

    public static List H(Collection collection0) {
        k.e(collection0, "<this>");
        return new ArrayList(collection0);
    }

    public static Set I(Iterable iterable0) {
        k.e(iterable0, "<this>");
        if(iterable0 instanceof Collection) {
            switch(((Collection)iterable0).size()) {
                case 0: {
                    return L.e();
                }
                case 1: {
                    if(iterable0 instanceof List) {
                        return L.d(((List)iterable0).get(0));
                    }
                    Object object0 = ((Collection)iterable0).iterator().next();
                    return L.d(object0);
                }
                default: {
                    return (Set)y.D(iterable0, new LinkedHashSet(F.e(((Collection)iterable0).size())));
                }
            }
        }
        return N.h(((Set)y.D(iterable0, new LinkedHashSet())));
    }

    public static List J(Iterable iterable0, Iterable iterable1) {
        k.e(iterable0, "<this>");
        k.e(iterable1, "other");
        Iterator iterator0 = iterable0.iterator();
        Iterator iterator1 = iterable1.iterator();
        List list0 = new ArrayList(Math.min(o.n(iterable0, 10), o.n(iterable1, 10)));
        while(iterator0.hasNext() && iterator1.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = iterator1.next();
            ((ArrayList)list0).add(r.a(object0, object1));
        }
        return list0;
    }

    public static boolean q(Iterable iterable0, Object object0) {
        k.e(iterable0, "<this>");
        return iterable0 instanceof Collection ? ((Collection)iterable0).contains(object0) : y.s(iterable0, object0) >= 0;
    }

    public static Object r(List list0) {
        k.e(list0, "<this>");
        if(list0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list0.get(0);
    }

    public static final int s(Iterable iterable0, Object object0) {
        k.e(iterable0, "<this>");
        if(iterable0 instanceof List) {
            return ((List)iterable0).indexOf(object0);
        }
        int v = 0;
        for(Object object1: iterable0) {
            if(v < 0) {
                o.m();
            }
            if(k.a(object0, object1)) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public static final Appendable t(Iterable iterable0, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, y3.l l0) {
        k.e(iterable0, "<this>");
        k.e(appendable0, "buffer");
        k.e(charSequence0, "separator");
        k.e(charSequence1, "prefix");
        k.e(charSequence2, "postfix");
        k.e(charSequence3, "truncated");
        appendable0.append(charSequence1);
        int v1 = 0;
        for(Object object0: iterable0) {
            ++v1;
            if(v1 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v1 > v) {
                break;
            }
            h.a(appendable0, object0, l0);
        }
        if(v >= 0 && v1 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    public static Appendable u(Iterable iterable0, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, y3.l l0, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? y.t(iterable0, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", l0) : y.t(iterable0, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? y.t(iterable0, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, l0) : y.t(iterable0, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    public static final String v(Iterable iterable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, y3.l l0) {
        k.e(iterable0, "<this>");
        k.e(charSequence0, "separator");
        k.e(charSequence1, "prefix");
        k.e(charSequence2, "postfix");
        k.e(charSequence3, "truncated");
        return ((StringBuilder)y.t(iterable0, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, l0)).toString();
    }

    public static String w(Iterable iterable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, y3.l l0, int v1, Object object0) {
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
        return y.v(iterable0, charSequence0, charSequence5, charSequence4, v, charSequence3, l0);
    }

    public static Object x(List list0) {
        k.e(list0, "<this>");
        if(list0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list0.get(o.j(list0));
    }

    public static Comparable y(Iterable iterable0) {
        k.e(iterable0, "<this>");
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)object0;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)object1;
            if(comparable0.compareTo(comparable1) > 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    public static Object z(Iterable iterable0) {
        k.e(iterable0, "<this>");
        if(iterable0 instanceof List) {
            return y.A(((List)iterable0));
        }
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object object0 = iterator0.next();
        if(iterator0.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return object0;
    }
}

