package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzadj;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {
    private MediaContent zzbnc;
    private boolean zzbnd;
    private zzadh zzbne;
    private ImageView.ScaleType zzbnf;
    private boolean zzbng;
    private zzadj zzbnh;

    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.zzbnd = true;
        this.zzbnc = mediaContent;
        zzadh zzadhVar = this.zzbne;
        if (zzadhVar != null) {
            zzadhVar.setMediaContent(mediaContent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zza(zzadh zzadhVar) {
        this.zzbne = zzadhVar;
        if (this.zzbnd) {
            zzadhVar.setMediaContent(this.zzbnc);
        }
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zzbng = true;
        this.zzbnf = scaleType;
        zzadj zzadjVar = this.zzbnh;
        if (zzadjVar != null) {
            zzadjVar.setImageScaleType(scaleType);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zza(zzadj zzadjVar) {
        this.zzbnh = zzadjVar;
        if (this.zzbng) {
            zzadjVar.setImageScaleType(this.zzbnf);
        }
    }
}
