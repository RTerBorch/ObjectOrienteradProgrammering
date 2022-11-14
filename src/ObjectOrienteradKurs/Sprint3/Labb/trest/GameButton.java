package ObjectOrienteradKurs.Sprint3.Labb.trest;

import javax.accessibility.Accessible;
import javax.swing.*;

public class GameButton {

    public class GameJButton extends AbstractButton implements Accessible {
    int position;

        public GameJButton(int position) {
            this.position = position;
        }
    }

}
