package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Player extends GameObject {
    Random r=new Random();
    Handler handler;
    private BufferedImage player_image;
    public Player(int x, int y, ID id,Handler handler) {
        super(x, y, id);
        this.handler=handler;
    }

    public Rectangle getBounds()
    {
        return new Rectangle((int)x,(int)y,32,32);
    }
    public void tick() {

        x+=velX;
        y+=velY;
        x=Game.clamp(x, 0,Game.WIDTH-47);
        y=Game.clamp(y, 0,Game.HEIGHT-68);
        handler.addObject(new Trail(x, y, ID.Trail, Color.white, 32, 32, 0.05f, handler));
        collision();
        if(Game.gameState == Game.STATE.Win || Game.gameState == Game.STATE.End) {
            handler.removeObject(this);
        }
    }
    private void collision() {
        for(int i=0;i<handler.object.size();i++)
        {
            GameObject tempObject=handler.object.get(i);
            if(tempObject.getId()==ID.BasicEnemy||
              (tempObject.getId()==ID.FastEnemy)||
              (tempObject.getId()==ID.SmartEnemy)) {
                if(getBounds().intersects(tempObject.getBounds())) {//temp object is now basic enemy
                    //collision code
                    HUD.HEALTH-=2;
                }
            }
            if(tempObject.getId()==ID.EnemyBoss || tempObject.getId()==ID.HardEnemy ||
              tempObject.getId()==ID.VerticalEnemy||tempObject.getId()==ID.HorizontalEnemy) {
                if (getBounds().intersects(tempObject.getBounds())) {//temp object is now basic enemy
                    //collision code
                    HUD.HEALTH -= 4;
                }
            }
                if(tempObject.getId()==ID.BuffedEnemyBoss) {
                    if(getBounds().intersects(tempObject.getBounds())) {//temp object is now basic enemy
                        //collision code
                        HUD.HEALTH-=8;
                    }
                }
        }
    }

    public void render(Graphics g) {
        // TODO Auto-generated method stub
//		g.setColor(Color.white);
//		g.fillRect((int)x, (int)y, 32, 32);
        g.drawImage(player_image,(int)x,(int)y,null);

    }

}
