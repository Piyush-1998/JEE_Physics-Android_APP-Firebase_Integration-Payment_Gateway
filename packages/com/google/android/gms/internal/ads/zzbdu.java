package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbdu implements zzom {
    private static final Pattern zzbia = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> zzbib = new AtomicReference<>();
    private final int zzbid;
    private final int zzbie;
    private final String zzbif;
    private final zzpa<? super zzbdu> zzbij;
    private zzon zzbik;
    private HttpURLConnection zzbil;
    private InputStream zzbim;
    private boolean zzbin;
    private long zzbio;
    private long zzbip;
    private long zzbiq;
    private long zzcq;
    private int zzejf;
    private SSLSocketFactory zzeje = new zzbdx(this);
    private Set<Socket> zzejg = new HashSet();
    private final zzou zzbii = new zzou();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdu(String str, zzpa<? super zzbdu> zzpaVar, int i, int i2, int i3) {
        this.zzbif = zzoz.checkNotEmpty(str);
        this.zzbij = zzpaVar;
        this.zzbid = i;
        this.zzbie = i2;
        this.zzejf = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.zzbil;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x012b, code lost:
        r23.zzbil = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012d, code lost:
        r0 = r14.getResponseCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0133, code lost:
        if (r0 < 200) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0137, code lost:
        if (r0 <= 299) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
        if (r0 != 200) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013c, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0142, code lost:
        if (r24.position == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0144, code lost:
        r4 = r24.position;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0147, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0149, code lost:
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014a, code lost:
        r23.zzbio = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0151, code lost:
        if (r24.isFlagSet(1) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:
        if (r24.zzcp == (-1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015b, code lost:
        r23.zzbip = r24.zzcp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0160, code lost:
        r3 = zzc(r23.zzbil);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0168, code lost:
        if (r3 == (-1)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016a, code lost:
        r4 = r3 - r23.zzbio;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016f, code lost:
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0170, code lost:
        r23.zzbip = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0173, code lost:
        r23.zzbip = r24.zzcp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0177, code lost:
        r23.zzbim = r23.zzbil.getInputStream();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017f, code lost:
        r23.zzbin = true;
        r0 = r23.zzbij;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0184, code lost:
        if (r0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0186, code lost:
        r0.zza(r23, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018b, code lost:
        return r23.zzbip;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018d, code lost:
        zzio();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0196, code lost:
        throw new com.google.android.gms.internal.ads.zzos(r0, r24, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0197, code lost:
        r3 = r23.zzbil.getHeaderFields();
        zzio();
        r4 = new com.google.android.gms.internal.ads.zzor(r0, r3, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a7, code lost:
        if (r0 != 416) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a9, code lost:
        r4.initCause(new com.google.android.gms.internal.ads.zzoo(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b2, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b4, code lost:
        zzio();
        r5 = java.lang.String.valueOf(r24.uri.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c8, code lost:
        if (r5.length() != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ca, code lost:
        r3 = "Unable to connect to ".concat(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cf, code lost:
        r3 = new java.lang.String("Unable to connect to ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d9, code lost:
        throw new com.google.android.gms.internal.ads.zzos(r3, r0, r24, 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9 A[Catch: IOException -> 0x0248, TryCatch #0 {IOException -> 0x0248, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:24:0x00d0, B:26:0x00d9, B:27:0x00e0, B:31:0x00e9, B:33:0x00ee, B:35:0x00f6, B:37:0x010b, B:51:0x012b, B:96:0x01de, B:98:0x01e9, B:100:0x01fa, B:102:0x0202, B:104:0x0210, B:106:0x021a, B:107:0x021d, B:105:0x0215, B:109:0x0227, B:110:0x022e, B:36:0x0108, B:19:0x0085, B:21:0x00a1, B:23:0x00cb, B:111:0x022f, B:112:0x0247), top: B:121:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee A[Catch: IOException -> 0x0248, TryCatch #0 {IOException -> 0x0248, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:24:0x00d0, B:26:0x00d9, B:27:0x00e0, B:31:0x00e9, B:33:0x00ee, B:35:0x00f6, B:37:0x010b, B:51:0x012b, B:96:0x01de, B:98:0x01e9, B:100:0x01fa, B:102:0x0202, B:104:0x0210, B:106:0x021a, B:107:0x021d, B:105:0x0215, B:109:0x0227, B:110:0x022e, B:36:0x0108, B:19:0x0085, B:21:0x00a1, B:23:0x00cb, B:111:0x022f, B:112:0x0247), top: B:121:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e9 A[Catch: IOException -> 0x0248, TryCatch #0 {IOException -> 0x0248, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:24:0x00d0, B:26:0x00d9, B:27:0x00e0, B:31:0x00e9, B:33:0x00ee, B:35:0x00f6, B:37:0x010b, B:51:0x012b, B:96:0x01de, B:98:0x01e9, B:100:0x01fa, B:102:0x0202, B:104:0x0210, B:106:0x021a, B:107:0x021d, B:105:0x0215, B:109:0x0227, B:110:0x022e, B:36:0x0108, B:19:0x0085, B:21:0x00a1, B:23:0x00cb, B:111:0x022f, B:112:0x0247), top: B:121:0x000f }] */
    @Override // com.google.android.gms.internal.ads.zzom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zza(com.google.android.gms.internal.ads.zzon r24) throws com.google.android.gms.internal.ads.zzos {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdu.zza(com.google.android.gms.internal.ads.zzon):long");
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final int read(byte[] bArr, int i, int i2) throws zzos {
        try {
            if (this.zzbiq != this.zzbio) {
                byte[] andSet = zzbib.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (this.zzbiq != this.zzbio) {
                    int read = this.zzbim.read(andSet, 0, (int) Math.min(this.zzbio - this.zzbiq, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.zzbiq += read;
                    if (this.zzbij != null) {
                        this.zzbij.zzc(this, read);
                    }
                }
                zzbib.set(andSet);
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.zzbip != -1) {
                long j = this.zzbip - this.zzcq;
                if (j == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j);
            }
            int read2 = this.zzbim.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzbip == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzcq += read2;
            if (this.zzbij != null) {
                this.zzbij.zzc(this, read2);
            }
            return read2;
        } catch (IOException e) {
            throw new zzos(e, this.zzbik, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r3 > android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) goto L27;
     */
    @Override // com.google.android.gms.internal.ads.zzom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws com.google.android.gms.internal.ads.zzos {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.zzbim     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L7b
            java.net.HttpURLConnection r2 = r9.zzbil     // Catch: java.lang.Throwable -> L93
            long r3 = r9.zzbip     // Catch: java.lang.Throwable -> L93
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L13
            long r3 = r9.zzbip     // Catch: java.lang.Throwable -> L93
            goto L18
        L13:
            long r3 = r9.zzbip     // Catch: java.lang.Throwable -> L93
            long r7 = r9.zzcq     // Catch: java.lang.Throwable -> L93
            long r3 = r3 - r7
        L18:
            int r7 = com.google.android.gms.internal.ads.zzpq.SDK_INT     // Catch: java.lang.Throwable -> L93
            r8 = 19
            if (r7 == r8) goto L24
            int r7 = com.google.android.gms.internal.ads.zzpq.SDK_INT     // Catch: java.lang.Throwable -> L93
            r8 = 20
            if (r7 != r8) goto L6b
        L24:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L34
            int r3 = r2.read()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            r4 = -1
            if (r3 != r4) goto L3a
            goto L6b
        L34:
            r5 = 2048(0x800, double:1.012E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L6b
        L3a:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            if (r4 != 0) goto L52
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            if (r3 == 0) goto L6b
        L52:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L93
        L6b:
            java.io.InputStream r2 = r9.zzbim     // Catch: java.io.IOException -> L71 java.lang.Throwable -> L93
            r2.close()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> L93
            goto L7b
        L71:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzos r3 = new com.google.android.gms.internal.ads.zzos     // Catch: java.lang.Throwable -> L93
            com.google.android.gms.internal.ads.zzon r4 = r9.zzbik     // Catch: java.lang.Throwable -> L93
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L93
            throw r3     // Catch: java.lang.Throwable -> L93
        L7b:
            r9.zzbim = r0
            r9.zzio()
            boolean r0 = r9.zzbin
            if (r0 == 0) goto L8d
            r9.zzbin = r1
            com.google.android.gms.internal.ads.zzpa<? super com.google.android.gms.internal.ads.zzbdu> r0 = r9.zzbij
            if (r0 == 0) goto L8d
            r0.zze(r9)
        L8d:
            java.util.Set<java.net.Socket> r0 = r9.zzejg
            r0.clear()
            return
        L93:
            r2 = move-exception
            r9.zzbim = r0
            r9.zzio()
            boolean r0 = r9.zzbin
            if (r0 == 0) goto La6
            r9.zzbin = r1
            com.google.android.gms.internal.ads.zzpa<? super com.google.android.gms.internal.ads.zzbdu> r0 = r9.zzbij
            if (r0 == 0) goto La6
            r0.zze(r9)
        La6:
            java.util.Set<java.net.Socket> r0 = r9.zzejg
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdu.close():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setReceiveBufferSize(int i) {
        this.zzejf = i;
        for (Socket socket : this.zzejg) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzejf);
                } catch (SocketException e) {
                    zzaxy.zzd("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Socket socket) {
        this.zzejg.add(socket);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long zzc(java.net.HttpURLConnection r9) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r9.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            if (r1 != 0) goto L34
            long r3 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L13
            goto L36
        L13:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 28
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Length ["
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzaxy.zzfc(r1)
        L34:
            r3 = -1
        L36:
            java.lang.String r1 = "Content-Range"
            java.lang.String r9 = r9.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto Lc9
            java.util.regex.Pattern r1 = com.google.android.gms.internal.ads.zzbdu.zzbia
            java.util.regex.Matcher r1 = r1.matcher(r9)
            boolean r5 = r1.find()
            if (r5 == 0) goto Lc9
            r5 = 2
            java.lang.String r5 = r1.group(r5)     // Catch: java.lang.NumberFormatException -> La8
            long r5 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> La8
            r7 = 1
            java.lang.String r1 = r1.group(r7)     // Catch: java.lang.NumberFormatException -> La8
            long r7 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> La8
            long r5 = r5 - r7
            r7 = 1
            long r5 = r5 + r7
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L6c
            r3 = r5
            goto Lc9
        L6c:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto Lc9
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.NumberFormatException -> La8
            int r1 = r1.length()     // Catch: java.lang.NumberFormatException -> La8
            int r1 = r1 + 26
            java.lang.String r7 = java.lang.String.valueOf(r9)     // Catch: java.lang.NumberFormatException -> La8
            int r7 = r7.length()     // Catch: java.lang.NumberFormatException -> La8
            int r1 = r1 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> La8
            r7.<init>(r1)     // Catch: java.lang.NumberFormatException -> La8
            java.lang.String r1 = "Inconsistent headers ["
            r7.append(r1)     // Catch: java.lang.NumberFormatException -> La8
            r7.append(r0)     // Catch: java.lang.NumberFormatException -> La8
            java.lang.String r0 = "] ["
            r7.append(r0)     // Catch: java.lang.NumberFormatException -> La8
            r7.append(r9)     // Catch: java.lang.NumberFormatException -> La8
            r7.append(r2)     // Catch: java.lang.NumberFormatException -> La8
            java.lang.String r0 = r7.toString()     // Catch: java.lang.NumberFormatException -> La8
            com.google.android.gms.internal.ads.zzaxy.zzfe(r0)     // Catch: java.lang.NumberFormatException -> La8
            long r0 = java.lang.Math.max(r3, r5)     // Catch: java.lang.NumberFormatException -> La8
            r3 = r0
            goto Lc9
        La8:
            java.lang.String r0 = java.lang.String.valueOf(r9)
            int r0 = r0.length()
            int r0 = r0 + 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r1.append(r0)
            r1.append(r9)
            r1.append(r2)
            java.lang.String r9 = r1.toString()
            com.google.android.gms.internal.ads.zzaxy.zzfc(r9)
        Lc9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdu.zzc(java.net.HttpURLConnection):long");
    }

    private final void zzio() {
        HttpURLConnection httpURLConnection = this.zzbil;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzaxy.zzc("Unexpected error while disconnecting", e);
            }
            this.zzbil = null;
        }
    }
}
