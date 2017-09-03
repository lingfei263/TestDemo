package cn.ffb.testdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.ffb.testdemo.base.MyBaseActivity;
import cn.ffb.testdemo.callback.CBActivity;
import cn.ffb.testdemo.glide.GlideActivity;

public class MainActivity extends MyBaseActivity implements View.OnClickListener {
    private Button cbBtn, glideBtn;

    @Override
    protected int getContentViewLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView() {
        cbBtn = (Button) findViewById(R.id.main_cb);
        cbBtn.setOnClickListener(this);
        glideBtn = (Button) findViewById(R.id.main_glide);
        glideBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_cb:
                startActivity(CBActivity.class);
                break;
            case R.id.main_glide:
                startActivity(GlideActivity.class);
                break;
            default:
                showToast("缺少点击事件");
                break;
        }
    }
}
