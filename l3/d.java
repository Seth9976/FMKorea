package l3;

import java.io.Serializable;

public final class d implements Serializable, h {
    private final Object f;

    public d(Object object0) {
        this.f = object0;
    }

    @Override  // l3.h
    public Object getValue() {
        return this.f;
    }

    @Override  // l3.h
    public boolean isInitialized() {
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getValue());
    }
}

