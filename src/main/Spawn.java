package main;

import main.Enemies.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static main.Game.HEIGHT;
import static main.Game.WIDTH;

public class Spawn {
    private Handler handler;
    private main.Enemies.EnemyBoss EnemyBoss;
    private HUD hud;
    private Game game;
    private Random r=new Random();
    private int scoreKeep=0;
    private Game.STATE gameState;


    public Spawn(Handler handler,HUD hud,Game game) {
        this.handler=handler;
        this.hud=hud;
        this.game=game;
    }
    public void tick() {

        scoreKeep++;
        if(scoreKeep>=250)
        {
            scoreKeep=0;
            hud.setWave(hud.getWave()+1);


            if(game.lvl==1){
                if(game.diff==0) {


                    if (hud.getWave() == 2) {
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH - 50), r.nextInt(HEIGHT - 50), ID.HardEnemy, handler));
                    } else if (hud.getWave() == 3) {

                                gameState= Game.STATE.Win;
                                HUD.HEALTH=100;
                                handler.clearEnemys();
                                for(int i=0;i<20;i++) {
                                    handler.addObject(new MenuParticle(r.nextInt(WIDTH),r.nextInt(HEIGHT),ID.MenuParticle,handler));
                                }
                    }

                }

                else if(game.diff==1) {

                    int spd = 3;

                    if(hud.getWave()==2) {
                        handler.addObject(new HorizontalEnemy(r.nextInt(WIDTH), HEIGHT / 2 - 20, ID.VerticalEnemy,handler));
                        handler.addObject(new VerticalEnemy(WIDTH / WIDTH + 20, r.nextInt(HEIGHT- 50), ID.VerticalEnemy,handler));
                        handler.addObject(new VerticalEnemy(WIDTH / 3 + 30, r.nextInt(HEIGHT- 50), ID.VerticalEnemy,handler));
                        handler.addObject(new VerticalEnemy(WIDTH / 3 * 2, r.nextInt(HEIGHT- 50), ID.VerticalEnemy,handler));
                        handler.addObject(new VerticalEnemy(WIDTH - 50, r.nextInt(HEIGHT- 50), ID.VerticalEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.HardEnemy,handler));
                    }


                }
            }
            if(game.lvl==2){
                if(game.diff==0)
                {


                    if(hud.getWave()==2) {
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler)); handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler)); handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler)); handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler)); handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));


                    }
                    else if(hud.getWave()==3) {
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                    }
                    else if(hud.getWave()==4) {
                        handler.addObject(new FastEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.FastEnemy,handler));
                    }
                    else if(hud.getWave()==5) {
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                    }
                    else if(hud.getWave()==6) {
                        handler.addObject(new FastEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.FastEnemy,handler));
                    }
                    else if(hud.getWave()==7) {
                        handler.addObject(new FastEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.FastEnemy,handler));
                    }
                    else if(hud.getWave()==30) {
                        handler.clearEnemys();
                        handler.addObject(new EnemyBoss((WIDTH/2)-48,-120, ID.EnemyBoss,handler));
                    }

                    else if(hud.getWave()==45) {
                        handler.clearEnemys();
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.HardEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new FastEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.FastEnemy,handler));
                        handler.addObject(new FastEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.FastEnemy,handler));
                    }
                    else if(hud.getWave()==50) {
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.HardEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));

                        handler.addObject(new BasicEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                    }
                    else if(hud.getWave()==65) {
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));

                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                    }
                    else if(hud.getWave()==80) {
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.HardEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new BasicEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new BasicEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new FastEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.FastEnemy,handler));
                    }
                    else if(hud.getWave()==90) {
                        handler.clearEnemys();
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.HardEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));


                    }
                    else if(hud.getWave()==100) {
                        handler.clearEnemys();
                        handler.addObject(new BuffedEnemyBoss((WIDTH/2)-48,-120, ID.EnemyBoss,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));

                    }
                }

                else if(game.diff==1)
                {

                    int spd = 3;

                    if(hud.getWave()==2) {
                        handler.addObject(new HorizontalEnemy(r.nextInt(WIDTH), HEIGHT / 2 - 20, ID.VerticalEnemy,handler));
                        handler.addObject(new VerticalEnemy(WIDTH / WIDTH + 20, r.nextInt(HEIGHT- 50), ID.VerticalEnemy,handler));
                        handler.addObject(new VerticalEnemy(WIDTH / 3 + 30, r.nextInt(HEIGHT- 50), ID.VerticalEnemy,handler));
                        handler.addObject(new VerticalEnemy(WIDTH / 3 * 2, r.nextInt(HEIGHT- 50), ID.VerticalEnemy,handler));
                        handler.addObject(new VerticalEnemy(WIDTH - 50, r.nextInt(HEIGHT- 50), ID.VerticalEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                    }
                    else if(hud.getWave()==3) {
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                    }
                    else if(hud.getWave()==4) {
                        handler.addObject(new FastEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.FastEnemy,handler));
                    }
                    else if(hud.getWave()==5) {
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.HardEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                    }
                    else if(hud.getWave()==6) {
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.HardEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.HardEnemy,handler));
                        handler.addObject(new FastEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.FastEnemy,handler));
                    }
                    else if(hud.getWave()==7) {
                        handler.addObject(new FastEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.FastEnemy,handler));
                    }
                    else if(hud.getWave()==30) {
                        handler.clearEnemys();
                        handler.addObject(new EnemyBoss((WIDTH/2)-48,-120, ID.EnemyBoss,handler));
                    }
                    else if(hud.getWave()==45) {
                        handler.clearEnemys();
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.HardEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new FastEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.FastEnemy,handler));
                        handler.addObject(new FastEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.FastEnemy,handler));
                    }
                    else if(hud.getWave()==50) {
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new BasicEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new BasicEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new BasicEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                    }
                    else if(hud.getWave()==65) {
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new BasicEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                    }
                    else if(hud.getWave()==80) {
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new BasicEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new BasicEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.BasicEnemy,handler));
                        handler.addObject(new FastEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.FastEnemy,handler));
                    }
                    else if(hud.getWave()==90) {
                        handler.clearEnemys();
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.HardEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));


                    }
                    else if(hud.getWave()==100) {
                        handler.clearEnemys();
                        handler.addObject(new HardEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.HardEnemy,handler));
                        handler.addObject(new BuffedEnemyBoss((WIDTH/2)-48,-120, ID.BuffedEnemyBoss,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));
                        handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler));

                    }

                }
            }
            if(game.lvl==1000){
                




                if (hud.getWave() == 2) {

                }
            }

        }
    }
    public Integer RandomizeList() {


        List<Integer> Randomizelist = new ArrayList<>();
        Randomizelist.add(handler.addObject(new HardEnemy(r.nextInt(WIDTH - 50), r.nextInt(HEIGHT - 50), ID.HardEnemy, handler)));
        Randomizelist.add(handler.addObject(new BasicEnemy(r.nextInt(WIDTH - 50), r.nextInt(HEIGHT - 50), ID.BasicEnemy, handler)));
        Randomizelist.add(handler.addObject(new FastEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.FastEnemy,handler)));
        Randomizelist.add(handler.addObject(new SmartEnemy(r.nextInt(WIDTH- 50),r.nextInt(HEIGHT- 50),ID.SmartEnemy,handler)));
        Randomizelist.add(handler.addObject(new AgressiveEnemy(r.nextInt(WIDTH- 50), r.nextInt(HEIGHT- 50), ID.AgressiveEnemy, handler)));
        
        
        Random r = new Random();
        return Randomizelist.get(r.nextInt(2));
    }
}
