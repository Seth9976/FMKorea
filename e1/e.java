package e1;

import G3.h;
import android.content.res.Resources;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import z3.g;
import z3.k;

public final class e {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }

        private final String b(b e$b0, String s) {
            String s1 = h.s(h.s(h.s(s, "\\u003C", "<", false, 4, null), "\\n", "", false, 4, null), "\\\"", "\"", false, 4, null);
            String s2 = s1.substring(1, s1.length() - 1);
            k.d(s2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String s3 = String.format("<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>", Arrays.copyOf(new Object[]{e$b0.b(), e$b0.c(), e$b0.d(), e$b0.e(), e$b0.a(), s2}, 6));
            k.d(s3, "java.lang.String.format(format, *args)");
            return s3;
        }
    }

    static final class b {
        public static final class e1.e.b.a {
            private e1.e.b.a() {
            }

            public e1.e.b.a(g g0) {
            }
        }

        private final String a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private static final int[] f;
        public static final e1.e.b.a g;

        static {
            b.g = new e1.e.b.a(null);
            b.f = new int[2];
        }

        public b(WebView webView0) {
            k.e(webView0, "webView");
            super();
            String s = String.format("%s{%s}", Arrays.copyOf(new Object[]{webView0.getClass().getName(), Integer.toHexString(webView0.hashCode())}, 2));
            k.d(s, "java.lang.String.format(format, *args)");
            this.a = s;
            webView0.getLocationOnScreen(b.f);
            this.b = b.f[0];
            this.c = b.f[1];
            this.d = webView0.getWidth();
            this.e = webView0.getHeight();
        }

        public final int a() {
            return this.e;
        }

        public final String b() {
            return this.a;
        }

        public final int c() {
            return this.b;
        }

        public final int d() {
            return this.c;
        }

        public final int e() {
            return this.d;
        }
    }

    private final Set a;
    private final Map b;
    public static final a c;

    static {
        e.c = new a(null);
    }

    public e() {
        this.a = new LinkedHashSet();
        this.b = new LinkedHashMap();
    }

    public final void b(PrintWriter printWriter0) {
        k.e(printWriter0, "writer");
        try {
            for(Object object0: this.a) {
                b e$b0 = (b)object0;
                String s = (String)this.b.get(e$b0.b());
                if(s != null) {
                    printWriter0.print("WebView HTML for ");
                    printWriter0.print(e$b0);
                    printWriter0.println(":");
                    printWriter0.println(e.c.b(e$b0, s));
                }
            }
        }
        catch(Exception unused_ex) {
        }
        this.a.clear();
        this.b.clear();
    }

    public final void c(WebView webView0) {
        static final class c implements ValueCallback {
            final e a;
            final b b;

            c(e e0, b e$b0) {
                this.a = e0;
                this.b = e$b0;
                super();
            }

            public final void a(String s) {
                Map map0 = this.a.b;
                k.d(s, "html");
                map0.put(this.b.b(), s);
            }

            @Override  // android.webkit.ValueCallback
            public void onReceiveValue(Object object0) {
                this.a(((String)object0));
            }
        }

        k.e(webView0, "view");
        b e$b0 = new b(webView0);
        this.a.add(e$b0);
        Resources resources0 = webView0.getResources();
        k.d(resources0, "view.resources");
        String s = String.format("(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll(\'body, body *\'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute(\'data-rect\', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === \'none\' || style.visibility !== \'visible\' || el.getAttribute(\'hidden\') === \'true\';      const disabled = el.disabled || el.getAttribute(\'aria-disabled\') === \'true\';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute(\'data-flag\', `${hidden ? \'H\' : \'\'}${disabled ? \'D\' : \'\'}${focused ? \'F\' : \'\'}`);      } else {        el.removeAttribute(\'data-flag\');      }    }    document.activeElement.setAttribute(\'focused\', \'true\');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll(\'script, link\'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll(\'*\'))) {      el.removeAttribute(\'class\');    }    return doc.getElementsByTagName(\'body\')[0].outerHTML.trim();  } catch (e) {    return \'Failed: \' + e;  }})();", Arrays.copyOf(new Object[]{e$b0.c(), e$b0.d(), resources0.getDisplayMetrics().scaledDensity}, 3));
        k.d(s, "java.lang.String.format(format, *args)");
        webView0.evaluateJavascript(s, new c(this, e$b0));
    }
}

