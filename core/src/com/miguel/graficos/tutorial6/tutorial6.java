package com.miguel.graficos.tutorial6;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class tutorial6 extends ApplicationAdapter {
    SpriteBatch batch;
    Texture img;
    private int x_figura1 , y_figura1 ;
    private int x_figura2 , y_figura2 ;
    private int x_figura3 , y_figura3 ;
    private int x_figura4 , y_figura4 ;
    private int ancho;
    private int alto;
    private int ancho_img;
    private int alto_img;

    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("freepik.png");

        ancho = Gdx.graphics.getWidth();
        alto = Gdx.graphics.getHeight();

        ancho_img = img.getWidth();
        alto_img = img.getHeight();

        x_figura1 = 0;
        y_figura1 = 0;

        x_figura2 = ancho-ancho_img;
        y_figura2 = 0;

        x_figura3 = ancho-ancho_img;
        y_figura3 = alto-alto_img;

        x_figura4 = 0;
        y_figura4 = alto-alto_img;
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 1, 0.5f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        batch.begin();

            moverFigura1();
            moverFigura2();
            moverFigura3();
            moverFigura4();



        batch.end();
    }

    public void moverFigura1(){
        batch.draw(img, x_figura1, y_figura1 );
        if (y_figura1 == (alto - alto_img)) {
            y_figura1 = y_figura1 - 1;
        }
        if (x_figura1 == (ancho - ancho_img)) {
            x_figura1 = x_figura1 - 1;
        }
        x_figura1++;
        y_figura1++;

    }
    public void moverFigura2(){
        batch.draw(img, x_figura2, y_figura2 );
        if (y_figura2 == (alto-ancho_img)) {
            y_figura2 = y_figura2 - 1;
        }
        if (x_figura2 == (0)) {
            x_figura2 = x_figura2 + 1;
        }
        x_figura2--;
        y_figura2++;

    }
    public void moverFigura3(){
        batch.draw(img, x_figura3, y_figura3 );
        if (y_figura3 == 0) {
            y_figura3 = y_figura3 + 1;
        }
        if (x_figura3 == 0) {
            x_figura3 = x_figura3 + 1;
        }
        x_figura3--;
        y_figura3--;

    }
    public void moverFigura4(){
        batch.draw(img, x_figura4, y_figura4 );
        if (y_figura4 == 0) {
            y_figura4 = y_figura4 + 1;
        }
        if (x_figura4 == (ancho-ancho_img)) {
            x_figura4 = x_figura4 - 1;
        }
        x_figura4++;
        y_figura4--;

    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
