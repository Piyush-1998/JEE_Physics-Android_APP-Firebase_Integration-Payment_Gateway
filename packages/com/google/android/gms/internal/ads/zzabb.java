package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzabb {
    public static boolean zza(zzabk zzabkVar, zzabi zzabiVar, String... strArr) {
        if (zzabkVar == null || zzabiVar == null || !zzabkVar.zzcys || zzabiVar == null) {
            return false;
        }
        return zzabkVar.zza(zzabiVar, com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime(), strArr);
    }

    public static zzabi zzb(zzabk zzabkVar) {
        if (zzabkVar == null) {
            return null;
        }
        return zzabkVar.zzex(com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime());
    }
}
