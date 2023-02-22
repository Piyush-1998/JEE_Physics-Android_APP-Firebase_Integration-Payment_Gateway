package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdpi extends zzbxe<zzdpl> implements zzdpd<zzdpg> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpi(Set<zzbys<zzdpl>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdpd
    public final void zza(final zzdos<zzdpg, ?> zzdosVar) {
        zza(new zzbxg(zzdosVar) { // from class: com.google.android.gms.internal.ads.zzdph
            private final zzdos zzhib;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhib = zzdosVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                zzdos zzdosVar2 = this.zzhib;
                ((zzdpl) obj).zza((zzdpg) zzdosVar2.zzaux(), zzdosVar2.zzauy());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdpd
    public final void zzb(final zzdos<zzdpg, ?> zzdosVar) {
        zza(new zzbxg(zzdosVar) { // from class: com.google.android.gms.internal.ads.zzdpk
            private final zzdos zzhib;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhib = zzdosVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                zzdos zzdosVar2 = this.zzhib;
                ((zzdpl) obj).zzb((zzdpg) zzdosVar2.zzaux(), zzdosVar2.zzauy());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdpd
    public final void zza(final zzdos<zzdpg, ?> zzdosVar, final Throwable th) {
        zza(new zzbxg(zzdosVar, th) { // from class: com.google.android.gms.internal.ads.zzdpj
            private final zzdos zzhib;
            private final Throwable zzhic;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhib = zzdosVar;
                this.zzhic = th;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                zzdos zzdosVar2 = this.zzhib;
                ((zzdpl) obj).zza((zzdpg) zzdosVar2.zzaux(), zzdosVar2.zzauy(), this.zzhic);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdpd
    public final void zzc(final zzdos<zzdpg, ?> zzdosVar) {
        zza(new zzbxg(zzdosVar) { // from class: com.google.android.gms.internal.ads.zzdpm
            private final zzdos zzhib;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhib = zzdosVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                zzdos zzdosVar2 = this.zzhib;
                ((zzdpl) obj).zzc((zzdpg) zzdosVar2.zzaux(), zzdosVar2.zzauy());
            }
        });
    }
}
