package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzadp extends NativeAd.AdChoicesInfo {
    private String text;
    private final List<NativeAd.Image> zzdcj = new ArrayList();
    private final zzado zzdcu;

    public zzadp(zzado zzadoVar) {
        zzadw zzadwVar;
        IBinder iBinder;
        this.zzdcu = zzadoVar;
        try {
            this.text = zzadoVar.getText();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            this.text = "";
        }
        try {
            for (zzadw zzadwVar2 : zzadoVar.zzry()) {
                if (!(zzadwVar2 instanceof IBinder) || (iBinder = (IBinder) zzadwVar2) == null) {
                    zzadwVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    if (queryLocalInterface instanceof zzadw) {
                        zzadwVar = (zzadw) queryLocalInterface;
                    } else {
                        zzadwVar = new zzady(iBinder);
                    }
                }
                if (zzadwVar != null) {
                    this.zzdcj.add(new zzadx(zzadwVar));
                }
            }
        } catch (RemoteException e2) {
            zzbbd.zzc("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.text;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzdcj;
    }
}
