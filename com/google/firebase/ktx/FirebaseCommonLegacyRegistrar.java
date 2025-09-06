package com.google.firebase.ktx;

import J2.h;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import m3.o;

@Keep
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return o.e(h.b("fire-core-ktx", "20.4.2"));
    }
}

