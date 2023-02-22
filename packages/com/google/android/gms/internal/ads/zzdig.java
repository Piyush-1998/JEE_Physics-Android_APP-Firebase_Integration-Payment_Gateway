package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdig<R> implements zzdnv {
    public final Executor executor;
    public final String zzbuo;
    public final zzvc zzdpw;
    public final zzvm zzgsx;
    public final zzdjb<R> zzgyn;
    public final zzdja zzgyo;
    @Nullable
    private final zzdnk zzgyp;

    public zzdig(zzdjb<R> zzdjbVar, zzdja zzdjaVar, zzvc zzvcVar, String str, Executor executor, zzvm zzvmVar, @Nullable zzdnk zzdnkVar) {
        this.zzgyn = zzdjbVar;
        this.zzgyo = zzdjaVar;
        this.zzdpw = zzvcVar;
        this.zzbuo = str;
        this.executor = executor;
        this.zzgsx = zzvmVar;
        this.zzgyp = zzdnkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnv
    public final Executor getExecutor() {
        return this.executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdnv
    @Nullable
    public final zzdnk zzasd() {
        return this.zzgyp;
    }

    @Override // com.google.android.gms.internal.ads.zzdnv
    public final zzdnv zzase() {
        return new zzdig(this.zzgyn, this.zzgyo, this.zzdpw, this.zzbuo, this.executor, this.zzgsx, this.zzgyp);
    }
}
