import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Asset> assets = new ArrayList<>();

    public void use(String assetName, String textureName, String texturePath) {
        Texture texture = TextureFactory.getTexture(textureName, texturePath);
        Asset asset = new Asset(assetName, texture);
        assets.add(asset);
    }

    public List<String> getAssets() {
        List<String> output = new ArrayList<String>();
        for (Asset asset : this.assets)
            output.add(asset.toString());
        return output;
    }
}
