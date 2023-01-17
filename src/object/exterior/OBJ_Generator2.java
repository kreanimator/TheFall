package object.exterior;

import main.GamePanel;
import object.Object;

public class OBJ_Generator2 extends Object {
    GamePanel gp;
    public final static String objName = "Generator2";



    public OBJ_Generator2(GamePanel gp, int col , int row) {
        super(gp,col,row);
        this.gp = gp;
        type = typeObstacle;
        name = objName;
        int height = gp.tileSize*2;
        int width = gp.tileSize*3;
        image = setup("tiles/exterior/generator2", width, height);

        down1 = image;
        collision = true;
        solidArea.x = 0;
        solidArea.y = 40;
        solidArea.width = gp.tileSize+20;
        solidArea.height = 36;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;

    }
    public void interact(){
        gp.player.attackCanceled = false;
        gp.player.shotCanceled = false;
    }

    }

