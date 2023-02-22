package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbez implements Runnable {
    private final /* synthetic */ String zzeca;
    private final /* synthetic */ String zzeks;
    private final /* synthetic */ int zzeku;
    private final /* synthetic */ zzbev zzekw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbez(zzbev zzbevVar, String str, String str2, int i) {
        this.zzekw = zzbevVar;
        this.zzeca = str;
        this.zzeks = str2;
        this.zzeku = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        hashMap.put("src", this.zzeca);
        hashMap.put("cachedSrc", this.zzeks);
        hashMap.put("totalBytes", Integer.toString(this.zzeku));
        this.zzekw.zza("onPrecacheEvent", hashMap);
    }
}
