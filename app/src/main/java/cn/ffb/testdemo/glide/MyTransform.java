package cn.ffb.testdemo.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;

/**
 * 根据ImageView的大小，对图片进行等比例缩放
 * Created by zhaoyalong on 2017/9/2.
 */

public class MyTransform extends BitmapTransformation {
    public MyTransform(Context context) {
        super(context);
    }

    public MyTransform(BitmapPool bitmapPool) {
        super(bitmapPool);
    }

    @Override
    protected Bitmap transform(BitmapPool pool, Bitmap toTransform, int outWidth, int outHeight) {
        int bitWidth = toTransform.getWidth();
        int bitHeight = toTransform.getHeight();
        float scale;
        //将图片宽高比大于imageView宽高比,按照宽度计算缩放比例
        if (bitWidth *outHeight  > outWidth*bitHeight) {
            scale=(float)outWidth/bitWidth;
        } else {
            scale=(float)outHeight/bitHeight;
        }
        // 取得想要缩放的matrix参数
        Matrix matrix = new Matrix();
        matrix.postScale(scale/2, scale/2);
        Bitmap newbm = Bitmap.createBitmap(toTransform, 0, 0, bitWidth,bitHeight,matrix,true);
        return newbm;
    }

    @Override
    public String getId() {
        return "cn.ffb.testdemo.glide.MyTransform";
    }
}
