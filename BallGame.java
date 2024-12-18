//Java program for Ball Game.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BallGame extends JPanel implements ActionListener {
private int ballX = 50, ballY = 50, ballRadius = 20;
private int ballDX = 2, ballDY = 2; // Ball speed in x and y direction
Timer timer;
public BallGame() {
setPreferredSize(new Dimension(600, 400));
setBackground(Color.BLACK);
timer = new Timer(5, this); // Set up a timer that calls actionPerformed every 5 milliseconds
timer.start();
}
public void paintComponent(Graphics g) {
super.paintComponent(g);
// Draw the ball
g.setColor(Color.RED);
g.fillOval(ballX, ballY, ballRadius * 2, ballRadius * 2);
}
public void actionPerformed(ActionEvent e) {
// Move the ball
ballX += ballDX;
ballY += ballDY;
// Check for collision with walls
if (ballX <= 0 || ballX + ballRadius * 2 >= getWidth()) {
ballDX = -ballDX; // Reverse the horizontal direction
}
if (ballY <= 0 || ballY + ballRadius * 2 >= getHeight()) {
ballDY = -ballDY; // Reverse the vertical direction
}
// Repaint the ball at the new position
repaint();
}
public static void main(String[] args) {
JFrame frame = new JFrame("Bouncing Ball Game");
BallGame ballGame = new BallGame();
frame.add(ballGame);
frame.pack();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}
