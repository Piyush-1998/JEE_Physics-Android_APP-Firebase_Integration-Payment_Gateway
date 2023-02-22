package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdsy {
    @NullableDecl
    private static final Object zzhmv;
    @NullableDecl
    private static final Method zzhmw;
    @NullableDecl
    private static final Method zzhmx;

    public static void zzh(Throwable th) {
        zzdsv.checkNotNull(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @Deprecated
    public static RuntimeException zzi(Throwable th) {
        zzh(th);
        throw new RuntimeException(th);
    }

    public static String zza(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        zzeeo.zza(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @NullableDecl
    private static Object zzawk() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    private static Method zzawl() {
        try {
            Method zza = zza("getStackTraceDepth", Throwable.class);
            if (zza == null) {
                return null;
            }
            zza.invoke(zzawk(), new Throwable());
            return zza;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @NullableDecl
    private static Method zza(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Object zzawk = zzawk();
        zzhmv = zzawk;
        zzhmw = zzawk == null ? null : zza("getStackTraceElement", Throwable.class, Integer.TYPE);
        zzhmx = zzhmv != null ? zzawl() : null;
    }
}
