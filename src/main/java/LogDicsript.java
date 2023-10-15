import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class LogDicsript extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        Editor editor = event.getData(PlatformDataKeys.EDITOR);
        String message=editor.getSelectionModel().getSelectedText();
        Messages.showMessageDialog(message,"Log Class",Messages.getInformationIcon());
    }
    @Override
    public boolean isDumbAware() {
        return false;
    }
}
