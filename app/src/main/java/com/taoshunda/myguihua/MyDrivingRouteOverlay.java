package com.taoshunda.myguihua;

import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;

/**
 * Created by 小智
 * on 2017/9/28
 * 描述：
 */

public class MyDrivingRouteOverlay extends DrivingRouteOverlay {


    /**
     * 构造函数
     *
     * @param baiduMap 该DrivingRouteOvelray引用的 BaiduMap
     */
    public MyDrivingRouteOverlay(BaiduMap baiduMap) {
        super(baiduMap);
    }

    @Override
    public BitmapDescriptor getStartMarker() { //覆写此方法以改变默认起点图标
        return BitmapDescriptorFactory.fromResource(R.mipmap.map_location);
        //这里可以使用BitmapDescriptorFactory.fromView(view)实现自定义view覆盖物，自定义覆盖物请关注以后的文章。
    }

    @Override
    public int getLineColor() {
        // TODO Auto-generated method stub //覆写此方法以改变默认绘制颜色 //Returns: //线颜色
        return super.getLineColor();
    }

    @Override
    public BitmapDescriptor getTerminalMarker() { //覆写此方法以改变默认终点图标
        return BitmapDescriptorFactory.fromResource(R.mipmap.map_location_user);
    }

    @Override
    public boolean onRouteNodeClick(int i) { // TODO Auto-generated method stub //覆写此方法以改变默认点击处理
          return true;
    }
}
