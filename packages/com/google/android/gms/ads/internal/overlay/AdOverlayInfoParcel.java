package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzagl;
import com.google.android.gms.internal.ads.zzagn;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzut;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzm();
    public final int orientation;
    public final String url;
    public final zzbbg zzbpa;
    public final zzut zzcgq;
    public final zzagl zzddv;
    public final zzagn zzddw;
    public final zzbfq zzdgc;
    public final zzd zzdoq;
    public final zzo zzdor;
    public final String zzdos;
    public final boolean zzdot;
    public final String zzdou;
    public final zzt zzdov;
    public final int zzdow;
    public final String zzdox;
    public final com.google.android.gms.ads.internal.zzi zzdoy;

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel zzc(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public AdOverlayInfoParcel(zzut zzutVar, zzo zzoVar, zzt zztVar, zzbfq zzbfqVar, int i, zzbbg zzbbgVar, String str, com.google.android.gms.ads.internal.zzi zziVar, String str2, String str3) {
        this.zzdoq = null;
        this.zzcgq = null;
        this.zzdor = zzoVar;
        this.zzdgc = zzbfqVar;
        this.zzddv = null;
        this.zzddw = null;
        this.zzdos = str2;
        this.zzdot = false;
        this.zzdou = str3;
        this.zzdov = null;
        this.orientation = i;
        this.zzdow = 1;
        this.url = null;
        this.zzbpa = zzbbgVar;
        this.zzdox = str;
        this.zzdoy = zziVar;
    }

    public AdOverlayInfoParcel(zzut zzutVar, zzo zzoVar, zzt zztVar, zzbfq zzbfqVar, boolean z, int i, zzbbg zzbbgVar) {
        this.zzdoq = null;
        this.zzcgq = zzutVar;
        this.zzdor = zzoVar;
        this.zzdgc = zzbfqVar;
        this.zzddv = null;
        this.zzddw = null;
        this.zzdos = null;
        this.zzdot = z;
        this.zzdou = null;
        this.zzdov = zztVar;
        this.orientation = i;
        this.zzdow = 2;
        this.url = null;
        this.zzbpa = zzbbgVar;
        this.zzdox = null;
        this.zzdoy = null;
    }

    public AdOverlayInfoParcel(zzut zzutVar, zzo zzoVar, zzagl zzaglVar, zzagn zzagnVar, zzt zztVar, zzbfq zzbfqVar, boolean z, int i, String str, zzbbg zzbbgVar) {
        this.zzdoq = null;
        this.zzcgq = zzutVar;
        this.zzdor = zzoVar;
        this.zzdgc = zzbfqVar;
        this.zzddv = zzaglVar;
        this.zzddw = zzagnVar;
        this.zzdos = null;
        this.zzdot = z;
        this.zzdou = null;
        this.zzdov = zztVar;
        this.orientation = i;
        this.zzdow = 3;
        this.url = str;
        this.zzbpa = zzbbgVar;
        this.zzdox = null;
        this.zzdoy = null;
    }

    public AdOverlayInfoParcel(zzut zzutVar, zzo zzoVar, zzagl zzaglVar, zzagn zzagnVar, zzt zztVar, zzbfq zzbfqVar, boolean z, int i, String str, String str2, zzbbg zzbbgVar) {
        this.zzdoq = null;
        this.zzcgq = zzutVar;
        this.zzdor = zzoVar;
        this.zzdgc = zzbfqVar;
        this.zzddv = zzaglVar;
        this.zzddw = zzagnVar;
        this.zzdos = str2;
        this.zzdot = z;
        this.zzdou = str;
        this.zzdov = zztVar;
        this.orientation = i;
        this.zzdow = 3;
        this.url = null;
        this.zzbpa = zzbbgVar;
        this.zzdox = null;
        this.zzdoy = null;
    }

    public AdOverlayInfoParcel(zzd zzdVar, zzut zzutVar, zzo zzoVar, zzt zztVar, zzbbg zzbbgVar) {
        this.zzdoq = zzdVar;
        this.zzcgq = zzutVar;
        this.zzdor = zzoVar;
        this.zzdgc = null;
        this.zzddv = null;
        this.zzddw = null;
        this.zzdos = null;
        this.zzdot = false;
        this.zzdou = null;
        this.zzdov = zztVar;
        this.orientation = -1;
        this.zzdow = 4;
        this.url = null;
        this.zzbpa = zzbbgVar;
        this.zzdox = null;
        this.zzdoy = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdOverlayInfoParcel(zzd zzdVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzbbg zzbbgVar, String str4, com.google.android.gms.ads.internal.zzi zziVar, IBinder iBinder6) {
        this.zzdoq = zzdVar;
        this.zzcgq = (zzut) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzdor = (zzo) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzdgc = (zzbfq) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzddv = (zzagl) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zzddw = (zzagn) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzdos = str;
        this.zzdot = z;
        this.zzdou = str2;
        this.zzdov = (zzt) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.orientation = i;
        this.zzdow = i2;
        this.url = str3;
        this.zzbpa = zzbbgVar;
        this.zzdox = str4;
        this.zzdoy = zziVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdoq, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, ObjectWrapper.wrap(this.zzcgq).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.zzdor).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, ObjectWrapper.wrap(this.zzdgc).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, ObjectWrapper.wrap(this.zzddw).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzdos, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdot);
        SafeParcelWriter.writeString(parcel, 9, this.zzdou, false);
        SafeParcelWriter.writeIBinder(parcel, 10, ObjectWrapper.wrap(this.zzdov).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.orientation);
        SafeParcelWriter.writeInt(parcel, 12, this.zzdow);
        SafeParcelWriter.writeString(parcel, 13, this.url, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzbpa, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzdox, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzdoy, i, false);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzddv).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
