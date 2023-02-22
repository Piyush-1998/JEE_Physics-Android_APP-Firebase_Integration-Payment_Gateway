package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbd extends zzar {
    private final zzbf zzcv;
    private final SSLSocketFactory zzcw;

    public zzbd() {
        this(null);
    }

    private zzbd(zzbf zzbfVar) {
        this(null, null);
    }

    private zzbd(zzbf zzbfVar, SSLSocketFactory sSLSocketFactory) {
        this.zzcv = null;
        this.zzcw = null;
    }

    @Override // com.google.android.gms.internal.ads.zzar
    public final zzbb zza(zzaa<?> zzaaVar, Map<String, String> map) throws IOException, zzl {
        String url = zzaaVar.getUrl();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(zzaaVar.getHeaders());
        zzbf zzbfVar = this.zzcv;
        if (zzbfVar != null) {
            String zzi = zzbfVar.zzi(url);
            if (zzi == null) {
                String valueOf = String.valueOf(url);
                throw new IOException(valueOf.length() != 0 ? "URL blocked by rewriter: ".concat(valueOf) : new String("URL blocked by rewriter: "));
            }
            url = zzi;
        }
        URL url2 = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int zzi2 = zzaaVar.zzi();
        httpURLConnection.setConnectTimeout(zzi2);
        httpURLConnection.setReadTimeout(zzi2);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url2.getProtocol());
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            switch (zzaaVar.getMethod()) {
                case -1:
                    break;
                case 0:
                    httpURLConnection.setRequestMethod("GET");
                    break;
                case 1:
                    httpURLConnection.setRequestMethod("POST");
                    zza(httpURLConnection, zzaaVar);
                    break;
                case 2:
                    httpURLConnection.setRequestMethod("PUT");
                    zza(httpURLConnection, zzaaVar);
                    break;
                case 3:
                    httpURLConnection.setRequestMethod("DELETE");
                    break;
                case 4:
                    httpURLConnection.setRequestMethod("HEAD");
                    break;
                case 5:
                    httpURLConnection.setRequestMethod("OPTIONS");
                    break;
                case 6:
                    httpURLConnection.setRequestMethod("TRACE");
                    break;
                case 7:
                    httpURLConnection.setRequestMethod("PATCH");
                    zza(httpURLConnection, zzaaVar);
                    break;
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (!((zzaaVar.getMethod() == 4 || (100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304) ? false : true)) {
                zzbb zzbbVar = new zzbb(responseCode, zza(httpURLConnection.getHeaderFields()));
                httpURLConnection.disconnect();
                return zzbbVar;
            }
            try {
                return new zzbb(responseCode, zza(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzbg(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static List<zzu> zza(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new zzu(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream zza(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private final void zza(HttpURLConnection httpURLConnection, zzaa<?> zzaaVar) throws IOException, zzl {
        byte[] zzg = zzaaVar.zzg();
        if (zzg != null) {
            httpURLConnection.setDoOutput(true);
            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                httpURLConnection.setRequestProperty("Content-Type", "UTF-8".length() != 0 ? "application/x-www-form-urlencoded; charset=".concat("UTF-8") : new String("application/x-www-form-urlencoded; charset="));
            }
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(zzg);
            dataOutputStream.close();
        }
    }
}
