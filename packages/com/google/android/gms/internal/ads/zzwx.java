package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzwx extends zzgt implements zzwu {
    public zzwx() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzwu zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof zzwu) {
            return (zzwu) queryLocalInterface;
        }
        return new zzww(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzwl zzwlVar = null;
        zzya zzyaVar = null;
        zzxb zzxbVar = null;
        zzxi zzxiVar = null;
        zzwg zzwgVar = null;
        zzxc zzxcVar = null;
        switch (i) {
            case 1:
                IObjectWrapper zzkc = zzkc();
                parcel2.writeNoException();
                zzgw.zza(parcel2, zzkc);
                return true;
            case 2:
                destroy();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean isReady = isReady();
                parcel2.writeNoException();
                zzgw.writeBoolean(parcel2, isReady);
                return true;
            case 4:
                boolean zza = zza((zzvc) zzgw.zza(parcel, zzvc.CREATOR));
                parcel2.writeNoException();
                zzgw.writeBoolean(parcel2, zza);
                return true;
            case 5:
                pause();
                parcel2.writeNoException();
                return true;
            case 6:
                resume();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzwl) {
                        zzwlVar = (zzwl) queryLocalInterface;
                    } else {
                        zzwlVar = new zzwn(readStrongBinder);
                    }
                }
                zza(zzwlVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof zzxc) {
                        zzxcVar = (zzxc) queryLocalInterface2;
                    } else {
                        zzxcVar = new zzxe(readStrongBinder2);
                    }
                }
                zza(zzxcVar);
                parcel2.writeNoException();
                return true;
            case 9:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 10:
                stopLoading();
                parcel2.writeNoException();
                return true;
            case 11:
                zzkd();
                parcel2.writeNoException();
                return true;
            case 12:
                zzvj zzke = zzke();
                parcel2.writeNoException();
                zzgw.zzb(parcel2, zzke);
                return true;
            case 13:
                zza((zzvj) zzgw.zza(parcel, zzvj.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zza(zzaqu.zzah(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zza(zzara.zzaj(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 19:
                zza(zzabp.zzl(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface3 instanceof zzwg) {
                        zzwgVar = (zzwg) queryLocalInterface3;
                    } else {
                        zzwgVar = new zzwi(readStrongBinder3);
                    }
                }
                zza(zzwgVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface4 instanceof zzxi) {
                        zzxiVar = (zzxi) queryLocalInterface4;
                    } else {
                        zzxiVar = new zzxl(readStrongBinder4);
                    }
                }
                zza(zzxiVar);
                parcel2.writeNoException();
                return true;
            case 22:
                setManualImpressionsEnabled(zzgw.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                boolean isLoading = isLoading();
                parcel2.writeNoException();
                zzgw.writeBoolean(parcel2, isLoading);
                return true;
            case 24:
                zza(zzats.zzam(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                setUserId(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                zzyg videoController = getVideoController();
                parcel2.writeNoException();
                zzgw.zza(parcel2, videoController);
                return true;
            case 29:
                zza((zzaac) zzgw.zza(parcel, zzaac.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                zza((zzym) zzgw.zza(parcel, zzym.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String adUnitId = getAdUnitId();
                parcel2.writeNoException();
                parcel2.writeString(adUnitId);
                return true;
            case 32:
                zzxc zzkh = zzkh();
                parcel2.writeNoException();
                zzgw.zza(parcel2, zzkh);
                return true;
            case 33:
                zzwl zzki = zzki();
                parcel2.writeNoException();
                zzgw.zza(parcel2, zzki);
                return true;
            case 34:
                setImmersiveMode(zzgw.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                String zzkf = zzkf();
                parcel2.writeNoException();
                parcel2.writeString(zzkf);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface5 instanceof zzxb) {
                        zzxbVar = (zzxb) queryLocalInterface5;
                    } else {
                        zzxbVar = new zzxd(readStrongBinder5);
                    }
                }
                zza(zzxbVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle adMetadata = getAdMetadata();
                parcel2.writeNoException();
                zzgw.zzb(parcel2, adMetadata);
                return true;
            case 38:
                zzbp(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 39:
                zza((zzvm) zzgw.zza(parcel, zzvm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                zza(zzsh.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 41:
                zzyf zzkg = zzkg();
                parcel2.writeNoException();
                zzgw.zza(parcel2, zzkg);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface6 instanceof zzya) {
                        zzyaVar = (zzya) queryLocalInterface6;
                    } else {
                        zzyaVar = new zzyc(readStrongBinder6);
                    }
                }
                zza(zzyaVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
