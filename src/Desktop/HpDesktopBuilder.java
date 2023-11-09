package Desktop;

public class HpDesktopBuilder extends AbstractDesktopBuilder {
    @Override
    public void buildMotherBoard() {
        desktop.setMotherBoard("HP motherboard");
    }

    @Override
    public void buildProcessor() {
        desktop.setProcessor("HP processor");
    }
}
