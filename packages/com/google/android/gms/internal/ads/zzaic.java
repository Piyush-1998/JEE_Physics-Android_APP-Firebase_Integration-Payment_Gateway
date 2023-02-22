package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaic implements zzduv<zzahx, ParcelFileDescriptor> {
    private final /* synthetic */ zzahr zzdfc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaic(zzahz zzahzVar, zzahr zzahrVar) {
        this.zzdfc = zzahrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzduv
    public final /* synthetic */ zzdvt<ParcelFileDescriptor> zzf(zzahx zzahxVar) throws Exception {
        zzbbq zzbbqVar = new zzbbq();
        zzahxVar.zza(this.zzdfc, new zzaib(this, zzbbqVar));
        return zzbbqVar;
    }
}
