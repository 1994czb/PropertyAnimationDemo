package com.animation.demo;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView icon;
    private LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        icon = (ImageView) findViewById(R.id.cion);
        container = (LinearLayout) findViewById(R.id.container);

    }


    public void onClick(View view) {


        //属性动画  ValueAnimator 的用法  ,属性动画本质是值动画
        final ValueAnimator valueAnimator = ValueAnimator.ofFloat(1f, 0f);
        //设置动画开始前的延迟
        valueAnimator.setStartDelay(1000);
        //动画时长
        valueAnimator.setDuration(2000);
        //设置动画监听
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animator) {
//                float animatedValue = (float)animator.getAnimatedValue();
//                Log.e("TAG", "=========== animatedValue == " + animatedValue);
//                ViewGroup.LayoutParams layoutParams = icon.getLayoutParams();
//                /*layoutParams.width= (int) (animatedValue*1000);
//                layoutParams.height= (int) (animatedValue*1000);*/
//                icon.setLayoutParams(layoutParams);
//                //淡入淡出动画效果
//                icon.setAlpha(animatedValue);

            }
        });
        valueAnimator.start();


        //ObjectAnimator的用法

//                //透明度变化
//                ObjectAnimator alphaObjectAnimator = ObjectAnimator.ofFloat(icon,"alpha",0f,1f,0.5f);
//                alphaObjectAnimator.setDuration(2000);
//                //延迟
//                alphaObjectAnimator.setStartDelay(100);
//               alphaObjectAnimator.start();


//                //缩放动画（水平方向）
//                ObjectAnimator scaleXObjectAnimator = ObjectAnimator.ofFloat(icon,"scaleX",0f,1f,0.5f);
//                scaleXObjectAnimator.setDuration(2000);
//                scaleXObjectAnimator.start();


//                //缩放动画（垂直方向）
//                ObjectAnimator scaleYObjectAnimator = ObjectAnimator.ofFloat(icon,"scaleY",0f,1f,0.5f);
//                scaleYObjectAnimator.setDuration(2000);
//                scaleYObjectAnimator.start();

//                //平移动画（水平方向）
//                ObjectAnimator translationXObjectAnimator = ObjectAnimator.ofFloat(icon,"translationX",0f,1000f);
//                translationXObjectAnimator.setDuration(2000);
//                translationXObjectAnimator.start();

//                //平移动画（垂直方向）
//                ObjectAnimator translationYObjectAnimator = ObjectAnimator.ofFloat(icon,"translationY",0f,1000f);
//                translationYObjectAnimator.setDuration(2000);
//                translationYObjectAnimator.start();

//        //旋转动画
//        ObjectAnimator rotationObjectAnimator = ObjectAnimator.ofFloat(icon,"rotation",0,360);
//        rotationObjectAnimator.setDuration(2000);
//        //旋转次数
//        rotationObjectAnimator.setRepeatCount(3);
//        //旋转动画的监听事件
//        rotationObjectAnimator.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animator) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animator) {
//
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animator) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animator) {
//
//            }
//        });
//        rotationObjectAnimator.start();


        //ViewPropertyAnimator的用法(可以理解为组合动画)
//        icon.animate().alpha(0.5f)
//                .translationX(100f)
//                .rotation(180)
//                .scaleX(2)
//                .scaleY(2)
//                .setStartDelay(2000)
//                .setDuration(3000);

//        //AnimatorSet 组合动画
//        AnimatorSet animatorSet = new AnimatorSet();
//        //透明动画
//        ObjectAnimator alphaObjectAnimator = ObjectAnimator.ofFloat(icon, "alpha", 0f, 1f, 0.5f);
//        //缩放动画
//        ObjectAnimator scaleXObjectAnimator = ObjectAnimator.ofFloat(icon, "scaleX", 0f, 1f, 0.5f);
//        /*
//        * 将动画组合到一起的几种方式
//        * */
//        //animatorSet.play(alphaObjectAnimator).with(scaleXObjectAnimator);
//        //animatorSet.playTogether(alphaObjectAnimator,scaleXObjectAnimator);
//        animatorSet.playSequentially(alphaObjectAnimator,scaleXObjectAnimator);
//        animatorSet.setDuration(3000);
//        animatorSet.start();


//        //ObjectAnimator也可以来实现组合动画
//        PropertyValuesHolder alphaPropertyValuesHolder = PropertyValuesHolder.ofFloat("alpha",0f,1f,0.5f);
//        PropertyValuesHolder scaleXPropertyValuesHolder = PropertyValuesHolder.ofFloat("scaleX",1f,2f);
//        ObjectAnimator rotationObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(icon,alphaPropertyValuesHolder,scaleXPropertyValuesHolder);
//        rotationObjectAnimator.setDuration(3000);
//        rotationObjectAnimator.start();


//        //用valueAnimator实现组合动画
//        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(0f,1f);
//        valueAnimator1.setDuration(3000);
//        valueAnimator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator valueAnimator) {
//                float animatedValue = (float) valueAnimator.getAnimatedValue();
//                ViewGroup.LayoutParams layoutParams = icon.getLayoutParams();
//                layoutParams.width = (int) (animatedValue * 300);
//                layoutParams.height = (int) (animatedValue * 300);
//                icon.setLayoutParams(layoutParams);
//                icon.setAlpha(animatedValue);
//            }
//        });
//        valueAnimator1.start();


        ////TODO 用xml文件实现属性动画的效果


//        //用AnimatorInflater去加载ValueAnimator对应的xml文件
//        ValueAnimator valueAnimator1 = (ValueAnimator) AnimatorInflater.loadAnimator(this, R.animator.value_animator);
//        valueAnimator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator valueAnimator) {
//                float animatedValue = (float) valueAnimator.getAnimatedValue();
//                icon.setAlpha(animatedValue);
//            }
//        });
//        valueAnimator1.setDuration(3000);
//        valueAnimator1.start();


//        //用AnimatorInflater去加载ObjectAnimator对应的xml文件
//        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.animator.object_animator);
//        objectAnimator.setDuration(3000);
//        objectAnimator.setTarget(icon);
//        objectAnimator.start();


//        //用AnimatorInflater去加载AnimatorSet对应的xml文件
//        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.animator_set);
//        animatorSet.setDuration(3000);
//        animatorSet.setTarget(icon);
//        animatorSet.start();


//        //利用ValueAnimator进行颜色变化动画
//        ValueAnimator valueAnimator1;
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
//            valueAnimator1 = ValueAnimator.ofArgb(0xffff0000, 0xff0000ff, 0xff00ff00);
//            valueAnimator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//                @Override
//                public void onAnimationUpdate(ValueAnimator valueAnimator) {
//                    int colorValue = (int) valueAnimator.getAnimatedValue();
//                    container.setBackgroundColor(colorValue);
//                }
//            });
//            valueAnimator1.setDuration(3000);
//            valueAnimator1.start();
//        }



        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(1000, 1000);
        //fraction是一个从0到1变化的值
        ValueAnimator valueAnimator1 = ValueAnimator.ofObject(new TypeEvaluator<Point>() {
            @Override
            public Point evaluate(float fraction, Point startValue, Point endValue) {
                float startX = startValue.getX();
                float endX = endValue.getX();
                float currentX = startX + fraction * (endX - startX);

                float startY = startValue.getY();
                float endY = endValue.getY();
                float currentY = startY + fraction * (endY - startY);
                return new Point(currentX, currentY);
            }
        }, startPoint, endPoint);

        valueAnimator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Point point = (Point) animation.getAnimatedValue();
            }
        });

    }
}
