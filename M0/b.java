package M0;

import O0.f;
import android.content.res.Resources.NotFoundException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import b1.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class b {
    static {
    }

    static List a(View view0) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            List list0 = new ArrayList();
            ViewGroup viewGroup0 = f.j(view0);
            if(viewGroup0 != null) {
                for(Object object0: f.b(viewGroup0)) {
                    View view1 = (View)object0;
                    if(view0 != view1) {
                        list0.addAll(b.c(view1));
                    }
                }
            }
            return list0;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    static List b(View view0) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(f.i(view0));
            Object object0 = view0.getTag();
            if(object0 != null) {
                arrayList0.add(object0.toString());
            }
            CharSequence charSequence0 = view0.getContentDescription();
            if(charSequence0 != null) {
                arrayList0.add(charSequence0.toString());
            }
            try {
                if(view0.getId() != -1) {
                    String[] arr_s = view0.getResources().getResourceName(view0.getId()).split("/");
                    if(arr_s.length == 2) {
                        arrayList0.add(arr_s[1]);
                    }
                }
            }
            catch(Resources.NotFoundException unused_ex) {
            }
            List list0 = new ArrayList();
            for(Object object1: arrayList0) {
                String s = (String)object1;
                if(!s.isEmpty() && s.length() <= 100) {
                    list0.add(s.toLowerCase());
                }
            }
            return list0;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    static List c(View view0) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            List list0 = new ArrayList();
            if(view0 instanceof EditText) {
                return list0;
            }
            if(view0 instanceof TextView) {
                String s = ((TextView)view0).getText().toString();
                if(!s.isEmpty() && s.length() < 100) {
                    list0.add(s.toLowerCase());
                    return list0;
                }
                return list0;
            }
            for(Object object0: f.b(view0)) {
                list0.addAll(b.c(((View)object0)));
            }
            return list0;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    static boolean d(String s, List list0) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            Iterator iterator0 = list0.iterator();
            do {
                if(!iterator0.hasNext()) {
                    return false;
                }
                Object object0 = iterator0.next();
            }
            while(!s.contains(((String)object0)));
            return true;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return false;
        }
    }

    static boolean e(List list0, List list1) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            Iterator iterator0 = list0.iterator();
            do {
                if(!iterator0.hasNext()) {
                    return false;
                }
                Object object0 = iterator0.next();
            }
            while(!b.d(((String)object0), list1));
            return true;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return false;
        }
    }

    static boolean f(String s, String s1) {
        Class class0 = b.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            return s.matches(s1);
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return false;
        }
    }
}

