package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdhp implements zzcya<zzbnc> {
    private final /* synthetic */ zzdhl zzgxq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdhp(zzdhl zzdhlVar) {
        this.zzgxq = zzdhlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzaqe() {
        this.zzgxq.zzgxm = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
        if (r0.zzedr < ((java.lang.Integer) com.google.android.gms.internal.ads.zzwe.zzpu().zzd(com.google.android.gms.internal.ads.zzaat.zzcty)).intValue()) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzcya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void onSuccess(com.google.android.gms.internal.ads.zzbnc r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbnc r4 = (com.google.android.gms.internal.ads.zzbnc) r4
            com.google.android.gms.internal.ads.zzdhl r0 = r3.zzgxq
            com.google.android.gms.internal.ads.zzbnc r0 = r0.zzgxm
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzdhl r0 = r3.zzgxq
            com.google.android.gms.internal.ads.zzbnc r0 = r0.zzgxm
            r0.destroy()
        Lf:
            com.google.android.gms.internal.ads.zzdhl r0 = r3.zzgxq
            r0.zzgxm = r4
            com.google.android.gms.internal.ads.zzdhl r0 = r3.zzgxq
            android.view.ViewGroup r0 = com.google.android.gms.internal.ads.zzdhl.zza(r0)
            r0.removeAllViews()
            com.google.android.gms.internal.ads.zzdhl r0 = r3.zzgxq
            android.view.ViewGroup r0 = com.google.android.gms.internal.ads.zzdhl.zza(r0)
            android.view.View r1 = r4.zzahq()
            com.google.android.gms.internal.ads.zzaym r2 = com.google.android.gms.ads.internal.zzp.zzkr()
            android.view.ViewGroup$LayoutParams r2 = r2.zzxt()
            r0.addView(r1, r2)
            boolean r0 = r4.zzahi()
            if (r0 != 0) goto L51
            com.google.android.gms.internal.ads.zzdhl r0 = r3.zzgxq
            com.google.android.gms.internal.ads.zzbbg r0 = com.google.android.gms.internal.ads.zzdhl.zzb(r0)
            int r0 = r0.zzedr
            com.google.android.gms.internal.ads.zzaai<java.lang.Integer> r1 = com.google.android.gms.internal.ads.zzaat.zzcty
            com.google.android.gms.internal.ads.zzaap r2 = com.google.android.gms.internal.ads.zzwe.zzpu()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 >= r1) goto L76
        L51:
            com.google.android.gms.internal.ads.zzdhl r0 = r3.zzgxq
            com.google.android.gms.ads.internal.overlay.zzq r0 = com.google.android.gms.internal.ads.zzdhl.zza(r0, r4)
            android.widget.RelativeLayout$LayoutParams r1 = com.google.android.gms.internal.ads.zzdhl.zzd(r4)
            boolean r2 = r4.zzahr()
            if (r2 == 0) goto L69
            boolean r2 = r4.zzahj()
            if (r2 != 0) goto L69
            r2 = 1
            goto L6a
        L69:
            r2 = 0
        L6a:
            r0.zzal(r2)
            com.google.android.gms.internal.ads.zzdhl r2 = r3.zzgxq
            android.view.ViewGroup r2 = com.google.android.gms.internal.ads.zzdhl.zza(r2)
            r2.addView(r0, r1)
        L76:
            com.google.android.gms.internal.ads.zzdhl r0 = r3.zzgxq
            com.google.android.gms.internal.ads.zzdhl.zzb(r0, r4)
            com.google.android.gms.internal.ads.zzdhl r0 = r3.zzgxq
            android.view.ViewGroup r0 = com.google.android.gms.internal.ads.zzdhl.zza(r0)
            com.google.android.gms.internal.ads.zzdhl r1 = r3.zzgxq
            com.google.android.gms.internal.ads.zzvj r1 = com.google.android.gms.internal.ads.zzdhl.zzc(r1)
            int r1 = r1.heightPixels
            r0.setMinimumHeight(r1)
            com.google.android.gms.internal.ads.zzdhl r0 = r3.zzgxq
            android.view.ViewGroup r0 = com.google.android.gms.internal.ads.zzdhl.zza(r0)
            com.google.android.gms.internal.ads.zzdhl r1 = r3.zzgxq
            com.google.android.gms.internal.ads.zzvj r1 = com.google.android.gms.internal.ads.zzdhl.zzc(r1)
            int r1 = r1.widthPixels
            r0.setMinimumWidth(r1)
            com.google.android.gms.internal.ads.zzdhl r0 = r3.zzgxq
            com.google.android.gms.internal.ads.zzdht r0 = com.google.android.gms.internal.ads.zzdhl.zzd(r0)
            com.google.android.gms.internal.ads.zzbne r1 = new com.google.android.gms.internal.ads.zzbne
            com.google.android.gms.internal.ads.zzdhl r2 = r3.zzgxq
            r1.<init>(r4, r2)
            r0.zzb(r1)
            r4.zzahw()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdhp.onSuccess(java.lang.Object):void");
    }
}
