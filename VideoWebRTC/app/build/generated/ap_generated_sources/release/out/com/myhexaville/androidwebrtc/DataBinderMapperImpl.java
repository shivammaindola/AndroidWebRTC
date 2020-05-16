package com.myhexaville.androidwebrtc;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.myhexaville.androidwebrtc.databinding.ActivityCallBindingImpl;
import com.myhexaville.androidwebrtc.databinding.ActivityMainBindingImpl;
import com.myhexaville.androidwebrtc.databinding.ActivitySampleCameraRenderBindingImpl;
import com.myhexaville.androidwebrtc.databinding.ActivitySampleDataChannelBindingImpl;
import com.myhexaville.androidwebrtc.databinding.ActivitySamplePeerConnectionBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCALL = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ACTIVITYSAMPLECAMERARENDER = 3;

  private static final int LAYOUT_ACTIVITYSAMPLEDATACHANNEL = 4;

  private static final int LAYOUT_ACTIVITYSAMPLEPEERCONNECTION = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.myhexaville.androidwebrtc.R.layout.activity_call, LAYOUT_ACTIVITYCALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.myhexaville.androidwebrtc.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.myhexaville.androidwebrtc.R.layout.activity_sample_camera_render, LAYOUT_ACTIVITYSAMPLECAMERARENDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.myhexaville.androidwebrtc.R.layout.activity_sample_data_channel, LAYOUT_ACTIVITYSAMPLEDATACHANNEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.myhexaville.androidwebrtc.R.layout.activity_sample_peer_connection, LAYOUT_ACTIVITYSAMPLEPEERCONNECTION);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCALL: {
          if ("layout/activity_call_0".equals(tag)) {
            return new ActivityCallBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_call is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSAMPLECAMERARENDER: {
          if ("layout/activity_sample_camera_render_0".equals(tag)) {
            return new ActivitySampleCameraRenderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sample_camera_render is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSAMPLEDATACHANNEL: {
          if ("layout/activity_sample_data_channel_0".equals(tag)) {
            return new ActivitySampleDataChannelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sample_data_channel is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSAMPLEPEERCONNECTION: {
          if ("layout/activity_sample_peer_connection_0".equals(tag)) {
            return new ActivitySamplePeerConnectionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sample_peer_connection is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_call_0", com.myhexaville.androidwebrtc.R.layout.activity_call);
      sKeys.put("layout/activity_main_0", com.myhexaville.androidwebrtc.R.layout.activity_main);
      sKeys.put("layout/activity_sample_camera_render_0", com.myhexaville.androidwebrtc.R.layout.activity_sample_camera_render);
      sKeys.put("layout/activity_sample_data_channel_0", com.myhexaville.androidwebrtc.R.layout.activity_sample_data_channel);
      sKeys.put("layout/activity_sample_peer_connection_0", com.myhexaville.androidwebrtc.R.layout.activity_sample_peer_connection);
    }
  }
}
