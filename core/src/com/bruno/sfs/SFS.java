package com.bruno.sfs;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.bruno.sfs.resources.Assets;
import com.bruno.sfs.screens.GameScreen;

public class SFS extends Game {
    public SpriteBatch batch;
    public Assets assets;
    // screens
    public GameScreen gameScreen;

    @Override
    public void create() {
        batch = new SpriteBatch();
        assets = new Assets();

        // load all assets
        assets.load();
        assets.manager.finishLoading();

        // init gameScreen
        gameScreen = new GameScreen(this);
        setScreen(gameScreen);
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        batch.dispose();
        assets.dispose();
    }
}
