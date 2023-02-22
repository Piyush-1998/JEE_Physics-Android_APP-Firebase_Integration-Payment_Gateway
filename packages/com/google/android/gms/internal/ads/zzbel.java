package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbel implements zzom {
    private Uri uri;
    private final zzom zzekj;
    private final long zzekk;
    private final zzom zzekl;
    private long zzekm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbel(zzom zzomVar, int i, zzom zzomVar2) {
        this.zzekj = zzomVar;
        this.zzekk = i;
        this.zzekl = zzomVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final long zza(zzon zzonVar) throws IOException {
        long j;
        zzon zzonVar2;
        this.uri = zzonVar.uri;
        zzon zzonVar3 = null;
        if (zzonVar.position >= this.zzekk) {
            zzonVar2 = null;
        } else {
            long j2 = zzonVar.position;
            if (zzonVar.zzcp != -1) {
                j = Math.min(zzonVar.zzcp, this.zzekk - j2);
            } else {
                j = this.zzekk - j2;
            }
            zzonVar2 = new zzon(zzonVar.uri, j2, j, null);
        }
        if (zzonVar.zzcp == -1 || zzonVar.position + zzonVar.zzcp > this.zzekk) {
            zzonVar3 = new zzon(zzonVar.uri, Math.max(this.zzekk, zzonVar.position), zzonVar.zzcp != -1 ? Math.min(zzonVar.zzcp, (zzonVar.position + zzonVar.zzcp) - this.zzekk) : -1L, null);
        }
        long zza = zzonVar2 != null ? this.zzekj.zza(zzonVar2) : 0L;
        long zza2 = zzonVar3 != null ? this.zzekl.zza(zzonVar3) : 0L;
        this.zzekm = zzonVar.position;
        if (zza == -1 || zza2 == -1) {
            return -1L;
        }
        return zza + zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzekm;
        long j2 = this.zzekk;
        if (j < j2) {
            i3 = this.zzekj.read(bArr, i, (int) Math.min(i2, j2 - j));
            this.zzekm += i3;
        } else {
            i3 = 0;
        }
        if (this.zzekm >= this.zzekk) {
            int read = this.zzekl.read(bArr, i + i3, i2 - i3);
            int i4 = i3 + read;
            this.zzekm += read;
            return i4;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final void close() throws IOException {
        this.zzekj.close();
        this.zzekl.close();
    }
}
