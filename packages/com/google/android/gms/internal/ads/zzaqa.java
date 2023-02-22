package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaqa implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzapx zzdmx;
    private final /* synthetic */ String zzdmy;
    private final /* synthetic */ String zzdmz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqa(zzapx zzapxVar, String str, String str2) {
        this.zzdmx = zzapxVar;
        this.zzdmy = str;
        this.zzdmz = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        context = this.zzdmx.zzvr;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        try {
            String str = this.zzdmy;
            String str2 = this.zzdmz;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            com.google.android.gms.ads.internal.zzp.zzkr();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.zzdmx.zzdx("Could not store picture.");
        }
    }
}
