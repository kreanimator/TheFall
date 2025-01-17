package object.interior.closets;

import main.GamePanel;
import object.Object;

public class OBJ_Comode1 extends Object {
    GamePanel gp;
    public final static String objName = "Comode1";

    public OBJ_Comode1(GamePanel gp, int col , int row) {
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
        solidArea.y = gp.tileSize;
        solidArea.width = gp.tileSize + 8;
        solidArea.height = 24;

        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {
        int width = gp.tileSize + 6;
        int height = (gp.tileSize*2);

        down1 = setup("tiles/interior/closets/comode1", width, height);
    }
    public void interact(){
        startDialogue(this,0);
    }
    public void setDialogue(){
        dialogues[0][0] = "You spent 30 minutes trying to find something useful, \n but it is only old clothes and plague here";
    }
}
