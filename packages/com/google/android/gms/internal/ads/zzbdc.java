package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbdc extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzbdd {
    private static final float[] zzegv = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private int height;
    private int width;
    private final float[] zzegs;
    private final zzbdb zzegw;
    private final float[] zzegx;
    private final float[] zzegy;
    private final float[] zzegz;
    private final float[] zzeha;
    private final float[] zzehb;
    private final float[] zzehc;
    private float zzehd;
    private float zzehe;
    private float zzehf;
    private SurfaceTexture zzehg;
    private SurfaceTexture zzehh;
    private int zzehi;
    private int zzehj;
    private int zzehk;
    private FloatBuffer zzehl;
    private final CountDownLatch zzehm;
    private final Object zzehn;
    private EGL10 zzeho;
    private EGLDisplay zzehp;
    private EGLContext zzehq;
    private EGLSurface zzehr;
    private volatile boolean zzehs;
    private volatile boolean zzeht;

    public zzbdc(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(zzegv.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzehl = asFloatBuffer;
        asFloatBuffer.put(zzegv).position(0);
        this.zzegs = new float[9];
        this.zzegx = new float[9];
        this.zzegy = new float[9];
        this.zzegz = new float[9];
        this.zzeha = new float[9];
        this.zzehb = new float[9];
        this.zzehc = new float[9];
        this.zzehd = Float.NaN;
        zzbdb zzbdbVar = new zzbdb(context);
        this.zzegw = zzbdbVar;
        zzbdbVar.zza(this);
        this.zzehm = new CountDownLatch(1);
        this.zzehn = new Object();
    }

    public final void zza(SurfaceTexture surfaceTexture, int i, int i2) {
        this.width = i;
        this.height = i2;
        this.zzehh = surfaceTexture;
    }

    public final void zzm(int i, int i2) {
        synchronized (this.zzehn) {
            this.width = i;
            this.height = i2;
            this.zzehs = true;
            this.zzehn.notifyAll();
        }
    }

    public final void zzzk() {
        synchronized (this.zzehn) {
            this.zzeht = true;
            this.zzehh = null;
            this.zzehn.notifyAll();
        }
    }

    public final SurfaceTexture zzzl() {
        if (this.zzehh == null) {
            return null;
        }
        try {
            this.zzehm.await();
        } catch (InterruptedException unused) {
        }
        return this.zzehg;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzehk++;
        synchronized (this.zzehn) {
            this.zzehn.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdd
    public final void zzuu() {
        synchronized (this.zzehn) {
            this.zzehn.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.SurfaceTexture, android.graphics.SurfaceTexture$OnFrameAvailableListener] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdc.run():void");
    }

    public final void zzb(float f, float f2) {
        float f3;
        float f4;
        float f5;
        int i = this.width;
        int i2 = this.height;
        if (i > i2) {
            f3 = (f * 1.7453293f) / i;
            f4 = f2 * 1.7453293f;
            f5 = i;
        } else {
            f3 = (f * 1.7453293f) / i2;
            f4 = f2 * 1.7453293f;
            f5 = i2;
        }
        this.zzehe -= f3;
        float f6 = this.zzehf - (f4 / f5);
        this.zzehf = f6;
        if (f6 < -1.5707964f) {
            this.zzehf = -1.5707964f;
        }
        if (this.zzehf > 1.5707964f) {
            this.zzehf = 1.5707964f;
        }
    }

    private static void zza(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    private static void zza(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    private static void zzb(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static int zzd(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        zzfi("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            zzfi("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            zzfi("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            zzfi("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                zzfi("deleteShader");
                return 0;
            }
            return glCreateShader;
        }
        return glCreateShader;
    }

    private final boolean zzzm() {
        EGLSurface eGLSurface = this.zzehr;
        boolean z = false;
        if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
            z = this.zzeho.eglDestroySurface(this.zzehp, this.zzehr) | this.zzeho.eglMakeCurrent(this.zzehp, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | false;
            this.zzehr = null;
        }
        EGLContext eGLContext = this.zzehq;
        if (eGLContext != null) {
            z |= this.zzeho.eglDestroyContext(this.zzehp, eGLContext);
            this.zzehq = null;
        }
        EGLDisplay eGLDisplay = this.zzehp;
        if (eGLDisplay != null) {
            boolean eglTerminate = z | this.zzeho.eglTerminate(eGLDisplay);
            this.zzehp = null;
            return eglTerminate;
        }
        return z;
    }

    private static void zzfi(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }
}
