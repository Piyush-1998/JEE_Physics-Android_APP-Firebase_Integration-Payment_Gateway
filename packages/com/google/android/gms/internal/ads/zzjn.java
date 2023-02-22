package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzjn implements Parcelable, Comparator<zza> {
    public static final Parcelable.Creator<zzjn> CREATOR = new zzjm();
    private int zzahr;
    private final zza[] zzaog;
    public final int zzaoh;

    public zzjn(List<zza> list) {
        this(false, (zza[]) list.toArray(new zza[list.size()]));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza implements Parcelable {
        public static final Parcelable.Creator<zza> CREATOR = new zzjo();
        private final byte[] data;
        private final String mimeType;
        private final UUID uuid;
        private int zzahr;
        public final boolean zzaoi;

        public zza(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private zza(UUID uuid, String str, byte[] bArr, boolean z) {
            this.uuid = (UUID) zzoz.checkNotNull(uuid);
            this.mimeType = (String) zzoz.checkNotNull(str);
            this.data = (byte[]) zzoz.checkNotNull(bArr);
            this.zzaoi = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public zza(Parcel parcel) {
            this.uuid = new UUID(parcel.readLong(), parcel.readLong());
            this.mimeType = parcel.readString();
            this.data = parcel.createByteArray();
            this.zzaoi = parcel.readByte() != 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof zza) {
                if (obj == this) {
                    return true;
                }
                zza zzaVar = (zza) obj;
                return this.mimeType.equals(zzaVar.mimeType) && zzpq.zza(this.uuid, zzaVar.uuid) && Arrays.equals(this.data, zzaVar.data);
            }
            return false;
        }

        public final int hashCode() {
            if (this.zzahr == 0) {
                this.zzahr = (((this.uuid.hashCode() * 31) + this.mimeType.hashCode()) * 31) + Arrays.hashCode(this.data);
            }
            return this.zzahr;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.uuid.getMostSignificantBits());
            parcel.writeLong(this.uuid.getLeastSignificantBits());
            parcel.writeString(this.mimeType);
            parcel.writeByteArray(this.data);
            parcel.writeByte(this.zzaoi ? (byte) 1 : (byte) 0);
        }
    }

    public zzjn(zza... zzaVarArr) {
        this(true, zzaVarArr);
    }

    private zzjn(boolean z, zza... zzaVarArr) {
        zzaVarArr = z ? (zza[]) zzaVarArr.clone() : zzaVarArr;
        Arrays.sort(zzaVarArr, this);
        for (int i = 1; i < zzaVarArr.length; i++) {
            if (zzaVarArr[i - 1].uuid.equals(zzaVarArr[i].uuid)) {
                String valueOf = String.valueOf(zzaVarArr[i].uuid);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Duplicate data for uuid: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.zzaog = zzaVarArr;
        this.zzaoh = zzaVarArr.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjn(Parcel parcel) {
        zza[] zzaVarArr = (zza[]) parcel.createTypedArray(zza.CREATOR);
        this.zzaog = zzaVarArr;
        this.zzaoh = zzaVarArr.length;
    }

    public final zza zzag(int i) {
        return this.zzaog[i];
    }

    public final int hashCode() {
        if (this.zzahr == 0) {
            this.zzahr = Arrays.hashCode(this.zzaog);
        }
        return this.zzahr;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzaog, ((zzjn) obj).zzaog);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.zzaog, 0);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zza zzaVar, zza zzaVar2) {
        zza zzaVar3 = zzaVar;
        zza zzaVar4 = zzaVar2;
        if (zzha.UUID_NIL.equals(zzaVar3.uuid)) {
            return zzha.UUID_NIL.equals(zzaVar4.uuid) ? 0 : 1;
        }
        return zzaVar3.uuid.compareTo(zzaVar4.uuid);
    }
}
