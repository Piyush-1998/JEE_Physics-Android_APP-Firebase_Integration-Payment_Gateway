package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzmv implements zzmz, zznc {
    private final Uri uri;
    private final Handler zzaeo;
    private zzhy zzaez;
    private final int zzbdf;
    private final zzmy zzbdg;
    private zznc zzbdh;
    private final zzol zzbep;
    private final zzka zzbeq;
    private final int zzber;
    private boolean zzbes;
    private final String zzbdj = null;
    private final zzia zzaes = new zzia();

    public zzmv(Uri uri, zzol zzolVar, zzka zzkaVar, int i, Handler handler, zzmy zzmyVar, String str, int i2) {
        this.uri = uri;
        this.zzbep = zzolVar;
        this.zzbeq = zzkaVar;
        this.zzbdf = i;
        this.zzaeo = handler;
        this.zzbdg = zzmyVar;
        this.zzber = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzhx() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zza(zzhc zzhcVar, boolean z, zznc zzncVar) {
        this.zzbdh = zzncVar;
        zznn zznnVar = new zznn(-9223372036854775807L, false);
        this.zzaez = zznnVar;
        zzncVar.zzb(zznnVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final zzmx zza(int i, zzok zzokVar) {
        zzoz.checkArgument(i == 0);
        return new zzmn(this.uri, this.zzbep.zzin(), this.zzbeq.zzgr(), this.zzbdf, this.zzaeo, this.zzbdg, this, zzokVar, null, this.zzber);
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzb(zzmx zzmxVar) {
        ((zzmn) zzmxVar).release();
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzhy() {
        this.zzbdh = null;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzb(zzhy zzhyVar, Object obj) {
        boolean z = zzhyVar.zza(0, this.zzaes, false).zzaid != -9223372036854775807L;
        if (!this.zzbes || z) {
            this.zzaez = zzhyVar;
            this.zzbes = z;
            this.zzbdh.zzb(zzhyVar, null);
        }
    }
}
