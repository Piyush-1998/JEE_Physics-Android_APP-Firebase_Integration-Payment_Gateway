package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdef implements zzelo<zzded> {
    private final zzelx<zzdjf> zzfrt;

    private zzdef(zzelx<zzdjf> zzelxVar) {
        this.zzfrt = zzelxVar;
    }

    public static zzdef zzaq(zzelx<zzdjf> zzelxVar) {
        return new zzdef(zzelxVar);
    }

    public static zzded zzb(zzdjf zzdjfVar) {
        return new zzded(zzdjfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzb(this.zzfrt.get());
    }
}
