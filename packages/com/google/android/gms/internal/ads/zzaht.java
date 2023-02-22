package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaht extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaht> CREATOR = new zzahw();
    public final byte[] data;
    public final int statusCode;
    public final boolean zzan;
    public final long zzao;
    public final String zzcgr;
    public final String[] zzdey;
    public final String[] zzdez;
    public final boolean zzdfa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaht(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.zzdfa = z;
        this.zzcgr = str;
        this.statusCode = i;
        this.data = bArr;
        this.zzdey = strArr;
        this.zzdez = strArr2;
        this.zzan = z2;
        this.zzao = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zzdfa);
        SafeParcelWriter.writeString(parcel, 2, this.zzcgr, false);
        SafeParcelWriter.writeInt(parcel, 3, this.statusCode);
        SafeParcelWriter.writeByteArray(parcel, 4, this.data, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.zzdey, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.zzdez, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzan);
        SafeParcelWriter.writeLong(parcel, 8, this.zzao);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
