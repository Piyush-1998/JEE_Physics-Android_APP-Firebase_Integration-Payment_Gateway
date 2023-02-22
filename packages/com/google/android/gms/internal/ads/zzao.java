package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzao extends Exception {
    private long zzao;
    private final zzy zzbv;

    public zzao() {
        this.zzbv = null;
    }

    public zzao(zzy zzyVar) {
        this.zzbv = zzyVar;
    }

    public zzao(String str) {
        super(str);
        this.zzbv = null;
    }

    public zzao(Throwable th) {
        super(th);
        this.zzbv = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(long j) {
        this.zzao = j;
    }
}
