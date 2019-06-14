package com.star.util.hook;

import android.os.Handler;
import android.os.Message;

import com.star.util.Logger;

/**
 * author heyang
 * email  512573717@qq.com
 * created 2019/6/13  上午9:18.
 */
public class ActivityThreadHCallBack implements Handler.Callback {


    // private static final int SERVICE_ARGS = 115;
    // private static final int STOP_SERVICE = 116;
    // private static final int SLEEPING = 137;
    // private static final int STOP_ACTIVITY_SHOW = 103;
    // private static final int STOP_ACTIVITY_HIDE = 104;


    @Override
    public boolean handleMessage(Message msg) {
        final int what = msg.what;
        Object record = msg.obj;

        switch (what) {
            case SERVICE_ARGS:
                Logger.e(msg.what+"Activity msg===================");
                SpBlockHelper.beforeSPBlock("SERVICE_ARGS");
                break;
            case STOP_SERVICE:
                Logger.e(msg.what+"Activity msg===================");
                SpBlockHelper.beforeSPBlock("STOP_SERVICE");
                break;
            case SLEEPING:
                Logger.e(msg.what+"Activity msg===================");
                SpBlockHelper.beforeSPBlock("SLEEPING");
                break;
            case STOP_ACTIVITY_SHOW:
            case STOP_ACTIVITY_HIDE:
                Logger.e(msg.what+"Activity msg  STOP_ACTIVITY===================");
                SpBlockHelper.beforeSPBlock("STOP_ACTIVITY");
                break;

        }
        return false;
    }
}
