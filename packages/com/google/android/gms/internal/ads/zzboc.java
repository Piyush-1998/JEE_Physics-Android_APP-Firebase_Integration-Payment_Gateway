package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzboc implements zzelo<zzbys<zzbwm>> {
    private final zzbnl zzfoq;
    private final zzelx<zzbvb> zzfot;

    public zzboc(zzbnl zzbnlVar, zzelx<zzbvb> zzelxVar) {
        this.zzfoq = zzbnlVar;
        this.zzfot = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        final zzbvb zzbvbVar = this.zzfot.get();
        return (zzbys) zzelu.zza(new zzbys(new zzbwm(zzbvbVar) { // from class: com.google.android.gms.internal.ads.zzbnn
            private final zzbvb zzfom;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfom = zzbvbVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwm
            public final void zzaia() {
                this.zzfom.zzajn();
            }
        }, zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
