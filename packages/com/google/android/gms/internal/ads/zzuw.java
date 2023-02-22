package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzuw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuw> CREATOR = new zzuz();
    public final int errorCode;
    public final String zzcgr;
    public final String zzcgs;
    private final zzuw zzcgt;

    public zzuw(int i, String str, String str2, zzuw zzuwVar) {
        this.errorCode = i;
        this.zzcgr = str;
        this.zzcgs = str2;
        this.zzcgt = zzuwVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.errorCode);
        SafeParcelWriter.writeString(parcel, 2, this.zzcgr, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzcgs, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzcgt, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final AdError zzpf() {
        AdError adError;
        if (this.zzcgt == null) {
            adError = null;
        } else {
            zzuw zzuwVar = this.zzcgt;
            adError = new AdError(zzuwVar.errorCode, zzuwVar.zzcgr, zzuwVar.zzcgs);
        }
        return new AdError(this.errorCode, this.zzcgr, this.zzcgs, adError);
    }

    public final LoadAdError zzpg() {
        AdError adError;
        if (this.zzcgt == null) {
            adError = null;
        } else {
            zzuw zzuwVar = this.zzcgt;
            adError = new AdError(zzuwVar.errorCode, zzuwVar.zzcgr, zzuwVar.zzcgs);
        }
        return new LoadAdError(this.errorCode, this.zzcgr, this.zzcgs, adError, null);
    }
}
