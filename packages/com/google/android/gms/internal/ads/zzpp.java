package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzpp implements ThreadFactory {
    private final /* synthetic */ String zzbkh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpp(String str) {
        this.zzbkh = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.zzbkh);
    }
}
