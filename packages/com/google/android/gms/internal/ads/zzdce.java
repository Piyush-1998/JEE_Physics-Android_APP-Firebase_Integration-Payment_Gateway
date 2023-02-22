package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdce implements zzelo<zzdcc> {
    private final zzelx<zzdvw> zzerr;

    private zzdce(zzelx<zzdvw> zzelxVar) {
        this.zzerr = zzelxVar;
    }

    public static zzdce zzan(zzelx<zzdvw> zzelxVar) {
        return new zzdce(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdcc(this.zzerr.get());
    }
}
