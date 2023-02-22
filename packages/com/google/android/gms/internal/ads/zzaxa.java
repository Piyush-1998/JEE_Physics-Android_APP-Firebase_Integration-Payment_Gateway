package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaxa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaxa> CREATOR = new zzaxd();
    public final String zzbqx;
    @Deprecated
    public final String zzbuo;
    @Deprecated
    public final zzvj zzdxj;
    public final zzvc zzdxk;

    public zzaxa(String str, String str2, zzvj zzvjVar, zzvc zzvcVar) {
        this.zzbuo = str;
        this.zzbqx = str2;
        this.zzdxj = zzvjVar;
        this.zzdxk = zzvcVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzbuo, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzbqx, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdxj, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzdxk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
