package cn.ffb.testdemo.common;


import android.os.Bundle;


import cn.ffb.base.BaseActivity;
import cn.ffb.testdemo.R;

public abstract class CommonFragmentContainerActivity extends BaseActivity {

  protected int getFragmentContainerViewId() {
    return R.id.fl_common_fragment_container;
  }


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.com_fragment_container);
  }


}
