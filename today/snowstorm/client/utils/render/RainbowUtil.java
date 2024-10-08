package today.snowstorm.client.utils.render;

import java.awt.*;

public class RainbowUtil {
    public static int IntRainbow(long l) {
        double d = Math.ceil((double)(System.currentTimeMillis() + l) / 20.0);
        return Color.getHSBColor((float)(d %= 360.0) / 360.0f, 0.8f, 0.7f).getRGB();
    }

}
