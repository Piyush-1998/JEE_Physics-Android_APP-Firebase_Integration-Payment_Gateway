package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzayq extends zzayr {
    @Override // com.google.android.gms.internal.ads.zzaym
    public final int zzxs() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public boolean isAttachedToWindow(View view) {
        return super.isAttachedToWindow(view) || view.getWindowId() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final long zzxw() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcrg)).booleanValue()) {
            return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        return -1L;
    }
}
