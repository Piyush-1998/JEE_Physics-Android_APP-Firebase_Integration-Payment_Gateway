package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbhd;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbgp<WebViewT extends zzbgt & zzbhb & zzbhd> {
    private final zzbgq zzepj;
    private final WebViewT zzepk;

    public static zzbgp<zzbfq> zzc(final zzbfq zzbfqVar) {
        return new zzbgp<>(zzbfqVar, new zzbgq(zzbfqVar) { // from class: com.google.android.gms.internal.ads.zzbgo
            private final zzbfq zzepi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzepi = zzbfqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbgq
            public final void zzh(Uri uri) {
                zzbhc zzabe = this.zzepi.zzabe();
                if (zzabe == null) {
                    zzaxy.zzfc("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                } else {
                    zzabe.zzh(uri);
                }
            }
        });
    }

    private zzbgp(WebViewT webviewt, zzbgq zzbgqVar) {
        this.zzepj = zzbgqVar;
        this.zzepk = webviewt;
    }

    @JavascriptInterface
    public final void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            zzaxy.zzfe("URL is empty, ignoring message");
        } else {
            zzayh.zzeaj.post(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzbgr
                private final String zzdft;
                private final zzbgp zzepl;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzepl = this;
                    this.zzdft = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzepl.zzfu(this.zzdft);
                }
            });
        }
    }

    @JavascriptInterface
    public final String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zzaxy.zzei("Click string is empty, not proceeding.");
            return "";
        }
        zzeg zzabh = this.zzepk.zzabh();
        if (zzabh == null) {
            zzaxy.zzei("Signal utils is empty, ignoring.");
            return "";
        }
        zzdw zzca = zzabh.zzca();
        if (zzca == null) {
            zzaxy.zzei("Signals object is empty, ignoring.");
            return "";
        } else if (this.zzepk.getContext() == null) {
            zzaxy.zzei("Context is null, ignoring.");
            return "";
        } else {
            return zzca.zza(this.zzepk.getContext(), str, this.zzepk.getView(), this.zzepk.zzzq());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzfu(String str) {
        this.zzepj.zzh(Uri.parse(str));
    }
}
