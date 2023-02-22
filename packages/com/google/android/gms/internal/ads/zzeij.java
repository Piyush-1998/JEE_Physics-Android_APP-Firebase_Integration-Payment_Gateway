package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzeij {
    private static final zzeih zziir = zzbhe();
    private static final zzeih zziis = new zzeik();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeih zzbhc() {
        return zziir;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeih zzbhd() {
        return zziis;
    }

    private static zzeih zzbhe() {
        try {
            return (zzeih) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
