package com.example.sweet.game20.util;

/**
 * Created by Sweet on 5/17/2018.
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class SimpleEnemyData
{
    public static final float[][] x = new float[][]{
            {-1f, -1f, -1f, -1f, -1f, -1f, -1f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, -1f, -1f, -1f, -1f, -1f, -1f, -1f, -1f, -1f},
            {-1f, -1f, -1f, -1f, -1f, -1f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, 0.0168f, -1f, -1f, -1f, -1f, -1f, -1f, -1f, -1f},
            {-1f, -1f, -1f, -1f, -1f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, 0.0168f, 0.0224f, 0.027999999f, -1f, -1f, -1f, -1f, -1f, -1f},
            {-1f, -1f, -1f, -1f, -0.0448f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, 0.0168f, 0.0224f, 0.027999999f, 0.0336f, 0.0392f, -1f, -1f, -1f, -1f},
            {-1f, -1f, -1f, -0.050399996f, -0.0448f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, 0.0168f, 0.0224f, 0.027999999f, 0.0336f, 0.0392f, 0.0448f, 0.050399996f, -1f, -1f},
            {-1f, -1f, -0.055999998f, -0.050399996f, -0.0448f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, 0.0168f, 0.0224f, 0.027999999f, 0.0336f, 0.0392f, 0.0448f, 0.050399996f, 0.055999998f, -1f},
            {-1f, -0.0616f, -0.055999998f, -0.050399996f, -0.0448f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, 0.0168f, 0.0224f, 0.027999999f, 0.0336f, 0.0392f, 0.0448f, 0.050399996f, 0.055999998f, 0.0616f},
            {-0.0672f, -0.0616f, -0.055999998f, -0.050399996f, -0.0448f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, 0.0168f, 0.0224f, 0.027999999f, 0.0336f, 0.0392f, 0.0448f, 0.050399996f, 0.055999998f, -1f},
            {-0.0672f, -0.0616f, -0.055999998f, -0.050399996f, -0.0448f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, -1f, 0.0224f, 0.027999999f, 0.0336f, 0.0392f, 0.0448f, 0.050399996f, 0.055999998f, -1f},
            {-0.0672f, -0.0616f, -0.055999998f, -0.050399996f, -0.0448f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, -1f, -1f, -1f, 0.0336f, 0.0392f, 0.0448f, 0.050399996f, 0.055999998f, -1f},
            {-0.0672f, -0.0616f, -0.055999998f, -0.050399996f, -0.0448f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, -1f, -1f, -1f, -1f, 0.0392f, 0.0448f, 0.050399996f, 0.055999998f, -1f},
            {-0.0672f, -0.0616f, -0.055999998f, -0.050399996f, -0.0448f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, -1f, 0.0224f, 0.027999999f, 0.0336f, 0.0392f, 0.0448f, 0.050399996f, 0.055999998f, -1},
            {-0.0672f, -0.0616f, -0.055999998f, -0.050399996f, -0.0448f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, 0.0168f, 0.0224f, 0.027999999f, 0.0336f, 0.0392f, 0.0448f, 0.050399996f, 0.055999998f, -1},
            {-1f, -0.0616f, -0.055999998f, -0.050399996f, -0.0448f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, 0.0168f, 0.0224f, 0.027999999f, 0.0336f, 0.0392f, 0.0448f, 0.050399996f, 0.055999998f, 0.0616f},
            {-1f, -1f, -0.055999998f, -0.050399996f, -0.0448f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, 0.0168f, 0.0224f, 0.027999999f, 0.0336f, 0.0392f, 0.0448f, 0.050399996f, 0.055999998f, -1},
            {-1f, -1f, -1f, -0.050399996f, -0.0448f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, 0.0168f, 0.0224f, 0.027999999f, 0.0336f, 0.0392f, 0.0448f, 0.050399996f, -1f, -1},
            {-1f, -1f, -1f, -1f, -0.0448f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, 0.0168f, 0.0224f, 0.027999999f, 0.0336f, 0.0392f, -1f, -1f, -1f, -1},
            {-1f, -1f, -1f, -1f, -1f, -0.0392f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, 0.0168f, 0.0224f, 0.027999999f, -1f, -1f, -1f, -1f, -1f, -1},
            {-1f, -1f, -1f, -1f, -1f, -1f, -0.0336f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, 0.0168f, -1f, -1f, -1f, -1f, -1f, -1f, -1f, -1},
            {-1f, -1f, -1f, -1f, -1f, -1f, -1f, -0.027999999f, -0.0224f, -0.0168f, -0.0112f, -0.0056f, 0.0f, 0.0056f, 0.0112f, -1f, -1f, -1f, -1f, -1f, -1f, -1f, -1f, -1}
    };
    
    public static final float[][] y = new float[][]{
            { -1f, -1f, -1f, -1f, -1f, -1f, -1f, -0.055999998f, -0.055999998f, -0.055999998f, -0.055999998f, -0.055999998f, -0.055999998f, -0.055999998f, -0.055999998f, -1f, -1f, -1f, -1f, -1f, -1f, -1f, -1f, -1f},
            { -1f, -1f, -1f, -1f, -1f, -1f, -0.050399996f, -0.050399996f, -0.050399996f, -0.050399996f, -0.050399996f, -0.050399996f, -0.050399996f, -0.050399996f, -0.050399996f, -0.050399996f, -1f, -1f, -1f, -1f, -1f, -1f, -1f, -1f},
            { -1f, -1f, -1f, -1f, -1f, -0.0448f, -0.0448f, -0.0448f, -0.0448f, -0.0448f, -0.0448f, -0.0448f, -0.0448f, -0.0448f, -0.0448f, -0.0448f, -0.0448f, -0.0448f, -1f, -1f, -1f, -1f, -1f, -1f},
            { -1f, -1f, -1f, -1f, -0.0392f, -0.0392f, -0.0392f, -0.0392f, -0.0392f, -0.0392f, -0.0392f, -0.0392f, -0.0392f, -0.0392f, -0.0392f, -0.0392f, -0.0392f, -0.0392f, -0.0392f, -0.0392f, -1f, -1f, -1f, -1f},
            { -1f, -1f, -1f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -0.0336f, -1f, -1f},
            { -1f, -1f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -0.027999999f, -1f},
            { -1f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f, -0.0224f},
            { -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -0.0168f, -1f},
            { -0.0112f, -0.0112f, -0.0112f, -0.0112f, -0.0112f, -0.0112f, -0.0112f, -0.0112f, -0.0112f, -0.0112f, -0.0112f, -0.0112f, -0.0112f, -0.0112f, -0.0112f, -1f, -0.0112f, -0.0112f, -0.0112f, -0.0112f, -0.0112f, -0.0112f, -0.0112f, -1f},
            { -0.0056f, -0.0056f, -0.0056f, -0.0056f, -0.0056f, -0.0056f, -0.0056f, -0.0056f, -0.0056f, -0.0056f, -0.0056f, -0.0056f, -0.0056f, -0.0056f, -0.0056f, -1f, -1f, -1f, -0.0056f, -0.0056f, -0.0056f, -0.0056f, -0.0056f, -1f},
            { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1f, -1f, -1f, -1f, 0.0f, 0.0f, 0.0f, 0.0f, -1f, },
            { 0.0056f, 0.0056f, 0.0056f, 0.0056f, 0.0056f, 0.0056f, 0.0056f, 0.0056f, 0.0056f, 0.0056f, 0.0056f, 0.0056f, 0.0056f, 0.0056f, 0.0056f, -1f, 0.0056f, 0.0056f, 0.0056f, 0.0056f, 0.0056f, 0.0056f, 0.0056f, -1f},
            { 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, 0.0112f, -1f},
            { -1f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f, 0.0168f},
            { -1f, -1f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, 0.0224f, -1f},
            { -1f, -1f, -1f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, 0.027999999f, -1f, -1f},
            { -1f, -1f, -1f, -1f, 0.0336f, 0.0336f, 0.0336f, 0.0336f, 0.0336f, 0.0336f, 0.0336f, 0.0336f, 0.0336f, 0.0336f, 0.0336f, 0.0336f, 0.0336f, 0.0336f, 0.0336f, 0.0336f, -1f, -1f, -1f, -1f},
            { -1f, -1f, -1f, -1f, -1f, 0.0392f, 0.0392f, 0.0392f, 0.0392f, 0.0392f, 0.0392f, 0.0392f, 0.0392f, 0.0392f, 0.0392f, 0.0392f, 0.0392f, 0.0392f, -1f, -1f, -1f, -1f, -1f, -1f},
            { -1f, -1f, -1f, -1f, -1f, -1f, 0.0448f, 0.0448f, 0.0448f, 0.0448f, 0.0448f, 0.0448f, 0.0448f, 0.0448f, 0.0448f, 0.0448f, -1f, -1f, -1f, -1f, -1f, -1f, -1f, -1f},
            { -1f, -1f, -1f, -1f, -1f, -1f, -1f, 0.050399996f, 0.050399996f, 0.050399996f, 0.050399996f, 0.050399996f, 0.050399996f, 0.050399996f, 0.050399996f, -1f, -1f, -1f, -1f, -1f, -1f, -1f, -1f, -1f}
    };
    
    public static final float[] colors = new float[]{
             0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f,
             0.0f, 0.0f, 0.0f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.34901962f, 0.0f, 0.32941177f, 1.0f, 0.34509805f, 0.0f, 0.33333334f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f,
             0.0f, 0.0f, 0.0f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.54901963f, 0.007843138f, 0.5294118f, 1.0f, 0.52156866f, 0.050980393f, 0.54509807f, 1.0f, 0.5137255f, 0.07058824f, 0.5568628f, 1.0f, 0.5019608f, 0.09411765f, 0.5647059f, 1.0f, 0.5058824f, 0.078431375f, 0.5568628f, 1.0f, 0.5137255f, 0.0627451f, 0.5529412f, 1.0f, 0.5294118f, 0.039215688f, 0.54509807f, 1.0f, 0.54509807f, 0.011764706f, 0.53333336f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f,
             0.0f, 0.0f, 0.0f, 1.0f, 0.34901962f, 0.0f, 0.32156864f, 1.0f, 0.5254902f, 0.047058824f, 0.54509807f, 1.0f, 0.5294118f, 0.105882354f, 0.5882353f, 1.0f, 0.5019608f, 0.15686275f, 0.6039216f, 1.0f, 0.4862745f, 0.18431373f, 0.6156863f, 1.0f, 0.4745098f, 0.20392157f, 0.61960787f, 1.0f, 0.47843137f, 0.19607843f, 0.61960787f, 1.0f, 0.4862745f, 0.18431373f, 0.6156863f, 1.0f, 0.5019608f, 0.15294118f, 0.6039216f, 1.0f, 0.5294118f, 0.105882354f, 0.5882353f, 1.0f, 0.5294118f, 0.039215688f, 0.54509807f, 1.0f, 0.34901962f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f,
             0.0f, 0.0f, 0.0f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.5294118f, 0.039215688f, 0.54509807f, 1.0f, 0.5137255f, 0.12941177f, 0.59607846f, 1.0f, 0.57254905f, 0.21568628f, 0.7137255f, 1.0f, 0.54509807f, 0.2509804f, 0.7254902f, 1.0f, 0.0f, 0.25490198f, 0.23921569f, 1.0f, 0.0f, 0.27058825f, 0.2509804f, 1.0f, 0.0f, 0.27058825f, 0.2509804f, 1.0f, 0.0f, 0.24705882f, 0.23137255f, 1.0f, 0.5372549f, 0.2627451f, 0.7254902f, 1.0f, 0.5803922f, 0.2f, 0.7137255f, 1.0f, 0.5137255f, 0.13333334f, 0.59607846f, 1.0f, 0.52156866f, 0.050980393f, 0.54901963f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f,
             0.0f, 0.0f, 0.0f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.53333336f, 0.03137255f, 0.5411765f, 1.0f, 0.52156866f, 0.12156863f, 0.5921569f, 1.0f, 0.5686275f, 0.22352941f, 0.7176471f, 1.0f, 0.59607846f, 0.30980393f, 0.8f, 1.0f, 0.0f, 0.29411766f, 0.28235295f, 1.0f, 0.43137255f, 0.62352943f, 0.32156864f, 1.0f, 0.41568628f, 0.63529414f, 0.34509805f, 1.0f, 0.41960785f, 0.6313726f, 0.3372549f, 1.0f, 0.43529412f, 0.62352943f, 0.31764707f, 1.0f, 0.0f, 0.3019608f, 0.28627452f, 1.0f, 0.59607846f, 0.30980393f, 0.8039216f, 1.0f, 0.5686275f, 0.21960784f, 0.7176471f, 1.0f, 0.52156866f, 0.12156863f, 0.5921569f, 1.0f, 0.5686275f, 0.03137255f, 0.56078434f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f,
             0.0f, 0.0f, 0.0f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.56078434f, 0.0f, 0.52156866f, 1.0f, 0.5372549f, 0.09019608f, 0.5803922f, 1.0f, 0.5803922f, 0.2f, 0.7137255f, 1.0f, 0.60784316f, 0.29803923f, 0.8f, 1.0f, 0.0f, 0.3019608f, 0.28627452f, 1.0f, 0.5686275f, 0.7607843f, 0.41960785f, 1.0f, 0.0f, 0.42352942f, 0.4f, 1.0f, 0.0f, 0.44705883f, 0.41960785f, 1.0f, 0.0f, 0.44705883f, 0.41960785f, 1.0f, 0.0f, 0.42352942f, 0.39607844f, 1.0f, 0.40784314f, 0.6392157f, 0.3529412f, 1.0f, 0.0f, 0.3137255f, 0.29803923f, 1.0f, 0.60784316f, 0.29803923f, 0.8f, 1.0f, 0.58431375f, 0.19607843f, 0.70980394f, 1.0f, 0.6392157f, 0.11764706f, 0.69411767f, 1.0f, 0.5921569f, 0.003921569f, 0.54901963f, 1.0f, 0.59607846f, 0.003921569f, 0.54901963f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f,
             0.0627451f, 0.0f, 0.05882353f, 1.0f, 0.39215687f, 0.0f, 0.36862746f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.57254905f, 0.02745098f, 0.56078434f, 1.0f, 0.61960787f, 0.14901961f, 0.69803923f, 1.0f, 0.63529414f, 0.26666668f, 0.79607844f, 1.0f, 0.0f, 0.27450982f, 0.25490198f, 1.0f, 0.5686275f, 0.75686276f, 0.41568628f, 1.0f, 0.0f, 0.43529412f, 0.40784314f, 1.0f, 0.011764706f, 0.9647059f, 0.92156863f, 1.0f, 0.007843138f, 0.9647059f, 0.92156863f, 1.0f, 0.007843138f, 0.9647059f, 0.92156863f, 1.0f, 0.011764706f, 0.9647059f, 0.92156863f, 1.0f, 0.0f, 0.43529412f, 0.40784314f, 1.0f, 0.41960785f, 0.6313726f, 0.3372549f, 1.0f, 0.0f, 0.28235295f, 0.26666668f, 1.0f, 0.27058825f, 0.1882353f, 0.4509804f, 1.0f, 0.3019608f, 0.09411765f, 0.39607844f, 1.0f, 0.3372549f, 0.007843138f, 0.34509805f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.37254903f, 0.0f, 0.34509805f, 1.0f, 0.35686275f, 0.0f, 0.32941177f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f,
             0.9607843f, 0.20784314f, 0.9607843f, 0.35686275f, 0.29411766f, 0.03137255f, 0.29411766f, 1.0f, 0.44705883f, 0.003921569f, 0.41568628f, 1.0f, 0.53333336f, 0.02745098f, 0.5411765f, 1.0f, 0.50980395f, 0.14509805f, 0.6f, 1.0f, 0.0f, 0.21568628f, 0.2f, 1.0f, 0.45882353f, 0.6039216f, 0.28627452f, 1.0f, 0.0f, 0.39215687f, 0.37254903f, 1.0f, 0.011764706f, 0.9647059f, 0.92156863f, 1.0f, 0.0f, 0.9647059f, 0.9098039f, 1.0f, 0.0f, 0.9647059f, 0.9137255f, 1.0f, 0.0f, 0.9607843f, 0.9137255f, 1.0f, 0.0f, 0.9647059f, 0.9137255f, 1.0f, 0.011764706f, 0.9647059f, 0.9254902f, 1.0f, 0.0f, 0.39607844f, 0.3764706f, 1.0f, 0.0f, 0.21568628f, 0.2f, 1.0f, 0.0f, 0.11764706f, 0.105882354f, 1.0f, 0.0f, 0.011764706f, 0.011764706f, 1.0f, 0.1764706f, 0.0f, 0.1764706f, 1.0f, 0.29803923f, 0.003921569f, 0.29803923f, 1.0f, 0.2509804f, 0.003921569f, 0.2509804f, 1.0f, 1.0f, 0.09803922f, 1.0f, 0.09803922f,
             0.9647059f, 0.20784314f, 0.95686275f, 0.6039216f, 0.9843137f, 0.078431375f, 0.9843137f, 0.7490196f, 0.25490198f, 0.023529412f, 0.2509804f, 1.0f, 0.34509805f, 0.02745098f, 0.37254903f, 1.0f, 0.47843137f, 0.13333334f, 0.5764706f, 1.0f, 0.0f, 0.22745098f, 0.21568628f, 1.0f, 0.44705883f, 0.6117647f, 0.3019608f, 1.0f, 0.0f, 0.40392157f, 0.38431373f, 1.0f, 0.011764706f, 0.9647059f, 0.92156863f, 1.0f, 0.0f, 0.9647059f, 0.9137255f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.9647059f, 0.9098039f, 1.0f, 0.011764706f, 0.9607843f, 0.92156863f, 1.0f, 0.0f, 0.40784314f, 0.3882353f, 1.0f, 0.96862745f, 0.11764706f, 0.96862745f, 0.11372549f, 0.9882353f, 0.078431375f, 0.9882353f, 0.36862746f, 0.9882353f, 0.08235294f, 0.9882353f, 0.5764706f, 0.9843137f, 0.078431375f, 0.9843137f, 0.4862745f, 0.9843137f, 0.07058824f, 0.9843137f, 0.23921569f,
             0.9647059f, 0.20784314f, 0.95686275f, 0.6039216f, 0.9843137f, 0.078431375f, 0.9843137f, 0.7490196f, 0.25490198f, 0.023529412f, 0.2509804f, 1.0f, 0.34901962f, 0.019607844f, 0.36862746f, 1.0f, 0.48235294f, 0.12941177f, 0.5764706f, 1.0f, 0.0f, 0.21960784f, 0.20392157f, 1.0f, 0.45882353f, 0.6039216f, 0.2901961f, 1.0f, 0.0f, 0.39607844f, 0.3764706f, 1.0f, 0.011764706f, 0.9647059f, 0.92156863f, 1.0f, 0.0f, 0.9647059f, 0.9098039f, 1.0f, 0.0f, 0.9647059f, 0.9137255f, 1.0f, 0.0f, 0.9607843f, 0.9137255f, 1.0f, 0.0f, 0.9647059f, 0.9137255f, 1.0f, 0.011764706f, 0.9647059f, 0.92156863f, 1.0f, 0.0f, 0.3882353f, 0.36862746f, 1.0f, 0.98039216f, 0.07450981f, 0.98039216f, 0.3882353f, 0.9882353f, 0.08235294f, 0.9882353f, 0.6156863f, 0.9843137f, 0.078431375f, 0.9843137f, 0.5137255f, 0.9843137f, 0.08235294f, 0.9843137f, 0.2509804f,
             0.9607843f, 0.20784314f, 0.9607843f, 0.35686275f, 0.29411766f, 0.03137255f, 0.29411766f, 1.0f, 0.44705883f, 0.003921569f, 0.41568628f, 1.0f, 0.5411765f, 0.011764706f, 0.53333336f, 1.0f, 0.52156866f, 0.12156863f, 0.5921569f, 1.0f, 0.0f, 0.18431373f, 0.1764706f, 1.0f, 0.47843137f, 0.5882353f, 0.2627451f, 1.0f, 0.0f, 0.36078432f, 0.3372549f, 1.0f, 0.015686275f, 0.9647059f, 0.9254902f, 1.0f, 0.0f, 0.9647059f, 0.9137255f, 1.0f, 0.0f, 0.9647059f, 0.9137255f, 1.0f, 0.0f, 0.9647059f, 0.9137255f, 1.0f, 0.0f, 0.9647059f, 0.9137255f, 1.0f, 0.011764706f, 0.9647059f, 0.9254902f, 1.0f, 0.0f, 0.35686275f, 0.3372549f, 1.0f, 0.0f, 0.18039216f, 0.16862746f, 1.0f, 0.0f, 0.09411765f, 0.09019608f, 1.0f, 0.0f, 0.007843138f, 0.015686275f, 1.0f, 0.21568628f, 0.0f, 0.21568628f, 1.0f, 0.34509805f, 0.007843138f, 0.34509805f, 1.0f, 0.29803923f, 0.003921569f, 0.29803923f, 1.0f, 0.972549f, 0.05882353f, 0.972549f, 0.12941177f,
             0.0627451f, 0.0f, 0.05882353f, 1.0f, 0.39215687f, 0.0f, 0.36862746f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.5882353f, 0.003921569f, 0.54901963f, 1.0f, 0.64705884f, 0.105882354f, 0.6901961f, 1.0f, 0.6745098f, 0.21960784f, 0.7882353f, 1.0f, 0.0f, 0.23137255f, 0.21960784f, 1.0f, 0.61960787f, 0.7411765f, 0.37254903f, 1.0f, 0.0f, 0.3764706f, 0.3529412f, 1.0f, 0.015686275f, 0.9647059f, 0.92156863f, 1.0f, 0.011764706f, 0.9607843f, 0.9254902f, 1.0f, 0.011764706f, 0.9647059f, 0.92156863f, 1.0f, 0.015686275f, 0.9647059f, 0.9254902f, 1.0f, 0.0f, 0.37254903f, 0.3529412f, 1.0f, 0.45882353f, 0.6039216f, 0.28627452f, 1.0f, 0.0f, 0.23921569f, 0.22352941f, 1.0f, 0.28627452f, 0.14509805f, 0.42352942f, 1.0f, 0.3137255f, 0.0627451f, 0.38039216f, 1.0f, 0.34901962f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.4f, 0.0f, 0.3764706f, 1.0f, 0.38431373f, 0.0f, 0.35686275f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f,
             0.0f, 0.0f, 0.0f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.5647059f, 0.039215688f, 0.5647059f, 1.0f, 0.62352943f, 0.14509805f, 0.69803923f, 1.0f, 0.6509804f, 0.24313726f, 0.7921569f, 1.0f, 0.0f, 0.23921569f, 0.22745098f, 1.0f, 0.6313726f, 0.7372549f, 0.3647059f, 1.0f, 0.0f, 0.34117648f, 0.31764707f, 1.0f, 0.0f, 0.36078432f, 0.34509805f, 1.0f, 0.0f, 0.35686275f, 0.3372549f, 1.0f, 0.0f, 0.34117648f, 0.31764707f, 1.0f, 0.46666667f, 0.59607846f, 0.27450982f, 1.0f, 0.0f, 0.24313726f, 0.22745098f, 1.0f, 0.654902f, 0.24313726f, 0.7921569f, 1.0f, 0.62352943f, 0.14509805f, 0.69803923f, 1.0f, 0.67058825f, 0.0627451f, 0.68235296f, 1.0f, 0.59607846f, 0.003921569f, 0.54901963f, 1.0f, 0.59607846f, 0.003921569f, 0.54901963f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f,
             0.0f, 0.0f, 0.0f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.5529412f, 0.05882353f, 0.57254905f, 1.0f, 0.6156863f, 0.15294118f, 0.7019608f, 1.0f, 0.65882355f, 0.23921569f, 0.7882353f, 1.0f, 0.0f, 0.20784314f, 0.19607843f, 1.0f, 0.49803922f, 0.5764706f, 0.23137255f, 1.0f, 0.48235294f, 0.58431375f, 0.2509804f, 1.0f, 0.4862745f, 0.58431375f, 0.24705882f, 1.0f, 0.49803922f, 0.57254905f, 0.23529412f, 1.0f, 0.0f, 0.21960784f, 0.20392157f, 1.0f, 0.654902f, 0.24313726f, 0.7921569f, 1.0f, 0.6156863f, 0.15686275f, 0.7019608f, 1.0f, 0.54901963f, 0.0627451f, 0.57254905f, 1.0f, 0.59607846f, 0.003921569f, 0.54901963f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f,
             0.0f, 0.0f, 0.0f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.5568628f, 0.050980393f, 0.5686275f, 1.0f, 0.6313726f, 0.12941177f, 0.69411767f, 1.0f, 0.59607846f, 0.18039216f, 0.7058824f, 1.0f, 0.0f, 0.15686275f, 0.14509805f, 1.0f, 0.0f, 0.1764706f, 0.16470589f, 1.0f, 0.0f, 0.16862746f, 0.15686275f, 1.0f, 0.0f, 0.15686275f, 0.14509805f, 1.0f, 0.6f, 0.1764706f, 0.7058824f, 1.0f, 0.6313726f, 0.12941177f, 0.69411767f, 1.0f, 0.5568628f, 0.050980393f, 0.5686275f, 1.0f, 0.56078434f, 0.0f, 0.52156866f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f,
             0.0f, 0.0f, 0.0f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.57254905f, 0.023529412f, 0.56078434f, 1.0f, 0.5568628f, 0.050980393f, 0.5686275f, 1.0f, 0.5411765f, 0.078431375f, 0.5803922f, 1.0f, 0.5294118f, 0.105882354f, 0.5882353f, 1.0f, 0.5294118f, 0.105882354f, 0.5882353f, 1.0f, 0.5411765f, 0.08235294f, 0.5803922f, 1.0f, 0.5529412f, 0.05882353f, 0.57254905f, 1.0f, 0.57254905f, 0.023529412f, 0.56078434f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f,
             0.0f, 0.0f, 0.0f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.56078434f, 0.0f, 0.52156866f, 1.0f, 0.5568628f, 0.0f, 0.5254902f, 1.0f, 0.5568628f, 0.0f, 0.52156866f, 1.0f, 0.5568628f, 0.0f, 0.52156866f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.5647059f, 0.0f, 0.52156866f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f,
             0.0f, 0.0f, 0.0f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.3529412f, 0.0f, 0.32156864f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f,
             0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f
    };

    public static final float[] posArr = new float[]{
                -0.027999999f, -0.055999998f, 0.0f,
                -0.0224f, -0.055999998f, 0.0f, -0.0168f, -0.055999998f, 0.0f, -0.0112f, -0.055999998f, 0.0f, -0.0056f, -0.055999998f, 0.0f, 0.0f, -0.055999998f, 0.0f, 0.0056f, -0.055999998f, 0.0f, 0.0112f, -0.055999998f, 0.0f, -0.0336f, -0.050399996f, 0.0f, -0.027999999f, -0.050399996f, 0.0f, -0.0224f, -0.050399996f, 0.0f, -0.0168f, -0.050399996f, 0.0f, -0.0112f, -0.050399996f, 0.0f, -0.0056f, -0.050399996f, 0.0f, 0.0f, -0.050399996f, 0.0f, 0.0056f, -0.050399996f, 0.0f, 0.0112f, -0.050399996f, 0.0f,
                0.0168f, -0.050399996f, 0.0f, -0.0392f, -0.0448f, 0.0f, -0.0336f, -0.0448f, 0.0f, -0.027999999f, -0.0448f, 0.0f, -0.0224f, -0.0448f, 0.38039216f, -0.0168f, -0.0448f, 0.38039216f, -0.0112f, -0.0448f, 0.38039216f, -0.0056f, -0.0448f, 0.38039216f, 0.0f, -0.0448f, 0.38039216f, 0.0056f, -0.0448f, 0.38039216f, 0.0112f, -0.0448f, 0.0f, 0.0168f, -0.0448f, 0.0f, 0.0224f, -0.0448f, 0.0f, 0.027999999f, -0.0448f, 0.0f, -0.0448f, -0.0392f, 0.0f, -0.0392f, -0.0392f, 0.0f,
                -0.0336f, -0.0392f, 0.0f, -0.027999999f, -0.0392f, 0.38039216f, -0.0224f, -0.0392f, 0.38039216f, -0.0168f, -0.0392f, 0.5137255f, -0.0112f, -0.0392f, 0.5137255f, -0.0056f, -0.0392f, 0.5137255f, 0.0f, -0.0392f, 0.5137255f, 0.0056f, -0.0392f, 0.38039216f, 0.0112f, -0.0392f, 0.38039216f, 0.0168f, -0.0392f, 0.38039216f, 0.0224f, -0.0392f, 0.0f, 0.027999999f, -0.0392f, 0.0f, 0.0336f, -0.0392f, 0.0f, 0.0392f, -0.0392f, 0.0f, -0.050399996f, -0.0336f, 0.0f, -0.0448f, -0.0336f, 0.0f,
                -0.0392f, -0.0336f, 0.0f, -0.0336f, -0.0336f, 0.38039216f, -0.027999999f, -0.0336f, 0.38039216f, -0.0224f, -0.0336f, 0.21568628f, -0.0168f, -0.0336f, 0.38039216f, -0.0112f, -0.0336f, 0.38039216f, -0.0056f, -0.0336f, 0.38039216f, 0.0f, -0.0336f, 0.38039216f, 0.0056f, -0.0336f, 0.21568628f, 0.0112f, -0.0336f, 0.0f, 0.0168f, -0.0336f, 0.38039216f, 0.0224f, -0.0336f, 0.38039216f, 0.027999999f, -0.0336f, 0.0f, 0.0336f, -0.0336f, 0.0f, 0.0392f, -0.0336f, 0.0f, 0.0448f, -0.0336f, 0.0f,
                0.050399996f, -0.0336f, 0.0f, -0.055999998f, -0.027999999f, 0.0f, -0.050399996f, -0.027999999f, 0.0f, -0.0448f, -0.027999999f, 0.0f, -0.0392f, -0.027999999f, 0.38039216f, -0.0336f, -0.027999999f, 0.38039216f, -0.027999999f, -0.027999999f, 0.21568628f, -0.0224f, -0.027999999f, 0.38039216f, -0.0168f, -0.027999999f, 0.54901963f, -0.0112f, -0.027999999f, 0.54901963f, -0.0056f, -0.027999999f, 0.54901963f, 0.0f, -0.027999999f, 0.54901963f, 0.0056f, -0.027999999f, 0.38039216f, 0.0112f, -0.027999999f, 0.21568628f, 0.0168f, -0.027999999f, 0.0f, 0.0224f, -0.027999999f, 0.38039216f,
                0.027999999f, -0.027999999f, 0.38039216f, 0.0336f, -0.027999999f, 0.38039216f, 0.0392f, -0.027999999f, 0.0f, 0.0448f, -0.027999999f, 0.0f, 0.050399996f, -0.027999999f, 0.0f, 0.055999998f, -0.027999999f, 0.0f, -0.0616f, -0.0224f, 0.0f, -0.055999998f, -0.0224f, 0.0f, -0.050399996f, -0.0224f, 0.0f, -0.0448f, -0.0224f, 0.38039216f, -0.0392f, -0.0224f, 0.38039216f, -0.0336f, -0.0224f, 0.21568628f, -0.027999999f, -0.0224f, 0.38039216f, -0.0224f, -0.0224f, 0.54901963f, -0.0168f, -0.0224f, 0.7607843f, -0.0112f, -0.0224f, 0.7607843f,
                -0.0056f, -0.0224f, 0.7607843f, 0.0f, -0.0224f, 0.7607843f, 0.0056f, -0.0224f, 0.54901963f, 0.0112f, -0.0224f, 0.38039216f, 0.0168f, -0.0224f, 0.21568628f, 0.0224f, -0.0224f, 0.0f, 0.027999999f, -0.0224f, 0.0f, 0.0336f, -0.0224f, 0.38039216f, 0.0392f, -0.0224f, 0.38039216f, 0.0448f, -0.0224f, 0.38039216f, 0.050399996f, -0.0224f, 0.0f, 0.055999998f, -0.0224f, 0.0f, 0.0616f, -0.0224f, 0.0f, -0.0672f, -0.0168f, 0.0f, -0.0616f, -0.0168f, 0.54901963f, -0.055999998f, -0.0168f, 0.0f,
                -0.050399996f, -0.0168f, 0.38039216f, -0.0448f, -0.0168f, 0.38039216f, -0.0392f, -0.0168f, 0.21568628f, -0.0336f, -0.0168f, 0.38039216f, -0.027999999f, -0.0168f, 0.54901963f, -0.0224f, -0.0168f, 0.7607843f, -0.0168f, -0.0168f, 1.0f, -0.0112f, -0.0168f, 1.0f, -0.0056f, -0.0168f, 1.0f, 0.0f, -0.0168f, 1.0f, 0.0056f, -0.0168f, 0.7607843f, 0.0112f, -0.0168f, 0.54901963f, 0.0168f, -0.0168f, 0.38039216f, 0.0224f, -0.0168f, 0.21568628f, 0.027999999f, -0.0168f, 0.0f, 0.0336f, -0.0168f, 0.0f,
                0.0392f, -0.0168f, 0.0f, 0.0448f, -0.0168f, 0.003921569f, 0.050399996f, -0.0168f, 0.0f, 0.055999998f, -0.0168f, 0.0f, -0.0672f, -0.0112f, 0.54901963f, -0.0616f, -0.0112f, 0.7607843f, -0.055999998f, -0.0112f, 0.54901963f, -0.050399996f, -0.0112f, 0.0f, -0.0448f, -0.0112f, 0.38431373f, -0.0392f, -0.0112f, 0.38039216f, -0.0336f, -0.0112f, 0.54901963f, -0.027999999f, -0.0112f, 0.7607843f, -0.0224f, -0.0112f, 1.0f, -0.0168f, -0.0112f, 1.0f, -0.0112f, -0.0112f, 1.0f, -0.0056f, -0.0112f, 1.0f,
                0.0f, -0.0112f, 1.0f, 0.0056f, -0.0112f, 1.0f, 0.0112f, -0.0112f, 0.7607843f, 0.0224f, -0.0112f, 0.21568628f, 0.027999999f, -0.0112f, 0.0f, 0.0336f, -0.0112f, 0.003921569f, 0.0392f, -0.0112f, 0.2f, 0.0448f, -0.0112f, 0.28627452f, 0.050399996f, -0.0112f, 0.21568628f, 0.055999998f, -0.0112f, 0.03137255f, -0.0672f, -0.0056f, 0.7607843f, -0.0616f, -0.0056f, 1.0f, -0.055999998f, -0.0056f, 0.7607843f, -0.050399996f, -0.0056f, 0.0f, -0.0448f, -0.0056f, 0.38431373f, -0.0392f, -0.0056f, 0.38039216f,
                -0.0336f, -0.0056f, 0.54901963f, -0.027999999f, -0.0056f, 0.7607843f, -0.0224f, -0.0056f, 1.0f, -0.0168f, -0.0056f, 1.0f, -0.0112f, -0.0056f, 1.0f, -0.0056f, -0.0056f, 1.0f, 0.0f, -0.0056f, 1.0f, 0.0056f, -0.0056f, 1.0f, 0.0112f, -0.0056f, 0.7607843f, 0.0336f, -0.0056f, 0.13725491f, 0.0392f, -0.0056f, 0.4f, 0.0448f, -0.0056f, 0.57254905f, 0.050399996f, -0.0056f, 0.43137255f, 0.055999998f, -0.0056f, 0.17254902f, -0.0672f, 0.0f, 0.7607843f, -0.0616f, 0.0f, 1.0f,
                -0.055999998f, 0.0f, 0.7607843f, -0.050399996f, 0.0f, 0.0f, -0.0448f, 0.0f, 0.38431373f, -0.0392f, 0.0f, 0.38039216f, -0.0336f, 0.0f, 0.54901963f, -0.027999999f, 0.0f, 0.7607843f, -0.0224f, 0.0f, 1.0f, -0.0168f, 0.0f, 1.0f, -0.0112f, 0.0f, 1.0f, -0.0056f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0056f, 0.0f, 1.0f, 0.0112f, 0.0f, 0.7607843f, 0.0392f, 0.0f, 0.43137255f, 0.0448f, 0.0f, 0.6431373f, 0.050399996f, 0.0f, 0.4627451f,
                0.055999998f, 0.0f, 0.19215687f, -0.0672f, 0.0056f, 0.54901963f, -0.0616f, 0.0056f, 0.7607843f, -0.055999998f, 0.0056f, 0.54901963f, -0.050399996f, 0.0056f, 0.0f, -0.0448f, 0.0056f, 0.38431373f, -0.0392f, 0.0056f, 0.38039216f, -0.0336f, 0.0056f, 0.54901963f, -0.027999999f, 0.0056f, 0.7607843f, -0.0224f, 0.0056f, 1.0f, -0.0168f, 0.0056f, 1.0f, -0.0112f, 0.0056f, 1.0f, -0.0056f, 0.0056f, 1.0f, 0.0f, 0.0056f, 1.0f, 0.0056f, 0.0056f, 1.0f, 0.0112f, 0.0056f, 0.7607843f,
                0.0224f, 0.0056f, 0.21568628f, 0.027999999f, 0.0056f, 0.0f, 0.0336f, 0.0056f, 0.047058824f, 0.0392f, 0.0056f, 0.25490198f, 0.0448f, 0.0056f, 0.35686275f, 0.050399996f, 0.0056f, 0.2784314f, 0.055999998f, 0.0056f, 0.07450981f, -0.0672f, 0.0112f, 0.0f, -0.0616f, 0.0112f, 0.54901963f, -0.055999998f, 0.0112f, 0.0f, -0.050399996f, 0.0112f, 0.38039216f, -0.0448f, 0.0112f, 0.38039216f, -0.0392f, 0.0112f, 0.21568628f, -0.0336f, 0.0112f, 0.38039216f, -0.027999999f, 0.0112f, 0.54901963f, -0.0224f, 0.0112f, 0.7607843f,
                -0.0168f, 0.0112f, 1.0f, -0.0112f, 0.0112f, 1.0f, -0.0056f, 0.0112f, 1.0f, 0.0f, 0.0112f, 1.0f, 0.0056f, 0.0112f, 0.7607843f, 0.0112f, 0.0112f, 0.54901963f, 0.0168f, 0.0112f, 0.38039216f, 0.0224f, 0.0112f, 0.21568628f, 0.027999999f, 0.0112f, 0.0f, 0.0336f, 0.0112f, 0.0f, 0.0392f, 0.0112f, 0.011764706f, 0.0448f, 0.0112f, 0.07450981f, 0.050399996f, 0.0112f, 0.02745098f, 0.055999998f, 0.0112f, 0.0f, -0.0616f, 0.0168f, 0.0f, -0.055999998f, 0.0168f, 0.0f,
                -0.050399996f, 0.0168f, 0.0f, -0.0448f, 0.0168f, 0.38039216f, -0.0392f, 0.0168f, 0.38039216f, -0.0336f, 0.0168f, 0.21568628f, -0.027999999f, 0.0168f, 0.38039216f, -0.0224f, 0.0168f, 0.54901963f, -0.0168f, 0.0168f, 0.7607843f, -0.0112f, 0.0168f, 0.7607843f, -0.0056f, 0.0168f, 0.7607843f, 0.0f, 0.0168f, 0.7607843f, 0.0056f, 0.0168f, 0.54901963f, 0.0112f, 0.0168f, 0.38039216f, 0.0168f, 0.0168f, 0.21568628f, 0.0224f, 0.0168f, 0.0f, 0.027999999f, 0.0168f, 0.0f, 0.0336f, 0.0168f, 0.38039216f,
                0.0392f, 0.0168f, 0.38039216f, 0.0448f, 0.0168f, 0.38039216f, 0.050399996f, 0.0168f, 0.0f, 0.055999998f, 0.0168f, 0.0f, 0.0616f, 0.0168f, 0.0f, -0.055999998f, 0.0224f, 0.0f, -0.050399996f, 0.0224f, 0.0f, -0.0448f, 0.0224f, 0.0f, -0.0392f, 0.0224f, 0.38039216f, -0.0336f, 0.0224f, 0.38039216f, -0.027999999f, 0.0224f, 0.21568628f, -0.0224f, 0.0224f, 0.38039216f, -0.0168f, 0.0224f, 0.54901963f, -0.0112f, 0.0224f, 0.54901963f, -0.0056f, 0.0224f, 0.54901963f, 0.0f, 0.0224f, 0.54901963f,
                0.0056f, 0.0224f, 0.38039216f, 0.0112f, 0.0224f, 0.21568628f, 0.0168f, 0.0224f, 0.0f, 0.0224f, 0.0224f, 0.38039216f, 0.027999999f, 0.0224f, 0.38039216f, 0.0336f, 0.0224f, 0.38039216f, 0.0392f, 0.0224f, 0.0f, 0.0448f, 0.0224f, 0.0f, 0.050399996f, 0.0224f, 0.0f, 0.055999998f, 0.0224f, 0.0f, -0.050399996f, 0.027999999f, 0.0f, -0.0448f, 0.027999999f, 0.0f, -0.0392f, 0.027999999f, 0.0f, -0.0336f, 0.027999999f, 0.38039216f, -0.027999999f, 0.027999999f, 0.38039216f, -0.0224f, 0.027999999f, 0.21568628f,
                -0.0168f, 0.027999999f, 0.38039216f, -0.0112f, 0.027999999f, 0.38039216f, -0.0056f, 0.027999999f, 0.38039216f, 0.0f, 0.027999999f, 0.38039216f, 0.0056f, 0.027999999f, 0.21568628f, 0.0112f, 0.027999999f, 0.0f, 0.0168f, 0.027999999f, 0.38039216f, 0.0224f, 0.027999999f, 0.38039216f, 0.027999999f, 0.027999999f, 0.0f, 0.0336f, 0.027999999f, 0.0f, 0.0392f, 0.027999999f, 0.0f, 0.0448f, 0.027999999f, 0.0f, 0.050399996f, 0.027999999f, 0.0f, -0.0448f, 0.0336f, 0.0f, -0.0392f, 0.0336f, 0.0f, -0.0336f, 0.0336f, 0.0f,
                -0.027999999f, 0.0336f, 0.38039216f, -0.0224f, 0.0336f, 0.38039216f, -0.0168f, 0.0336f, 0.5137255f, -0.0112f, 0.0336f, 0.5137255f, -0.0056f, 0.0336f, 0.5137255f, 0.0f, 0.0336f, 0.5137255f, 0.0056f, 0.0336f, 0.38039216f, 0.0112f, 0.0336f, 0.38039216f, 0.0168f, 0.0336f, 0.38039216f, 0.0224f, 0.0336f, 0.0f, 0.027999999f, 0.0336f, 0.0f, 0.0336f, 0.0336f, 0.0f, 0.0392f, 0.0336f, 0.0f, -0.0392f, 0.0392f, 0.0f, -0.0336f, 0.0392f, 0.0f, -0.027999999f, 0.0392f, 0.0f,
                -0.0224f, 0.0392f, 0.38039216f, -0.0168f, 0.0392f, 0.38039216f, -0.0112f, 0.0392f, 0.38039216f, -0.0056f, 0.0392f, 0.38039216f, 0.0f, 0.0392f, 0.38039216f, 0.0056f, 0.0392f, 0.38039216f, 0.0112f, 0.0392f, 0.0f, 0.0168f, 0.0392f, 0.0f, 0.0224f, 0.0392f, 0.0f, 0.027999999f, 0.0392f, 0.0f, -0.0336f, 0.0448f, 0.0f, -0.027999999f, 0.0448f, 0.0f, -0.0224f, 0.0448f, 0.0f, -0.0168f, 0.0448f, 0.0f, -0.0112f, 0.0448f, 0.0f, -0.0056f, 0.0448f, 0.0f,
                0.0f, 0.0448f, 0.0f, 0.0056f, 0.0448f, 0.0f, 0.0112f, 0.0448f, 0.0f, 0.0168f, 0.0448f, 0.0f, -0.027999999f, 0.050399996f, 0.0f, -0.0224f, 0.050399996f, 0.0f, -0.0168f, 0.050399996f, 0.0f, -0.0112f, 0.050399996f, 0.0f, -0.0056f, 0.050399996f, 0.0f, 0.0f, 0.050399996f, 0.0f, 0.0056f, 0.050399996f, 0.0f, 0.0112f, 0.050399996f, 0.0f};

    public static final FloatBuffer posBuf = (FloatBuffer)ByteBuffer
            .allocateDirect(posArr.length * Constants.BYTES_PER_FLOAT)
            .order(ByteOrder.nativeOrder())
            .asFloatBuffer()
            .put(posArr).position(0);
}