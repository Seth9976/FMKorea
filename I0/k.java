package I0;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class k {
    public static void a(Closeable closeable0) {
        if(closeable0 == null) {
            return;
        }
        try {
            closeable0.close();
        }
        catch(IOException iOException0) {
            g.a().c("co.median.median_core.IOUtils", iOException0.toString(), iOException0);
        }
    }

    public static void b(InputStream inputStream0, OutputStream outputStream0) {
        byte[] arr_b = new byte[0x400];
        int v;
        while((v = inputStream0.read(arr_b)) > 0) {
            outputStream0.write(arr_b, 0, v);
        }
    }
}

