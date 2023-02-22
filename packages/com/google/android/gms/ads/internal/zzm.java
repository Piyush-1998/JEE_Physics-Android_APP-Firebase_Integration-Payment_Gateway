package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzaxy;
import com.google.android.gms.internal.ads.zzwl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzm extends WebViewClient {
    private final /* synthetic */ zzj zzbpi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(zzj zzjVar) {
        this.zzbpi = zzjVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzwl zzwlVar;
        zzwl zzwlVar2;
        String zzbr;
        zzwl zzwlVar3;
        zzwl zzwlVar4;
        zzwl zzwlVar5;
        zzwl zzwlVar6;
        zzwl zzwlVar7;
        zzwl zzwlVar8;
        if (str.startsWith(this.zzbpi.zzkk())) {
            return false;
        }
        if (!str.startsWith("gmsg://noAdLoaded")) {
            if (!str.startsWith("gmsg://scriptLoadFailed")) {
                if (!str.startsWith("gmsg://adResized")) {
                    if (str.startsWith("gmsg://")) {
                        return true;
                    }
                    zzwlVar = this.zzbpi.zzbpf;
                    if (zzwlVar != null) {
                        try {
                            zzwlVar2 = this.zzbpi.zzbpf;
                            zzwlVar2.onAdLeftApplication();
                        } catch (RemoteException e) {
                            zzaxy.zze("#007 Could not call remote method.", e);
                        }
                    }
                    zzbr = this.zzbpi.zzbr(str);
                    this.zzbpi.zzbs(zzbr);
                    return true;
                }
                zzwlVar3 = this.zzbpi.zzbpf;
                if (zzwlVar3 != null) {
                    try {
                        zzwlVar4 = this.zzbpi.zzbpf;
                        zzwlVar4.onAdLoaded();
                    } catch (RemoteException e2) {
                        zzaxy.zze("#007 Could not call remote method.", e2);
                    }
                }
                this.zzbpi.zzbt(this.zzbpi.zzbq(str));
                return true;
            }
            zzwlVar5 = this.zzbpi.zzbpf;
            if (zzwlVar5 != null) {
                try {
                    zzwlVar6 = this.zzbpi.zzbpf;
                    zzwlVar6.onAdFailedToLoad(0);
                } catch (RemoteException e3) {
                    zzaxy.zze("#007 Could not call remote method.", e3);
                }
            }
            this.zzbpi.zzbt(0);
            return true;
        }
        zzwlVar7 = this.zzbpi.zzbpf;
        if (zzwlVar7 != null) {
            try {
                zzwlVar8 = this.zzbpi.zzbpf;
                zzwlVar8.onAdFailedToLoad(3);
            } catch (RemoteException e4) {
                zzaxy.zze("#007 Could not call remote method.", e4);
            }
        }
        this.zzbpi.zzbt(0);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzwl zzwlVar;
        zzwl zzwlVar2;
        zzwlVar = this.zzbpi.zzbpf;
        if (zzwlVar != null) {
            try {
                zzwlVar2 = this.zzbpi.zzbpf;
                zzwlVar2.onAdFailedToLoad(0);
            } catch (RemoteException e) {
                zzaxy.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
