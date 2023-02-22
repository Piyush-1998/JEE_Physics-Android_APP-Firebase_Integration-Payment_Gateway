package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbgk extends zzyj {
    private boolean zzads;
    private boolean zzadt;
    private int zzaev;
    private zzyl zzdkl;
    private final zzbde zzefm;
    private final boolean zzeoz;
    private final boolean zzepa;
    private boolean zzepb;
    private float zzepd;
    private float zzepe;
    private float zzepf;
    private zzafi zzepg;
    private final Object lock = new Object();
    private boolean zzepc = true;

    public zzbgk(zzbde zzbdeVar, float f, boolean z, boolean z2) {
        this.zzefm = zzbdeVar;
        this.zzepd = f;
        this.zzeoz = z;
        this.zzepa = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final void play() {
        zzf("play", null);
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final void pause() {
        zzf("pause", null);
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final void stop() {
        zzf("stop", null);
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final void mute(boolean z) {
        zzf(z ? "mute" : "unmute", null);
    }

    public final void zzb(zzaac zzaacVar) {
        boolean z = zzaacVar.zzadr;
        boolean z2 = zzaacVar.zzads;
        boolean z3 = zzaacVar.zzadt;
        synchronized (this.lock) {
            this.zzads = z2;
            this.zzadt = z3;
        }
        zzf("initialState", CollectionUtils.mapOf("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    private final void zzf(String str, Map<String, String> map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzbbi.zzedy.execute(new Runnable(this, hashMap) { // from class: com.google.android.gms.internal.ads.zzbgn
            private final Map zzedp;
            private final zzbgk zzeph;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeph = this;
                this.zzedp = hashMap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzeph.zzk(this.zzedp);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final boolean isMuted() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzepc;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final int getPlaybackState() {
        int i;
        synchronized (this.lock) {
            i = this.zzaev;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final float getAspectRatio() {
        float f;
        synchronized (this.lock) {
            f = this.zzepf;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final float getDuration() {
        float f;
        synchronized (this.lock) {
            f = this.zzepd;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final float getCurrentTime() {
        float f;
        synchronized (this.lock) {
            f = this.zzepe;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final void zza(zzyl zzylVar) {
        synchronized (this.lock) {
            this.zzdkl = zzylVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final zzyl zzqj() throws RemoteException {
        zzyl zzylVar;
        synchronized (this.lock) {
            zzylVar = this.zzdkl;
        }
        return zzylVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final boolean isCustomControlsEnabled() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzeoz && this.zzads;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final boolean isClickToExpandEnabled() {
        boolean z;
        boolean isCustomControlsEnabled = isCustomControlsEnabled();
        synchronized (this.lock) {
            if (!isCustomControlsEnabled) {
                try {
                    z = (this.zzadt && this.zzepa) ? true : true;
                } finally {
                }
            }
            z = false;
        }
        return z;
    }

    public final void zze(float f) {
        synchronized (this.lock) {
            this.zzepe = f;
        }
    }

    public final void zzacs() {
        boolean z;
        int i;
        synchronized (this.lock) {
            z = this.zzepc;
            i = this.zzaev;
            this.zzaev = 3;
        }
        zza(i, 3, z, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[Catch: all -> 0x004f, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:11:0x0013, B:13:0x002f, B:14:0x0038), top: B:29:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(float r4, float r5, int r6, boolean r7, float r8) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            float r1 = r3.zzepd     // Catch: java.lang.Throwable -> L4f
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L12
            float r1 = r3.zzepf     // Catch: java.lang.Throwable -> L4f
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            r3.zzepd = r5     // Catch: java.lang.Throwable -> L4f
            r3.zzepe = r4     // Catch: java.lang.Throwable -> L4f
            boolean r4 = r3.zzepc     // Catch: java.lang.Throwable -> L4f
            r3.zzepc = r7     // Catch: java.lang.Throwable -> L4f
            int r5 = r3.zzaev     // Catch: java.lang.Throwable -> L4f
            r3.zzaev = r6     // Catch: java.lang.Throwable -> L4f
            float r2 = r3.zzepf     // Catch: java.lang.Throwable -> L4f
            r3.zzepf = r8     // Catch: java.lang.Throwable -> L4f
            float r8 = r8 - r2
            float r8 = java.lang.Math.abs(r8)     // Catch: java.lang.Throwable -> L4f
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L38
            com.google.android.gms.internal.ads.zzbde r8 = r3.zzefm     // Catch: java.lang.Throwable -> L4f
            android.view.View r8 = r8.getView()     // Catch: java.lang.Throwable -> L4f
            r8.invalidate()     // Catch: java.lang.Throwable -> L4f
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzafi r8 = r3.zzepg     // Catch: android.os.RemoteException -> L45
            if (r8 == 0) goto L4b
            com.google.android.gms.internal.ads.zzafi r8 = r3.zzepg     // Catch: android.os.RemoteException -> L45
            r8.zzsq()     // Catch: android.os.RemoteException -> L45
            goto L4b
        L45:
            r8 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.zzbbd.zze(r0, r8)
        L4b:
            r3.zza(r5, r6, r4, r7)
            return
        L4f:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgk.zza(float, float, int, boolean, float):void");
    }

    public final void zza(zzafi zzafiVar) {
        synchronized (this.lock) {
            this.zzepg = zzafiVar;
        }
    }

    private final void zza(final int i, final int i2, final boolean z, final boolean z2) {
        zzbbi.zzedy.execute(new Runnable(this, i, i2, z, z2) { // from class: com.google.android.gms.internal.ads.zzbgm
            private final int zzeax;
            private final int zzeay;
            private final boolean zzemt;
            private final boolean zzemu;
            private final zzbgk zzeph;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeph = this;
                this.zzeax = i;
                this.zzeay = i2;
                this.zzemt = z;
                this.zzemu = z2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzeph.zzb(this.zzeax, this.zzeay, this.zzemt, this.zzemu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(int i, int i2, boolean z, boolean z2) {
        synchronized (this.lock) {
            boolean z3 = false;
            boolean z4 = i != i2;
            boolean z5 = !this.zzepb && i2 == 1;
            boolean z6 = z4 && i2 == 1;
            boolean z7 = z4 && i2 == 2;
            boolean z8 = z4 && i2 == 3;
            boolean z9 = z != z2;
            this.zzepb = (this.zzepb || z5) ? true : true;
            if (z5) {
                try {
                    if (this.zzdkl != null) {
                        this.zzdkl.onVideoStart();
                    }
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
            if (z6 && this.zzdkl != null) {
                this.zzdkl.onVideoPlay();
            }
            if (z7 && this.zzdkl != null) {
                this.zzdkl.onVideoPause();
            }
            if (z8) {
                if (this.zzdkl != null) {
                    this.zzdkl.onVideoEnd();
                }
                this.zzefm.zzzw();
            }
            if (z9 && this.zzdkl != null) {
                this.zzdkl.onVideoMute(z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(Map map) {
        this.zzefm.zza("pubVideoCmd", map);
    }
}
