package ss23_behavior_design._1_observer_design;

import java.util.ArrayList;
import java.util.List;

public class Girl implements  Subject {
    private List<Boy> boyList = new ArrayList<>();
    @Override
    public void add(Boy boy) {
        boyList.add(boy);
    }

    @Override
    public void remove(Boy boy) {
        boyList.remove(boy);
    }

    @Override
    public void note() {
        for (Boy boy :boyList) {
            boy.update();
        }
    }

    public void postImageToFaceBook() {
        // Trạng thái status
        note();
    }
}
