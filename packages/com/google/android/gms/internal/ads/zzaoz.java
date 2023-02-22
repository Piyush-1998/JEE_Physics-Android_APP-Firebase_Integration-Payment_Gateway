package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzaoz extends zzgt implements zzapa {
    public zzaoz() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzapa zzaf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzapa) {
            return (zzapa) queryLocalInterface;
        }
        return new zzapc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzapb zzapdVar;
        zzapb zzapbVar;
        zzaoo zzaooVar = null;
        zzaov zzaoxVar = null;
        zzaou zzaowVar = null;
        zzaov zzaoxVar2 = null;
        zzaop zzaorVar = null;
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Bundle bundle = (Bundle) zzgw.zza(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzgw.zza(parcel, Bundle.CREATOR);
            zzvj zzvjVar = (zzvj) zzgw.zza(parcel, zzvj.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzapbVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (queryLocalInterface instanceof zzapb) {
                    zzapdVar = (zzapb) queryLocalInterface;
                } else {
                    zzapdVar = new zzapd(readStrongBinder);
                }
                zzapbVar = zzapdVar;
            }
            zza(asInterface, readString, bundle, bundle2, zzvjVar, zzapbVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzapo zztw = zztw();
            parcel2.writeNoException();
            zzgw.zzb(parcel2, zztw);
        } else if (i == 3) {
            zzapo zztx = zztx();
            parcel2.writeNoException();
            zzgw.zzb(parcel2, zztx);
        } else if (i == 5) {
            zzyg videoController = getVideoController();
            parcel2.writeNoException();
            zzgw.zza(parcel2, videoController);
        } else if (i == 10) {
            zzy(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i == 11) {
            zza(parcel.createStringArray(), (Bundle[]) parcel.createTypedArray(Bundle.CREATOR));
            parcel2.writeNoException();
        } else {
            switch (i) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    zzvc zzvcVar = (zzvc) zzgw.zza(parcel, zzvc.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        if (queryLocalInterface2 instanceof zzaoo) {
                            zzaooVar = (zzaoo) queryLocalInterface2;
                        } else {
                            zzaooVar = new zzaoq(readStrongBinder2);
                        }
                    }
                    zza(readString2, readString3, zzvcVar, asInterface2, zzaooVar, zzamz.zzad(parcel.readStrongBinder()), (zzvj) zzgw.zza(parcel, zzvj.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    zzvc zzvcVar2 = (zzvc) zzgw.zza(parcel, zzvc.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        if (queryLocalInterface3 instanceof zzaop) {
                            zzaorVar = (zzaop) queryLocalInterface3;
                        } else {
                            zzaorVar = new zzaor(readStrongBinder3);
                        }
                    }
                    zza(readString4, readString5, zzvcVar2, asInterface3, zzaorVar, zzamz.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 15:
                    boolean zzz = zzz(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzgw.writeBoolean(parcel2, zzz);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    zzvc zzvcVar3 = (zzvc) zzgw.zza(parcel, zzvc.CREATOR);
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        if (queryLocalInterface4 instanceof zzaov) {
                            zzaoxVar2 = (zzaov) queryLocalInterface4;
                        } else {
                            zzaoxVar2 = new zzaox(readStrongBinder4);
                        }
                    }
                    zza(readString6, readString7, zzvcVar3, asInterface4, zzaoxVar2, zzamz.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 17:
                    boolean zzaa = zzaa(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzgw.writeBoolean(parcel2, zzaa);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    zzvc zzvcVar4 = (zzvc) zzgw.zza(parcel, zzvc.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        if (queryLocalInterface5 instanceof zzaou) {
                            zzaowVar = (zzaou) queryLocalInterface5;
                        } else {
                            zzaowVar = new zzaow(readStrongBinder5);
                        }
                    }
                    zza(readString8, readString9, zzvcVar4, asInterface5, zzaowVar, zzamz.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 19:
                    zzdr(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    zzvc zzvcVar5 = (zzvc) zzgw.zza(parcel, zzvc.CREATOR);
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        if (queryLocalInterface6 instanceof zzaov) {
                            zzaoxVar = (zzaov) queryLocalInterface6;
                        } else {
                            zzaoxVar = new zzaox(readStrongBinder6);
                        }
                    }
                    zzb(readString10, readString11, zzvcVar5, asInterface6, zzaoxVar, zzamz.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
