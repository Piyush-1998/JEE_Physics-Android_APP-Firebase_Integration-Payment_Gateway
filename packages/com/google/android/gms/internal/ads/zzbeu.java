package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbeu implements Runnable {
    private final /* synthetic */ String zzeca;
    private final /* synthetic */ String zzeks;
    private final /* synthetic */ int zzekt;
    private final /* synthetic */ int zzeku;
    private final /* synthetic */ boolean zzekv = false;
    private final /* synthetic */ zzbev zzekw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbeu(zzbev zzbevVar, String str, String str2, int i, int i2, boolean z) {
        this.zzekw = zzbevVar;
        this.zzeca = str;
        this.zzeks = str2;
        this.zzekt = i;
        this.zzeku = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.zzeca);
        hashMap.put("cachedSrc", this.zzeks);
        hashMap.put("bytesLoaded", Integer.toString(this.zzekt));
        hashMap.put("totalBytes", Integer.toString(this.zzeku));
        hashMap.put("cacheReady", this.zzekv ? "1" : "0");
        this.zzekw.zza("onPrecacheEvent", hashMap);
    }
}
