package j2;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import l2.B.d.b;

class x implements B {
    private final File a;
    private final String b;
    private final String c;

    x(String s, String s1, File file0) {
        this.b = s;
        this.c = s1;
        this.a = file0;
    }

    @Override  // j2.B
    public String a() {
        return this.c;
    }

    @Override  // j2.B
    public InputStream b() {
        if(this.a.exists() && this.a.isFile()) {
            try {
                return new FileInputStream(this.a);
            }
            catch(FileNotFoundException unused_ex) {
            }
        }
        return null;
    }

    @Override  // j2.B
    public b c() {
        byte[] arr_b = this.d();
        return arr_b == null ? null : b.a().b(arr_b).c(this.b).a();
    }

    private byte[] d() {
        try {
            byte[] arr_b = new byte[0x2000];
            try(InputStream inputStream0 = this.b(); ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(); GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0)) {
                if(inputStream0 == null) {
                    return null;
                }
                int v;
                while((v = inputStream0.read(arr_b)) > 0) {
                    gZIPOutputStream0.write(arr_b, 0, v);
                }
                gZIPOutputStream0.finish();
                return byteArrayOutputStream0.toByteArray();
            }
        }
        catch(IOException unused_ex) {
            return null;
        }
    }
}

