package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbnc extends zzbpd {
    private final View view;
    private final zzbfq zzdgc;
    private final zzdkw zzfnm;
    private final int zzfnn;
    private final boolean zzfno;
    private final boolean zzfnp;
    private zzsj zzfnv;
    private final zzbmt zzfnw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnc(zzbpg zzbpgVar, View view, zzbfq zzbfqVar, zzdkw zzdkwVar, int i, boolean z, boolean z2, zzbmt zzbmtVar) {
        super(zzbpgVar);
        this.view = view;
        this.zzdgc = zzbfqVar;
        this.zzfnm = zzdkwVar;
        this.zzfnn = i;
        this.zzfno = z;
        this.zzfnp = z2;
        this.zzfnw = zzbmtVar;
    }

    public final zzdkw zzahp() {
        return zzdls.zza(this.zzfpf.zzhan, this.zzfnm);
    }

    public final View zzahq() {
        return this.view;
    }

    public final int zzahh() {
        return this.zzfnn;
    }

    public final boolean zzahi() {
        return this.zzfno;
    }

    public final boolean zzahj() {
        return this.zzfnp;
    }

    public final boolean zzabx() {
        zzbfq zzbfqVar = this.zzdgc;
        return (zzbfqVar == null || zzbfqVar.zzabe() == null || !this.zzdgc.zzabe().zzabx()) ? false : true;
    }

    public final boolean zzahr() {
        zzbfq zzbfqVar = this.zzdgc;
        return zzbfqVar != null && zzbfqVar.zzabg();
    }

    public final void zza(zzsc zzscVar) {
        zzbfq zzbfqVar = this.zzdgc;
        if (zzbfqVar != null) {
            zzbfqVar.zza(zzscVar);
        }
    }

    public final void zza(zzsj zzsjVar) {
        this.zzfnv = zzsjVar;
    }

    public final zzsj zzahs() {
        return this.zzfnv;
    }

    public final void zzfd(long j) {
        this.zzfnw.zzfd(j);
    }
}
