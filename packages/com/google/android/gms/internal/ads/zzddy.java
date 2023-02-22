package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzddy implements zzden<zzddz> {
    private final zzbbg zzbpa;
    private final zzdvw zzgay;
    private final Context zzvr;

    public zzddy(zzdvw zzdvwVar, Context context, zzbbg zzbbgVar) {
        this.zzgay = zzdvwVar;
        this.zzvr = context;
        this.zzbpa = zzbbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzddz> zzaqs() {
        return this.zzgay.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdeb
            private final zzddy zzguy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzguy = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzguy.zzarg();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddz zzarg() throws Exception {
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzvr).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzp.zzkp();
        boolean zzaz = zzayh.zzaz(this.zzvr);
        String str = this.zzbpa.zzbra;
        com.google.android.gms.ads.internal.zzp.zzkr();
        boolean zzxu = zzaym.zzxu();
        com.google.android.gms.ads.internal.zzp.zzkp();
        return new zzddz(isCallerInstantApp, zzaz, str, zzxu, zzayh.zzaw(this.zzvr), DynamiteModule.getRemoteVersion(this.zzvr, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(this.zzvr, ModuleDescriptor.MODULE_ID));
    }
}
