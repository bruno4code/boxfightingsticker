package com.bruno.sfs.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.bruno.sfs.SFS;
import com.bruno.sfs.resources.Assets;

public class GameScreen implements Screen {
    private final SFS game;

    // background - ring
    private Texture backgroundTexture;
    private Texture frontRopes;

    public GameScreen(SFS game) {
         this.game = game;
         createGameArea();

     }

     private void createGameArea() {
        // get ring from asset manager
         backgroundTexture = game.assets.manager.get(Assets.BACKGROUND_TEXTURE);
         frontRopes = game.assets.manager.get(Assets.FRONT_ROPES_TEXTURE);
     }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0,0,0,1);
        // using the same batch for all game
        game.batch.begin();
        game.batch.draw(backgroundTexture, 0, 0);
        game.batch.end();
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
}
