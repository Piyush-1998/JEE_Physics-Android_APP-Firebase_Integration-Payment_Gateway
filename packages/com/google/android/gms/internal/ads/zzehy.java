package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzehy {
    private static final zzehw zzihx = zzbhb();
    private static final zzehw zzihy = new zzehv();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzehw zzbgz() {
        return zzihx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzehw zzbha() {
        return zzihy;
    }

    private static zzehw zzbhb() {
        try {
            return (zzehw) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
