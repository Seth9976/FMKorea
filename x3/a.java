package x3;

import E3.b;
import z3.d;
import z3.k;

public abstract class a {
    public static final Class a(b b0) {
        k.e(b0, "<this>");
        Class class0 = ((d)b0).b();
        k.c(class0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return class0;
    }

    public static final Class b(b b0) {
        k.e(b0, "<this>");
        Class class0 = ((d)b0).b();
        if(!class0.isPrimitive()) {
            k.c(class0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return class0;
        }
        switch(class0.getName()) {
            case "boolean": {
                class0 = Boolean.class;
                break;
            }
            case "byte": {
                class0 = Byte.class;
                break;
            }
            case "char": {
                class0 = Character.class;
                break;
            }
            case "double": {
                class0 = Double.class;
                break;
            }
            case "float": {
                class0 = Float.class;
                break;
            }
            case "int": {
                class0 = Integer.class;
                break;
            }
            case "long": {
                class0 = Long.class;
                break;
            }
            case "short": {
                class0 = Short.class;
                break;
            }
            case "void": {
                class0 = Void.class;
            }
        }
        k.c(class0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return class0;
    }
}

