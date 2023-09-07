package object.interior.beds;

import main.GamePanel;
import object.Object;

public class OBJ_Bed3 extends Object {
    GamePanel gp;
    public final static String objName = "Bed3";

    public OBJ_Bed3(GamePanel gp, int col , int row) {
        super(gp,col,row);
        this.gp = gp;
        name = objName;
        speed = 0;
        direction = "down";
        type = typeObstacle;
        collision = true;
        getImage();
        setDialogue();

        solidArea.x = 2;
        solidArea.y = 8;
        solidArea.width = 30;
        solidArea.height = gp.tileSize;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {
        int width = gp.tileSize-14;
        int height = gp.tileSize + 18;

        down1 = setup("tiles/interior/beds/bed3", width, height);
    }
    public void interact(){
        startDialogue(this,0);
    }
    public void setDialogue(){
        dialogues[0][0] = "It's not time for sleep...";
    }
}