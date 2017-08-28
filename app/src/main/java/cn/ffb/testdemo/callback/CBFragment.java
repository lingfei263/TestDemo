package cn.ffb.testdemo.callback;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import cn.ffb.testdemo.MainActivity;
import cn.ffb.testdemo.R;

/**
 * Created by Administrator on 2017/8/28.
 */

public class CBFragment extends Fragment implements ICallBack {
    private EditText numa, numb;
    private Button btn;
    private TextView textView;
    private int a = 0, b = 0;
    private String stra, strb;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cb, null);
        numa = (EditText) view.findViewById(R.id.cb_num_a);
        numb = (EditText) view.findViewById(R.id.cb_num_b);
        btn = (Button) view.findViewById(R.id.cb_btn);
        textView = (TextView) view.findViewById(R.id.cb_tv);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stra = numa.getText().toString().trim();
                strb = numb.getText().toString().trim();
                if (!stra.isEmpty()) {
                    a =Integer.parseInt(stra) ;
                }else{
                    numa.setText(0+"");
                }
                if (!strb.isEmpty()){
                    b =Integer.parseInt(strb) ;
                }else{
                    numb.setText(0+"");
                }
                MainActivity mainActivity= (MainActivity) getActivity();
                mainActivity.calculate(a,b,CBFragment.this);
            }
        });
        return view;
    }

    @Override
    public void update(String str) {
        textView.setText(str);
    }
}
