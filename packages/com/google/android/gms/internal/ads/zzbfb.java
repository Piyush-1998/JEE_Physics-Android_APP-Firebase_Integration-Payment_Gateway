package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbfb implements Runnable {
    private final /* synthetic */ String val$message;
    private final /* synthetic */ String zzeca;
    private final /* synthetic */ String zzeks;
    private final /* synthetic */ zzbev zzekw;
    private final /* synthetic */ String zzelc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfb(zzbev zzbevVar, String str, String str2, String str3, String str4) {
        this.zzekw = zzbevVar;
        this.zzeca = str;
        this.zzeks = str2;
        this.zzelc = str3;
        this.val$message = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String zzfp;
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
        hashMap.put("src", this.zzeca);
        if (!TextUtils.isEmpty(this.zzeks)) {
            hashMap.put("cachedSrc", this.zzeks);
        }
        zzbev zzbevVar = this.zzekw;
        zzfp = zzbev.zzfp(this.zzelc);
        hashMap.put("type", zzfp);
        hashMap.put("reason", this.zzelc);
        if (!TextUtils.isEmpty(this.val$message)) {
            hashMap.put("message", this.val$message);
        }
        this.zzekw.zza("onPrecacheEvent", hashMap);
    }
}
