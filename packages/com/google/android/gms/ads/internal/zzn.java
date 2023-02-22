package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzeg;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzn extends AsyncTask<Void, Void, String> {
    private final /* synthetic */ zzj zzbpi;

    private zzn(zzj zzjVar) {
        this.zzbpi = zzjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        Future future;
        try {
            zzj zzjVar = this.zzbpi;
            future = this.zzbpi.zzbpc;
            zzjVar.zzbpg = (zzeg) future.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzbbd.zzd("", e);
        }
        return this.zzbpi.zzkj();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(String str) {
        WebView webView;
        WebView webView2;
        String str2 = str;
        webView = this.zzbpi.zzbpe;
        if (webView == null || str2 == null) {
            return;
        }
        webView2 = this.zzbpi.zzbpe;
        webView2.loadUrl(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzn(zzj zzjVar, zzm zzmVar) {
        this(zzjVar);
    }
}
