package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaac;
import com.google.android.gms.internal.ads.zzabq;
import com.google.android.gms.internal.ads.zzace;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzarb;
import com.google.android.gms.internal.ads.zzatt;
import com.google.android.gms.internal.ads.zzaxy;
import com.google.android.gms.internal.ads.zzbat;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzef;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzsi;
import com.google.android.gms.internal.ads.zzvc;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzwe;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzwl;
import com.google.android.gms.internal.ads.zzwx;
import com.google.android.gms.internal.ads.zzxb;
import com.google.android.gms.internal.ads.zzxc;
import com.google.android.gms.internal.ads.zzxi;
import com.google.android.gms.internal.ads.zzya;
import com.google.android.gms.internal.ads.zzyf;
import com.google.android.gms.internal.ads.zzyg;
import com.google.android.gms.internal.ads.zzym;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzj extends zzwx {
    private final zzbbg zzbpa;
    private final zzvj zzbpb;
    private final Future<zzeg> zzbpc = zzbbi.zzedu.zze(new zzo(this));
    private final zzq zzbpd;
    private WebView zzbpe;
    private zzwl zzbpf;
    private zzeg zzbpg;
    private AsyncTask<Void, Void, String> zzbph;
    private final Context zzvr;

    public zzj(Context context, zzvj zzvjVar, String str, zzbbg zzbbgVar) {
        this.zzvr = context;
        this.zzbpa = zzbbgVar;
        this.zzbpb = zzvjVar;
        this.zzbpe = new WebView(this.zzvr);
        this.zzbpd = new zzq(context, str);
        zzbt(0);
        this.zzbpe.setVerticalScrollBarEnabled(false);
        this.zzbpe.getSettings().setJavaScriptEnabled(true);
        this.zzbpe.setWebViewClient(new zzm(this));
        this.zzbpe.setOnTouchListener(new zzl(this));
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzyg getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final boolean isLoading() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final boolean isReady() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void stopLoading() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzya zzyaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final String zzkf() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzyf zzkg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final IObjectWrapper zzkc() throws RemoteException {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzbpe);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzbph.cancel(true);
        this.zzbpc.cancel(true);
        this.zzbpe.destroy();
        this.zzbpe = null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final boolean zza(zzvc zzvcVar) throws RemoteException {
        Preconditions.checkNotNull(this.zzbpe, "This Search Ad has already been torn down");
        this.zzbpd.zza(zzvcVar, this.zzbpa);
        this.zzbph = new zzn(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void pause() throws RemoteException {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void resume() throws RemoteException {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzwl zzwlVar) throws RemoteException {
        this.zzbpf = zzwlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzxc zzxcVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzxb zzxbVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final Bundle getAdMetadata() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void showInterstitial() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zzkd() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzvj zzke() throws RemoteException {
        return this.zzbpb;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzvj zzvjVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzaqv zzaqvVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzarb zzarbVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzxc zzkh() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzwl zzki() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzabq zzabqVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzwg zzwgVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzxi zzxiVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzatt zzattVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void setUserId(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zzbp(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzaac zzaacVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzym zzymVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzvm zzvmVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzsi zzsiVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void setImmersiveMode(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzbq(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzwe.zzpq();
            return zzbat.zzc(this.zzvr, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzbt(int i) {
        if (this.zzbpe == null) {
            return;
        }
        this.zzbpe.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzkj() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(zzace.zzczm.get());
        builder.appendQueryParameter(SearchIntents.EXTRA_QUERY, this.zzbpd.getQuery());
        builder.appendQueryParameter("pubId", this.zzbpd.zzlp());
        Map<String, String> zzlq = this.zzbpd.zzlq();
        for (String str : zzlq.keySet()) {
            builder.appendQueryParameter(str, zzlq.get(str));
        }
        Uri build = builder.build();
        zzeg zzegVar = this.zzbpg;
        if (zzegVar != null) {
            try {
                build = zzegVar.zza(build, this.zzvr);
            } catch (zzef e) {
                zzaxy.zzd("Unable to process ad data", e);
            }
        }
        String zzkk = zzkk();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(zzkk).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(zzkk);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzkk() {
        String zzlo = this.zzbpd.zzlo();
        if (TextUtils.isEmpty(zzlo)) {
            zzlo = "www.google.com";
        }
        String str = zzace.zzczm.get();
        StringBuilder sb = new StringBuilder(String.valueOf(zzlo).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(zzlo);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzbr(String str) {
        if (this.zzbpg == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzbpg.zza(parse, this.zzvr, null, null);
        } catch (zzef e) {
            zzaxy.zzd("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbs(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.zzvr.startActivity(intent);
    }
}
