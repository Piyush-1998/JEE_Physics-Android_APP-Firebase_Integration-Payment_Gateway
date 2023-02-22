package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbna implements zzelo<String> {
    public static zzbna zzahn() {
        zzbna zzbnaVar;
        zzbnaVar = zzbmz.zzfnu;
        return zzbnaVar;
    }

    public static String zzaho() {
        return (String) zzelu.zza("app_open_ad", "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzaho();
    }
}
