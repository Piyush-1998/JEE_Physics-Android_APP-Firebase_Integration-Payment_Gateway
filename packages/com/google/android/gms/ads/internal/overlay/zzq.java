package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.zzbat;
import com.google.android.gms.internal.ads.zzwe;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzq extends FrameLayout implements View.OnClickListener {
    private final ImageButton zzdoz;
    private final zzy zzdpa;

    public zzq(Context context, zzp zzpVar, zzy zzyVar) {
        super(context);
        this.zzdpa = zzyVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zzdoz = imageButton;
        imageButton.setImageResource(17301527);
        this.zzdoz.setBackgroundColor(0);
        this.zzdoz.setOnClickListener(this);
        ImageButton imageButton2 = this.zzdoz;
        zzwe.zzpq();
        int zzc = zzbat.zzc(context, zzpVar.paddingLeft);
        zzwe.zzpq();
        int zzc2 = zzbat.zzc(context, 0);
        zzwe.zzpq();
        int zzc3 = zzbat.zzc(context, zzpVar.paddingRight);
        zzwe.zzpq();
        imageButton2.setPadding(zzc, zzc2, zzc3, zzbat.zzc(context, zzpVar.paddingBottom));
        this.zzdoz.setContentDescription("Interstitial close button");
        ImageButton imageButton3 = this.zzdoz;
        zzwe.zzpq();
        int zzc4 = zzbat.zzc(context, zzpVar.size + zzpVar.paddingLeft + zzpVar.paddingRight);
        zzwe.zzpq();
        addView(imageButton3, new FrameLayout.LayoutParams(zzc4, zzbat.zzc(context, zzpVar.size + zzpVar.paddingBottom), 17));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzy zzyVar = this.zzdpa;
        if (zzyVar != null) {
            zzyVar.zzup();
        }
    }

    public final void zzal(boolean z) {
        if (z) {
            this.zzdoz.setVisibility(8);
        } else {
            this.zzdoz.setVisibility(0);
        }
    }
}
