import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveRectangleGravity extends JPanel implements KeyListener {
    private int rectX = 225; // x-coordinate of the rectangle's top-left corner
    private int rectY = 225; // y-coordinate of the rectangle's top-left corner
    private int rectVX = 0; // x-component of the rectangle's velocity
    private int rectVY = 0; // y-component of the rectangle's velocity
    private final int GRAVITY = 1; // acceleration due to gravity
    private final int MAX_SPEED = 10; // maximum speed of the rectangle

    public MoveRectangleGravity() {
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.WHITE);
        setFocusable(true);
        addKeyListener(this);

        // Start a timer to update the rectangle's position
        Timer timer = new Timer(25, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the rectangle's velocity due to gravity
                rectVY += GRAVITY;

                // Update the rectangle's position based on its velocity
                rectX += rectVX;
                rectY += rectVY;

                // Keep the rectangle inside the white box
                if (rectX < 0) {
                    rectX = 0;
                    rectVX = 0;
                } else if (rectX > 450) {
                    rectX = 450;
                    rectVX = 0;
                }
                if (rectY < 0) {
                    rectY = 0;
                    rectVY = 0;
                } else if (rectY > 450) {
                    rectY = 450;
                    rectVY = 0;
                }

                // Repaint the panel to update the display
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(rectX, rectY, 50, 50);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_LEFT:
                if (rectVX > -MAX_SPEED) {
                    rectVX -= 1;
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (rectVX < MAX_SPEED) {
                    rectVX += 1;
                }
                break;
            case KeyEvent.VK_UP:
                if (rectVY > -MAX_SPEED) {
                    rectVY -= 1;
                }
                break;
            case KeyEvent.VK_DOWN:
                if (rectVY < MAX_SPEED) {
                    rectVY += 1;
                }
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // not used
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // not used
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Move Rectangle Gravity");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MoveRectangleGravity());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
