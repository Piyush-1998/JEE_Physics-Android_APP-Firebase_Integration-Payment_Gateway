package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzdsu {
    private static final Logger logger = Logger.getLogger(zzdsu.class.getName());
    private static final zzdsr zzhlr = new zza();

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    static final class zza {
        private zza() {
        }
    }

    private zzdsu() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzhi(@NullableDecl String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzhh(@NullableDecl String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String emptyToNull(@NullableDecl String str) {
        if (zzhh(str)) {
            return null;
        }
        return str;
    }
}
