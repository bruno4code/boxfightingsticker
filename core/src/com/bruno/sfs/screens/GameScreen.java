package com.bruno.sfs.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.bruno.sfs.SFS;
import com.bruno.sfs.resources.Assets;
import com.bruno.sfs.resources.GlobalVariables;

public class GameScreen implements Screen {
    private final SFS game;

    private final OrthographicCamera camera;
    // background - ring
    private Texture backgroundTexture;
    private Texture frontRopes;

    public GameScreen(SFS game) {
         this.game = game;
         // set up camera
         camera = new OrthographicCamera(GlobalVariables.WORLD_WIDTH, GlobalVariables.WORLD_HEIGHT);
         // muda o centro da camera para o centro da janela
         camera.translate(camera.viewportWidth / 2f, camera.viewportHeight / 2f);
         camera.update();

         createGameArea();

     }

     private void createGameArea() {
        // get ring from asset manager
         backgroundTexture = game.assets.manager.get(Assets.BACKGROUND_TEXTURE);
         // front ropes é colocado novamente para o player não passar por cima
         frontRopes = game.assets.manager.get(Assets.FRONT_ROPES_TEXTURE);
     }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        // clean screen every frame
        ScreenUtils.clear(0,0,0,1);

        // tell the spriteBrach to use the camera
        game.batch.setProjectionMatrix(camera.combined);

        // using the same batch for all game
        game.batch.begin();
        // como a imagem é 2x o tamanho da tela, divido por 2
        game.batch.draw(backgroundTexture, 0, 0, backgroundTexture.getWidth() * GlobalVariables.WORLD_SCALE, backgroundTexture.getHeight() * GlobalVariables.WORLD_SCALE);
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
