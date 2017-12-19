/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kareem.platformexample;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Kareem
 */
public class Player {
    
    private float x;
    private float y;
    
    private float elapsed;
    
    private Animation<Texture> run;
    private Texture stand;
    
    private float dx;
    private float dy;
    
    this.dx = dx;
    this.dy = dy;
    
    public Player (float x, float y){
        this.x = x;
        this.y = y;
        this.elapsed = 0;
        this.stand = new Texture ("raw/stand.png");
        
        Texture[] runFrames = new Texture [6];
        
        for (int i = 0; i < 6; i++){
            runFrames[i] = new Texture ("raw/run " + i + ".png");
        }
        
        run = new Animation(1f/10f, run);
        
        public void update(float deltaTime){
            if (Gdx.input.isKeyPressed(Input.Keys.LEFT)){
                this.dx = 3;
                this.elapsed += deltaTime;
                
            }else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
                this.dx = -3;
                this.elapsed += deltaTime;
                
            }else{
                this.dx = 0;
                this.elapsed = 0;

            }
        }
        
        public void render(SpriteBatch batch){
            // Standing
            if (this.dx == 0){
                batch.draw(stand, x, y);
            }else if (this.dx > 0){
                batch.draw();
            }
        }
    }
}
