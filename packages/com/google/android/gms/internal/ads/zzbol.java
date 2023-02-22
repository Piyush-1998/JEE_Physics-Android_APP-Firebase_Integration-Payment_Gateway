package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbol implements zzelo<Boolean> {
    private final zzelx<zzdln> zzfos;

    public zzbol(zzelx<zzdln> zzelxVar) {
        this.zzfos = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        boolean booleanValue;
        if (this.zzfos.get().zzasp() != null) {
            booleanValue = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcos)).booleanValue();
        } else {
            booleanValue = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcup)).booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }
}
