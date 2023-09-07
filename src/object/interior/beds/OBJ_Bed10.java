package object.interior.beds;

import main.GamePanel;
import object.Object;

public class OBJ_Bed10 extends Object {
    GamePanel gp;
    public final static String objName = "Bed10";

    public OBJ_Bed10(GamePanel gp, int col , int row) {
        super(gp,col,row);
        this.gp = gp;
        name = objName;
        speed = 0;
        direction = "down";
        type = typeObstacle;
        collision = true;
        getImage();
        setDialogue();

        solidArea.x = 8;
        solidArea.y = 16;
        solidArea.width = gp.tileSize;
        solidArea.height = 24;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {
        int height = gp.tileSize;
        int width = gp.tileSize + 18;

        down1 = setup("tiles/interior/beds/bed10", width, height);
    }
    public void interact(){
        startDialogue(this,0);
    }
    public void setDialogue(){
        dialogues[0][0] = "This bed is broken...";
    }
}