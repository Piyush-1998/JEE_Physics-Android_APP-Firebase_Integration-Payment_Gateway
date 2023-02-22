package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdod implements zzelo<zzdvw> {
    public static zzdod zzauj() {
        zzdod zzdodVar;
        zzdodVar = zzdog.zzhgi;
        return zzdodVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        zzdvw zzdvwVar;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcuu)).booleanValue()) {
            zzdvwVar = zzbbi.zzedw;
        } else {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcut)).booleanValue()) {
                zzdvwVar = zzbbi.zzedu;
            } else {
                zzdvwVar = zzbbi.zzedy;
            }
        }
        return (zzdvw) zzelu.zza(zzdvwVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
