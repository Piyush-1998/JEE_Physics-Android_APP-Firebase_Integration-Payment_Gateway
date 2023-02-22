package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public interface zzarc extends IInterface {
    void onError(String str) throws RemoteException;

    void onSuccess(List<Uri> list) throws RemoteException;
}
