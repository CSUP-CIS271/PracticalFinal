// temporary package name
package bin;

import bin.Gui;


public class client {

    public static void main(String[] cl_args) {
        client client = new client();
    }

    public client() {
        Gui gui = new Gui();
        gui.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(500, 100);
    }

}
