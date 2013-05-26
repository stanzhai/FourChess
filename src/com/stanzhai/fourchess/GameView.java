package com.stanzhai.fourchess;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameView implements ApplicationListener {
	// 用于将纹理送入GPU
	private SpriteBatch batch;
	// 纹理
	private Texture texture;
	// 精灵
	private Sprite backgroundSprite;
	// 背景音乐
	private Music music;
	private OrthographicCamera camera;
	private BitmapFont font;
	
	@Override
	public void create() {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
		   
		batch = new SpriteBatch();
		
		texture = new Texture(Gdx.files.internal("main.jpg"));
		
		backgroundSprite = new Sprite(texture, 0, 0, 480, 320);
		
		font = new BitmapFont(Gdx.files.internal("main.fnt"), Gdx.files.internal("fnt.png"), false);
		
		music = Gdx.audio.newMusic(Gdx.files.internal("main.mp3"));
		music.setLooping(true);
		music.play();
	}

	@Override
	public void dispose() {
		texture.dispose();
		music.dispose();
		batch.dispose();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT); //清屏 
		// tell the camera to update its matrices.
	    camera.update();
	    // 让SpriteBatch 在camera指定的视角范围内渲染
		batch.setProjectionMatrix(camera.combined);
        batch.begin(); 
        // 禁用半透明混合，适用于绘制大背景
        batch.disableBlending();
        backgroundSprite.draw(batch);
        batch.enableBlending();
        
        font.draw(batch, "四块子", 0, Gdx.graphics.getHeight() / 2 - 8);
        batch.end(); 
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

}
