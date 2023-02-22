package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zztw;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcjp implements zzelo<zzto> {
    private final zzelx<Context> zzert;
    private final zzelx<zztw.zza.EnumC0020zza> zzfne;
    private final zzelx<String> zzfsc;
    private final zzelx<zzbbg> zzfsr;
    private final zzelx<String> zzgec;

    private zzcjp(zzelx<Context> zzelxVar, zzelx<String> zzelxVar2, zzelx<zzbbg> zzelxVar3, zzelx<zztw.zza.EnumC0020zza> zzelxVar4, zzelx<String> zzelxVar5) {
        this.zzert = zzelxVar;
        this.zzfsc = zzelxVar2;
        this.zzfsr = zzelxVar3;
        this.zzfne = zzelxVar4;
        this.zzgec = zzelxVar5;
    }

    public static zzcjp zze(zzelx<Context> zzelxVar, zzelx<String> zzelxVar2, zzelx<zzbbg> zzelxVar3, zzelx<zztw.zza.EnumC0020zza> zzelxVar4, zzelx<String> zzelxVar5) {
        return new zzcjp(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        final String str = this.zzfsc.get();
        zzbbg zzbbgVar = this.zzfsr.get();
        final zztw.zza.EnumC0020zza enumC0020zza = this.zzfne.get();
        final String str2 = this.zzgec.get();
        zzto zztoVar = new zzto(new zztt(this.zzert.get()));
        final zztw.zzu zzuVar = (zztw.zzu) ((zzegp) zztw.zzu.zzor().zzcq(zzbbgVar.zzedq).zzcr(zzbbgVar.zzedr).zzcs(zzbbgVar.zzeds ? 0 : 2).zzbfx());
        zztoVar.zza(new zztn(enumC0020zza, str, zzuVar, str2) { // from class: com.google.android.gms.internal.ads.zzcjq
            private final String zzdft;
            private final zztw.zza.EnumC0020zza zzged;
            private final zztw.zzu zzgee;
            private final String zzgef;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzged = enumC0020zza;
                this.zzdft = str;
                this.zzgee = zzuVar;
                this.zzgef = str2;
            }

            @Override // com.google.android.gms.internal.ads.zztn
            public final void zza(zztw.zzi.zza zzaVar) {
                zztw.zza.EnumC0020zza enumC0020zza2 = this.zzged;
                String str3 = this.zzdft;
                zztw.zzu zzuVar2 = this.zzgee;
                zzaVar.zza(zzaVar.zznx().zzbfk().zzb(enumC0020zza2)).zza(zzaVar.zznw().zzbfk().zzbz(str3).zza(zzuVar2)).zzcb(this.zzgef);
            }
        });
        return (zzto) zzelu.zza(zztoVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
