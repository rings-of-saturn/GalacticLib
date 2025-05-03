package rings_of_saturn.github.io.galacticlib.rendering;

import net.minecraft.client.gui.DrawContext;

public class DrawingHelper {
    public void drawLine(int x1, int y1, int width, int height, DrawContext context, int color) {
        int x2 = x1 + width;
        int y2 = y1 + height;

        int deltax = Math.abs(x2 - x1);
        int deltay = Math.abs(y2 - y1);
        int error = 0;
        int y = y1;
        for(int x=x1; x<x2; x++) {
            context.fill(x, y, x, y, color);
            error = error + deltay;
            if(2*error >= deltax ) {
                y = y + 1;
                error=error - deltax;
            }
        }
    }
}
