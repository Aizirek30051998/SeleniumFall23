import org.testng.annotations.Test;

public class DropAndDragTest extends BaseTest{

    @Test
    void drop() throws InterruptedException {
        browserManager.openByNavigate("https://demoqa.com/droppable");
        helper.scrollToDown();
        dropPage.simpleDrop();
        dropPage.acceptDrop();
        dropPage.preventPropogationDrop();
        dropPage.revertDraggableDrop();
    }

    @Test
    void drag() throws InterruptedException {
        browserManager.openByNavigate("https://demoqa.com/dragabble");
        dragPage.simple();
        dragPage.axisRestricted();
        dragPage.containerRestricted();
        dragPage.cursorStyle();
    }
}
