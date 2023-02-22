package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaqi {
    private zzdpt zzdnm;
    private static final Object lock = new Object();
    private static boolean zzzh = false;
    private static boolean zzdnl = false;

    public final boolean zzp(Context context) {
        synchronized (lock) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzctq)).booleanValue()) {
                if (zzzh) {
                    return true;
                }
                try {
                    zzq(context);
                    boolean zzau = this.zzdnm.zzau(ObjectWrapper.wrap(context));
                    zzzh = zzau;
                    return zzau;
                } catch (RemoteException e) {
                    e = e;
                    zzbbd.zze("#007 Could not call remote method.", e);
                    return false;
                } catch (NullPointerException e2) {
                    e = e2;
                    zzbbd.zze("#007 Could not call remote method.", e);
                    return false;
                }
            }
            return false;
        }
    }

    private final void zzq(Context context) {
        synchronized (lock) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzctq)).booleanValue() && !zzdnl) {
                try {
                    zzdnl = true;
                    this.zzdnm = (zzdpt) zzbbc.zza(context, "com.google.android.gms.ads.omid.DynamiteOmid", zzaqh.zzbxs);
                } catch (zzbbe e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final String getVersion(Context context) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzctq)).booleanValue()) {
            try {
                zzq(context);
                String valueOf = String.valueOf(this.zzdnm.getVersion());
                return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
            } catch (RemoteException | NullPointerException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
                return null;
            }
        }
        return null;
    }

    public final IObjectWrapper zza(String str, WebView webView, String str2, String str3, String str4) {
        return zza(str, webView, str2, str3, str4, "Google");
    }

    public final IObjectWrapper zza(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (lock) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (((Boolean) zzwe.zzpu().zzd(zzaat.zzctq)).booleanValue() && zzzh) {
                    try {
                        return this.zzdnm.zza(str, ObjectWrapper.wrap(webView), str2, str3, str4, str5);
                    } catch (RemoteException | NullPointerException e) {
                        zzbbd.zze("#007 Could not call remote method.", e);
                        return null;
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final void zzab(IObjectWrapper iObjectWrapper) {
        synchronized (lock) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzctq)).booleanValue() && zzzh) {
                try {
                    this.zzdnm.zzab(iObjectWrapper);
                } catch (RemoteException | NullPointerException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void zzac(IObjectWrapper iObjectWrapper) {
        synchronized (lock) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzctq)).booleanValue() && zzzh) {
                try {
                    this.zzdnm.zzac(iObjectWrapper);
                } catch (RemoteException | NullPointerException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, View view) {
        synchronized (lock) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzctq)).booleanValue() && zzzh) {
                try {
                    this.zzdnm.zzc(iObjectWrapper, ObjectWrapper.wrap(view));
                } catch (RemoteException | NullPointerException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void zzb(IObjectWrapper iObjectWrapper, View view) {
        synchronized (lock) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzctq)).booleanValue() && zzzh) {
                try {
                    this.zzdnm.zzd(iObjectWrapper, ObjectWrapper.wrap(view));
                } catch (RemoteException | NullPointerException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }
}
