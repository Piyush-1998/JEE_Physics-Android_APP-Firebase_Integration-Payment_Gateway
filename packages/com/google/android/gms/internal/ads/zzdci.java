package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdci implements zzelo<zzdcg> {
    private final zzelx<zzdvw> zzerr;

    private zzdci(zzelx<zzdvw> zzelxVar) {
        this.zzerr = zzelxVar;
    }

    public static zzdci zzao(zzelx<zzdvw> zzelxVar) {
        return new zzdci(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdcg(this.zzerr.get());
    }
}
