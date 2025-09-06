package o2;

import j2.j;
import j2.r;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import l2.B.a;
import l2.B.d;
import l2.B;
import l2.C;
import m2.h;
import q2.i;

public class e {
    private final AtomicInteger a;
    private final f b;
    private final i c;
    private final j d;
    private static final Charset e;
    private static final int f;
    private static final h g;
    private static final Comparator h;
    private static final FilenameFilter i;

    static {
        e.e = Charset.forName("UTF-8");
        e.f = 15;
        e.g = new h();
        e.h = (File file0, File file1) -> e.u(file0, file1);
        e.i = (File file0, String s) -> e.v(file0, s);
    }

    public e(f f0, i i0, j j0) {
        this.a = new AtomicInteger(0);
        this.b = f0;
        this.c = i0;
        this.d = j0;
    }

    private static String A(File file0) {
        byte[] arr_b = new byte[0x2000];
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try(FileInputStream fileInputStream0 = new FileInputStream(file0)) {
            int v;
            while((v = fileInputStream0.read(arr_b)) > 0) {
                byteArrayOutputStream0.write(arr_b, 0, v);
            }
            return new String(byteArrayOutputStream0.toByteArray(), e.e);
        }
    }

    private void B(File file0, d b$d0, String s, a b$a0) {
        try {
            String s1 = e.A(file0);
            B b0 = e.g.F(s1).r(b$d0).o(b$a0);
            e.G(this.b.g(s), e.g.G(b0));
        }
        catch(IOException iOException0) {
            g2.f.f().l("Could not synthesize final native report file for " + file0, iOException0);
        }
    }

    private void C(String s, long v) {
        boolean z;
        List list0 = this.b.p(s, e.i);
        if(list0.isEmpty()) {
            g2.f.f().i("Session " + s + " has no events.");
            return;
        }
        Collections.sort(list0);
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = list0.iterator();
    alab1:
        while(true) {
            z = false;
            while(true) {
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                File file0 = (File)object0;
                try {
                    String s1 = e.A(file0);
                    arrayList0.add(e.g.h(s1));
                    if(!z && !e.s(file0.getName())) {
                        break;
                    }
                }
                catch(IOException iOException0) {
                    g2.f.f().l("Could not add event to report for " + file0, iOException0);
                    continue;
                }
                z = true;
            }
        }
        if(arrayList0.isEmpty()) {
            g2.f.f().k("Could not parse event files for session " + s);
            return;
        }
        String s2 = k2.i.j(s, this.b);
        String s3 = e.F(this.b.o(s, "app-quality-session-id"));
        this.D(this.b.o(s, "report"), arrayList0, v, z, s2, s3);
    }

    private void D(File file0, List list0, long v, boolean z, String s, String s1) {
        File file1;
        try {
            h h0 = e.g;
            B b0 = h0.F(e.A(file0)).s(v, z, s).n(s1).p(C.a(list0));
            l2.B.e b$e0 = b0.l();
            if(b$e0 == null) {
                return;
            }
            g2.f.f().b("appQualitySessionId: " + s1);
            if(z) {
                String s2 = b$e0.i();
                file1 = this.b.j(s2);
            }
            else {
                String s3 = b$e0.i();
                file1 = this.b.l(s3);
            }
            e.G(file1, h0.G(b0));
            return;
        }
        catch(IOException iOException0) {
        }
        g2.f.f().l("Could not synthesize final report file for " + file0, iOException0);
    }

    private int E(String s, int v) {
        c c0 = (File file0, String s) -> e.t(file0, s);
        List list0 = this.b.p(s, c0);
        Collections.sort(list0, (File file0, File file1) -> e.x(file0, file1));
        return e.f(list0, v);
    }

    private static String F(File file0) {
        try {
            return e.A(file0);
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    private static void G(File file0, String s) {
        try(OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(new FileOutputStream(file0), e.e)) {
            outputStreamWriter0.write(s);
        }
    }

    private static void H(File file0, String s, long v) {
        try(OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(new FileOutputStream(file0), e.e)) {
            outputStreamWriter0.write(s);
            file0.setLastModified(v * 1000L);
        }
    }

    // 检测为 Lambda 实现
    public static boolean a(File file0, String s) [...]

    // 检测为 Lambda 实现
    public static boolean b(File file0, String s) [...]

    // 检测为 Lambda 实现
    public static int c(File file0, File file1) [...]

    // 检测为 Lambda 实现
    public static int d(File file0, File file1) [...]

    private SortedSet e(String s) {
        this.b.b();
        SortedSet sortedSet0 = this.p();
        if(s != null) {
            sortedSet0.remove(s);
        }
        if(sortedSet0.size() <= 8) {
            return sortedSet0;
        }
        while(sortedSet0.size() > 8) {
            String s1 = (String)sortedSet0.last();
            g2.f.f().b("Removing session over cap: " + s1);
            this.b.c(s1);
            sortedSet0.remove(s1);
        }
        return sortedSet0;
    }

    private static int f(List list0, int v) {
        int v1 = list0.size();
        for(Object object0: list0) {
            if(v1 <= v) {
                return v1;
            }
            f.s(((File)object0));
            --v1;
        }
        return v1;
    }

    private void g() {
        int v = this.c.b().a.b;
        List list0 = this.n();
        int v1 = list0.size();
        if(v1 <= v) {
            return;
        }
        for(Object object0: list0.subList(v, v1)) {
            ((File)object0).delete();
        }
    }

    private static long h(long v) [...] // Inlined contents

    public void i() {
        this.j(this.b.m());
        this.j(this.b.k());
        this.j(this.b.h());
    }

    private void j(List list0) {
        for(Object object0: list0) {
            ((File)object0).delete();
        }
    }

    public void k(String s, long v) {
        for(Object object0: this.e(s)) {
            g2.f.f().i("Finalizing report for session " + ((String)object0));
            this.C(((String)object0), v);
            this.b.c(((String)object0));
        }
        this.g();
    }

    public void l(String s, d b$d0, a b$a0) {
        File file0 = this.b.o(s, "report");
        g2.f.f().b("Writing native session report for " + s + " to file: " + file0);
        this.B(file0, b$d0, s, b$a0);
    }

    private static String m(int v, boolean z) {
        String s = String.format(Locale.US, "%010d", v);
        return z ? "event" + s + "_" : "event" + s + "";
    }

    private List n() {
        List list0 = new ArrayList();
        list0.addAll(this.b.k());
        list0.addAll(this.b.h());
        Collections.sort(list0, e.h);
        List list1 = this.b.m();
        Collections.sort(list1, e.h);
        list0.addAll(list1);
        return list0;
    }

    private static String o(String s) {
        return s.substring(0, e.f);
    }

    public SortedSet p() {
        return new TreeSet(this.b.d()).descendingSet();
    }

    public long q(String s) {
        return this.b.o(s, "start-time").lastModified();
    }

    // 去混淆评级： 低(30)
    public boolean r() {
        return !this.b.m().isEmpty() || !this.b.k().isEmpty() || !this.b.h().isEmpty();
    }

    // 去混淆评级： 低(20)
    private static boolean s(String s) {
        return s.startsWith("event") && s.endsWith("_");
    }

    // 去混淆评级： 低(20)
    private static boolean t(File file0, String s) {
        return s.startsWith("event") && !s.endsWith("_");
    }

    private static int u(File file0, File file1) {
        return file1.getName().compareTo(file0.getName());
    }

    private static boolean v(File file0, String s) {
        return s.startsWith("event");
    }

    public List w() {
        List list0 = this.n();
        List list1 = new ArrayList();
        for(Object object0: list0) {
            File file0 = (File)object0;
            try {
                String s = e.A(file0);
                ((ArrayList)list1).add(r.a(e.g.F(s), file0.getName(), file0));
            }
            catch(IOException iOException0) {
                g2.f.f().l("Could not load report file " + file0 + "; deleting", iOException0);
                file0.delete();
            }
        }
        return list1;
    }

    private static int x(File file0, File file1) {
        return e.o(file0.getName()).compareTo(e.o(file1.getName()));
    }

    public void y(l2.B.e.d b$e$d0, String s, boolean z) {
        int v = this.c.b().a.a;
        String s1 = e.g.i(b$e$d0);
        String s2 = e.m(this.a.getAndIncrement(), z);
        try {
            e.G(this.b.o(s, s2), s1);
            String s3 = this.d.d();
            if(s3 == null) {
                g2.f.f().k("Missing AQS session id for Crashlytics session " + s);
            }
            else {
                e.G(this.b.o(s, "app-quality-session-id"), s3);
            }
        }
        catch(IOException iOException0) {
            g2.f.f().l("Could not persist event for session " + s, iOException0);
        }
        this.E(s, v);
    }

    public void z(B b0) {
        l2.B.e b$e0 = b0.l();
        if(b$e0 == null) {
            g2.f.f().b("Could not get session for report");
            return;
        }
        String s = b$e0.i();
        try {
            String s1 = e.g.G(b0);
            e.G(this.b.o(s, "report"), s1);
            e.H(this.b.o(s, "start-time"), "", b$e0.l());
        }
        catch(IOException iOException0) {
            g2.f.f().c("Could not persist report for session " + s, iOException0);
        }
    }
}

