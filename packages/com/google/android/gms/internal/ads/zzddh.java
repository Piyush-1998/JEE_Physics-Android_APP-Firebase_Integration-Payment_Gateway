package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzddh implements zzelo<zzddf> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Bundle> zzgui;

    private zzddh(zzelx<zzdvw> zzelxVar, zzelx<Bundle> zzelxVar2) {
        this.zzerr = zzelxVar;
        this.zzgui = zzelxVar2;
    }

    public static zzddh zzbe(zzelx<zzdvw> zzelxVar, zzelx<Bundle> zzelxVar2) {
        return new zzddh(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzddf(this.zzerr.get(), this.zzgui.get());
    }
}
