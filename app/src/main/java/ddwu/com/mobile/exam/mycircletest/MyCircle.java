package ddwu.com.mobile.exam.mycircletest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyCircle extends View {

    private Paint myPaint;
    private int x;
    private int y;
    private int r = 100;
    int color= Color.RED;

    public MyCircle(Context context) {
        super(context);
        myPaint = new Paint();
    }

    public MyCircle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        myPaint = new Paint();
    }

    public MyCircle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        myPaint = new Paint();
    }

    public int getR() {return r;}
    public void setR(int r) {this.r = r;}

    public int getMyPaint() {return color;}
    public void setMyPaint(int color) {this.color = color;}

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        myPaint.setColor(color);

        x = getWidth() / 2;
        y = getHeight() / 2;

        canvas.drawCircle(x, y, r, myPaint);
    }
}
