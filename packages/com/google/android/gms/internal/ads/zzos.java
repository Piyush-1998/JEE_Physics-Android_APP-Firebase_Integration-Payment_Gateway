package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzos extends IOException {
    private final int type;
    private final zzon zzbik;

    public zzos(String str, zzon zzonVar, int i) {
        super(str);
        this.zzbik = zzonVar;
        this.type = 1;
    }

    public zzos(IOException iOException, zzon zzonVar, int i) {
        super(iOException);
        this.zzbik = zzonVar;
        this.type = i;
    }

    public zzos(String str, IOException iOException, zzon zzonVar, int i) {
        super(str, iOException);
        this.zzbik = zzonVar;
        this.type = 1;
    }
}
