package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzelg {
    public abstract void zzik(String str);

    public static zzelg zzn(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzekz(cls.getSimpleName());
        }
        return new zzelb(cls.getSimpleName());
    }
}
