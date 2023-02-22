package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcf;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzdv implements zzdw {
    protected static volatile zzex zzwg;
    protected MotionEvent zzwl;
    protected double zzwu;
    private double zzwv;
    private double zzww;
    protected float zzwx;
    protected float zzwy;
    protected float zzwz;
    protected float zzxa;
    protected DisplayMetrics zzxd;
    protected LinkedList<MotionEvent> zzwm = new LinkedList<>();
    protected long zzwn = 0;
    protected long zzwo = 0;
    protected long zzwp = 0;
    protected long zzwq = 0;
    protected long zzwr = 0;
    protected long zzws = 0;
    protected long zzwt = 0;
    private boolean zzxb = false;
    protected boolean zzxc = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdv(Context context) {
        try {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqu)).booleanValue()) {
                zzcx.zzbo();
            } else {
                zzfe.zzb(zzwg);
            }
            this.zzxd = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    protected abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzeu;

    protected abstract zzcf.zza.C0008zza zza(Context context, zzby.zza zzaVar);

    protected abstract zzcf.zza.C0008zza zzb(Context context, View view, Activity activity);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract zzfd zzb(MotionEvent motionEvent) throws zzeu;

    @Override // com.google.android.gms.internal.ads.zzdw
    public void zzb(View view) {
    }

    protected abstract zzcf.zza.C0008zza zzc(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzdw
    public String zzb(Context context) {
        if (zzfg.isMainThread()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zza(context, null, zzcw.zznn, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public String zza(Context context, View view, Activity activity) {
        return zza(context, null, zzcw.zzno, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public String zza(Context context, String str, View view, Activity activity) {
        return zza(context, str, zzcw.zznp, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public void zza(MotionEvent motionEvent) {
        boolean z = false;
        if (this.zzxb) {
            zzbx();
            this.zzxb = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzwu = 0.0d;
            this.zzwv = motionEvent.getRawX();
            this.zzww = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = this.zzwv;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.zzww;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.zzwu += Math.sqrt((d2 * d2) + (d4 * d4));
            this.zzwv = rawX;
            this.zzww = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzwl = obtain;
                    this.zzwm.add(obtain);
                    if (this.zzwm.size() > 6) {
                        this.zzwm.remove().recycle();
                    }
                    this.zzwp++;
                    this.zzwr = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zzwo += motionEvent.getHistorySize() + 1;
                    zzfd zzb = zzb(motionEvent);
                    if ((zzb == null || zzb.zzzs == null || zzb.zzzv == null) ? false : true) {
                        this.zzws += zzb.zzzs.longValue() + zzb.zzzv.longValue();
                    }
                    if (this.zzxd != null && zzb != null && zzb.zzzt != null && zzb.zzzw != null) {
                        z = true;
                    }
                    if (z) {
                        this.zzwt += zzb.zzzt.longValue() + zzb.zzzw.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzwq++;
                }
            } catch (zzeu unused) {
            }
        } else {
            this.zzwx = motionEvent.getX();
            this.zzwy = motionEvent.getY();
            this.zzwz = motionEvent.getRawX();
            this.zzxa = motionEvent.getRawY();
            this.zzwn++;
        }
        this.zzxc = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public void zza(int i, int i2, int i3) {
        if (this.zzwl != null) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqh)).booleanValue()) {
                zzbx();
            } else {
                this.zzwl.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzxd;
        if (displayMetrics != null) {
            this.zzwl = MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, this.zzxd.density * i2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzwl = null;
        }
        this.zzxc = false;
    }

    private final void zzbx() {
        this.zzwr = 0L;
        this.zzwn = 0L;
        this.zzwo = 0L;
        this.zzwp = 0L;
        this.zzwq = 0L;
        this.zzws = 0L;
        this.zzwt = 0L;
        if (this.zzwm.size() > 0) {
            Iterator<MotionEvent> it = this.zzwm.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.zzwm.clear();
        } else {
            MotionEvent motionEvent = this.zzwl;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzwl = null;
    }

    private final String zza(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        zzdu zzduVar;
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcqj)).booleanValue();
        zzcf.zza.C0008zza c0008zza = null;
        if (booleanValue) {
            zzduVar = zzwg != null ? zzwg.zzcl() : null;
            str2 = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcqu)).booleanValue() ? "be" : "te";
        } else {
            zzduVar = null;
            str2 = null;
        }
        try {
            if (i == zzcw.zznp) {
                c0008zza = zzb(context, view, activity);
                this.zzxb = true;
                i5 = PointerIconCompat.TYPE_HAND;
            } else if (i == zzcw.zzno) {
                c0008zza = zzc(context, view, activity);
                i5 = PointerIconCompat.TYPE_TEXT;
            } else {
                c0008zza = zza(context, null);
                i5 = 1000;
            }
            if (booleanValue && zzduVar != null) {
                zzduVar.zza(i5, -1, System.currentTimeMillis() - currentTimeMillis, str2);
            }
        } catch (Exception e) {
            if (booleanValue && zzduVar != null) {
                if (i == zzcw.zznp) {
                    i2 = PointerIconCompat.TYPE_HELP;
                } else if (i == zzcw.zzno) {
                    i2 = PointerIconCompat.TYPE_VERTICAL_TEXT;
                } else {
                    i2 = i == zzcw.zznn ? PointerIconCompat.TYPE_CONTEXT_MENU : -1;
                }
                zzduVar.zza(i2, -1, System.currentTimeMillis() - currentTimeMillis, str2, e);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (c0008zza != null) {
            try {
                if (((zzcf.zza) ((zzegp) c0008zza.zzbfx())).zzbfl() != 0) {
                    String zzj = zzcx.zzj((zzcf.zza) ((zzegp) c0008zza.zzbfx()), str);
                    if (!booleanValue || zzduVar == null) {
                        return zzj;
                    }
                    if (i == zzcw.zznp) {
                        i4 = PointerIconCompat.TYPE_CELL;
                    } else if (i == zzcw.zzno) {
                        i4 = PointerIconCompat.TYPE_ALIAS;
                    } else {
                        i4 = i == zzcw.zznn ? PointerIconCompat.TYPE_WAIT : -1;
                    }
                    zzduVar.zza(i4, -1, System.currentTimeMillis() - currentTimeMillis2, str2);
                    return zzj;
                }
            } catch (Exception e2) {
                String num = Integer.toString(7);
                if (!booleanValue || zzduVar == null) {
                    return num;
                }
                if (i == zzcw.zznp) {
                    i3 = PointerIconCompat.TYPE_CROSSHAIR;
                } else if (i == zzcw.zzno) {
                    i3 = PointerIconCompat.TYPE_COPY;
                } else {
                    i3 = i == zzcw.zznn ? 1005 : -1;
                }
                zzduVar.zza(i3, -1, System.currentTimeMillis() - currentTimeMillis2, str2, e2);
                return num;
            }
        }
        return Integer.toString(5);
    }
}
