package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zztw;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzckp implements zzelo<Set<zzbys<zzdpl>>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<String> zzgeo;
    private final zzelx<Map<zzdpg, zzcku>> zzgep;

    public zzckp(zzelx<String> zzelxVar, zzelx<Context> zzelxVar2, zzelx<Executor> zzelxVar3, zzelx<Map<zzdpg, zzcku>> zzelxVar4) {
        this.zzgeo = zzelxVar;
        this.zzert = zzelxVar2;
        this.zzerr = zzelxVar3;
        this.zzgep = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        Set emptySet;
        final String str = this.zzgeo.get();
        Context context = this.zzert.get();
        Executor executor = this.zzerr.get();
        Map<zzdpg, zzcku> map = this.zzgep.get();
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzctk)).booleanValue()) {
            zzto zztoVar = new zzto(new zztt(context));
            zztoVar.zza(new zztn(str) { // from class: com.google.android.gms.internal.ads.zzckr
                private final String zzdgb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdgb = str;
                }

                @Override // com.google.android.gms.internal.ads.zztn
                public final void zza(zztw.zzi.zza zzaVar) {
                    zzaVar.zzcb(this.zzdgb);
                }
            });
            emptySet = Collections.singleton(new zzbys(new zzcks(zztoVar, map), executor));
        } else {
            emptySet = Collections.emptySet();
        }
        return (Set) zzelu.zza(emptySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}
