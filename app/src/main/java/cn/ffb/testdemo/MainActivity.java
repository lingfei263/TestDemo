package cn.ffb.testdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.ffb.testdemo.callback.CBFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        CBFragment fragment = new CBFragment();
        fragmentTransaction.add(R.id.fl_common_fragment_container, fragment);
        fragmentTransaction.commit();
    }
    public void calculate(int a,int b,CBFragment cbFragment){
        int c = a+b;
        cbFragment.update(c+"");
    }

}
