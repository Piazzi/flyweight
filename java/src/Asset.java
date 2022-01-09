public class Asset {

    private String name;
    private Texture texture;

    public Asset(String name, Texture texture) {
        this.name = name;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "name='" + name + '\'' +
                ", texture name=" + texture.getName() +  '\'' +
                ", texture path=" + texture.getPath() +  '\'' +
                '}';
    }
}
