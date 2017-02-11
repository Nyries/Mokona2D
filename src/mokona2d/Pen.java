package mokona2d;

import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Shape;

/**
 *
 * @author Christine
 */
public class Pen {

    private Color fill;

    private Graphics2D g2D;
    private GeneralPath gp;
    private Color outline;
    private boolean showControlPoints;
    private float thickness;

    public Pen(Graphics2D g2D, float thickness) {
        this.g2D = g2D;

        this.thickness = thickness;
        g2D.setStroke(new BasicStroke(thickness));

        this.outline = Color.BLACK;
        this.showControlPoints = false;
    }

    public void curveTo(Pair ctr1, Pair ctr2, Pair p) {
        gp.curveTo(ctr1.x, ctr1.y, ctr2.x, ctr2.y, p.x, p.y);
        if (showControlPoints) {
            drawControl(ctr1);
            drawControl(ctr2);
        }
    }

    public void draw(Shape s) {
        g2D.setPaint(outline);
        g2D.draw(s);
        if (fill != null) {
            g2D.setPaint(fill);
            g2D.fill(s);
        }
    }

    public void drawControl(Pair p) {
        Shape guide = new Ellipse2D.Double(p.x, p.y, 2, 2);
        outline = Color.BLUE;
        draw(guide);

        outline = Color.BLACK;
    }

    public void drawCurve(Pair p1, Pair ctr, Pair p2) {
        Shape quadCurve = new QuadCurve2D.Double(p1.x, p1.y, ctr.x, ctr.y, p2.x, p2.y);
        if (showControlPoints) {
            drawControl(ctr);
        }
        draw(quadCurve);
    }

    public void drawCurve(Pair p1, Pair ctr1, Pair ctr2, Pair p2) {
        Shape cubicCurve = new CubicCurve2D.Double(p1.x, p1.y, ctr1.x, ctr1.y, ctr2.x, ctr2.y, p2.x, p2.y);
        if (showControlPoints) {
            drawControl(ctr1);
            drawControl(ctr2);
        }
        draw(cubicCurve);
    }

    // temporary code
    public void drawGuide(Pair p) {
        Shape guide = new Ellipse2D.Double(p.x, p.y, 2, 2);
        outline = Color.RED;
        draw(guide);

        outline = Color.BLACK;
    }

    public void drawGuides(double[] p) {
        for (int i = 0; i < p.length; i += 2) {
            Pair guide = new Pair(p[i], p[i + 1]);
            drawGuide(guide);
        }
    }

    public void drawLine(Pair p1, Pair p2) {
        Shape line = new Line2D.Double(p1.x, p1.y, p2.x, p2.y);
        draw(line);
    }

    public void endAndFillShadow(Color f) {
        setFill(f);
        setOutline(f);
        draw(gp);
        setOutline(Color.BLACK);
    }

    public void endAndFillShape(Color f) {
        setFill(f);
        draw(gp);
    }

    public void lineTo(Pair p) {
        gp.lineTo(p.x, p.y);
    }

    public void moveTo(Pair p) {
        startPath();
        gp.moveTo(p.x, p.y);
    }

    public void quadTo(Pair ctr, Pair p) {
        gp.quadTo(ctr.x, ctr.y, p.x, p.y);
        if (showControlPoints) {
            drawControl(ctr);
        }
    }

    public void setFill(Color fill) {
        this.fill = fill;
    }

    public void setOutline(Color outline) {
        this.outline = outline;
    }

    public void setShowControlPoints(boolean showControlPoints) {
        this.showControlPoints = showControlPoints;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
        g2D.setStroke(new BasicStroke(this.thickness));
    }

    public void startPath() {
        this.gp = new GeneralPath();
    }
}
