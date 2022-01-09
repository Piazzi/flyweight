import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;


public class GameTest {

    @Test
    public void shouldReturnAssets() {
        Game game = new Game();
        game.use("Rock 3D Model", "RockTexture", "localStorage/RockTexture");
        game.use("Wall 3D Model", "BrickTexture", "localStorage/BrickTexture");
        game.use("House 3D Model", "WoodTexture", "localStorage/WoodTexture");

        List<String> output = Arrays.asList(
                        "Asset{name='Rock 3D Model', texture name=RockTexture', texture path=localStorage/RockTexture'}",
                        "Asset{name='Wall 3D Model', texture name=BrickTexture', texture path=localStorage/BrickTexture'}",
                        "Asset{name='House 3D Model', texture name=WoodTexture', texture path=localStorage/WoodTexture'}"
        );

        assertEquals(output, game.getAssets());
    }

    @Test
    public void shouldReturnTexturesTotal(){
        Game game = new Game();
        game.use("Rock 3D Model", "RockTexture", "localStorage/RockTexture");
        game.use("Wall 3D Model", "BrickTexture", "localStorage/BrickTexture");
        game.use("House 3D Model", "WoodTexture", "localStorage/WoodTexture");
        assertEquals(3, TextureFactory.getNumberOfTextures());
    }

    @Test
    public void shouldReturnAssetsTotal(){
        Game game = new Game();
        game.use("Rock 3D Model", "RockTexture", "localStorage/RockTexture");
        game.use("Wall 3D Model", "BrickTexture", "localStorage/BrickTexture");
        game.use("House 3D Model", "WoodTexture", "localStorage/WoodTexture");
        assertEquals(3, game.getAssets().size());
    }

}