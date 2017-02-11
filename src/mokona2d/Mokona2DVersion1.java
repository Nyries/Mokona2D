package mokona2d;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Christine
 */
public class Mokona2DVersion1 extends JFrame {
    private final int HEIGHT = 510;
    private final int WIDTH = 875;
    private Graphics2D g2D;
    private Pen pen;

    public Mokona2DVersion1() {
        this.setTitle("Mokona2D Version 1");
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);
        this.setVisible(true); 
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void drawBody() {
        Pair p1 = new Pair(312, 94);
        Pair ctr1 = new Pair(171, 374);
        Pair p2 = new Pair(404, 373);
        
        pen.drawCurve(p1, ctr1, p2);
        
        p1 = p2;
        Pair ctr2 = new Pair(650, 395);
        p2 = new Pair(496, 71);
        pen.drawCurve(p1, ctr2, p2);
    }
    
    private void drawCornerLeftEar(){
        Pair p1 = new Pair(56, 241);
        Pair ctr1 = new Pair(49, 245);
        Pair p2 = new Pair(48, 250);
        
        pen.drawCurve(p1, ctr1, p2);
    }
    
    private void drawCornerRightEar(){
        Pair p1 = new Pair(782, 275);
        Pair ctr1 = new Pair(790, 279);
        Pair p2 = new Pair(791, 282);
        
        pen.drawCurve(p1, ctr1, p2);
    }
    
    private void drawEarrings() {
        // Draw hook
        Pair p1 = new Pair(102, 257);
        Pair p2 = new Pair(101, 248);
        
        pen.drawLine(p1, p2);
        
        p1 = p2;
        Pair ctr1 = new Pair(119, 251);
        p2 = new Pair(137, 242);
        
        pen.drawCurve(p1, ctr1, p2);
        
        p1 = p2;
        p2 = new Pair(137, 254);
        
        pen.drawLine(p1, p2);
        
        // Draw ornament
        p1 = new Pair(123, 259);
        ctr1 = new Pair(109, 263);
        Pair ctr2 = new Pair(110, 274);
        p2 = new Pair(123, 278);
        
        pen.drawCurve(p1, ctr1, ctr2, p2);
        
        p1 = new Pair(123, 259);
        ctr1 = new Pair(138, 261);
        ctr2 = new Pair(137, 277);
        p2 = new Pair(123, 278);
        
        pen.drawCurve(p1, ctr1, ctr2, p2);
    }
    
    private void drawEars() {
        drawLeftEar();
        drawRightEar();
    }
    
    private void drawEyes() {
        drawLeftEye();
        drawRightEye();
    }
    
    private void drawFace() {
        drawEyes();
        drawMouth();
    }
    
    private void drawFeet() {
        drawLeftFeet();
        drawRightFeet();
    }
    
    private void drawGem() {
        // Draw upper part
        Pair p1 = new Pair(388, 75);
        Pair ctr1 = new Pair(391, 44);
        Pair ctr2 = new Pair(445, 32);
        Pair p2 = new Pair(450, 77);
        
        pen.drawCurve(p1, ctr1, ctr2, p2);
        
        // Draw lower part
        ctr1 = new Pair(389, 121);
        ctr2 = new Pair(447, 122);
        pen.drawCurve(p1, ctr1, ctr2, p2);
    }
    
    private void drawHands() {
        drawLeftHand();
        drawRightHand();
    }
    
    private void drawHead() {
        Pair p1 = new Pair(352, 55);
        Pair ctr = new Pair(418, 18);
        Pair p2 = new Pair(478, 54);
        
        pen.drawCurve(p1, ctr, p2);
    }
    
    private void drawInnerLeftEar() {
        Pair p1 = new Pair(48, 250);
        Pair ctr1 = new Pair(130, 285);
        Pair p2 = new Pair(265, 199);
        
        pen.drawCurve(p1, ctr1, p2);
    }
    
    private void drawInnerRightEar() {
        Pair p1 = new Pair(791, 282);
        Pair ctr1 = new Pair(665, 286);
        Pair p2 = new Pair(545, 180);
        
        pen.drawCurve(p1, ctr1, p2);
    }
    
    private void drawLeftEar() {
        drawOuterLeftEar();
        drawCornerLeftEar();
        drawMiddleLeftEar();
        drawInnerLeftEar();
        drawEarrings();
    }
    
    private void drawLeftEye() {
        Pair p1 = new Pair(327, 132);
        Pair ctr = new Pair(355, 109);
        Pair p2 = new Pair(393, 130);
        
        pen.drawCurve(p1, ctr, p2);
    }
    
    private void drawLeftFeet() {
        // Draw forefeet
        Pair p1 = new Pair(289, 342);
        Pair ctr1 = new Pair(201, 410);
        Pair p2 = new Pair(242, 424);
        
        pen.drawCurve(p1, ctr1, p2);
        
        // Draw backfeet
        p1 = p2;
        ctr1 = new Pair(264, 434);
        Pair ctr2 = new Pair(292, 370);
        p2 = new Pair(330, 363);
        
        pen.drawCurve(p1, ctr1, ctr2, p2);
    }
    
    private void drawLeftHand() {
        // Draw forehand
        Pair p1 = new Pair(346, 231);
        Pair ctr1 = new Pair(367, 251);
        Pair ctr2 = new Pair(400, 242);
        Pair p2 = new Pair(414, 256);
        
        pen.drawCurve(p1, ctr1, ctr2, p2);
        
        // Draw backhand
        p1 = p2;
        ctr1 = new Pair(421, 280);
        ctr2 = new Pair(377, 288);
        p2 = new Pair(343, 277);
        
        pen.drawCurve(p1, ctr1, ctr2, p2);
    }
    
    private void drawMiddleLeftEar() {
        // Draw long part
        Pair p1 = new Pair(77, 231);
        Pair ctr1 = new Pair(200, 197);
        Pair p2 = new Pair(240, 144);
        
        pen.drawCurve(p1, ctr1, p2);
        
        // Draw short part
        p1 = p2;
        ctr1 = new Pair(237, 163);
        p2 = new Pair(231, 159);
        pen.drawCurve(p1, ctr1, p2);
        
        // Draw medium part
        p1 = p2;
        ctr1 = new Pair(256, 150);
        Pair ctr2 = new Pair(290, 130);
        p2 = new Pair(300, 112); 
        pen.drawCurve(p1, ctr1, ctr2, p2);
    }
    
    private void drawMiddleRightEar() {
        // Draw long part
        Pair p1 = new Pair(758, 266);
        Pair ctr1 = new Pair(670, 242);
        Pair p2 = new Pair(576, 156);
        
        pen.drawCurve(p1, ctr1, p2);
        
        // Draw short part
        p1 = p2;
        ctr1 = new Pair(576, 165);
        p2 = new Pair(587, 175);
        pen.drawCurve(p1, ctr1, p2);
        
        // Draw medium part
        p1 = p2;
        ctr1 = new Pair(554, 153);
        p2 = new Pair(528, 121); 
        pen.drawCurve(p1, ctr1, p2);
    }
    
    private void drawMouth() {
        // Draw left side
        Pair p1 = new Pair(386, 153);
        Pair ctr = new Pair(394, 167);
        Pair p2 = new Pair(417, 156);
        
        pen.drawCurve(p1, ctr, p2);
        
        // Draw right side
        p1 = p2;
        ctr = new Pair(442, 169);
        p2 = new Pair(449, 156);
        
        pen.drawCurve(p1, ctr, p2);
    }
    
    private void drawOuterLeftEar() {
        Pair p1 = new Pair(365, 46);
        Pair ctr1 = new Pair(285, 84);
        Pair ctr2 = new Pair(174, 188);
        Pair p2 = new Pair(56, 241);
        
        pen.drawCurve(p1, ctr1, ctr2, p2);
    }
    
    private void drawOuterRightEar() {
        Pair p1 = new Pair(456, 42);
        Pair ctr1 = new Pair(584, 99);
        Pair ctr2 = new Pair(689, 251);
        Pair p2 = new Pair(782, 275);
        
        pen.drawCurve(p1, ctr1, ctr2, p2);
    }
    
    private void drawRightEar() {
        drawOuterRightEar();
        drawCornerRightEar();
        drawMiddleRightEar();
        drawInnerRightEar();
    }
    
    private void drawRightEye() {
        Pair p1 = new Pair(441, 131);
        Pair ctr = new Pair(484, 110);
        Pair p2 = new Pair(505, 135);
        
        pen.drawCurve(p1, ctr, p2);
    }
    
    private void drawRightFeet() {
        // Draw forefeet
        Pair p1 = new Pair(483, 367);
        Pair ctr1 = new Pair(499, 365);
        Pair ctr2 = new Pair(536, 400);
        Pair p2 = new Pair(552, 416);
        
        pen.drawCurve(p1, ctr1, ctr2, p2);
        
        p1 = p2;
        ctr1 = new Pair(586, 435);
        p2 = new Pair(581, 395);
        
        pen.drawCurve(p1, ctr1, p2);
        
        // Draw backfeet
        p1 = p2;
        ctr1 = new Pair(567, 360);
        ctr2 = new Pair(546, 370);
        p2 = new Pair(527, 344);
        
        pen.drawCurve(p1, ctr1, ctr2, p2);
    }

    private void drawRightHand() {
        // Draw forehand
        Pair p1 = new Pair(474, 223);
        Pair ctr = new Pair(412, 206);
        Pair p2 = new Pair(400, 236);
        
        pen.drawCurve(p1, ctr, p2);
        
        // Draw backhand
        p1 = p2;
        Pair ctr1 = new Pair(411, 264);
        Pair ctr2 = new Pair(445, 253);
        p2 = new Pair(465, 267);
        
        pen.drawCurve(p1, ctr1, ctr2, p2);
    }
    
    private void init(Graphics g) {
        g2D = (Graphics2D)g;
    }
    
    @Override
    public void paint(Graphics g) {
        init(g);
        
        pen = new Pen(g2D, 2.0f);
        
        drawHead();
        drawGem();
        drawFace();
        drawBody();
        drawEars();
        drawHands();
        drawFeet();
    }
    
}
