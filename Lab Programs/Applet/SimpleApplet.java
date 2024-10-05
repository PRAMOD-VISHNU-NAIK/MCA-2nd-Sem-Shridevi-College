import java.applet.Applet;
import java.awt.Graphics;

public class SimpleApplet extends Applet {
    // This method initializes the applet
    @Override
    public void init() {
        System.out.println("Applet initialized.");
    }

    // This method starts the applet
    @Override
    public void start() {
        System.out.println("Applet started.");
    }

    // This method is called to repaint the applet's content
    @Override
    public void paint(Graphics g) {
        g.drawString("Hello, Applet!", 50, 50); // Display text on the applet window
    }

    // This method stops the applet
    @Override
    public void stop() {
        System.out.println("Applet stopped.");
    }

    // This method destroys the applet
    @Override
    public void destroy() {
        System.out.println("Applet destroyed.");
    }
}
