package Desktop;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Desktop {

    private String motherBoard;
    private String processor;

    public void display() {
        System.out.println("MotherBoard " + motherBoard);
        System.out.println("Processor " + processor);
    }


    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public String getProcessor() {
        return processor;
    }
}
