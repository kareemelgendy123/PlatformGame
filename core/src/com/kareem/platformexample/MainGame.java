/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kareem.platformexample;

import com.badlogic.gdx.Screen;

/**
 *
 * @author Kareem
 */
public class MainGame implements Screen{
    
    private Platform Game;
    Player p1;
    private Object p1;
    
    public 

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        p1.update(deltaTime);
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
    }

    private static class p1 {

        public p1() {
        }
    }

    private static class Platform {

        public Platform() {
        }
    }
    
}
