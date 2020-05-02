package com.example.asus.drawgeometricfigure;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by asus on 2020/5/2.
 */
public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
/**
 * 绘制机器人
 * */
        Paint myPaint = new Paint();//创建画笔

        myPaint.setAntiAlias(true);//采用抗锯齿功能 这样绘制出来的曲线更加光滑
        myPaint.setColor(0xFFA4C739); //设置画笔颜色 0xFF代表该颜色完全不透明 A4C739绿色

        //绘制机器人的头弧
        RectF rectF = new RectF(10,10,100,100);//定义外轮廓矩形 包裹Arc的外周矩形尺寸 前两个是左上点 后两个为右下点
        rectF.offset(90, 20);//调整起始位置

        canvas.drawArc(rectF, -10, -160, false, myPaint);//1、Arc外周矩形尺寸，2、起始角度 3、arc划过的角度 5、是否包裹圆心 6、所用画笔

        //绘制眼睛
        myPaint.setColor(0xFFFFFFFF);//设置画笔颜色为白色 眼睛是白色的
        canvas.drawCircle(165,53,4,myPaint);//绘制圆形 1 2 指定圆心 3 半径 4 画笔
        canvas.drawCircle(125, 53, 4, myPaint);//第二支眼睛

        //绘制天线
        myPaint.setColor(0xFFA4C739);//设置画笔颜色为绿色
        myPaint.setStrokeWidth(2);//设置笔触的宽度 为2
        canvas.drawLine(110, 15, 125, 35, myPaint);//第一跟天线 1 2 起始点位置 3 4 终止点位置
        canvas.drawLine(180, 15, 165, 35, myPaint);//第二根天线

        //绘制机器人身体
        canvas.drawRect(100, 75, 190, 150, myPaint);//绘制矩形
        //绘制圆角矩形 也需要设置圆角矩形的外周 轮廓矩形 即RectF
        RectF rectF_body = new RectF(100,140,190,160);
        canvas.drawRoundRect(rectF_body, 10, 10, myPaint);//1、是圆角矩形外周矩形 2、x轴方向圆角半径 3、y方向圆角半径 4、画笔

        //绘制机器人的胳膊和腿

        RectF rectF_arm = new RectF(75,75,95,140);
        canvas.drawRoundRect(rectF_arm,10,10,myPaint);//1、是圆角矩形外周矩形 2、x轴方向圆角半径 3、y方向圆角半径 4、画笔

        rectF_arm.offset(120,0);//绘制第二个胳膊 将第一个的 起始位置修改一下就行了
        canvas.drawRoundRect(rectF_arm,10,10,myPaint);


        //绘制腿
        RectF rectF_leg = new RectF(115,150,135,200);
        canvas.drawRoundRect(rectF_leg,10,10,myPaint);
        rectF_leg.offset(40,0);
        canvas.drawRoundRect(rectF_leg,10,10,myPaint);




    }
}
