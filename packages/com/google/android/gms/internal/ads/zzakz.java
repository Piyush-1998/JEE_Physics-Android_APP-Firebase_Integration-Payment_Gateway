package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzakz implements zzbbu<zzali> {
    private final /* synthetic */ zzakx zzdhf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakz(zzakx zzakxVar) {
        this.zzdhf = zzakxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final /* synthetic */ void zzh(zzali zzaliVar) {
        zzalb zzalbVar;
        zzaxy.zzei("Releasing engine reference.");
        zzalbVar = this.zzdhf.zzdhd;
        zzalbVar.zzth();
    }
}
