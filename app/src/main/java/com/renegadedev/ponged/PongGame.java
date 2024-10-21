package com.renegadedev.ponged;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

class PongGame extends SurfaceView {

    // Are we debugging?
    private final boolean DEBUGGING = true;

    // These objects are needed to do the drawing
    private SurfaceHolder mOurHolder;
    private Canvas mCanvas;
    private Paint mPaint;

    // How many frames per second did we get?
    private long mFPS;
    // The number of milliseconds in a second
    private final int MILLIS_IN_SECOND = 1000;

    // Holds the resolution of the screen
    private int mScreenX;
    private int mScreenY;
    // How big will the text be?
    private int mFontSize;
    private int mFontMargin;

    // the game objects
    private Bat mBat;
    private Ball mBall;

    // the current score and lives remaining
    private int mScore;
    private int mLives;

    /*
        The PongGame constructor
        called when this line:
        mPongGame = new PongGame(this, size.x, size.y);
        is executed from PongedActivity.
     */
    public PongGame(Context context, int x, int y) {
        // Super... calls the parent class
        // constructor of SurfaceView
        // provided by Android.
        super(context);
    }
}