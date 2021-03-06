package com.example.sweet.game20.Objects;

import android.content.Context;
import android.opengl.Matrix;

import com.example.sweet.game20.util.Constants;
import com.example.sweet.game20.util.VectorFunctions;

import static android.opengl.GLES20.glUniform1f;

/**
 * Created by Sweet on 5/15/2018.
 */

public class Simple extends Enemy
{
    private int[]
            //gunPixelCoordinates = {19, 8, 20, 8, 21, 8, 19, 11, 20, 11, 21, 11},
            gunPixelCoordinates = {19, 8, 20, 8, 21, 8, 19, 11, 20, 11, 21, 11},
            //thusterPixelCoordinates = {0, 7, 1, 8, 2, 9, 2, 10, 1, 11, 0, 12, 1, 9, 1, 10};
            thusterPixelCoordinates = {0, 8, 0, 9, 0, 10, 0, 11, 1, 9, 1, 10};

    private Pixel[]
            gun1Pixels = new Pixel[gunPixelCoordinates.length/2],
            thrusterPixels = new Pixel[thusterPixelCoordinates.length/2];

    private float trackDistance = 1.2f;
    private float engageDistance = 1f;
    private float retreatDistance = .5f;
    private boolean track = false;
    private boolean retreat = false;

    public Simple(PixelGroup p, int sL, Gun g, ParticleSystem ps, float modifier)
    {
        super(p, sL, ps);

        for(int i = 0; i < thusterPixelCoordinates.length; i += 2)
            thrusterPixels[i/2] = enemyBody.getpMap()[thusterPixelCoordinates[i+1]][thusterPixelCoordinates[i]];

        for(int i = 0; i < gunPixelCoordinates.length; i += 2)
            gun1Pixels[i/2] = enemyBody.getpMap()[gunPixelCoordinates[i+1]][gunPixelCoordinates[i]];

        guns = new GunComponent[1];
        thrusters = new ThrustComponent[1];
        thrusters[0] = new ThrustComponent(thrusterPixels, 0, 0, 0, 0, 0, 2, ps);
        //guns[0] = new GunComponent(gun1Pixels, 1, 0, 0, 0, g, ps);
        enemyBody.angle = 3.14;
        enemyBody.rotate(enemyBody.angle);
        baseSpeed = .005f;
        hasGun = false;
    }

    public void move(float pX, float pY)
    {
        float distanceToPlayer = VectorFunctions.getMagnitude(pX - enemyBody.centerX, pY - enemyBody.centerY);
        float angleMoving = 0f;
        float ratio = 1;
        if(distanceToPlayer > trackDistance)
        {
            track = true;
            retreat = false;
        }
        else if(distanceToPlayer < retreatDistance)
        {
            retreat = true;
            track = false;
        }

        if(track)
            angleMoving = -(float)(Math.atan2(pY - enemyBody.centerY,pX - enemyBody.centerX));

        if(retreat)
            angleMoving = -(float)(Math.atan2(enemyBody.centerY - pY, enemyBody.centerX - pX));


        rotate(angleMoving , .08f);

        float tempDistX = -(float)(baseSpeed * thrusters[0].thrustPower * Math.cos(enemyBody.angle));
        float tempDistY = (float)(baseSpeed * thrusters[0].thrustPower * Math.sin(enemyBody.angle));

        if(distanceToPlayer < engageDistance && distanceToPlayer > retreatDistance && track)
        {
            tempDistX *= .6;
            tempDistY *= .6;
            ratio = .6f;
            //guns[0].gun.shoot(guns[0].x + enemyBody.centerX, guns[0].y+ enemyBody.centerY, (float)enemyBody.angle + (float)Math.PI);
        }

        x+=tempDistX;
        y+=tempDistY;
        enemyBody.move(-tempDistX, -tempDistY);
        //guns[0].gun.move();
        addThrustParticles(thrusterPixels, ratio, .06f);
    }

    public void rotate(float angleMoving, float rotateSpeed)
    {
        float delta = (float)enemyBody.angle - angleMoving;
        if (delta > rotateSpeed || delta < -rotateSpeed)
        {
            if (delta < -Math.PI || (delta > 0 && delta < Math.PI))
                enemyBody.angle -= rotateSpeed;
            else
                enemyBody.angle += rotateSpeed;
        }
        else
            enemyBody.angle =  angleMoving;

        enemyBody.rotate(enemyBody.angle);

        if (enemyBody.angle > Math.PI)
            enemyBody.angle -= Constants.twoPI;
        else if (enemyBody.angle < -Math.PI)
            enemyBody.angle += Constants.twoPI;
    }
    
    public void addThrustParticles(Pixel[] pixels, float ratio, float dist)
    {
        for(Pixel p: pixels)
        {
            if(p.live)
            {
                float xDisp = p.xOriginal * enemyBody.cosA + p.yOriginal * enemyBody.sinA;
                float yDisp = p.yOriginal * enemyBody.cosA - p.xOriginal * enemyBody.sinA;
                for (int t = 0; t < 2; t++)
                {
                    particleSystem.addParticle(xDisp + enemyBody.centerX, yDisp + enemyBody.centerY,
                            //-enemyBody.cosA, enemyBody.sinA,
                            (float)-enemyBody.angle,
                            (float) (Math.random() * .2 + .8), 0, (float) (Math.random()), .7f,
                            (baseSpeed * thrusters[0].thrustPower * (float)(Math.random()*70+20)) * ratio, dist * ratio * (float)Math.random()*2, (float)(Math.random()*20)
                    );
                }
            }
        }
    }
    
    @Override
    public void draw(double interpolation)
    {
        //guns[0].gun.draw(0);
        glUniform1f(xDispLoc, enemyBody.getCenterX());
        glUniform1f(yDispLoc, enemyBody.getCenterY());
        enemyBody.draw();
    }
    public void shoot()
    {

    }
    @Override
    public Simple clone()
    {
        //public Simple(PixelGroup p, int sL, Gun g, ParticleSystem ps, float modifier)
        Simple s = new Simple(enemyBody.clone(),0, guns[0].gun.clone(), particleSystem, 0f);
        s.setUniformLocs(xDispLoc, yDispLoc);
        return s;
    }
}
