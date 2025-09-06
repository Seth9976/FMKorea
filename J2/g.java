package j2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import l2.B.d.b;

class g implements B {
    private final byte[] a;
    private final String b;
    private final String c;

    g(String s, String s1, byte[] arr_b) {
        this.b = s;
        this.c = s1;
        this.a = arr_b;
    }

    @Override  // j2.B
    public String a() {
        return this.c;
    }

    @Override  // j2.B
    public InputStream b() {
        return this.e() ? null : new ByteArrayInputStream(this.a);
    }

    @Override  // j2.B
    public b c() {
        byte[] arr_b = this.d();
        return arr_b == null ? null : b.a().b(arr_b).c(this.b).a();
    }

    private byte[] d() {
        if(this.e()) {
            return null;
        }
        try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(); GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0)) {
            gZIPOutputStream0.write(this.a);
            gZIPOutputStream0.finish();
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    private boolean e() {
        return this.a == null || this.a.length == 0;
    }
}

