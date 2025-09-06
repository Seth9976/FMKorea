package k2;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

class e implements Closeable {
    static class b {
        final int a;
        final int b;
        static final b c;

        static {
            b.c = new b(0, 0);
        }

        b(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        @Override
        public String toString() {
            return this.getClass().getSimpleName() + "[position = " + this.a + ", length = " + this.b + "]";
        }
    }

    final class c extends InputStream {
        private int f;
        private int g;
        final e h;

        private c(b e$b0) {
            this.f = e0.c0(e$b0.a + 4);
            this.g = e$b0.b;
        }

        c(b e$b0, a e$a0) {
            this(e$b0);
        }

        @Override
        public int read() {
            if(this.g == 0) {
                return -1;
            }
            e.this.f.seek(((long)this.f));
            int v = e.this.f.read();
            this.f = e.this.c0(this.f + 1);
            --this.g;
            return v;
        }

        @Override
        public int read(byte[] arr_b, int v, int v1) {
            e.K(arr_b, "buffer");
            if((v | v1) < 0 || v1 > arr_b.length - v) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int v2 = this.g;
            if(v2 > 0) {
                if(v1 > v2) {
                    v1 = v2;
                }
                e.this.U(this.f, arr_b, v, v1);
                this.f = e.this.c0(this.f + v1);
                this.g -= v1;
                return v1;
            }
            return -1;
        }
    }

    public interface d {
        void a(InputStream arg1, int arg2);
    }

    private final RandomAccessFile f;
    int g;
    private int h;
    private b i;
    private b j;
    private final byte[] k;
    private static final Logger l;

    static {
        e.l = Logger.getLogger("k2.e");
    }

    public e(File file0) {
        this.k = new byte[16];
        if(!file0.exists()) {
            e.F(file0);
        }
        this.f = e.L(file0);
        this.N();
    }

    private static void F(File file0) {
        File file1 = new File(file0.getPath() + ".tmp");
        try(RandomAccessFile randomAccessFile0 = e.L(file1)) {
            randomAccessFile0.setLength(0x1000L);
            randomAccessFile0.seek(0L);
            byte[] arr_b = new byte[16];
            e.g0(arr_b, new int[]{0x1000, 0, 0, 0});
            randomAccessFile0.write(arr_b);
        }
        if(!file1.renameTo(file0)) {
            throw new IOException("Rename failed!");
        }
    }

    public boolean J() {
        synchronized(this) {
        }
        return this.h == 0;
    }

    private static Object K(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }

    private static RandomAccessFile L(File file0) {
        return new RandomAccessFile(file0, "rwd");
    }

    private b M(int v) {
        if(v == 0) {
            return b.c;
        }
        this.f.seek(((long)v));
        return new b(v, this.f.readInt());
    }

    private void N() {
        this.f.seek(0L);
        this.f.readFully(this.k);
        int v = e.O(this.k, 0);
        this.g = v;
        if(((long)v) > this.f.length()) {
            throw new IOException("File is truncated. Expected length: " + this.g + ", Actual length: " + this.f.length());
        }
        this.h = e.O(this.k, 4);
        int v1 = e.O(this.k, 8);
        int v2 = e.O(this.k, 12);
        this.i = this.M(v1);
        this.j = this.M(v2);
    }

    private static int O(byte[] arr_b, int v) {
        return ((arr_b[v] & 0xFF) << 24) + ((arr_b[v + 1] & 0xFF) << 16) + ((arr_b[v + 2] & 0xFF) << 8) + (arr_b[v + 3] & 0xFF);
    }

    private int Q() {
        return this.g - this.Z();
    }

    public void R() {
        synchronized(this) {
            if(!this.J()) {
                if(this.h == 1) {
                    this.t();
                }
                else {
                    int v1 = this.c0(this.i.a + 4 + this.i.b);
                    this.U(v1, this.k, 0, 4);
                    int v2 = e.O(this.k, 0);
                    this.e0(this.g, this.h - 1, v1, this.j.a);
                    --this.h;
                    this.i = new b(v1, v2);
                }
                return;
            }
        }
        throw new NoSuchElementException();
    }

    private void U(int v, byte[] arr_b, int v1, int v2) {
        int v3 = this.c0(v);
        int v4 = this.g;
        if(v3 + v2 <= v4) {
            this.f.seek(((long)v3));
            this.f.readFully(arr_b, v1, v2);
            return;
        }
        int v5 = v4 - v3;
        this.f.seek(((long)v3));
        this.f.readFully(arr_b, v1, v5);
        this.f.seek(16L);
        this.f.readFully(arr_b, v1 + v5, v2 - v5);
    }

    private void V(int v, byte[] arr_b, int v1, int v2) {
        int v3 = this.c0(v);
        int v4 = this.g;
        if(v3 + v2 <= v4) {
            this.f.seek(((long)v3));
            this.f.write(arr_b, v1, v2);
            return;
        }
        int v5 = v4 - v3;
        this.f.seek(((long)v3));
        this.f.write(arr_b, v1, v5);
        this.f.seek(16L);
        this.f.write(arr_b, v1 + v5, v2 - v5);
    }

    private void Y(int v) {
        this.f.setLength(((long)v));
        this.f.getChannel().force(true);
    }

    public int Z() {
        if(this.h == 0) {
            return 16;
        }
        int v = this.j.a;
        int v1 = this.i.a;
        return v < v1 ? v + 4 + this.j.b + this.g - v1 : v - v1 + 4 + this.j.b + 16;
    }

    private int c0(int v) {
        return v < this.g ? v : v + 16 - this.g;
    }

    @Override
    public void close() {
        synchronized(this) {
            this.f.close();
        }
    }

    private void e0(int v, int v1, int v2, int v3) {
        e.g0(this.k, new int[]{v, v1, v2, v3});
        this.f.seek(0L);
        this.f.write(this.k);
    }

    private static void f0(byte[] arr_b, int v, int v1) {
        arr_b[v] = (byte)(v1 >> 24);
        arr_b[v + 1] = (byte)(v1 >> 16);
        arr_b[v + 2] = (byte)(v1 >> 8);
        arr_b[v + 3] = (byte)v1;
    }

    private static void g0(byte[] arr_b, int[] arr_v) {
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            e.f0(arr_b, v1, arr_v[v]);
            v1 += 4;
        }
    }

    public void j(byte[] arr_b) {
        this.r(arr_b, 0, arr_b.length);
    }

    public void r(byte[] arr_b, int v, int v1) {
        synchronized(this) {
            e.K(arr_b, "buffer");
            if((v | v1) >= 0 && v1 <= arr_b.length - v) {
                this.v(v1);
                boolean z = this.J();
                b e$b0 = new b((z ? 16 : this.c0(this.j.a + 4 + this.j.b)), v1);
                e.f0(this.k, 0, v1);
                this.V(e$b0.a, this.k, 0, 4);
                this.V(e$b0.a + 4, arr_b, v, v1);
                this.e0(this.g, this.h + 1, (z ? e$b0.a : this.i.a), e$b0.a);
                this.j = e$b0;
                ++this.h;
                if(z) {
                    this.i = e$b0;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public void t() {
        synchronized(this) {
            this.e0(0x1000, 0, 0, 0);
            this.h = 0;
            this.i = b.c;
            this.j = b.c;
            if(this.g > 0x1000) {
                this.Y(0x1000);
            }
            this.g = 0x1000;
        }
    }

    @Override
    public String toString() {
        class a implements d {
            boolean a;
            final StringBuilder b;
            final e c;

            a(StringBuilder stringBuilder0) {
                this.b = stringBuilder0;
                super();
                this.a = true;
            }

            @Override  // k2.e$d
            public void a(InputStream inputStream0, int v) {
                if(this.a) {
                    this.a = false;
                }
                else {
                    this.b.append(", ");
                }
                this.b.append(v);
            }
        }

        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.getClass().getSimpleName());
        stringBuilder0.append('[');
        stringBuilder0.append("fileLength=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", size=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", first=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", last=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", element lengths=[");
        try {
            this.w(new a(this, stringBuilder0));
        }
        catch(IOException iOException0) {
            e.l.log(Level.WARNING, "read error", iOException0);
        }
        stringBuilder0.append("]]");
        return stringBuilder0.toString();
    }

    private void v(int v) {
        int v1 = this.Q();
        if(v1 >= v + 4) {
            return;
        }
        int v2 = this.g;
        do {
            v1 += v2;
            v2 <<= 1;
        }
        while(v1 < v + 4);
        this.Y(v2);
        int v3 = this.c0(this.j.a + 4 + this.j.b);
        if(v3 < this.i.a) {
            FileChannel fileChannel0 = this.f.getChannel();
            fileChannel0.position(((long)this.g));
            if(fileChannel0.transferTo(16L, ((long)(v3 - 4)), fileChannel0) != ((long)(v3 - 4))) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int v4 = this.j.a;
        int v5 = this.i.a;
        if(v4 < v5) {
            int v6 = this.g + v4 - 16;
            this.e0(v2, this.h, v5, v6);
            this.j = new b(v6, this.j.b);
        }
        else {
            this.e0(v2, this.h, v5, v4);
        }
        this.g = v2;
    }

    public void w(d e$d0) {
        synchronized(this) {
            int v1 = this.i.a;
            for(int v2 = 0; v2 < this.h; ++v2) {
                b e$b0 = this.M(v1);
                e$d0.a(new c(this, e$b0, null), e$b0.b);
                v1 = this.c0(e$b0.a + 4 + e$b0.b);
            }
        }
    }
}

