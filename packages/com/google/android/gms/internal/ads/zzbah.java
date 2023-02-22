package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nonnull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbah {
    public static boolean zzdi(int i) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcrc)).booleanValue()) {
            return ((Boolean) zzwe.zzpu().zzd(zzaat.zzcrd)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0135 A[Catch: JSONException -> 0x0151, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0151, blocks: (B:33:0x011c, B:47:0x0144, B:48:0x0148, B:49:0x014d, B:38:0x012b, B:41:0x0135), top: B:55:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014d A[Catch: JSONException -> 0x0151, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0151, blocks: (B:33:0x011c, B:47:0x0144, B:48:0x0148, B:49:0x014d, B:38:0x012b, B:41:0x0135), top: B:55:0x011c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject zza(android.content.Context r16, android.view.View r17) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbah.zza(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject zzt(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxh)).booleanValue()) {
                com.google.android.gms.ads.internal.zzp.zzkp();
                jSONObject.put("contained_in_scroll_view", zzayh.zzs(view));
            } else {
                com.google.android.gms.ads.internal.zzp.zzkp();
                jSONObject.put("contained_in_scroll_view", zzayh.zzr(view) != -1);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject zzb(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.zzp.zzkp();
            jSONObject.put("can_show_on_lock_screen", zzayh.zzq(view));
            com.google.android.gms.ads.internal.zzp.zzkp();
            jSONObject.put("is_keyguard_locked", zzayh.zzay(context));
        } catch (JSONException unused) {
            zzaxy.zzfe("Unable to get lock screen information");
        }
        return jSONObject;
    }

    public static JSONObject zza(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        String str;
        String str2;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] zzu = zzu(view);
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, WeakReference<View>> next = it.next();
                View view2 = next.getValue().get();
                if (view2 != null) {
                    int[] zzu2 = zzu(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                    try {
                        jSONObject4.put("width", zzb(context, view2.getMeasuredWidth()));
                        jSONObject4.put("height", zzb(context, view2.getMeasuredHeight()));
                        jSONObject4.put("x", zzb(context, zzu2[0] - zzu[0]));
                        jSONObject4.put("y", zzb(context, zzu2[1] - zzu[1]));
                        jSONObject4.put(str4, str3);
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = zza(context, rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", zzb(context, zzu2[0] - zzu[0]));
                            jSONObject.put("y", zzb(context, zzu2[1] - zzu[1]));
                            jSONObject.put(str4, str3);
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            str = str3;
                            str2 = str4;
                            try {
                                jSONObject3.put("font_size", textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            } catch (JSONException unused) {
                                zzaxy.zzfe("Unable to get asset views information");
                                it = it2;
                                str3 = str;
                                str4 = str2;
                            }
                        } else {
                            str = str3;
                            str2 = str4;
                        }
                        jSONObject3.put("is_clickable", map2 != null && map2.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject2.put(next.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        str = str3;
                        str2 = str4;
                    }
                    it = it2;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject zza(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("click_point", zza(context, point, point2));
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e) {
                e = e;
                jSONObject = jSONObject2;
                zzaxy.zzc("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private static int[] zzu(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static Point zza(MotionEvent motionEvent, View view) {
        int[] zzu = zzu(view);
        return new Point(((int) motionEvent.getRawX()) - zzu[0], ((int) motionEvent.getRawY()) - zzu[1]);
    }

    private static JSONObject zza(Context context, Point point, Point point2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", zzb(context, point2.x));
            jSONObject.put("y", zzb(context, point2.y));
            jSONObject.put("start_x", zzb(context, point.x));
            jSONObject.put("start_y", zzb(context, point.y));
            return jSONObject;
        } catch (JSONException e) {
            zzaxy.zzc("Error occurred while putting signals into JSON object.", e);
            return null;
        }
    }

    public static boolean zza(zzdkx zzdkxVar) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxi)).booleanValue() && zzdkxVar.zzhav) {
            return ((Boolean) zzwe.zzpu().zzd(zzaat.zzcxk)).booleanValue();
        }
        return false;
    }

    public static JSONObject zzbl(@Nonnull Context context) {
        JSONObject jSONObject = new JSONObject();
        com.google.android.gms.ads.internal.zzp.zzkp();
        DisplayMetrics zza = zzayh.zza((WindowManager) context.getSystemService("window"));
        try {
            jSONObject.put("width", zzb(context, zza.widthPixels));
            jSONObject.put("height", zzb(context, zza.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams zzyg() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) zzwe.zzpu().zzd(zzaat.zzcxj)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    private static int zzb(Context context, int i) {
        return zzwe.zzpq().zzb(context, i);
    }

    private static JSONObject zza(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", zzb(context, rect.right - rect.left));
        jSONObject.put("height", zzb(context, rect.bottom - rect.top));
        jSONObject.put("x", zzb(context, rect.left));
        jSONObject.put("y", zzb(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }
}
