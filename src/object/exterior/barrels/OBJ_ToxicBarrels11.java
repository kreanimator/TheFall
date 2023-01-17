package object.exterior.barrels;

import main.GamePanel;
import object.Object;

public class OBJ_ToxicBarrels11 extends Object {
    GamePanel gp;
    public final static String objName = "ToxicBarrels11";

    public OBJ_ToxicBarrels11(GamePanel gp, int col, int row) {
        super(gp, col, row);
        this.gp = gp;
        name = objName;
        speed = 0;
        direction = "down";
        type = typeObstacle;
        lightRadius = 300;
        collision = true;
        getImage();
        setAction();

        solidArea.x = 6;
        solidArea.y = 16;
        solidArea.width = 32;
        solidArea.height = 32;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {
        int width = gp.tileSize ;
        int height = gp.tileSize ;

        down1 = setup("tiles/exterior/toxic_barrels11", width, height);


    }

    public void interact(){
        gp.player.attackCanceled = false;
        gp.player.shotCanceled = false;
    }
}
