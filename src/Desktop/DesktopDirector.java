package Desktop;

import Desktop.Desktop;

public class DesktopDirector {

    public Desktop createDesktop(AbstractDesktopBuilder builder) {
        builder.buildMotherBoard();
        builder.buildProcessor();

        return builder.getDesktop();
    }
}
