package Desktop;

public abstract class AbstractDesktopBuilder {

    protected Desktop desktop = new Desktop();
    public abstract void buildMotherBoard();

    public abstract void buildProcessor();

    public Desktop getDesktop() {
        return desktop;
    }

}
