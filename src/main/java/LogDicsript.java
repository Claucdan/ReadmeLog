import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

import java.io.*;

public class LogDicsript extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        Editor editor = event.getData(PlatformDataKeys.EDITOR);
        String message=String.valueOf(editor.getSelectionModel().getSelectedText());
        String path= event.getProject().getBasePath();
        path+="/docs/README.md";path=path.replace("/","\\");File file=new File(path);
        if(message=="null")Messages.showMessageDialog("Pleas select class shat you want to add to readme", "Log Class", Messages.getInformationIcon());
        else {
            try {
                FileWriter pw = new FileWriter(file, true);
                pw.write("\n# New class\n" + "## " + message);
                pw.flush();
                Messages.showMessageDialog(messag   e, "Log Class", Messages.getInformationIcon());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    @Override
    public boolean isDumbAware() {
        return false;
    }
}
