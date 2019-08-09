package com.example.tutorialapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.widget.ImageView;

public class foodActivityPicture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_picture);
//        if(getIntent().hasExtra("com.example.tutorialapplication.")){
////            TextView tv = (TextView) findViewById(R.id.groceryListTextView);
//            int id = getIntent().getExtras().getInt("com.example.tutorialapplication.ITEM_INDEX");
//            int pic = getImg(id);
//
//            ImageView img = (ImageView)findViewById(R.id.imageView);
//            scaleImg(img, pic);
//            //            tv.setText(text);
//    }

        Intent in = getIntent();
        int index = in.getIntExtra("com.example.tutorialapplication.ITEM_INDEX", -1);
        if(index > -1 ){
            int pic = getImg(index);
            ImageView img = (ImageView)findViewById(R.id.imageView);
            scaleImg(img, pic);
        }
}
    private int getImg(int positionId){
        switch(positionId){
            case 0: return R.drawable.peach;
            case 1: return R.drawable.tomato;
            case 2: return R.drawable.squash;
            default: return -1;
        }
    }
    private void scaleImg(ImageView img, int pic){
        Display screen = getWindowManager().getDefaultDisplay();
        BitmapFactory.Options options = new BitmapFactory.Options();

        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), pic, options);

        int imgWidth = options.outWidth;
        int screenWidth = screen.getWidth();
        int imgHeight = options.outHeight;

        if(imgWidth > screenWidth){
            int ratio = Math.round((float)imgWidth / (float)screenWidth);
            options.inSampleSize = ratio;
        }

        options.inJustDecodeBounds = false;
        Bitmap scaleImg = BitmapFactory.decodeResource(getResources(), pic, options);
        img.setImageBitmap(scaleImg);

    }
}
