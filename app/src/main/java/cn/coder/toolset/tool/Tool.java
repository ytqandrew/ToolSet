package cn.coder.toolset.tool;

import android.app.Activity;
import android.content.Intent;

import cn.coder.toolset.Common.ToolSetApplication;
import cn.coder.toolset.feature.Feature;

/**
 * Created by Administrator on 2017/8/8.
 */

public abstract class Tool extends Feature{
    public Tool(String title, String des) {
        super(title, des);
    }
}
