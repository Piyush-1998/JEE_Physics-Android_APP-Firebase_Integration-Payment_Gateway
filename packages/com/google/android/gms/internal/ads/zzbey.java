package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbey implements Runnable {
    private final /* synthetic */ String zzeca;
    private final /* synthetic */ String zzeks;
    private final /* synthetic */ zzbev zzekw;
    private final /* synthetic */ long zzekz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbey(zzbev zzbevVar, String str, String str2, long j) {
        this.zzekw = zzbevVar;
        this.zzeca = str;
        this.zzeks = str2;
        this.zzekz = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        hashMap.put("src", this.zzeca);
        hashMap.put("cachedSrc", this.zzeks);
        hashMap.put("totalDuration", Long.toString(this.zzekz));
        this.zzekw.zza("onPrecacheEvent", hashMap);
    }
}
