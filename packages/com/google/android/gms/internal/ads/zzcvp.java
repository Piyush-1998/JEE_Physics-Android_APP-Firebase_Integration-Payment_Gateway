package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbuc;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcvp<AdT, AdapterT, ListenerT extends zzbuc> implements zzcre<AdT> {
    private final zzcrf<AdapterT, ListenerT> zzfkl;
    private final zzdpf zzfqo;
    private final zzcrh<AdT, AdapterT, ListenerT> zzgoh;
    private final zzdvw zzgoi;

    public zzcvp(zzdpf zzdpfVar, zzdvw zzdvwVar, zzcrf<AdapterT, ListenerT> zzcrfVar, zzcrh<AdT, AdapterT, ListenerT> zzcrhVar) {
        this.zzfqo = zzdpfVar;
        this.zzgoi = zzdvwVar;
        this.zzgoh = zzcrhVar;
        this.zzfkl = zzcrfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final boolean zza(zzdlj zzdljVar, zzdkx zzdkxVar) {
        return !zzdkxVar.zzhap.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final zzdvt<AdT> zzb(final zzdlj zzdljVar, final zzdkx zzdkxVar) {
        final zzcrg<AdapterT, ListenerT> zzcrgVar;
        Iterator<String> it = zzdkxVar.zzhap.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzcrgVar = null;
                break;
            }
            try {
                zzcrgVar = this.zzfkl.zzf(it.next(), zzdkxVar.zzhar);
                break;
            } catch (zzdlr unused) {
            }
        }
        if (zzcrgVar == null) {
            return zzdvl.immediateFailedFuture(new zzctt("unable to instantiate mediation adapter class"));
        }
        zzbbq zzbbqVar = new zzbbq();
        zzcrgVar.zzglc.zza(new zzcvu(this, zzcrgVar, zzbbqVar));
        if (zzdkxVar.zzduo) {
            Bundle bundle = zzdljVar.zzhbp.zzfqn.zzhbu.zzchc;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        return this.zzfqo.zzu(zzdpg.ADAPTER_LOAD_AD_SYN).zza(new zzdop(this, zzdljVar, zzdkxVar, zzcrgVar) { // from class: com.google.android.gms.internal.ads.zzcvs
            private final zzdkx zzfoo;
            private final zzdlj zzgbj;
            private final zzcrg zzgod;
            private final zzcvp zzgoj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgoj = this;
                this.zzgbj = zzdljVar;
                this.zzfoo = zzdkxVar;
                this.zzgod = zzcrgVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdop
            public final void run() {
                this.zzgoj.zzd(this.zzgbj, this.zzfoo, this.zzgod);
            }
        }, this.zzgoi).zzw(zzdpg.ADAPTER_LOAD_AD_ACK).zze(zzbbqVar).zzw(zzdpg.ADAPTER_WRAP_ADAPTER).zzb(new zzdoq(this, zzdljVar, zzdkxVar, zzcrgVar) { // from class: com.google.android.gms.internal.ads.zzcvr
            private final zzdkx zzfoo;
            private final zzdlj zzgbj;
            private final zzcrg zzgod;
            private final zzcvp zzgoj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgoj = this;
                this.zzgbj = zzdljVar;
                this.zzfoo = zzdkxVar;
                this.zzgod = zzcrgVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdoq
            public final Object apply(Object obj) {
                return this.zzgoj.zza(this.zzgbj, this.zzfoo, this.zzgod, (Void) obj);
            }
        }).zzauz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg zzcrgVar, Void r4) throws Exception {
        return this.zzgoh.zzb(zzdljVar, zzdkxVar, zzcrgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg zzcrgVar) throws Exception {
        this.zzgoh.zza(zzdljVar, zzdkxVar, zzcrgVar);
    }
}
