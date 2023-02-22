package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzvl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvl> CREATOR = new zzvk();
    public final int type;
    public final int zzadb;
    public final String zzadc;
    public final long zzadd;

    public zzvl(int i, int i2, String str, long j) {
        this.type = i;
        this.zzadb = i2;
        this.zzadc = str;
        this.zzadd = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.type);
        SafeParcelWriter.writeInt(parcel, 2, this.zzadb);
        SafeParcelWriter.writeString(parcel, 3, this.zzadc, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzadd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static zzvl zza(JSONObject jSONObject) throws JSONException {
        return new zzvl(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong(AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }
}
