import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PramodApplet extends Applet implements KeyListener {

    private String message = "";
    private String eventType = "";
    
    //This method is called when the applet is first loaded
    @Override
    public void init() {
        //This tells the applet that it should listen for key events happening within its window.
        addKeyListener(this); // Add the KeyListener to the applet.  (keyPressed, keyReleased, keyTyped).
        setFocusable(true);   // Ensure the applet can receive keyboard input
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Press any key...", 30, 30);
        g.drawString(eventType + ": " + message, 20, 50);  // Display key event
    }
    
    
    // Handling all 3 KeyEvents (keyPressed, keyReleased, keyTyped)
    //Triggered When: A key is physically pressed down, regardless of whether it produces a printable character.
    @Override
    public void keyPressed(KeyEvent e) {
        eventType = "Key Pressed";
        message = KeyEvent.getKeyText(e.getKeyCode()); // Get the name of the key
        repaint(); // Repaint the applet with the new message
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        eventType = "Key Released";
        message = KeyEvent.getKeyText(e.getKeyCode());
        repaint();
    }
    
    //Triggered When: A key produces a character, meaning the key press results in a printable character being typed,
    //like letters, numbers, or symbols.
    @Override
    public void keyTyped(KeyEvent e) {
        eventType = "Key Typed";
        message = String.valueOf(e.getKeyChar()); // Get the character of the key typed
        repaint();
    }

}
