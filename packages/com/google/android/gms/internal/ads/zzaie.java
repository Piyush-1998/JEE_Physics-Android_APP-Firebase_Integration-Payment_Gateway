package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaie implements Runnable {
    private final /* synthetic */ zzahz zzdfd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaie(zzahz zzahzVar) {
        this.zzdfd = zzahzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdfd.disconnect();
    }
}
