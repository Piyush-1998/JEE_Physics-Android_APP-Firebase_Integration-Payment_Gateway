package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeiq implements zzehx {
    private final int flags;
    private final String info;
    private final Object[] zziib;
    private final zzehz zziie;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeiq(zzehz zzehzVar, String str, Object[] objArr) {
        this.zziie = zzehzVar;
        this.info = str;
        this.zziib = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.flags = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzbhh() {
        return this.info;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zzbhi() {
        return this.zziib;
    }

    @Override // com.google.android.gms.internal.ads.zzehx
    public final zzehz zzbgy() {
        return this.zziie;
    }

    @Override // com.google.android.gms.internal.ads.zzehx
    public final int zzbgw() {
        return (this.flags & 1) == 1 ? zzegp.zze.zzige : zzegp.zze.zzigf;
    }

    @Override // com.google.android.gms.internal.ads.zzehx
    public final boolean zzbgx() {
        return (this.flags & 2) == 2;
    }
}
