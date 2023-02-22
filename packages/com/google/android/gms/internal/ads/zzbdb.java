package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbdb implements SensorEventListener {
    private final SensorManager zzegn;
    private final Display zzegp;
    private float[] zzegs;
    private Handler zzegt;
    private zzbdd zzegu;
    private final float[] zzegq = new float[9];
    private final float[] zzegr = new float[9];
    private final Object zzego = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdb(Context context) {
        this.zzegn = (SensorManager) context.getSystemService("sensor");
        this.zzegp = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void start() {
        if (this.zzegt != null) {
            return;
        }
        Sensor defaultSensor = this.zzegn.getDefaultSensor(11);
        if (defaultSensor == null) {
            zzaxy.zzfc("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        zzdsf zzdsfVar = new zzdsf(handlerThread.getLooper());
        this.zzegt = zzdsfVar;
        if (this.zzegn.registerListener(this, defaultSensor, 0, zzdsfVar)) {
            return;
        }
        zzaxy.zzfc("SensorManager.registerListener failed.");
        stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void stop() {
        if (this.zzegt == null) {
            return;
        }
        this.zzegn.unregisterListener(this);
        this.zzegt.post(new zzbda(this));
        this.zzegt = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzbdd zzbddVar) {
        this.zzegu = zzbddVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.zzego) {
            if (this.zzegs == null) {
                this.zzegs = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.zzegq, fArr);
        int rotation = this.zzegp.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.zzegq, 2, 129, this.zzegr);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.zzegq, 129, 130, this.zzegr);
        } else if (rotation == 3) {
            SensorManager.remapCoordinateSystem(this.zzegq, 130, 1, this.zzegr);
        } else {
            System.arraycopy(this.zzegq, 0, this.zzegr, 0, 9);
        }
        zzl(1, 3);
        zzl(2, 6);
        zzl(5, 7);
        synchronized (this.zzego) {
            System.arraycopy(this.zzegr, 0, this.zzegs, 0, 9);
        }
        zzbdd zzbddVar = this.zzegu;
        if (zzbddVar != null) {
            zzbddVar.zzuu();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(float[] fArr) {
        synchronized (this.zzego) {
            if (this.zzegs == null) {
                return false;
            }
            System.arraycopy(this.zzegs, 0, fArr, 0, this.zzegs.length);
            return true;
        }
    }

    private final void zzl(int i, int i2) {
        float[] fArr = this.zzegr;
        float f = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f;
    }
}
