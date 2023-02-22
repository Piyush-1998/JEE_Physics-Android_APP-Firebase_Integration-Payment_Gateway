package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcdn implements zzelo<zzccv> {
    private final zzcdh zzfyt;

    private zzcdn(zzcdh zzcdhVar) {
        this.zzfyt = zzcdhVar;
    }

    public static zzcdn zza(zzcdh zzcdhVar) {
        return new zzcdn(zzcdhVar);
    }

    public static zzccv zzb(zzcdh zzcdhVar) {
        return (zzccv) zzelu.zza(zzcdhVar.zzamj(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzb(this.zzfyt);
    }
}
