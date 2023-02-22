package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzegf {
    private static final zzege<?> zzicq = new zzegg();
    private static final zzege<?> zzicr = zzbez();

    private static zzege<?> zzbez() {
        try {
            return (zzege) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzege<?> zzbfa() {
        return zzicq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzege<?> zzbfb() {
        zzege<?> zzegeVar = zzicr;
        if (zzegeVar != null) {
            return zzegeVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
