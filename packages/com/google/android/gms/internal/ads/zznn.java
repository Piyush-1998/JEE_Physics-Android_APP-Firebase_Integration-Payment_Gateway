package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zznn extends zzhy {
    private static final Object zzbgl = new Object();
    private final boolean zzaio;
    private final boolean zzaip;
    private final long zzbgm;
    private final long zzbgn;
    private final long zzbgo;
    private final long zzbgp;

    public zznn(long j, boolean z) {
        this(j, j, 0L, 0L, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final int zzfd() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final int zzfe() {
        return 1;
    }

    private zznn(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.zzbgm = j;
        this.zzbgn = j2;
        this.zzbgo = 0L;
        this.zzbgp = 0L;
        this.zzaio = z;
        this.zzaip = false;
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final zzid zza(int i, zzid zzidVar, boolean z, long j) {
        zzoz.zzc(i, 0, 1);
        boolean z2 = this.zzaio;
        long j2 = this.zzbgn;
        zzidVar.zzaic = null;
        zzidVar.zzaim = -9223372036854775807L;
        zzidVar.zzain = -9223372036854775807L;
        zzidVar.zzaio = z2;
        zzidVar.zzaip = false;
        zzidVar.zzais = 0L;
        zzidVar.zzaid = j2;
        zzidVar.zzaiq = 0;
        zzidVar.zzair = 0;
        zzidVar.zzait = 0L;
        return zzidVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final zzia zza(int i, zzia zziaVar, boolean z) {
        zzoz.zzc(i, 0, 1);
        Object obj = z ? zzbgl : null;
        return zziaVar.zza(obj, obj, 0, this.zzbgm, 0L, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final int zzc(Object obj) {
        return zzbgl.equals(obj) ? 0 : -1;
    }
}
