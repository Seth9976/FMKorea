package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

abstract class m {
    static class a implements c {
        private final ByteBuffer a;

        a(ByteBuffer byteBuffer0) {
            this.a = byteBuffer0;
            byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        }

        @Override  // androidx.emoji2.text.m$c
        public int a() {
            return this.a.getInt();
        }

        @Override  // androidx.emoji2.text.m$c
        public void b(int v) {
            this.a.position(this.a.position() + v);
        }

        @Override  // androidx.emoji2.text.m$c
        public long c() {
            return m.c(this.a.getInt());
        }

        @Override  // androidx.emoji2.text.m$c
        public long getPosition() {
            return (long)this.a.position();
        }

        @Override  // androidx.emoji2.text.m$c
        public int readUnsignedShort() {
            return m.d(this.a.getShort());
        }
    }

    static class b {
        private final long a;
        private final long b;

        b(long v, long v1) {
            this.a = v;
            this.b = v1;
        }

        long a() {
            return this.a;
        }
    }

    interface c {
        int a();

        void b(int arg1);

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c m$c0) {
        long v3;
        m$c0.b(4);
        int v = m$c0.readUnsignedShort();
        if(v > 100) {
            throw new IOException("Cannot read metadata.");
        }
        m$c0.b(6);
        int v1 = 0;
        for(int v2 = 0; true; ++v2) {
            v3 = -1L;
            if(v2 >= v) {
                break;
            }
            int v4 = m$c0.a();
            m$c0.b(4);
            v3 = m$c0.c();
            m$c0.b(4);
            if(0x6D657461 == v4) {
                break;
            }
        }
        if(v3 != -1L) {
            m$c0.b(((int)(v3 - m$c0.getPosition())));
            m$c0.b(12);
            long v5 = m$c0.c();
            while(((long)v1) < v5) {
                int v6 = m$c0.a();
                long v7 = m$c0.c();
                long v8 = m$c0.c();
                if(0x456D6A69 != v6 && 1701669481 != v6) {
                    ++v1;
                    continue;
                }
                return new b(v7 + v3, v8);
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static P.b b(ByteBuffer byteBuffer0) {
        ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
        byteBuffer1.position(((int)m.a(new a(byteBuffer1)).a()));
        return P.b.h(byteBuffer1);
    }

    static long c(int v) {
        return ((long)v) & 0xFFFFFFFFL;
    }

    static int d(short v) {
        return v & 0xFFFF;
    }
}

