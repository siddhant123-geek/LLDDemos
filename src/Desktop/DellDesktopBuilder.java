package Desktop;

public class DellDesktopBuilder extends AbstractDesktopBuilder {
    @Override
    public void buildMotherBoard() {
        desktop.setMotherBoard("Dell motherboard");
    }

    @Override
    public void buildProcessor() {
        desktop.setProcessor("Dell processor");
    }
}
