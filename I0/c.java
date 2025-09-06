package i0;

import android.os.Build.VERSION;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import z3.k;

public abstract class c {
    public static final void a(ReadableByteChannel readableByteChannel0, FileChannel fileChannel0) {
        k.e(readableByteChannel0, "input");
        k.e(fileChannel0, "output");
        try {
            if(Build.VERSION.SDK_INT > 23) {
                fileChannel0.transferFrom(readableByteChannel0, 0L, 0x7FFFFFFFFFFFFFFFL);
            }
            else {
                InputStream inputStream0 = Channels.newInputStream(readableByteChannel0);
                OutputStream outputStream0 = Channels.newOutputStream(fileChannel0);
                byte[] arr_b = new byte[0x1000];
                int v1;
                while((v1 = inputStream0.read(arr_b)) > 0) {
                    outputStream0.write(arr_b, 0, v1);
                }
            }
            fileChannel0.force(false);
        }
        finally {
            readableByteChannel0.close();
            fileChannel0.close();
        }
    }
}

