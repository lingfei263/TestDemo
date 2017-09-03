package cn.ffb.testdemo.glide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;

import cn.ffb.testdemo.R;

public class GlideActivity extends AppCompatActivity {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        imageView = (ImageView) findViewById(R.id.glide_image_view);
    }
    public void loadImage(View view) {
        String url = "http://p0.so.qhimgs1.com/t01a737e7d235d5ffd0.jpg";
        Glide.with(this).load(url).transform(new MyTransform(this)).into(imageView);
    }

}
