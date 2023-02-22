package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbbc {
    public static <T> T zza(Context context, String str, zzbbf<IBinder, T> zzbbfVar) throws zzbbe {
        try {
            return zzbbfVar.apply(zzbu(context).instantiate(str));
        } catch (Exception e) {
            throw new zzbbe(e);
        }
    }

    public static Context zzbt(Context context) throws zzbbe {
        return zzbu(context).getModuleContext();
    }

    private static DynamiteModule zzbu(Context context) throws zzbbe {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzbbe(e);
        }
    }
}
