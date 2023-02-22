package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzbzw {
    private final zzbfq zzdgc;
    private final zzcaz zzfuz;

    public zzbzw(zzcaz zzcazVar) {
        this(zzcazVar, null);
    }

    public zzbzw(zzcaz zzcazVar, zzbfq zzbfqVar) {
        this.zzfuz = zzcazVar;
        this.zzdgc = zzbfqVar;
    }

    public final zzcaz zzakm() {
        return this.zzfuz;
    }

    public final zzbfq zzahe() {
        return this.zzdgc;
    }

    public final View zzakn() {
        zzbfq zzbfqVar = this.zzdgc;
        if (zzbfqVar != null) {
            return zzbfqVar.getWebView();
        }
        return null;
    }

    public final View zzako() {
        zzbfq zzbfqVar = this.zzdgc;
        if (zzbfqVar == null) {
            return null;
        }
        return zzbfqVar.getWebView();
    }

    public Set<zzbys<zzbsu>> zzb(zzbru zzbruVar) {
        return Collections.singleton(zzbys.zzb(zzbruVar, zzbbi.zzedz));
    }

    public Set<zzbys<zzbyh>> zzc(zzbru zzbruVar) {
        return Collections.singleton(zzbys.zzb(zzbruVar, zzbbi.zzedz));
    }

    public final zzbys<zzbwm> zzb(Executor executor) {
        final zzbfq zzbfqVar = this.zzdgc;
        return new zzbys<>(new zzbwm(zzbfqVar) { // from class: com.google.android.gms.internal.ads.zzbzy
            private final zzbfq zzepi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzepi = zzbfqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwm
            public final void zzaia() {
                zzbfq zzbfqVar2 = this.zzepi;
                if (zzbfqVar2.zzaba() != null) {
                    zzbfqVar2.zzaba().close();
                }
            }
        }, executor);
    }
}
