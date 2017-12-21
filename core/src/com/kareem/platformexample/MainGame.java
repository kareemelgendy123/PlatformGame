/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kareem.platformexample;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/**
 * This is a screen. 
 * We can create multiple and switch between them in our PlatformGame class.
 * It has a bunch of methods that come with it by default: 
 * we really just worry about the render, dispose, and create ones
 * @author lamon
 */
public class MainGame implements Screen{

    // we want to keep track of the game manager
    // this way we could make methods to switch screens!
    private PlatformExample gameManager;
    // our game needs a hero
    private Player p1;
    // our hero needs a place to be in
    private World world;
    
    // the constructor for our maingame needs to know what made it
    // this is what the game variable is
    public MainGame(PlatformExample game){
        // we save this so we can talk to it later
        this.gameManager = game;
        // create our new player at 100,100
        p1 = new Player(100,100);
        // generate the world
        world = new World();
    }
    
    @Override
    public void show() {
        // this would be what happens when the game wakes up from being hidden
        // i.e. when you minimized the game and reopenned it
    }

    // the main game loop for this screen
    @Override
    public void render(float deltaTime) {
        // update the player
        p1.update(deltaTime);
        
        // check for collisions and fix them
        for(Rectangle block: world.getBlocks()){
            p1.fixCollision(block);
        }
        
        // get the SpriteBatch from the manager
        SpriteBatch batch = gameManager.getBatch();
        
        // clears the screen in a black colour
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	
        // ask the world to render
        // notice this is not in the SpriteBatch
        // This is because it uses its own ShapeRenderer
        world.render();
        
        // ask the SpriteBatch to start taking notes of what to draw
        batch.begin();
	// ask the player to draw themself
        p1.render(batch);
        // tell the SpriteBatch we are good to draw everything now
	batch.end();
    }

    // used when the window is resized.... we haven't use it here
    @Override
    public void resize(int width, int height) {
        
    }

    // if the game could pause, what do you need to happen?
    @Override
    public void pause() {
        
    }

    // when the game is unpaused, what do you need to happen?
    @Override
    public void resume() {
        
    }

    // when the game needs to be minimized, what needs to happen?
    @Override
    public void hide() {
        
    }

    // get rid of heavy objects...
    @Override
    public void dispose() {
        
    }
    
}