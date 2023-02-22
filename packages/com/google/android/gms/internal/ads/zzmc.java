package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzmc implements Parcelable {
    public static final Parcelable.Creator<zzmc> CREATOR = new zzme();
    private final zza[] zzbda;

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public interface zza extends Parcelable {
    }

    public zzmc(List<? extends zza> list) {
        zza[] zzaVarArr = new zza[list.size()];
        this.zzbda = zzaVarArr;
        list.toArray(zzaVarArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmc(Parcel parcel) {
        this.zzbda = new zza[parcel.readInt()];
        int i = 0;
        while (true) {
            zza[] zzaVarArr = this.zzbda;
            if (i >= zzaVarArr.length) {
                return;
            }
            zzaVarArr[i] = (zza) parcel.readParcelable(zza.class.getClassLoader());
            i++;
        }
    }

    public final int length() {
        return this.zzbda.length;
    }

    public final zza zzba(int i) {
        return this.zzbda[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzbda, ((zzmc) obj).zzbda);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzbda);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzbda.length);
        for (zza zzaVar : this.zzbda) {
            parcel.writeParcelable(zzaVar, 0);
        }
    }
}
