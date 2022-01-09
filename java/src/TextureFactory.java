import java.util.HashMap;
import java.util.Map;

public class TextureFactory {

    private static Map<String, Texture> textures = new HashMap<>();

    public static Texture getTexture(String name, String path) {
        Texture texture = textures.get(path);
        if(texture == null) {
            texture = new Texture(name, path);
            textures.put(name,texture);
        }
        return texture;
    }

    public static int getNumberOfTextures() {
        return textures.size();
    }
}
