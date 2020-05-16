package com.myhexaville.androidwebrtc.databinding;
import com.myhexaville.androidwebrtc.R;
import com.myhexaville.androidwebrtc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCallBindingImpl extends ActivityCallBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.remote_video_layout, 1);
        sViewsWithIds.put(R.id.remote_video_view, 2);
        sViewsWithIds.put(R.id.local_video_layout, 3);
        sViewsWithIds.put(R.id.local_video_view, 4);
        sViewsWithIds.put(R.id.call_fragment_container, 5);
        sViewsWithIds.put(R.id.contact_name_call, 6);
        sViewsWithIds.put(R.id.buttons_call_container, 7);
        sViewsWithIds.put(R.id.button_call_disconnect, 8);
        sViewsWithIds.put(R.id.button_call_switch_camera, 9);
        sViewsWithIds.put(R.id.button_call_toggle_mic, 10);
        sViewsWithIds.put(R.id.capture_format_text_call, 11);
        sViewsWithIds.put(R.id.capture_format_slider_call, 12);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCallBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityCallBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[8]
            , (android.widget.ImageButton) bindings[9]
            , (android.widget.ImageButton) bindings[10]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.FrameLayout) bindings[5]
            , (android.widget.SeekBar) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[6]
            , (com.myhexaville.androidwebrtc.app_rtc_sample.view.PercentFrameLayout) bindings[3]
            , (org.webrtc.SurfaceViewRenderer) bindings[4]
            , (com.myhexaville.androidwebrtc.app_rtc_sample.view.PercentFrameLayout) bindings[1]
            , (org.webrtc.SurfaceViewRenderer) bindings[2]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}