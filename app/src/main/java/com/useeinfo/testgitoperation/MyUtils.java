package com.useeinfo.testgitoperation;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Created by lyx on 2017/8/9 14:28.
 * Contact:     lvyongxu@gmail.com
 * Description:
 */

public class MyUtils {

    /**
     * 获取软件版本号
     *
     * @param context
     * @return
     */
    public static String getVersionName(Context context) {
        String version;
        try {
            PackageManager manager = context.getPackageManager();
            PackageInfo info = manager.getPackageInfo(context.getPackageName(), 0);
//            version1 = info.versionCode;//build
            version = info.versionName;
        } catch (Exception e) {
            e.printStackTrace();
            version = "N/A";
        }
        return version;
    }

}
