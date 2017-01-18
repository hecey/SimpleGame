package com.hecey.kat.simplegame;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by katrina on 1/18/2017.
 */

public class GamePanel extends SurfaceView implements SurfaceHolder.Callback{
 public GamePanel(Context context){
    super (context);
     getHolder().addCallback(this);
 }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height){}
    @Override
    public void surfaceDestroyed (SurfaceHolder holder){}
    @Override
    public void surfaceCreated (SurfaceHolder holder){}
}
