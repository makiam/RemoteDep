package app;

import javax.swing.*;

public class AppMainFrame extends JFrame {
    @Override
    protected void frameInit() {
        super.frameInit();
        this.setSize(1280,1024);
        this.setTitle("My Title");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
