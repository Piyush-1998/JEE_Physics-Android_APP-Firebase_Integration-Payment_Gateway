package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzalz {
    private zzakk zzdie;
    private zzdvt<zzali> zzdif;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalz(zzakk zzakkVar) {
        this.zzdie = zzakkVar;
    }

    private final void zztm() {
        if (this.zzdif == null) {
            final zzbbq zzbbqVar = new zzbbq();
            this.zzdif = zzbbqVar;
            this.zzdie.zzb((zzeg) null).zza(new zzbbu(zzbbqVar) { // from class: com.google.android.gms.internal.ads.zzamc
                private final zzbbq zzbvp;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbvp = zzbbqVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbbu
                public final void zzh(Object obj) {
                    this.zzbvp.set((zzali) obj);
                }
            }, new zzbbs(zzbbqVar) { // from class: com.google.android.gms.internal.ads.zzamb
                private final zzbbq zzbvp;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbvp = zzbbqVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbbs
                public final void run() {
                    this.zzbvp.setException(new zzalj("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final <I, O> zzamg<I, O> zzb(String str, zzaln<I> zzalnVar, zzalo<O> zzaloVar) {
        zztm();
        return new zzamg<>(this.zzdif, str, zzalnVar, zzaloVar);
    }

    public final void zzc(final String str, final zzahf<? super zzali> zzahfVar) {
        zztm();
        this.zzdif = zzdvl.zzb(this.zzdif, new zzduv(str, zzahfVar) { // from class: com.google.android.gms.internal.ads.zzame
            private final zzahf zzdfx;
            private final String zzdgb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdgb = str;
                this.zzdfx = zzahfVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                zzali zzaliVar = (zzali) obj;
                zzaliVar.zza(this.zzdgb, this.zzdfx);
                return zzdvl.zzaf(zzaliVar);
            }
        }, zzbbi.zzedz);
    }

    public final void zzd(final String str, final zzahf<? super zzali> zzahfVar) {
        this.zzdif = zzdvl.zzb(this.zzdif, new zzdsl(str, zzahfVar) { // from class: com.google.android.gms.internal.ads.zzamd
            private final zzahf zzdfx;
            private final String zzdgb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdgb = str;
                this.zzdfx = zzahfVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj) {
                zzali zzaliVar = (zzali) obj;
                zzaliVar.zzb(this.zzdgb, this.zzdfx);
                return zzaliVar;
            }
        }, zzbbi.zzedz);
    }
}
