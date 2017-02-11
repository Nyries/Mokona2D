package mokona2d;

import javax.swing.WindowConstants;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author Christine
 */
public class Mokona2DVersion2 extends JFrame {
    private final int HEIGHT = 510;
    private final int WIDTH = 875;
    private Graphics2D g2D;
    private Pen pen;

    public Mokona2DVersion2() {
        this.setTitle("Mokona2D Version 2");
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void drawBody() {
        Pair ctr1 = new Pair(171, 374);
        Pair p2 = new Pair(404, 373);

        pen.quadTo(ctr1, p2);

        Pair ctr2 = new Pair(650, 395);
        p2 = new Pair(496, 71);
        pen.quadTo(ctr2, p2);

        p2 = new Pair(478, 54);
        pen.lineTo(p2);
        pen.endAndFillShape(new Color(238, 239, 234));
    }

    private void drawCornerLeftEar() {
        Pair ctr1 = new Pair(49, 245);
        Pair p2 = new Pair(77, 231);

        pen.quadTo(ctr1, p2);

        // Draw long part
        ctr1 = new Pair(200, 195);
        p2 = new Pair(240, 144);

        pen.quadTo(ctr1, p2);

        // Draw short part
        ctr1 = new Pair(237, 163);
        p2 = new Pair(231, 159);

        pen.quadTo(ctr1, p2);

        // Draw medium part
        ctr1 = new Pair(256, 150);
        Pair ctr2 = new Pair(290, 130);
        p2 = new Pair(300, 112);

        pen.curveTo(ctr1, ctr2, p2);

        pen.endAndFillShape(new Color(223, 191, 196));
    }

    private void drawCornerRightEar() {
        Pair p1 = new Pair(758, 266);
        Pair ctr = new Pair(790, 279);
        Pair p2 = new Pair(791, 282);

        pen.moveTo(p1);
        pen.quadTo(ctr, p2);
    }

    private void drawDarkShadowOnGem() {
        Pair p1 = new Pair(438, 58);
        Pair ctr1 = new Pair(459, 98);
        Pair ctr2 = new Pair(416, 117);
        Pair p2 = new Pair(397, 91);
        pen.moveTo(p1);
        pen.curveTo(ctr1, ctr2, p2);
        
        ctr1 = new Pair(406, 98);
        p2 = new Pair(413, 98);
        pen.quadTo(ctr1, p2);
        
        ctr1 = new Pair(414, 82);
        ctr2 = new Pair(428, 68);
        p2 = new Pair(440, 76);
        pen.curveTo(ctr1, ctr2, p2);
        
        pen.endAndFillShadow(new Color(109, 75, 52));
    }

    private void drawEarrings() {
        // Draw hook
        Pair p1 = new Pair(102, 257);
        Pair p2 = new Pair(101, 248);

        pen.moveTo(p1);
        pen.lineTo(p2);

        Pair ctr1 = new Pair(119, 251);
        p2 = new Pair(137, 242);

        pen.quadTo(ctr1, p2);

        p2 = new Pair(137, 254);

        pen.lineTo(p2);
        pen.endAndFillShape(new Color(236, 205, 172));

        // Draw ornament
        p1 = new Pair(123, 259);
        ctr1 = new Pair(109, 263);
        Pair ctr2 = new Pair(110, 274);
        p2 = new Pair(123, 278);

        pen.moveTo(p1);
        pen.curveTo(ctr1, ctr2, p2);

        ctr1 = new Pair(137, 277);
        ctr2 = new Pair(138, 261);

        pen.curveTo(ctr1, ctr2, p1);
        pen.endAndFillShape(new Color(208, 112, 86));
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

        pen.moveTo(p1);
        pen.curveTo(ctr1, ctr2, p2);

        // Draw lower part
        ctr1 = new Pair(447, 122);
        ctr2 = new Pair(389, 121);
        pen.curveTo(ctr1, ctr2, p1);
        pen.endAndFillShape(new Color(214, 115, 94));

        drawShadowOnGem();
    }

    private void drawHands() {
        drawLeftHand();
        drawRightHand();
    }

    private void drawHead() {
        Pair p1 = new Pair(478, 54);
        Pair ctr = new Pair(418, 18);
        Pair p2 = new Pair(352, 55);

        pen.moveTo(p1);
        pen.quadTo(ctr, p2);

        p2 = new Pair(312, 94);
        pen.lineTo(p2);
    }

    private void drawInnerLeftEar() {
        Pair p1 = new Pair(265, 199);
        Pair ctr1 = new Pair(130, 285);
        Pair p2 = new Pair(48, 250);

        pen.moveTo(p1);
        pen.quadTo(ctr1, p2);
    }

    private void drawInnerRightEar() {
        Pair ctr1 = new Pair(665, 286);
        Pair p2 = new Pair(545, 180);

        pen.quadTo(ctr1, p2);

        pen.endAndFillShape(new Color(223, 191, 196));
    }

    private void drawLeftEar() {
        drawInnerLeftEar();
        drawCornerLeftEar();
        drawShadowOnLeftEar();
        drawEarrings();
        drawOuterLeftEar();
        drawMiddleLeftEar();
    }

    private void drawLeftEye() {
        Pair p1 = new Pair(327, 132);
        Pair ctr = new Pair(355, 109);
        Pair p2 = new Pair(393, 130);

        pen.moveTo(p1);
        pen.quadTo(ctr, p2);
        pen.endAndFillShape(null);
    }

    private void drawLeftFeet() {
        // Draw forefeet
        Pair p1 = new Pair(289, 342);
        Pair ctr1 = new Pair(201, 410);
        Pair p2 = new Pair(242, 424);

        pen.moveTo(p1);
        pen.quadTo(ctr1, p2);

        // Draw backfeet
        ctr1 = new Pair(264, 434);
        Pair ctr2 = new Pair(292, 370);
        p2 = new Pair(330, 363);

        pen.curveTo(ctr1, ctr2, p2);
        pen.endAndFillShape(new Color(237, 239, 234));

        drawShadowOnLeftFeet();
    }

    private void drawLeftHand() {
        // Draw forehand
        Pair p1 = new Pair(346, 231);
        Pair ctr1 = new Pair(367, 251);
        Pair ctr2 = new Pair(400, 242);
        Pair p2 = new Pair(414, 256);

        pen.moveTo(p1);
        pen.curveTo(ctr1, ctr2, p2);

        // Draw backhand
        ctr1 = new Pair(421, 280);
        ctr2 = new Pair(377, 288);
        p2 = new Pair(343, 277);

        pen.curveTo(ctr1, ctr2, p2);
        pen.endAndFillShape(null);
    }
    
    private void drawLightShadowOnGem() {
        Pair p1 = new Pair(397, 68);
        Pair ctr1 = new Pair(407, 46);
        Pair p2 = new Pair(425, 54);
        pen.moveTo(p1);
        pen.quadTo(ctr1, p2);
        
        ctr1 = new Pair(425, 59);
        p2 = new Pair(420, 61);
        pen.quadTo(ctr1, p2);

        ctr1 = new Pair(419, 74);
        p2 = new Pair(407, 69);
        pen.quadTo(ctr1, p2);
        
        ctr1 = new Pair(401, 73);
        pen.quadTo(ctr1, p1);
        
        pen.endAndFillShadow(new Color(250, 232, 237));
    }
    
    private void drawMiddleLeftEar() {
        // Draw long part
        Pair ctr1 = new Pair(200, 197);
        Pair p2 = new Pair(240, 144);

        pen.quadTo(ctr1, p2);

        // Draw short part
        ctr1 = new Pair(237, 163);
        p2 = new Pair(231, 159);

        pen.quadTo(ctr1, p2);

        // Draw medium part
        ctr1 = new Pair(256, 150);
        Pair ctr2 = new Pair(290, 130);
        p2 = new Pair(300, 112);

        pen.curveTo(ctr1, ctr2, p2);
        pen.endAndFillShape(new Color(237, 239, 234));
    }

    private void drawMiddleRightEar() {
        // Draw long part
        Pair ctr1 = new Pair(670, 242);
        Pair p2 = new Pair(576, 156);

        pen.quadTo(ctr1, p2);

        // Draw short part
        ctr1 = new Pair(576, 165);
        p2 = new Pair(587, 175);
        pen.quadTo(ctr1, p2);

        // Draw medium part
        ctr1 = new Pair(554, 153);
        p2 = new Pair(528, 121);
        pen.quadTo(ctr1, p2);
        pen.endAndFillShape(new Color(237, 239, 234));
    }

    private void drawMouth() {
        // Draw left side
        Pair p1 = new Pair(386, 153);
        Pair ctr = new Pair(394, 167);
        Pair p2 = new Pair(417, 156);

        pen.moveTo(p1);
        pen.quadTo(ctr, p2);

        // Draw right side
        ctr = new Pair(442, 169);
        p2 = new Pair(449, 156);

        pen.quadTo(ctr, p2);
        pen.endAndFillShape(null);
    }

    private void drawOuterLeftEar() {
        Pair p1 = new Pair(365, 46);
        Pair ctr1 = new Pair(285, 84);
        Pair ctr2 = new Pair(174, 188);
        Pair p2 = new Pair(77, 231);

        pen.moveTo(p1);
        pen.curveTo(ctr1, ctr2, p2);
    }

    private void drawOuterRightEar() {
        Pair p1 = new Pair(456, 42);
        Pair ctr1 = new Pair(584, 99);
        Pair ctr2 = new Pair(689, 251);
        Pair p2 = new Pair(758, 266);

        pen.moveTo(p1);
        pen.curveTo(ctr1, ctr2, p2);
    }

    private void drawRightEar() {
        drawCornerRightEar();
        drawInnerRightEar();
        drawShadowOnRightEar();
        drawOuterRightEar();
        drawMiddleRightEar();
    }

    private void drawRightEye() {
        Pair p1 = new Pair(441, 131);
        Pair ctr = new Pair(484, 110);
        Pair p2 = new Pair(505, 135);

        pen.moveTo(p1);
        pen.quadTo(ctr, p2);
        pen.endAndFillShape(null);
    }

    private void drawRightFeet() {
        // Draw forefeet
        Pair p1 = new Pair(483, 367);
        Pair ctr1 = new Pair(499, 365);
        Pair ctr2 = new Pair(536, 400);
        Pair p2 = new Pair(552, 416);

        pen.moveTo(p1);
        pen.curveTo(ctr1, ctr2, p2);

        ctr1 = new Pair(586, 435);
        p2 = new Pair(581, 395);

        pen.quadTo(ctr1, p2);

        // Draw backfeet
        ctr1 = new Pair(567, 360);
        ctr2 = new Pair(546, 370);
        p2 = new Pair(527, 344);

        pen.curveTo(ctr1, ctr2, p2);
        pen.endAndFillShape(new Color(237, 239, 234));

        drawShadowOnRightFeet();
    }

    private void drawRightHand() {
        // Draw forehand
        Pair p1 = new Pair(474, 223);
        Pair ctr1 = new Pair(412, 206);
        Pair p2 = new Pair(400, 236);

        pen.moveTo(p1);
        pen.quadTo(ctr1, p2);

        // Draw backhand
        ctr1 = new Pair(411, 264);
        Pair ctr2 = new Pair(445, 253);
        p2 = new Pair(465, 267);

        pen.curveTo(ctr1, ctr2, p2);
        pen.endAndFillShape(null);
    }
    
    private void drawShadowOnGem() {
        drawLightShadowOnGem();
        drawDarkShadowOnGem();
    }

    private void drawShadowOnLeftEar() {
        Pair p1 = new Pair(266, 194);
        Pair ctr1 = new Pair(213, 212);
        Pair ctr2 = new Pair(148, 233);
        Pair p2 = new Pair(148, 205);

        pen.moveTo(p1);
        pen.curveTo(ctr1, ctr2, p2);

        // Draw long part
        ctr1 = new Pair(200, 195);
        p2 = new Pair(240, 144);

        pen.quadTo(ctr1, p2);

        // Draw short part
        ctr1 = new Pair(237, 163);
        p2 = new Pair(231, 159);

        pen.quadTo(ctr1, p2);

        // Draw medium part
        ctr1 = new Pair(256, 150);
        ctr2 = new Pair(290, 130);
        p2 = new Pair(300, 112);

        pen.curveTo(ctr1, ctr2, p2);
        pen.endAndFillShadow(new Color(199, 143, 156));
    }

    private void drawShadowOnLeftFeet() {
        Pair p1 = new Pair(289, 342);
        Pair p2 = new Pair(280, 348);

        pen.moveTo(p1);
        pen.lineTo(p2);

        Pair ctr1 = new Pair(281, 361);
        Pair ctr2 = new Pair(299, 374);
        p2 = new Pair(312, 372);

        pen.curveTo(ctr1, ctr2, p2);

        ctr1 = new Pair(318, 366);
        p2 = new Pair(330, 363);
        pen.quadTo(ctr1, p2);

        pen.endAndFillShadow(new Color(182, 183, 167));
    }

    private void drawShadowOnRightEar() {
        Pair p1 = new Pair(539, 176);
        pen.moveTo(p1);

        Pair p2 = new Pair(675, 229);
        Pair ctr1 = new Pair(571, 202);
        Pair ctr2 = new Pair(681, 256);

        pen.curveTo(ctr1, ctr2, p2);

        // Draw long part
        ctr1 = new Pair(670, 242);
        p2 = new Pair(576, 156);

        pen.quadTo(ctr1, p2);

        // Draw short part
        ctr1 = new Pair(576, 165);
        p2 = new Pair(587, 175);
        pen.quadTo(ctr1, p2);

        // Draw medium part
        ctr1 = new Pair(554, 153);
        p2 = new Pair(517, 113);
        pen.quadTo(ctr1, p2);
        pen.endAndFillShadow(new Color(199, 143, 156));
    }

    private void drawShadowOnRightFeet() {
        Pair p1 = new Pair(483, 367);
        Pair ctr1 = new Pair(496, 366);
        Pair p2 = new Pair(504, 376);
        
        pen.moveTo(p1);
        pen.quadTo(ctr1, p2);
        
        ctr1 = new Pair(515, 370);
        Pair ctr2 = new Pair(544, 360);
        p2 = new Pair(533, 350);

        pen.curveTo(ctr1, ctr2, p2);

        p2 = new Pair(527, 344);
        pen.lineTo(p2);

        pen.endAndFillShadow(new Color(182, 183, 167));
    }

    private void init(Graphics g) {
        g2D = (Graphics2D) g;
    }

    @Override
    public void paint(Graphics g) {
        init(g);

        pen = new Pen(g2D, 2.0f);

        drawFeet();
        drawHead();
        drawBody();
        drawGem();
        drawFace();
        drawEars();
        drawHands();
    }
}
